// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOpenAccountResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteOpenAccountResponseBody</p>
 */
public class DeleteOpenAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteOpenAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOpenAccountResponseBody create() {
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

        public DeleteOpenAccountResponseBody build() {
            return new DeleteOpenAccountResponseBody(this);
        } 

    } 

}