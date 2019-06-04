package io.plactal.eoscommander.data.remote.model.api.actions;

import com.google.gson.annotations.Expose;

/**
 * @author redli
 * @date 2019/3/14
 */
public class Action {

    /**
     * global_action_seq : 14291919
     * account_action_seq : 0
     * block_num : 14286896
     * block_time : 2019-03-13T03:02:39.500
     * action_trace : {"receipt":{"receiver":"smallred1111","act_digest":"5a2f7d6000cc7fc4ad0bf75e28014fc927a5b0502cefa13b00f58953cf98f4a7","global_sequence":14291919,"recv_sequence":1,"auth_sequence":[["sakuya",685]],"code_sequence":1,"abi_sequence":1},"act":{"account":"eosio.token","name":"transfer","authorization":[{"actor":"sakuya","permission":"active"}],"data":{"from":"sakuya","to":"smallred1111","quantity":"100.0000 TOK","memo":""},"hex_data":"0000000018afa1c110420849dd188dc440420f000000000004544f4b0000000000"},"context_free":false,"elapsed":12,"console":"","trx_id":"9059e1e5d5b4b1b7c8d633ed57373fe56d25989d6d9e6fc2ccb02af2eae81687","block_num":14286896,"block_time":"2019-03-13T03:02:39.500","producer_block_id":"00da00309a6c552c67c785c612a8ad79fe41a1e3d9bfc9fff08dddf7c8812556","account_ram_deltas":[],"except":null,"inline_traces":[]}
     */

    @Expose
    private int global_action_seq;

    @Expose
    private int account_action_seq;

    @Expose
    private int block_num;

    @Expose
    private String block_time;

    @Expose
    private ActionTrace action_trace;
}
