package io.plactal.ultraincommander.rpc;

import io.plactal.ultraincommander.crypto.ec.UltrainPrivateKey;
import io.plactal.ultraincommander.rpc.utils.EccTool;

/**
 * @author redli
 * @date 2019/3/28
 */
public class Ecc {

    /**
     * 生成私钥
     * @param seed
     * @return
     */
    public static String seedPrivate(String seed) {
        return EccTool.seedPrivate(seed);
    }


    /**
     * 通过私钥获取公钥
     * @param privateKey
     * @return
     */
    public static String getPublicKey(String privateKey) {
        return new UltrainPrivateKey(privateKey).getPublicKey().toString();
    }
}
