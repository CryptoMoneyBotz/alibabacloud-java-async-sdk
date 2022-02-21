// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferInReenterTransferAuthorizationCodeResponse} extends {@link TeaModel}
 *
 * <p>TransferInReenterTransferAuthorizationCodeResponse</p>
 */
public class TransferInReenterTransferAuthorizationCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferInReenterTransferAuthorizationCodeResponseBody body;

    private TransferInReenterTransferAuthorizationCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferInReenterTransferAuthorizationCodeResponse create() {
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
    public TransferInReenterTransferAuthorizationCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferInReenterTransferAuthorizationCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferInReenterTransferAuthorizationCodeResponseBody body);

        @Override
        TransferInReenterTransferAuthorizationCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferInReenterTransferAuthorizationCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferInReenterTransferAuthorizationCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferInReenterTransferAuthorizationCodeResponse response) {
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
        public Builder body(TransferInReenterTransferAuthorizationCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferInReenterTransferAuthorizationCodeResponse build() {
            return new TransferInReenterTransferAuthorizationCodeResponse(this);
        } 

    } 

}
