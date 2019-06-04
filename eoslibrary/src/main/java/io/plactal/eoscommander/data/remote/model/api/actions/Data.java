package io.plactal.eoscommander.data.remote.model.api.actions;


import com.google.gson.annotations.Expose;

/**
 * @author redli
 * @date 2019/3/14
 */
public class Data {
    /**
     * from : sakuya
     * to : smallred1111
     * quantity : 100.0000 TOK
     * memo :
     */

    @Expose
    private String from;

    @Expose
    private String to;

    @Expose
    private String quantity;

    @Expose
    private String memo;
}
