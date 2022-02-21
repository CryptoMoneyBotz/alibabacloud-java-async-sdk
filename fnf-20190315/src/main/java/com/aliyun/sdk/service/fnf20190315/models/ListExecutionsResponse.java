// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionsResponse} extends {@link TeaModel}
 *
 * <p>ListExecutionsResponse</p>
 */
public class ListExecutionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExecutionsResponseBody body;

    private ListExecutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExecutionsResponse create() {
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
    public ListExecutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExecutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExecutionsResponseBody body);

        @Override
        ListExecutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExecutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExecutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExecutionsResponse response) {
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
        public Builder body(ListExecutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExecutionsResponse build() {
            return new ListExecutionsResponse(this);
        } 

    } 

}