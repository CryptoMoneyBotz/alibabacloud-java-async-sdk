// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStructSyncOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateStructSyncOrderResponse</p>
 */
public class CreateStructSyncOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStructSyncOrderResponseBody body;

    private CreateStructSyncOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStructSyncOrderResponse create() {
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
    public CreateStructSyncOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStructSyncOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStructSyncOrderResponseBody body);

        @Override
        CreateStructSyncOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStructSyncOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStructSyncOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStructSyncOrderResponse response) {
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
        public Builder body(CreateStructSyncOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStructSyncOrderResponse build() {
            return new CreateStructSyncOrderResponse(this);
        } 

    } 

}