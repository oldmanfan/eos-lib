package io.plactal.eoscommander.rpc;

import io.plactal.eoscommander.crypto.ec.EosPrivateKey;
import io.plactal.eoscommander.rpc.utils.EccTool;

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
        return new EosPrivateKey(privateKey).getPublicKey().toString();
    }
}
