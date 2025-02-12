// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateOAuthTokenRequest</p>
 */
public class CreateOAuthTokenRequest extends Request {
    @Body
    @NameInMap("clientId")
    @Validation(required = true)
    private String clientId;

    @Body
    @NameInMap("clientSecret")
    @Validation(required = true)
    private String clientSecret;

    @Body
    @NameInMap("code")
    private String code;

    @Body
    @NameInMap("grantType")
    @Validation(required = true)
    private String grantType;

    @Body
    @NameInMap("login")
    private String login;

    @Body
    @NameInMap("scope")
    @Validation(required = true)
    private String scope;

    private CreateOAuthTokenRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.code = builder.code;
        this.grantType = builder.grantType;
        this.login = builder.login;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOAuthTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return login
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<CreateOAuthTokenRequest, Builder> {
        private String clientId; 
        private String clientSecret; 
        private String code; 
        private String grantType; 
        private String login; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(CreateOAuthTokenRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.code = request.code;
            this.grantType = request.grantType;
            this.login = request.login;
            this.scope = request.scope;
        } 

        /**
         * clientId
         * <p>
         * 
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * client_secret
         */
        public Builder clientSecret(String clientSecret) {
            this.putBodyParameter("clientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * 当前grantType=code时必传
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * 授权类型：code，token
         */
        public Builder grantType(String grantType) {
            this.putBodyParameter("grantType", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * code = token时必传
         */
        public Builder login(String login) {
            this.putBodyParameter("login", login);
            this.login = login;
            return this;
        }

        /**
         * 授权范围.例如：read:repo,write:repo
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public CreateOAuthTokenRequest build() {
            return new CreateOAuthTokenRequest(this);
        } 

    } 

}
