package com.limite.eoslibsimple;

import com.google.gson.Gson;

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

        final String SAMPLE_PRIV_KEY_FOR_TEST = "5KCwrz6v3sQQiaf85aJW6nd36ZmgucDu8BARfKKup3VeQ1Ar3HU";

        Rpc rpc = new Rpc("http://10.255.1.226:8888");

        Gson gson = new Gson();

//        String eosChainInfo =  rpc.getChainInfo();
//        System.out.println();
//        System.out.println("GetChainInfo: " + gson.toJson(eosChainInfo));
//
//        EosChainInfo info = new Gson().fromJson(eosChainInfo, EosChainInfo.class);
//        String headBlockNum =  info.getHeadBlockNum().toString();
//        String block = rpc.getBlock(headBlockNum);
//        System.out.println();
//        System.out.println("GetBlock: " + gson.toJson(block));
//
//        String account = rpc.getAccount("smallred1111");
//        System.out.println();
//        System.out.println("GetAccount: " + gson.toJson(account));
//
//        String keyAccounts = rpc.getKeyAccounts(SAMPLE_PRIV_KEY_FOR_TEST);
//        System.out.println();
//        System.out.println("GetKeyAccounts: " + gson.toJson(keyAccounts));

//        String actions = rpc.getActions("smallred1111");
//        System.out.println();
//        System.out.println("GetActions: " + gson.toJson(actions));


        String privateKey = Ecc.seedPrivate("abc");
        String publicKey = Ecc.getPublicKey(privateKey);
        System.out.println();
        System.out.println("privateKey: " + privateKey);
        System.out.println("publicKey: " + publicKey);

        String privateKey1 = Ecc.seedPrivate("abc");
        String publicKey1 = Ecc.getPublicKey(privateKey);
        System.out.println();
        System.out.println("privateKey1: " + privateKey1);
        System.out.println("publicKey1: " + publicKey1);


        System.out.println();
        System.out.println("publicKey2: " + Ecc.getPublicKey(SAMPLE_PRIV_KEY_FOR_TEST));



//        String actions1 = rpc.getActions("smallred1111", -1, -20);
//        System.out.println();
//        System.out.println("GetActions1: " + gson.toJson(actions1));
//
//        String balance = rpc.getCurrencyBalance("smallred1111", "eosio.token", "TOK");
//        System.out.println();
//        System.out.println("GetCurrencyBalance: " + gson.toJson(balance));
//
//        String tableRows = rpc.getTableRows("dipcctest112", "dipcctest112", "users");
//        System.out.println();
//        System.out.println("GetTableRows: " + gson.toJson(tableRows));

//        String tableRows1 = rpc.getTableRows("sakuyatest12", "sakuyatest12", "dusers", 100);
//        System.out.println();
//        System.out.println("GetTableRows1: " + gson.toJson(tableRows1));
//
//        String tableRows2 = rpc.getTableRows("sakuyatest12", "sakuyatest12", "dusers", 100, true);
//        System.out.println();
//        System.out.println("GetTableRows2: " + gson.toJson(tableRows2));

//        String tableRows3 = rpc.getTableRows("dipcctest112", "dipcctest112", "users", "dipcchelmy11", "", 1);
//        System.out.println();
//        System.out.println("GetTableRows3: " + gson.toJson(tableRows3));

//        String tableRows4 = rpc.getTableRows("dipcctest112", "dipcctest112", "users", -1, "", "", "dipcchelmy11", "", 0);
//        System.out.println();
//        System.out.println("GetTableRows4: " + gson.toJson(tableRows4));

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

        Map<String, Object> args2 = new HashMap<>();
//        args2.put("msg", "testtest");
//        args2.put("index", 123321);
//        String txnResponse = rpc.pushTransaction("sakuyatest13", "test", "smallred111167", SAMPLE_PRIV_KEY_FOR_TEST, args2);

//        args2.put("from", "smallred1111");
//        args2.put("to", "smallred1112");
//        args2.put("quantity", "0.0001 TOK");
//        args2.put("memo", "阿卡丽3");

//        String txnResponse = rpc.pushTransaction("eosio.token", "transfer", "smallred1111", SAMPLE_PRIV_KEY_FOR_TEST, args2);
//        System.out.println();
//        System.out.println("PushTransaction: " + gson.toJson(txnResponse));
    }
}
