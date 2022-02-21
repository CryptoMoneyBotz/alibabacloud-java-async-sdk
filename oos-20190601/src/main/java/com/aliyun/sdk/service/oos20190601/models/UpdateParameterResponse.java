// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateParameterResponse} extends {@link TeaModel}
 *
 * <p>UpdateParameterResponse</p>
 */
public class UpdateParameterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateParameterResponseBody body;

    private UpdateParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateParameterResponse create() {
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
    public UpdateParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateParameterResponseBody body);

        @Override
        UpdateParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateParameterResponse response) {
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
        public Builder body(UpdateParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateParameterResponse build() {
            return new UpdateParameterResponse(this);
        } 

    } 

}
