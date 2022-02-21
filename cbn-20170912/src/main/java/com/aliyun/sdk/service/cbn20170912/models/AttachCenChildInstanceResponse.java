// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachCenChildInstanceResponse} extends {@link TeaModel}
 *
 * <p>AttachCenChildInstanceResponse</p>
 */
public class AttachCenChildInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachCenChildInstanceResponseBody body;

    private AttachCenChildInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachCenChildInstanceResponse create() {
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
    public AttachCenChildInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachCenChildInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachCenChildInstanceResponseBody body);

        @Override
        AttachCenChildInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachCenChildInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachCenChildInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachCenChildInstanceResponse response) {
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
        public Builder body(AttachCenChildInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachCenChildInstanceResponse build() {
            return new AttachCenChildInstanceResponse(this);
        } 

    } 

}