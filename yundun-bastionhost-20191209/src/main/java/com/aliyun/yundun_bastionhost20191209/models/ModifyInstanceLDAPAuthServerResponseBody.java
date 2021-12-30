// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyInstanceLDAPAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceLDAPAuthServerResponseBody</p>
 */
public class ModifyInstanceLDAPAuthServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyInstanceLDAPAuthServerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceLDAPAuthServerResponseBody create() {
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

        public ModifyInstanceLDAPAuthServerResponseBody build() {
            return new ModifyInstanceLDAPAuthServerResponseBody(this);
        } 

    } 

}
