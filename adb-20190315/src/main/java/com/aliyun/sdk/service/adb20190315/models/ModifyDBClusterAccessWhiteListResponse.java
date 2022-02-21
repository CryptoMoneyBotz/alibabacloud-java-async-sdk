// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterAccessWhiteListResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterAccessWhiteListResponse</p>
 */
public class ModifyDBClusterAccessWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBClusterAccessWhiteListResponseBody body;

    private ModifyDBClusterAccessWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBClusterAccessWhiteListResponse create() {
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
    public ModifyDBClusterAccessWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBClusterAccessWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBClusterAccessWhiteListResponseBody body);

        @Override
        ModifyDBClusterAccessWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBClusterAccessWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBClusterAccessWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBClusterAccessWhiteListResponse response) {
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
        public Builder body(ModifyDBClusterAccessWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBClusterAccessWhiteListResponse build() {
            return new ModifyDBClusterAccessWhiteListResponse(this);
        } 

    } 

}
