// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindMFADeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BindMFADeviceResponseBody</p>
 */
public class BindMFADeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BindMFADeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindMFADeviceResponseBody create() {
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

        public BindMFADeviceResponseBody build() {
            return new BindMFADeviceResponseBody(this);
        } 

    } 

}
