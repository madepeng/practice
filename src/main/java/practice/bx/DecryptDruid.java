package practice.bx;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * @ClassName DecryptDruid
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/11/22
 * @Version V1.0
 **/
public class DecryptDruid {

    public static void main(String[] args) {
        try {
            DecryptDruid.testDecrypt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 对文字进行解密
     *
     * @throws Exception
     */
    public static void testDecrypt() {
        // pas c 公钥
        String publicKeyText =
                "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAMQyOkzrqBMPeZWj8+2OlNlQ9kpYbk94+sqmsHntFvRFc2CvQPqKQ2Tu2ggoXTbVKNBTcTk3Pw+13Fu+t76lVgkCAwEAAQ==";
        // pas c 密文密码
        String cipherText =
                "CJqdAZ4HdX+dpEY7cY5DJ0kosRAqc7hw7y4LTiC5KEoJ0/sNYQkrqwGVdUNwerqn+0hDcogmbKXvYAcfs5axyw==";
        String decryptword = null;
        try {
            decryptword = ConfigTools.decrypt(publicKeyText, cipherText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //
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
