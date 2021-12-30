// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyUserResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyUserResponseBody</p>
 */
public class ModifyUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyUserResponseBody build() {
            return new ModifyUserResponseBody(this);
        } 

    } 

}
