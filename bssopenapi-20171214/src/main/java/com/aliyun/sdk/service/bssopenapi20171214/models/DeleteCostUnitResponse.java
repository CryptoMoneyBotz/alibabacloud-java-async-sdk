// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCostUnitResponse} extends {@link TeaModel}
 *
 * <p>DeleteCostUnitResponse</p>
 */
public class DeleteCostUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCostUnitResponseBody body;

    private DeleteCostUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCostUnitResponse create() {
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
    public DeleteCostUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCostUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCostUnitResponseBody body);

        @Override
        DeleteCostUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCostUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCostUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCostUnitResponse response) {
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
        public Builder body(DeleteCostUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCostUnitResponse build() {
            return new DeleteCostUnitResponse(this);
        } 

    } 

}
