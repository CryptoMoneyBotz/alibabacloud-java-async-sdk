// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBindingResponse} extends {@link TeaModel}
 *
 * <p>DeleteBindingResponse</p>
 */
public class DeleteBindingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBindingResponseBody body;

    private DeleteBindingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBindingResponse create() {
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
    public DeleteBindingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBindingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBindingResponseBody body);

        @Override
        DeleteBindingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBindingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBindingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBindingResponse response) {
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
        public Builder body(DeleteBindingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBindingResponse build() {
            return new DeleteBindingResponse(this);
        } 

    } 

}
