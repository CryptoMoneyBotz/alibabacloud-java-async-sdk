// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitOrderApprovalResponse} extends {@link TeaModel}
 *
 * <p>SubmitOrderApprovalResponse</p>
 */
public class SubmitOrderApprovalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitOrderApprovalResponseBody body;

    private SubmitOrderApprovalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitOrderApprovalResponse create() {
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
    public SubmitOrderApprovalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitOrderApprovalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitOrderApprovalResponseBody body);

        @Override
        SubmitOrderApprovalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitOrderApprovalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitOrderApprovalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitOrderApprovalResponse response) {
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
        public Builder body(SubmitOrderApprovalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitOrderApprovalResponse build() {
            return new SubmitOrderApprovalResponse(this);
        } 

    } 

}
