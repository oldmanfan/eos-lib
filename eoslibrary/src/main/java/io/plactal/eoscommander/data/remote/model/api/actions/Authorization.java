package io.plactal.eoscommander.data.remote.model.api.actions;

import com.google.gson.annotations.Expose;

/**
 * @author redli
 * @date 2019/3/14
 */

public class Authorization {
    /**
     * actor : sakuya
     * permission : active
     */

    @Expose
    private String actor;

    @Expose
    private String permission;

}
