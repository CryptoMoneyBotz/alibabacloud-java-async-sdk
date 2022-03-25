// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMultiContainerGroupMetricResponse} extends {@link TeaModel}
 *
 * <p>DescribeMultiContainerGroupMetricResponse</p>
 */
public class DescribeMultiContainerGroupMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMultiContainerGroupMetricResponseBody body;

    private DescribeMultiContainerGroupMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMultiContainerGroupMetricResponse create() {
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
    public DescribeMultiContainerGroupMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMultiContainerGroupMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMultiContainerGroupMetricResponseBody body);

        @Override
        DescribeMultiContainerGroupMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMultiContainerGroupMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMultiContainerGroupMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMultiContainerGroupMetricResponse response) {
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
        public Builder body(DescribeMultiContainerGroupMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMultiContainerGroupMetricResponse build() {
            return new DescribeMultiContainerGroupMetricResponse(this);
        } 

    } 

}
