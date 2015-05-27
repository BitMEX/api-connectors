; mIRC does not support SHA-2 family hashing
; so download this small dll http://www.xise.nl/mirc/sha2.zip
; and put it in your user/appdata/roaming/mIRC folder

; BitMex API communicator
; Edit /btc alias to your heart's content to vary
; the request types and data sent

; Fill in API Key and Secret below

; Written by BitMEX user `cengel`, winner of BitMEX's "most esoteric
; API connector award"


alias sha256 return $dll(sha2.dll,sha256,$calc($2) $1)

on *:sockread:btc.*:{
  var %header, %read
  if ($sock($sockname).mark != header.finished) {
    sockread %header
    while (%header != $null) {
      ;echo -ag %header
      sockread %header
    }
    if ($sockbr) sockmark $sockname header.finished
  }
  if ($sock($sockname).mark == header.finished) {
    sockread -f %read
    while ($sockbr) {
      if (%read != $null) echo -ag %read
      sockread -f %read
    }
  }
}

alias nonce {
  if (!%nonce) set -u1 %nonce $ctime $+ $calc($ticks % 10000)
  else inc %nonce
  return %nonce
}

alias btc {
  var %sockname = btc. $+ $nonce
  sockopen -e %sockname testnet.bitmex.com 443 HTTP/1.0
}

on *:sockopen:btc.*:{
  var %api_key = API_KEY
  var %secret = API_SECRET

  var %nonce = $nonce
  var %data = GET/api/v1/position $+ %nonce
  var %sign = $hmac-sha-256(%secret,%data)

  var %a = sockwrite -n $sockname

  %a GET /api/v1/position HTTP/1.0
  %a Content-Type: application/x-www-form-urlencoded
  %a api-nonce: %nonce
  %a api-key: %api_key
  %a api-signature: %sign
  %a $+($crlf,%data)
}
