// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteHostShareKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteHostShareKeyResponseBody</p>
 */
public class DeleteHostShareKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private DeleteHostShareKeyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHostShareKeyResponseBody create() {
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
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteHostShareKeyResponseBody build() {
            return new DeleteHostShareKeyResponseBody(this);
        } 

    } 

}
