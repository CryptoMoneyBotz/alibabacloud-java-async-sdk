// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLocalNodesResponse} extends {@link TeaModel}
 *
 * <p>AddLocalNodesResponse</p>
 */
public class AddLocalNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLocalNodesResponseBody body;

    private AddLocalNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLocalNodesResponse create() {
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
    public AddLocalNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLocalNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLocalNodesResponseBody body);

        @Override
        AddLocalNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLocalNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLocalNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLocalNodesResponse response) {
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
        public Builder body(AddLocalNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLocalNodesResponse build() {
            return new AddLocalNodesResponse(this);
        } 

    } 

}