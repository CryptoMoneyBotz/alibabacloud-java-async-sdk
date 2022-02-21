// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFCTriggerResponse} extends {@link TeaModel}
 *
 * <p>ListFCTriggerResponse</p>
 */
public class ListFCTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFCTriggerResponseBody body;

    private ListFCTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFCTriggerResponse create() {
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
    public ListFCTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFCTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFCTriggerResponseBody body);

        @Override
        ListFCTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFCTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFCTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFCTriggerResponse response) {
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
        public Builder body(ListFCTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFCTriggerResponse build() {
            return new ListFCTriggerResponse(this);
        } 

    } 

}