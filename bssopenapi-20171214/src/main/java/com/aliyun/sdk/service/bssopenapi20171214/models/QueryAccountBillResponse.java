// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccountBillResponse} extends {@link TeaModel}
 *
 * <p>QueryAccountBillResponse</p>
 */
public class QueryAccountBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAccountBillResponseBody body;

    private QueryAccountBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAccountBillResponse create() {
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
    public QueryAccountBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAccountBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAccountBillResponseBody body);

        @Override
        QueryAccountBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAccountBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAccountBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAccountBillResponse response) {
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
        public Builder body(QueryAccountBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAccountBillResponse build() {
            return new QueryAccountBillResponse(this);
        } 

    } 

}
