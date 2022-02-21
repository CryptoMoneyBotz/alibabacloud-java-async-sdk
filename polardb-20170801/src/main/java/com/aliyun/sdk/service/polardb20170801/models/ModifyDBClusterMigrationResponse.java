// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterMigrationResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterMigrationResponse</p>
 */
public class ModifyDBClusterMigrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBClusterMigrationResponseBody body;

    private ModifyDBClusterMigrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBClusterMigrationResponse create() {
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
    public ModifyDBClusterMigrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBClusterMigrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBClusterMigrationResponseBody body);

        @Override
        ModifyDBClusterMigrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBClusterMigrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBClusterMigrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBClusterMigrationResponse response) {
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
        public Builder body(ModifyDBClusterMigrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBClusterMigrationResponse build() {
            return new ModifyDBClusterMigrationResponse(this);
        } 

    } 

}