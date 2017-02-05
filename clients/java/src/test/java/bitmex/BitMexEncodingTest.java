package bitmex;

import org.junit.Test;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by stuart on 30/01/2017.
 */
public class BitMexEncodingTest {

    @Test
    public void test_sign_get() throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String apiSecret = "API_KEY_SECRET";
        String verb = "GET";
        String path = "/api/v1/instrument?filter=%7B%22symbol%22%3A+%22XBTM15%22%7D";
        long nonce = 1429631577690L;
        String data = "";
        final Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        String messageToEncode = verb + path + Long.toString(nonce) + data;
        SecretKeySpec secret = new SecretKeySpec(apiSecret.getBytes(), "HmacSHA256");
        sha256_HMAC.init(secret);
        byte[] encoded = sha256_HMAC.doFinal(messageToEncode.getBytes("UTF-8"));
        String result = BitMexApiAuth.toHexString(encoded);
        System.out.println("Sample = " + BitMexApiAuth.toHexString(encoded));

        assertThat(result, is("9f1753e2db64711e39d111bc2ecace3dc9e7f026e6f65b65c4f53d3d14a60e5f"));

    }

    @Test
    public void test_sign_post() throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String apiSecret = "API_KEY_SECRET";
        String verb = "POST";
        String path = "/api/v1/order";
        long nonce = 1429631577995L;
        String data = "{\"symbol\":\"XBTM15\",\"price\":219.0,\"clOrdID\":\"mm_bitmex_1a/oemUeQ4CAJZgP3fjHsA\",\"orderQty\":98}";
        final Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        String messageToEncode = verb + path + Long.toString(nonce) + data;
        SecretKeySpec secret = new SecretKeySpec(apiSecret.getBytes(), "HmacSHA256");
        sha256_HMAC.init(secret);
        byte[] encoded = sha256_HMAC.doFinal(messageToEncode.getBytes("UTF-8"));
        String result = BitMexApiAuth.toHexString(encoded);
        System.out.println("Sample = " + BitMexApiAuth.toHexString(encoded));

        assertThat(result, is("93912e048daa5387759505a76c28d6e92c6a0d782504fc9980f4fb8adfc13e25"));

    }
}
