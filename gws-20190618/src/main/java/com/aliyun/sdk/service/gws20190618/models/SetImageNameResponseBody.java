// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetImageNameResponseBody} extends {@link TeaModel}
 *
 * <p>SetImageNameResponseBody</p>
 */
public class SetImageNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetImageNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetImageNameResponseBody create() {
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

        public SetImageNameResponseBody build() {
            return new SetImageNameResponseBody(this);
        } 

    } 

}
