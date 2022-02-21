// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplatesResponse} extends {@link TeaModel}
 *
 * <p>DeleteTemplatesResponse</p>
 */
public class DeleteTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTemplatesResponseBody body;

    private DeleteTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTemplatesResponse create() {
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
    public DeleteTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTemplatesResponseBody body);

        @Override
        DeleteTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTemplatesResponse response) {
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
        public Builder body(DeleteTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTemplatesResponse build() {
            return new DeleteTemplatesResponse(this);
        } 

    } 

}
