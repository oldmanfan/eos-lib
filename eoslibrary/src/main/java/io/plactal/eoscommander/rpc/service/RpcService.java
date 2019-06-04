package io.plactal.eoscommander.rpc.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Map;

import io.plactal.eoscommander.data.remote.model.api.GetRequiredKeys;
import io.plactal.eoscommander.data.remote.model.api.GetTableRequest;
import io.plactal.eoscommander.data.remote.model.chain.PackedTransaction;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * 
 * @author espritblock http://eblock.io
 *
 */
public interface RpcService {

	@GET("/v1/chain/get_info")
	Call<JsonObject> getChainInfo();

	@POST("/v1/chain/get_block")
	Call<JsonObject> getBlock(@Body Map<String, String> requestFields);

	@POST("/v1/chain/get_account")
	Call<JsonObject> getAccount(@Body Map<String, String> requestFields);

	@POST("/v1/history/get_key_accounts")
	Call<JsonObject> getKeyAccounts(@Body Map<String, String> requestFields);

	@POST("v1/history/get_actions")
	Call<JsonObject> getActions(@Body Map<String, Object> requestFields);

	@POST("/v1/chain/get_table_rows")
	Call<JsonObject> getTableRows(@Body GetTableRequest body);

	@POST("/v1/chain/get_currency_balance")
	Call<JsonArray> getCurrencyBalance(@Body Map<String, Object> requestFields);

	@POST("/v1/chain/abi_json_to_bin")
	Call<JsonObject> abiJsonToBin(@Body Map<String, Object> requestFields);

	@POST("/v1/chain/get_required_keys")
	Call<JsonObject> getRequiredKeys(@Body GetRequiredKeys requiredKeys);

	@POST("/v1/chain/push_transaction")
	Call<JsonObject> pushTransaction(@Body PackedTransaction body);


}
