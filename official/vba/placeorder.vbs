' BitMEX Order Placement Example
' Written by BitMEX user `cengel`

' Note:
' Requires JSONConverter.bas and hexhash.vbs from this folder

' Usage:
' In VBA go to Tools -> References -> and check "Microsoft Scripting Runtime" and "Microsoft VB Reg Expressions"
' In "H" Column put in: Row 1: Symbol, Row 2: Price, Row 3: Qty
' For example: XBTUSD , 590.10 , 10
' Then run placeorder()

Sub placeorder()
Dim Json, httpObject As Object
Dim nonce As Double
Dim verb, apiKey, apiSecret, Signature, symbol, price, qty, url, postdata, replytext, nonceStr As String
Dim jsoncount As Long

' Set monotonically (w time) increasing nonce
nonce = DateDiff("s", "1/1/1970", Now)

' Set api key and secret
apiKey = "key"
apiSecret = "secret"

' Build query
symbol = Cells(1, "H").Value
price = Cells(2, "H").Value
qty = Cells(3, "H").Value

verb = "POST"
url = "/api/v1/order"
postdata = "symbol=" & symbol & "&price=" & price & "&quantity=" & qty

' Stringize nonce
nonceStr = nonce

' Compute signature using hexhash script
Signature = HexHash(verb + url + nonceStr + postdata, apiSecret, "SHA256")

' Set up HTTP req with headers
Set httpObject = CreateObject("MSXML2.XMLHTTP")
httpObject.Open "POST", "https://testnet.bitmex.com" & url, False
httpObject.setRequestHeader "Content-Type", "application/x-www-form-urlencoded"
httpObject.setRequestHeader "api-nonce", nonceStr
httpObject.setRequestHeader "api-key", apiKey
httpObject.setRequestHeader "api-signature", Signature
httpObject.Send (postdata)

' Catch response
replytext = httpObject.ResponseText

' Parse JSON response
Set Json = JsonConverter.ParseJson(replytext)

' This is useful for grabbing dimensions of the response for loops
' When doing this, get Json parms by doing Json(i)("key") like Json(2)("symbol")
jsoncount = Json.Count

If Json("ordStatus") = "Rejected" Then
  MsgBox ("Order rejected")
Exit Sub
Else
'And here just outputting some elements of response
  Cells(1, "A") = Json("symbol")
  Cells(1, "B") = Json("timestamp")
  Cells(1, "C") = Json("price")
  Cells(1, "D") = Json("orderQty")
  Cells(1, "E") = Json("orderID")
  MsgBox ("Order placed.")
End If
End Sub
