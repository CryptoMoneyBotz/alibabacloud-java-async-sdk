// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCodeupOrganizationRequest} extends {@link RequestModel}
 *
 * <p>GetCodeupOrganizationRequest</p>
 */
public class GetCodeupOrganizationRequest extends Request {
    @Path
    @NameInMap("identity")
    @Validation(required = true)
    private String identity;

    @Query
    @NameInMap("AccessToken")
    private String accessToken;

    private GetCodeupOrganizationRequest(Builder builder) {
        super(builder);
        this.identity = builder.identity;
        this.accessToken = builder.accessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCodeupOrganizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    public static final class Builder extends Request.Builder<GetCodeupOrganizationRequest, Builder> {
        private String identity; 
        private String accessToken; 

        private Builder() {
            super();
        } 

        private Builder(GetCodeupOrganizationRequest request) {
            super(request);
            this.identity = request.identity;
            this.accessToken = request.accessToken;
        } 

        /**
         * identity.
         */
        public Builder identity(String identity) {
            this.putPathParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        @Override
        public GetCodeupOrganizationRequest build() {
            return new GetCodeupOrganizationRequest(this);
        } 

    } 

}
