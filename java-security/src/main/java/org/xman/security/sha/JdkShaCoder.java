package org.xman.security.sha;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JdkShaCoder {

    private final static String HEX = "0123456789abcdef";
    private static MessageDigest SHA = null;

    static {
        try {
            SHA = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException ignored) {
        }
    }

    /**
     * SHA-1加密
     *
     * @param data 待加密字符串
     * @return 加密后的字符串
     */
    public static String SHA(String data) {

        StringBuilder hash = new StringBuilder(40);
        for (byte b : SHA.digest(data.getBytes())) {
            hash.append(HEX.charAt((b >> 4) & 0x0f));
            hash.append(HEX.charAt(b & 0x0f));
        }

        return hash.toString();
    }

    /**
     * SHA-1加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA");

        // 执行消息摘要
        return md.digest(data);
    }


    /**
     * SHA-256加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA256(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * SHA-384加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA384(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-384");

        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * SHA-512加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeSHA512(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-512");

        // 执行消息摘要
        return md.digest(data);
    }
}
