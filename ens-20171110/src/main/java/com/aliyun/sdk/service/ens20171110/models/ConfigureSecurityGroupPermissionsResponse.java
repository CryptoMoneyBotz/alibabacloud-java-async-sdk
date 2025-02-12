// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSecurityGroupPermissionsResponse} extends {@link TeaModel}
 *
 * <p>ConfigureSecurityGroupPermissionsResponse</p>
 */
public class ConfigureSecurityGroupPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureSecurityGroupPermissionsResponseBody body;

    private ConfigureSecurityGroupPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureSecurityGroupPermissionsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ConfigureSecurityGroupPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureSecurityGroupPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureSecurityGroupPermissionsResponseBody body);

        @Override
        ConfigureSecurityGroupPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureSecurityGroupPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureSecurityGroupPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureSecurityGroupPermissionsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ConfigureSecurityGroupPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureSecurityGroupPermissionsResponse build() {
            return new ConfigureSecurityGroupPermissionsResponse(this);
        } 

    } 

}
