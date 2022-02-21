// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccessKeyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAccessKeyResponseBody</p>
 */
public class UpdateAccessKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateAccessKeyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccessKeyResponseBody create() {
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

        public UpdateAccessKeyResponseBody build() {
            return new UpdateAccessKeyResponseBody(this);
        } 

    } 

}