// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildDesktopsResponse} extends {@link TeaModel}
 *
 * <p>RebuildDesktopsResponse</p>
 */
public class RebuildDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebuildDesktopsResponseBody body;

    private RebuildDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebuildDesktopsResponse create() {
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
    public RebuildDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebuildDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebuildDesktopsResponseBody body);

        @Override
        RebuildDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebuildDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebuildDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebuildDesktopsResponse response) {
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
        public Builder body(RebuildDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebuildDesktopsResponse build() {
            return new RebuildDesktopsResponse(this);
        } 

    } 

}