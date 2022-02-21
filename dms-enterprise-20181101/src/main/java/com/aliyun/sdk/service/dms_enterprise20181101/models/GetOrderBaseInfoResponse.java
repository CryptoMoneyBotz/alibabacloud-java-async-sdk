// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderBaseInfoResponse} extends {@link TeaModel}
 *
 * <p>GetOrderBaseInfoResponse</p>
 */
public class GetOrderBaseInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOrderBaseInfoResponseBody body;

    private GetOrderBaseInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOrderBaseInfoResponse create() {
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
    public GetOrderBaseInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrderBaseInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOrderBaseInfoResponseBody body);

        @Override
        GetOrderBaseInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrderBaseInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOrderBaseInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrderBaseInfoResponse response) {
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
        public Builder body(GetOrderBaseInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrderBaseInfoResponse build() {
            return new GetOrderBaseInfoResponse(this);
        } 

    } 

}
