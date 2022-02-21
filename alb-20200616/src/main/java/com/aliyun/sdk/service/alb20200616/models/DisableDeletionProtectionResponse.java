// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDeletionProtectionResponse} extends {@link TeaModel}
 *
 * <p>DisableDeletionProtectionResponse</p>
 */
public class DisableDeletionProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableDeletionProtectionResponseBody body;

    private DisableDeletionProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableDeletionProtectionResponse create() {
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
    public DisableDeletionProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableDeletionProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableDeletionProtectionResponseBody body);

        @Override
        DisableDeletionProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableDeletionProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableDeletionProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableDeletionProtectionResponse response) {
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
        public Builder body(DisableDeletionProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableDeletionProtectionResponse build() {
            return new DisableDeletionProtectionResponse(this);
        } 

    } 

}