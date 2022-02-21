// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetPasswordPolicyRequest</p>
 */
public class GetPasswordPolicyRequest extends Request {
    private GetPasswordPolicyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetPasswordPolicyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetPasswordPolicyRequest response) {
            super(response);
        } 

        @Override
        public GetPasswordPolicyRequest build() {
            return new GetPasswordPolicyRequest(this);
        } 

    } 

}
