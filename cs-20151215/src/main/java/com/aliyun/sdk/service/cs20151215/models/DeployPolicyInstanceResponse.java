// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployPolicyInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeployPolicyInstanceResponse</p>
 */
public class DeployPolicyInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeployPolicyInstanceResponseBody body;

    private DeployPolicyInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeployPolicyInstanceResponse create() {
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
    public DeployPolicyInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployPolicyInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeployPolicyInstanceResponseBody body);

        @Override
        DeployPolicyInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployPolicyInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeployPolicyInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployPolicyInstanceResponse response) {
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
        public Builder body(DeployPolicyInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployPolicyInstanceResponse build() {
            return new DeployPolicyInstanceResponse(this);
        } 

    } 

}