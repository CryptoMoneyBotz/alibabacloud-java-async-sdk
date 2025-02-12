// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerSpecRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoadBalancerSpecRequest</p>
 */
public class DescribeLoadBalancerSpecRequest extends Request {
    @Query
    @NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    private DescribeLoadBalancerSpecRequest(Builder builder) {
        super(builder);
        this.loadBalancerSpec = builder.loadBalancerSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public static final class Builder extends Request.Builder<DescribeLoadBalancerSpecRequest, Builder> {
        private String loadBalancerSpec; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoadBalancerSpecRequest response) {
            super(response);
            this.loadBalancerSpec = response.loadBalancerSpec;
        } 

        /**
         * LoadBalancerSpec.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putQueryParameter("LoadBalancerSpec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        @Override
        public DescribeLoadBalancerSpecRequest build() {
            return new DescribeLoadBalancerSpecRequest(this);
        } 

    } 

}
