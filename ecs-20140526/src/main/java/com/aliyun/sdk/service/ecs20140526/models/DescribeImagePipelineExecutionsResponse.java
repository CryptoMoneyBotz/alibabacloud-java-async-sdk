// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePipelineExecutionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeImagePipelineExecutionsResponse</p>
 */
public class DescribeImagePipelineExecutionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImagePipelineExecutionsResponseBody body;

    private DescribeImagePipelineExecutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImagePipelineExecutionsResponse create() {
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
    public DescribeImagePipelineExecutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImagePipelineExecutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImagePipelineExecutionsResponseBody body);

        @Override
        DescribeImagePipelineExecutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImagePipelineExecutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImagePipelineExecutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImagePipelineExecutionsResponse response) {
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
        public Builder body(DescribeImagePipelineExecutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImagePipelineExecutionsResponse build() {
            return new DescribeImagePipelineExecutionsResponse(this);
        } 

    } 

}
