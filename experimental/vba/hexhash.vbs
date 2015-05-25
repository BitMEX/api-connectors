' BitMEX hex calc
' Pure VBA HMAC-SHA-256 computation
' Purpose: to compute api-signature for HTTP header to do private calls for BitMEX
' Written by BitMEX user `cengel`
'
' TL;DR : HexHash(AllPostDataCombinedIntoOneString, apiSecret, "SHA256")
'

Sub BitMexSign()

    Dim nonce As Double
    Dim verb, url, apiKey, apiSecret, postdata, Signature, nonce2 As String
    nonce = 1429631577690#

    '
    ' Reproducing examples from https://www.bitmex.com/app/apiKeys
    '

    apiKey = "LAqUlngMIQkIUjXMUreyu3qn"
    apiSecret = "chNOOS4KvNXR_Xq4k4c9qsfoKWvnDecLATCRlcBwyKDYnWgO"

    '
    ' Simple GET with querystring
    '
    verb = "GET"
    ' Note url-encoding on querystring - this is '/api/v1/instrument?filter={"symbol": "XBTM15"}'
    url = "/api/v1/instrument?filter=%7B%22symbol%22%3A+%22XBTM15%22%7D"
    nonce2 = nonce
    postdata = ""

    ' HEX(HMAC_SHA256(apiSecret, 'GET/api/v1/instrument?filter=%7B%22symbol%22%3A+%22XBTM15%22%7D1429631577690'))
    ' Result is:
    ' '9f1753e2db64711e39d111bc2ecace3dc9e7f026e6f65b65c4f53d3d14a60e5f'
    Signature = HexHash(verb + url + nonce2 + postdata, apiSecret, "SHA256")
    MsgBox ("Signature from GET req: " & Signature)

    '
    ' POST
    '
    verb = "POST"
    url = "/api/v1/order"
    nonce = 1429631577995#
    nonce2 = nonce
    postdata = "{" + Chr(34) & "symbol" & Chr(34) & ":" & Chr(34) & "XBTM15" & Chr(34) & "," & Chr(34) & "price" & Chr(34) & ":219.0," & Chr(34) & "clOrdID" & Chr(34) & ":" & Chr(34) & "mm_bitmex_1a/oemUeQ4CAJZgP3fjHsA" & Chr(34) & "," & Chr(34) & "quantity" & Chr(34) & ":98}"
    ' "c8f371f0bdae96fd6b4a4d506632b5832982c5143f5c22973bc08d2f56a8beaf"
    Signature = HexHash(verb + url + nonce2 + postdata, apiSecret, "SHA256")
    MsgBox ("Signature from POST req: " & Signature)

End Sub



Function HexHash(ByVal clearText As String, ByVal key As String, Meth As String) As String

    Dim hashedBytes
    Dim i As Integer

    hashedBytes = computeHash(clearText, key, Meth)
    HexHash = ""

    For i = 1 To LenB(hashedBytes)
        ' Incredibly important that the LCase() function calls this way, otherwise code won't always work
        HexHash = HexHash & LCase(Right("0" & Hex(AscB(MidB(hashedBytes, i, 1))), 2))
    Next

End Function
Function computeHash(ByVal clearText As String, ByVal key As String, Meth As String) As Byte()

    Dim BKey() As Byte
    Dim BTxt() As Byte

    BTxt = StrConv(clearText, vbFromUnicode)
    BKey = StrConv(key, vbFromUnicode)

    If Meth = "SHA512" Then
        Set SHAhasher = CreateObject("System.Security.Cryptography.HMACSHA512")
    ElseIf Meth = "SHA256" Then
        Set SHAhasher = CreateObject("System.Security.Cryptography.HMACSHA256")
    Else
        Set SHAhasher = CreateObject("System.Security.Cryptography.HMACSHA1")
    End If

    If key <> "" Then
        SHAhasher.key = BKey
    Else
    End If
    computeHash = SHAhasher.computeHash_2(BTxt)
    Set SHAhaser = Nothing
End Function

