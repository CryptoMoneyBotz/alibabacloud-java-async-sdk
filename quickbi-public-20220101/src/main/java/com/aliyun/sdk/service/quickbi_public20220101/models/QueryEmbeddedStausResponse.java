// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmbeddedStausResponse} extends {@link TeaModel}
 *
 * <p>QueryEmbeddedStausResponse</p>
 */
public class QueryEmbeddedStausResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEmbeddedStausResponseBody body;

    private QueryEmbeddedStausResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEmbeddedStausResponse create() {
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
    public QueryEmbeddedStausResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEmbeddedStausResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEmbeddedStausResponseBody body);

        @Override
        QueryEmbeddedStausResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEmbeddedStausResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEmbeddedStausResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEmbeddedStausResponse response) {
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
        public Builder body(QueryEmbeddedStausResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEmbeddedStausResponse build() {
            return new QueryEmbeddedStausResponse(this);
        } 

    } 

}
