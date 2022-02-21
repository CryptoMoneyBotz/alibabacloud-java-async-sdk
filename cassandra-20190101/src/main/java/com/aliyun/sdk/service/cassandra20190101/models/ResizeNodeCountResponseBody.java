// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeNodeCountResponseBody} extends {@link TeaModel}
 *
 * <p>ResizeNodeCountResponseBody</p>
 */
public class ResizeNodeCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResizeNodeCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeNodeCountResponseBody create() {
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

        public ResizeNodeCountResponseBody build() {
            return new ResizeNodeCountResponseBody(this);
        } 

    } 

}