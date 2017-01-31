package bitmex;

import com.google.gson.Gson;
import io.swagger.client.ApiClient;
import io.swagger.client.Pair;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/**
 * Created by stuart on 29/01/2017.
 */
public class BitMexApiAuth {

    private final ApiClient apiClient;
    private final String bitmexKey;
    private final String bitmexSecret;
    private final SecretKeySpec secret_key;
    private final Mac sha256_HMAC = Mac.getInstance("HmacSHA256");

    public BitMexApiAuth(ApiClient apiClient, String bitmexKey, String bitmexSecret) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        this.apiClient = apiClient;
        this.bitmexKey = bitmexKey;
        this.bitmexSecret = bitmexSecret;
        secret_key = new SecretKeySpec(bitmexSecret.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);
    }

    public void applyToParams(Map<String, Object> formParams, List<Pair> queryParams, Map<String, String> headerParams, String method, String path)  {
        String nonce = Long.toString(System.currentTimeMillis());
        headerParams.put("api-nonce", nonce);
        headerParams.put("api-key", bitmexKey);
        try {
            headerParams.put("api-signature", getSignature(formParams, queryParams, nonce, method, path));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private String getSignature(Map<String, Object> formParams, List<Pair> queryParams, String nonce, String method, String path) throws UnsupportedEncodingException {
        String base = apiClient.getPath();
        //String url = base + "/order";
        //String url = "/api/v1/order?symbol=XBTUSD";
        final String params;
        params = getQueryParams(queryParams);

        String url = base + path + params;

        //String postData = getFormParams(formParams);
        String postData = convertToJson(formParams);
        String messageToEncode = method + url + nonce + postData;
        System.out.println("Message = : " + messageToEncode);
        byte[] encoded = sha256_HMAC.doFinal(messageToEncode.getBytes("UTF-8"));
        return toHexString(encoded);
    }

    private static String getFormParams(Map<String, Object> formParams) {
        final StringBuilder builder = new StringBuilder();
        for(Map.Entry<String, Object> item : formParams.entrySet()) {
            builder.append("&").append(item.getKey()).append("=").append(item.getValue());
        }
        //builder.setCharAt(0, '?');
        return builder.toString();
    }

    private static String getQueryParams(List<Pair> queryParams) {
        if(queryParams.size() == 0) {
            return "";
        }
        final StringBuilder builder = new StringBuilder();
        for(Pair item : queryParams) {
            builder.append("&").append(item.getName()).append("=").append(item.getValue());
        }
        builder.setCharAt(0, '?');
        return builder.toString();
    }

    static String toHexString(byte[] encoded) {
        StringBuilder hex = new StringBuilder(encoded.length * 2);
        for(byte b : encoded) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }

    public static String convertToJson(Map<String, Object> formParams) {
        Gson gson = new Gson();
        String response = gson.toJson(formParams);
        return response;
    }
}
