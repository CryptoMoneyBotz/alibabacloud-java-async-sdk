// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataLimitResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDataLimitResponseBody</p>
 */
public class DeleteDataLimitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDataLimitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataLimitResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDataLimitResponseBody build() {
            return new DeleteDataLimitResponseBody(this);
        } 

    } 

}