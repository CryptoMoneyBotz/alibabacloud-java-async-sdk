// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDBResourcePoolWithUserResponse} extends {@link TeaModel}
 *
 * <p>BindDBResourcePoolWithUserResponse</p>
 */
public class BindDBResourcePoolWithUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindDBResourcePoolWithUserResponseBody body;

    private BindDBResourcePoolWithUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindDBResourcePoolWithUserResponse create() {
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
    public BindDBResourcePoolWithUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindDBResourcePoolWithUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindDBResourcePoolWithUserResponseBody body);

        @Override
        BindDBResourcePoolWithUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindDBResourcePoolWithUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindDBResourcePoolWithUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindDBResourcePoolWithUserResponse response) {
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
        public Builder body(BindDBResourcePoolWithUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindDBResourcePoolWithUserResponse build() {
            return new BindDBResourcePoolWithUserResponse(this);
        } 

    } 

}
