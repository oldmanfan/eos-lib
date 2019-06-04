package io.plactal.eoscommander.data.remote.model.api.actions;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * @author redli
 * @date 2019/3/14
 */
public class Receipt {

    /**
     * receiver : smallred1111
     * act_digest : 5a2f7d6000cc7fc4ad0bf75e28014fc927a5b0502cefa13b00f58953cf98f4a7
     * global_sequence : 14291919
     * recv_sequence : 1
     * auth_sequence : [["sakuya",685]]
     * code_sequence : 1
     * abi_sequence : 1
     */

    @Expose
    private String receiver;

    @Expose
    private String act_digest;

    @Expose
    private int global_sequence;

    @Expose
    private int recv_sequence;

    @Expose
    private int code_sequence;

    @Expose
    private int abi_sequence;

    @Expose
    private List<List<Object>> auth_sequence;
}
