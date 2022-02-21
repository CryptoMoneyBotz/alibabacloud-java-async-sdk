// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateCostUnitResourceResponse} extends {@link TeaModel}
 *
 * <p>AllocateCostUnitResourceResponse</p>
 */
public class AllocateCostUnitResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateCostUnitResourceResponseBody body;

    private AllocateCostUnitResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateCostUnitResourceResponse create() {
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
    public AllocateCostUnitResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateCostUnitResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateCostUnitResourceResponseBody body);

        @Override
        AllocateCostUnitResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateCostUnitResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateCostUnitResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateCostUnitResourceResponse response) {
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
        public Builder body(AllocateCostUnitResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateCostUnitResourceResponse build() {
            return new AllocateCostUnitResourceResponse(this);
        } 

    } 

}