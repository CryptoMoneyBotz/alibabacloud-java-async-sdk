// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTransitRouterResponse} extends {@link TeaModel}
 *
 * <p>DeleteTransitRouterResponse</p>
 */
public class DeleteTransitRouterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTransitRouterResponseBody body;

    private DeleteTransitRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTransitRouterResponse create() {
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
    public DeleteTransitRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTransitRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTransitRouterResponseBody body);

        @Override
        DeleteTransitRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTransitRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTransitRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTransitRouterResponse response) {
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
        public Builder body(DeleteTransitRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTransitRouterResponse build() {
            return new DeleteTransitRouterResponse(this);
        } 

    } 

}
