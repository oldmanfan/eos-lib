# EOS Java
Java API，用于使用[EOSIO RPC API](https://developers.eos.io/eosio-nodeos/reference)与基于[EOSIO的区块](https://developers.eos.io/eosio-nodeos/reference)链集。适用Java 和 Android。特色：支持自定义智能合约

## 安装

##### 方式一（推荐）
- Maven
```
<dependency>
	<groupId>com.redli</groupId>
	<artifactId>eoslibrary_v2.5</artifactId>
	<version>2.5</version>
	<type>pom</type>
</dependency>
```
- Gradle
```
implementation 'com.redli:eoslibrary_v2.5:2.5'
```

##### 方式二
- 导入jar包 [eoslibrary_v2.5.jar](https://github.com/TBoyLi/eos-lib-simple/blob/master/app/libs/eoslibrary_v2.5.jar)

##### 方式三
- [下载源码](https://github.com/TBoyLi/eos-lib-simple)导入eoslibrary module (自行修改源码针对自己项目个性化制定)

## API (Ecc and Rpc)
>接口返回说明(所有接口返回统一格式)如下：
```
{
    "isSuccess":true or false,
    "message":"操作成功 or 操作成功",
    "data":"链返回的json信息"
}
```
>例如（获得链信息）：
```
{
    "isSuccess":true,
    "message":"操作成功",
    "data":"{"server_version":"5e8e2949","chain_id":"cf057bbfb72640471fd910bcb67639c22df9f92470936cddc1ade0e2f2e7dc4f","head_block_num":28601043,"last_irreversible_block_num":28601030,"last_irreversible_block_id":"01b46ac611697416b029dc9d7ea9e0033904ddb84bb40a7cc0447e6b3a39a02f","head_block_id":"01b46ad38b76ccff4e1c31b1e64f6f80eb4b40ee870b57427cfa26961957d2da","head_block_time":"2019-06-06T06:33:54.000","head_block_producer":"sunny","virtual_block_cpu_limit":200000000,"virtual_block_net_limit":1048576000,"block_cpu_limit":199900,"block_net_limit":1048576,"server_version_string":"v1.6.3"}"
}
```

##### Ecc类
1. 生成私钥 （Ecc.seedPrivate）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| seed | String | 种子 | 随机数 | Ecc.seedPrivate("随机种子") |

2.私钥获取公钥（Ecc.getPublicKey）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| privateKey | String | 私钥 | 用户私钥 | Ecc.getPublicKey("私钥") |

##### Rpc类
初始化Rpc

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| baseUrl | String | 链地址 |  | Rpc rpc = new Rpc("http://链IP:链端口") |

1.获取链信息（getChainInfo）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| 无 | |  |  |  |

2.获取账户信息（getAccount）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| account | String | 账户名称 |   |  rpc.getAccount("smallred1111")  |

3.通过私钥获取账户名（getKeyAccounts）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| privateKey | String | 私钥 |   |  rpc.getKeyAccounts("123425")  |

4.获得交易信息（getActions）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| account | String | 账户名称 |   |  rpc.getActions("smallred1111") |

5.获得交易信息（getActions）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| account | String | 账户名称 | 必填  |   |
| pos | String | 账户名称 | 可选  | 默认-1 |
| offset | String | 账户名称 | 可选  | 默认-20 |

6.获取表数据（getTableRows）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| scope | String | 作用域 | 必填  |   |
| code | String | 合约名 | 必填  |   |
| table | String | 表名 | 必填  |   |
| keyType | String |  | 可选  |  默认""  |
| encodeType | String |  | 可选  |   |
| lowerBound | String |  | 可选  |   |
| upperBound | String |  | 可选  |   |
| limit | String | 限制 | 可选  | 默认10  |

7.获得交易信息（getCurrencyBalance）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| account | String | 账户名称 | 必填  |   |
| code | String | 合约名 |  必填  |  |
| symbol | String | 象征 |  必填  |  |


8.发起交易（pushTransaction）***重点***（***支持自定义合约名***）

| 参数 | 类型 |参数名 | 描述 | 示例 | 
| :------| ------: | ------: | :------: | :------: |
| code | String | 合约名 |  必填  |  |
| action | String | 合约方法 | 必填  |   |
| account | String | 用户名 | 必填  |   |
| privateKey | String | 用户私钥 |  必填  |  |
| args | Map<String, Object> | 合约方法参数集 |  必填  |  |

>*注意：*API中 1 - 7 接口可以通过[EOSIO RPC API](https://developers.eos.io/eosio-nodeos/reference)的api可以通过http请求操作，这里是根据个人项目需求把API 1-7 封装到包里方便使用的。

## 使用
##### Java
直接调用即可

##### Android
- 推荐使用方式如下：
```
final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
Map<String, Object> args1 = new HashMap<>();
args2.put("msg", "testtest");
args2.put("index", 123321);

Map<String, Object> args2 = new HashMap<>();
args2.put("from", "smallred1111");
args2.put("to", "smallred1112");
args2.put("quantity", "0.0001 TOK");
args2.put("memo", "阿卡丽3");

threadPoolExecutor.execute(new Runnable() {
   @Override public void run() {
        //自定义智能合约交易
        String txnResponse1 = rpc.pushTransaction("sakuyatest13", "test", "smallred111167", SAMPLE_PRIV_KEY_FOR_TEST, args2);
        System.out.println();
        System.out.println("PushTransaction1: " + gson.toJson(txnResponse1));
        //EOS 官方智能合约交易
        String txnResponse2 = rpc.pushTransaction("eosio.token", "transfer", "smallred1111", SAMPLE_PRIV_KEY_FOR_TEST, args2);
        System.out.println();
        System.out.println("PushTransaction2: " + gson.toJson(txnResponse2));
        threadPoolExecutor.shutdown();
    }
});
```
>ANDROID 版本使用注意项（Android P 限制了明文流量的网络请求，非加密的流量请求都会被系统禁止掉）配置如下：
```
1、在res目录下创建xml文件夹并在xml目录下创建network_security_config.xml，内容如下：
<network-security-config>
  <base-config cleartextTrafficPermitted="true" />
</network-security-config>
2、AndroidManifest：
<application
  android:networkSecurityConfig="@xml/network_security_config">
</application>
```
>有问题欢迎评论，或者需要自定义接口的。也欢迎[Github项目地址](https://github.com/TBoyLi/eos-lib-simple) Issues :clap::clap::clap:
>厘米特科技
[简书地址](https://www.jianshu.com/p/3e0c7744182d)

## 最后
>致谢： 
- [EosCommander](https://github.com/playerone-id/EosCommander) 椭圆曲线算法及blockchain工具类  
- [eos4j](https://github.com/espritblock/eos4j) 私钥生成工具

