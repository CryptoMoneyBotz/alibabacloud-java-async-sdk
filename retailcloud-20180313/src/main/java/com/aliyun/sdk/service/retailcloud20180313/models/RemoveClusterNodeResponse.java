// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveClusterNodeResponse} extends {@link TeaModel}
 *
 * <p>RemoveClusterNodeResponse</p>
 */
public class RemoveClusterNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveClusterNodeResponseBody body;

    private RemoveClusterNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveClusterNodeResponse create() {
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
    public RemoveClusterNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveClusterNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveClusterNodeResponseBody body);

        @Override
        RemoveClusterNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveClusterNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveClusterNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveClusterNodeResponse response) {
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
        public Builder body(RemoveClusterNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveClusterNodeResponse build() {
            return new RemoveClusterNodeResponse(this);
        } 

    } 

}
