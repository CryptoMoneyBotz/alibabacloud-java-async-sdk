// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerListResponse} extends {@link TeaModel}
 *
 * <p>GetCustomerListResponse</p>
 */
public class GetCustomerListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCustomerListResponseBody body;

    private GetCustomerListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCustomerListResponse create() {
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
    public GetCustomerListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCustomerListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCustomerListResponseBody body);

        @Override
        GetCustomerListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCustomerListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCustomerListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCustomerListResponse response) {
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
        public Builder body(GetCustomerListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCustomerListResponse build() {
            return new GetCustomerListResponse(this);
        } 

    } 

}
