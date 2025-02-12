// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRenewalPriceResponse} extends {@link TeaModel}
 *
 * <p>DescribeRenewalPriceResponse</p>
 */
public class DescribeRenewalPriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRenewalPriceResponseBody body;

    private DescribeRenewalPriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRenewalPriceResponse create() {
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
    public DescribeRenewalPriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRenewalPriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRenewalPriceResponseBody body);

        @Override
        DescribeRenewalPriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRenewalPriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRenewalPriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRenewalPriceResponse response) {
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
        public Builder body(DescribeRenewalPriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRenewalPriceResponse build() {
            return new DescribeRenewalPriceResponse(this);
        } 

    } 

}
