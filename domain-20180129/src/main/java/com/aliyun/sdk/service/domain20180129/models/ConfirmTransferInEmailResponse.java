// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmTransferInEmailResponse} extends {@link TeaModel}
 *
 * <p>ConfirmTransferInEmailResponse</p>
 */
public class ConfirmTransferInEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmTransferInEmailResponseBody body;

    private ConfirmTransferInEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmTransferInEmailResponse create() {
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
    public ConfirmTransferInEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmTransferInEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmTransferInEmailResponseBody body);

        @Override
        ConfirmTransferInEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmTransferInEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmTransferInEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmTransferInEmailResponse response) {
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
        public Builder body(ConfirmTransferInEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmTransferInEmailResponse build() {
            return new ConfirmTransferInEmailResponse(this);
        } 

    } 

}
