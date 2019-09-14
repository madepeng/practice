package practice;

import com.alibaba.druid.filter.config.ConfigTools;

public class DecryptDruid {
    public static void main(String[] args) {
        try {
            DecryptDruid.testDecrypt();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 对文字进行解密
     * 
     * @throws Exception
     */
    public static void testDecrypt() {
        // 解密
        String publicKeyText =
                "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIdJVQ/2XtnwtTcdNpjUpxf+HNlCu+4QfUf/95bWlO56JlmctYGuWNYqsiAlQCjE4Vntqdv7019R/vh3+yAuglcCAwEAAQ==";
        String cipherText =
                "J14ocut803vNW8oS9rPNxZ/NIH05YvRt8Dfflc78oQ27A5TvMWB94lueFp1YarejvW0YDA3USL60XzVUcBID/Q==";
        String decryptword = null;
        try {
            decryptword = ConfigTools.decrypt(publicKeyText, cipherText);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(decryptword);
    }

    /**
     * 文字进行加密
     * 
     * @throws Exception
     */
    public static void testEncrypt() throws Exception {
        // 加密
        String password = "xxxxxxx";
        String encryptword = ConfigTools.encrypt(password);
        System.out.println(encryptword);

    }

}
