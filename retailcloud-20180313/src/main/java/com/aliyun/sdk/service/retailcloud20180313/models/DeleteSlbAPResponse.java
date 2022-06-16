// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSlbAPResponse} extends {@link TeaModel}
 *
 * <p>DeleteSlbAPResponse</p>
 */
public class DeleteSlbAPResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSlbAPResponseBody body;

    private DeleteSlbAPResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSlbAPResponse create() {
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
    public DeleteSlbAPResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSlbAPResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSlbAPResponseBody body);

        @Override
        DeleteSlbAPResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSlbAPResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSlbAPResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSlbAPResponse response) {
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
        public Builder body(DeleteSlbAPResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSlbAPResponse build() {
            return new DeleteSlbAPResponse(this);
        } 

    } 

}
