// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReleaseMetricResponse} extends {@link TeaModel}
 *
 * <p>QueryReleaseMetricResponse</p>
 */
public class QueryReleaseMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryReleaseMetricResponseBody body;

    private QueryReleaseMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryReleaseMetricResponse create() {
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
    public QueryReleaseMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryReleaseMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryReleaseMetricResponseBody body);

        @Override
        QueryReleaseMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryReleaseMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryReleaseMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryReleaseMetricResponse response) {
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
        public Builder body(QueryReleaseMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryReleaseMetricResponse build() {
            return new QueryReleaseMetricResponse(this);
        } 

    } 

}
