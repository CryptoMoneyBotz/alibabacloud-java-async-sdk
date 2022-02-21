// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySessionByClientIdResponse} extends {@link TeaModel}
 *
 * <p>QuerySessionByClientIdResponse</p>
 */
public class QuerySessionByClientIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySessionByClientIdResponseBody body;

    private QuerySessionByClientIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySessionByClientIdResponse create() {
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
    public QuerySessionByClientIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySessionByClientIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySessionByClientIdResponseBody body);

        @Override
        QuerySessionByClientIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySessionByClientIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySessionByClientIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySessionByClientIdResponse response) {
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
        public Builder body(QuerySessionByClientIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySessionByClientIdResponse build() {
            return new QuerySessionByClientIdResponse(this);
        } 

    } 

}