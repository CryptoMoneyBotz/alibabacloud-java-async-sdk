// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePolicyVersionResponse} extends {@link TeaModel}
 *
 * <p>DeletePolicyVersionResponse</p>
 */
public class DeletePolicyVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePolicyVersionResponseBody body;

    private DeletePolicyVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePolicyVersionResponse create() {
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
    public DeletePolicyVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePolicyVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePolicyVersionResponseBody body);

        @Override
        DeletePolicyVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePolicyVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePolicyVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePolicyVersionResponse response) {
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
        public Builder body(DeletePolicyVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePolicyVersionResponse build() {
            return new DeletePolicyVersionResponse(this);
        } 

    } 

}
