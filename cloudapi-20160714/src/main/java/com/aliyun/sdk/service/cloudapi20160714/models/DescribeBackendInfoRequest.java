// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackendInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackendInfoRequest</p>
 */
public class DescribeBackendInfoRequest extends Request {
    @Query
    @NameInMap("BackendId")
    private String backendId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeBackendInfoRequest(Builder builder) {
        super(builder);
        this.backendId = builder.backendId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackendInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendId
     */
    public String getBackendId() {
        return this.backendId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeBackendInfoRequest, Builder> {
        private String backendId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackendInfoRequest response) {
            super(response);
            this.backendId = response.backendId;
            this.securityToken = response.securityToken;
        } 

        /**
         * BackendId.
         */
        public Builder backendId(String backendId) {
            this.putQueryParameter("BackendId", backendId);
            this.backendId = backendId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeBackendInfoRequest build() {
            return new DescribeBackendInfoRequest(this);
        } 

    } 

}
