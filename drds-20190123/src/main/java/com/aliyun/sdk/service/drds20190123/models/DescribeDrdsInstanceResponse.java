// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceResponse} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceResponse</p>
 */
public class DescribeDrdsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDrdsInstanceResponseBody body;

    private DescribeDrdsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDrdsInstanceResponse create() {
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
    public DescribeDrdsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDrdsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDrdsInstanceResponseBody body);

        @Override
        DescribeDrdsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDrdsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDrdsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDrdsInstanceResponse response) {
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
        public Builder body(DescribeDrdsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDrdsInstanceResponse build() {
            return new DescribeDrdsInstanceResponse(this);
        } 

    } 

}