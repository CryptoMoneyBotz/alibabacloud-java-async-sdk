// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansInstanceResponse} extends {@link TeaModel}
 *
 * <p>QuerySavingsPlansInstanceResponse</p>
 */
public class QuerySavingsPlansInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySavingsPlansInstanceResponseBody body;

    private QuerySavingsPlansInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySavingsPlansInstanceResponse create() {
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
    public QuerySavingsPlansInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySavingsPlansInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySavingsPlansInstanceResponseBody body);

        @Override
        QuerySavingsPlansInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySavingsPlansInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySavingsPlansInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySavingsPlansInstanceResponse response) {
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
        public Builder body(QuerySavingsPlansInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySavingsPlansInstanceResponse build() {
            return new QuerySavingsPlansInstanceResponse(this);
        } 

    } 

}
