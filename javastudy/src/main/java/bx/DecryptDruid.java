package bx;

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
                "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIOEHIrGBu5kzrhXkrLGcRE798bKhVQ4oyQrSBeir1e3EiG+HN98PCm8Y9lAsHJihP1rPGcwoRyxlOOebTg3d9ECAwEAAQ==";
        // pas c 密文密码
        String cipherText =
                "Db5z7wncqDRU7DjEmAMFMfVquPvUR9gV2YPaBMfrH+44l+QVmIVLdnqJI+Y9Ruo9i7Yw7TMtDUk+5q4pkTtadQ==";
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
