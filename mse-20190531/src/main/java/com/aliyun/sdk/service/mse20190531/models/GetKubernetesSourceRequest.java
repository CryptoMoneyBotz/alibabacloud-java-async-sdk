// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKubernetesSourceRequest} extends {@link RequestModel}
 *
 * <p>GetKubernetesSourceRequest</p>
 */
public class GetKubernetesSourceRequest extends Request {
    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    private GetKubernetesSourceRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKubernetesSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public static final class Builder extends Request.Builder<GetKubernetesSourceRequest, Builder> {
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(GetKubernetesSourceRequest response) {
            super(response);
            this.gatewayUniqueId = response.gatewayUniqueId;
        } 

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public GetKubernetesSourceRequest build() {
            return new GetKubernetesSourceRequest(this);
        } 

    } 

}