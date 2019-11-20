package com.limite.eoslibsimple;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

import io.plactal.eoscommander.rpc.Ecc;
import io.plactal.eoscommander.rpc.Rpc;

/**
 * @author redli
 * @date 2019/3/28
 */
public class Test {
    public static void main(String[] arg) {

        final String SAMPLE_PRIV_KEY_FOR_TEST = "您的私钥";


        Rpc rpc = new Rpc("链地址");


        Gson gson = new Gson();

//        String privateKey = Ecc.seedPrivate("abc");
//        String publicKey = Ecc.getPublicKey(privateKey);
//        System.out.println();
//        System.out.println("privateKey: " + privateKey);
//        System.out.println("privateKey Length: " + privateKey.length());
//        System.out.println("publicKey: " + publicKey);
//
//        String privateKey1 = Ecc.seedPrivate("abcefdgdgagdqerqewrqwtr536547565wtetryu6745er");
//        String publicKey1 = Ecc.getPublicKey(privateKey);
//        System.out.println();
//        System.out.println("privateKey1: " + privateKey1);
//        System.out.println("privateKey1 Length: " + privateKey1.length());
//        System.out.println("publicKey1: " + publicKey1);
//
//        String publicKey1 = Ecc.getPublicKey(SAMPLE_PRIV_KEY_FOR_TEST);
//        System.out.println();
//        System.out.println("publicKey1: " + publicKey1);

//        String eosChainInfo =  rpc.getChainInfo();
//        System.out.println();
//        System.out.println("GetChainInfo: " + gson.toJson(eosChainInfo));
//
//        String account = rpc.getAccount("dipcchelmy12");
//        System.out.println();
//        System.out.println("GetAccount: " + gson.toJson(account));

//        String keyAccounts = rpc.getKeyAccounts(SAMPLE_PRIV_KEY_FOR_TEST);
//        System.out.println();
//        System.out.println("GetKeyAccounts: " + gson.toJson(keyAccounts));

//        String actions = rpc.getActions("smallred1111");
//        System.out.println();
//        System.out.println("GetActions: " + gson.toJson(actions));

//        String actions1 = rpc.getActions("smallred1111", 0, 10);
//        System.out.println();
//        System.out.println("GetActions1: " + gson.toJson(actions1));
//
//        String balance = rpc.getCurrencyBalance("smallred1111", "eosio.token", "TOK");
//        System.out.println();
//        System.out.println("GetCurrencyBalance: " + gson.toJson(balance));

//        String tableRows = rpc.getTableRows("usrtokenlist", "usrtokenlist", "token");
//        System.out.println();
//        System.out.println("GetTableRows: " + gson.toJson(tableRows));

//        String tableRows1 = rpc.getTableRows("sakuyatest12", "sakuyatest12", "dusers", 100);
//        System.out.println();
//        System.out.println("GetTableRows1: " + gson.toJson(tableRows1));
////
//        String tableRows2 = rpc.getTableRows("sakuyatest12", "sakuyatest12", "dusers", 100, true);
//        System.out.println();
//        System.out.println("GetTableRows2: " + gson.toJson(tableRows2));

//        String tableRows3 = rpc.getTableRows("dipcctest112", "dipcctest112", "users", "dipcchelmy11", "", 1);
//        System.out.println();
//        System.out.println("GetTableRows3: " + gson.toJson(tableRows3));

        String tableRows4 = rpc.getTableRows("dipcctest112", "dipcctest112", "users", 1, "", "", "", "", 10);
        System.out.println();
        System.out.println("GetTableRows4: " + gson.toJson(tableRows4));
        System.out.println();
        JsonObject jsonObject = gson.fromJson(tableRows4, JsonObject.class);
        String data = jsonObject.get("data").getAsString();
        System.out.println("GetTableRows4: " + data);

//        Map<String, Object> args = new HashMap<>();
//        args.put("msg", "testtest");
//        args.put("index", 123321);
//        String jsonToBinResponse = rpc.abiJsonToBin("sakuyatest13", "test", args);
//
//        args.put("from", "smallred1111");
//        args.put("to", "smallred1112");
//        args.put("quantity", "0.0001 TOK");
//        args.put("memo", "阿卡丽");
//        String jsonToBinResponse = rpc.abiJsonToBin("eosio.token", "transfer", args);
//        System.out.println();
//        System.out.println("AbiJsonToBin: " + gson.toJson(jsonToBinResponse));
//
//        Map<String, Object> args1 = new HashMap<>();
//        args1.put("msg", "testtest");
//        args1.put("index", 123321);
//        String requiredKeysResponse = rpc.getRequiredKeys("sakuyatest13", "test", "smallred1111", SAMPLE_PRIV_KEY_FOR_TEST, args1);
//        System.out.println();
//        System.out.println("GetRequiredKeys: " + gson.toJson(requiredKeysResponse));

//        Map<String, Object> args2 = new HashMap<>();
//        args2.put("msg", "testtest");
//        args2.put("index", 123321);
//        String txnResponse = rpc.pushTransaction("sakuya", "transfer", "dipcchelmy11", SAMPLE_PRIV_KEY_FOR_TEST, args2);


//        args2.put("from", "dipcchelmy11");
//        args2.put("to", "wb");
//        args2.put("quantity", "10.0000 LIVE");
//        args2.put("memo", "");
//
//        String txnResponse = rpc.pushTransaction("eosio.token", "transfer", "smallred1111", SAMPLE_PRIV_KEY_FOR_TEST, args2);
//        String txnResponse = rpc.pushTransaction("sakuya", "transfer", "dipcchelmy11", SAMPLE_PRIV_KEY_FOR_TEST, args2);
//        System.out.println();
//        System.out.println("PushTransaction: " + gson.toJson(txnResponse));
    }
}