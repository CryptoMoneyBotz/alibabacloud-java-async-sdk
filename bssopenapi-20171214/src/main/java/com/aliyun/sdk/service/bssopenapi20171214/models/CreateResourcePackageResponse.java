// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourcePackageResponse} extends {@link TeaModel}
 *
 * <p>CreateResourcePackageResponse</p>
 */
public class CreateResourcePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourcePackageResponseBody body;

    private CreateResourcePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourcePackageResponse create() {
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
    public CreateResourcePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourcePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourcePackageResponseBody body);

        @Override
        CreateResourcePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourcePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourcePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourcePackageResponse response) {
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
        public Builder body(CreateResourcePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourcePackageResponse build() {
            return new CreateResourcePackageResponse(this);
        } 

    } 

}
