package com.limite.eoslibsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import io.plactal.eoscommander.rpc.Rpc;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    private Rpc rpc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String SAMPLE_PRIV_KEY_FOR_TEST = "您的私钥";

//        final Rpc rpc = new Rpc("https://ultrainio.ultrain.info");
        final Rpc rpc = new Rpc("https://pioneer.ultrain.info");

        final Gson gson = new Gson();

        final Map<String, Object> args2 = new HashMap<>();
        args2.put("msg", "testtest");
        args2.put("index", 123321);

        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());

        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {

                String eosChainInfo =  rpc.getChainInfo();
                Log.d(TAG, "ChainInfo: " + eosChainInfo);

                String balance = rpc.getCurrencyBalance("liangqin1", "utrio.token", "UGAS");
                Log.d(TAG, "MyBalance: " + balance);

                String transFee = rpc.getTransferFee(3945524L);
                Log.d(TAG, "TransferFee: " + transFee);

                Map<String, Object> payload = new HashMap<>();
                payload.put("user_id", "6C37204FF07F4AA1BA67DF43502045E3");
                payload.put("user_name", "muhanmude");
                payload.put("user_phone", "188");
                payload.put("id_card_number", "371**");
                payload.put("record_content", "xxx");
                payload.put("action_desc", "xxxx");
                payload.put("point_type", "xxx");
                payload.put("action_point", 10);
                payload.put("action_time", 1592897730075L);
                payload.put("record_hash", "9BA2CD7DDE31BDB66CB393167EDB5426");
                payload.put("upper_chain_time", 1592897731719L);

                Map<String, Object> record = new HashMap<>();
                record.put("record", payload);
                String r = rpc.pushTransaction("yuanjing1", "setPointsRecord", "yuanjing1", "5KfjDYSn44QfW2s9xs8NxrCPMZUh1ZbZNJG7o6PUsLNg8VbCdV4", record);
                Log.d(TAG, "setPointsRecord: " + r);

                Map<String, Object> p = new HashMap<>();
                p.put("user_id", "6C37204FF07F4AA1BA67DF43502045E3");
                String points = rpc.pushTransaction("yuanjing1", "getPointsRecord", "yuanjing1", "5KfjDYSn44QfW2s9xs8NxrCPMZUh1ZbZNJG7o6PUsLNg8VbCdV4", p);
                Log.d(TAG, "Points: " + points);

                String exists = rpc.getAccountExists("yuanjing1");
                Log.d(TAG, "account exists: " + exists);
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
//        String actions = rpc.getActions("smallred1111");
//        System.out.println();
//        System.out.println("GetActions: " + gson.toJson(actions));
//
//        String balance = rpc.getCurrencyBalance("smallred1111", "eosio.token", "TOK");
//        System.out.println();
//        System.out.println("GetCurrencyBalance: " + gson.toJson(balance));
//
//        String tableRows = rpc.getTableRows("sakuyatest12", "sakuyatest12", "dusers");
//        System.out.println();
//        System.out.println("GetTableRows: " + gson.toJson(tableRows));
//
//        String tableRows1 = rpc.getTableRows("sakuyatest12", "sakuyatest12", "dusers", 100);
//        System.out.println();
//        System.out.println("GetTableRows1: " + gson.toJson(tableRows1));
//
//        String tableRows2 = rpc.getTableRows("sakuyatest12", "sakuyatest12", "dusers", 100, true);
//        System.out.println();
//        System.out.println("GetTableRows2: " + gson.toJson(tableRows2));
//
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
//

//                Map<String, Object> args2 = new HashMap<>();
//        args2.put("msg", "testtest");
//        args2.put("index", 123321);
//        String txnResponse = rpc.pushTransaction("sakuyatest13", "test", "smallred111167", SAMPLE_PRIV_KEY_FOR_TEST, args2);

//                args2.put("from", "smallred1111");
//                args2.put("to", "smallred1112");
//                args2.put("quantity", "0.0001 TOK");
//                args2.put("memo", "阿卡丽2");
//
//                String txnResponse = rpc.pushTransaction("eosio.token", "transfer", "smallred1111", SAMPLE_PRIV_KEY_FOR_TEST, args2);
//                System.out.println();
//                System.out.println("PushTransaction: " + gson.toJson(txnResponse));

                threadPoolExecutor.shutdown();
            }
        });
    }
}
