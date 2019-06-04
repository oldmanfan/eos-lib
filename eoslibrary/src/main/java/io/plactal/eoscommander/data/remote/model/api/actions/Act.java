package io.plactal.eoscommander.data.remote.model.api.actions;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * @author redli
 * @date 2019/3/14
 */

public class Act {

    /**
     * account : eosio.token
     * name : transfer
     * authorization : [{"actor":"sakuya","permission":"active"}]
     * data : {"from":"sakuya","to":"smallred1111","quantity":"100.0000 TOK","memo":""}
     * hex_data : 0000000018afa1c110420849dd188dc440420f000000000004544f4b0000000000
     */
    @Expose
    private String account;

    @Expose
    private String name;

    @Expose
    private Data data;

    @Expose
    private String hex_data;

    @Expose
    private List<Authorization> authorization;
}
