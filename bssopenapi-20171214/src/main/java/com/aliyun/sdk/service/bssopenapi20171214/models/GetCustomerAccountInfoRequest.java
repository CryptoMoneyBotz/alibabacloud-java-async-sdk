// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerAccountInfoRequest</p>
 */
public class GetCustomerAccountInfoRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    @Validation(required = true)
    private Long ownerId;

    private GetCustomerAccountInfoRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerAccountInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<GetCustomerAccountInfoRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomerAccountInfoRequest response) {
            super(response);
            this.ownerId = response.ownerId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public GetCustomerAccountInfoRequest build() {
            return new GetCustomerAccountInfoRequest(this);
        } 

    } 

}
