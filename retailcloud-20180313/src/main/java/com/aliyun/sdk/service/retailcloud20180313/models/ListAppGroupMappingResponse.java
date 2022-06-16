// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppGroupMappingResponse} extends {@link TeaModel}
 *
 * <p>ListAppGroupMappingResponse</p>
 */
public class ListAppGroupMappingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppGroupMappingResponseBody body;

    private ListAppGroupMappingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppGroupMappingResponse create() {
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
    public ListAppGroupMappingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppGroupMappingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppGroupMappingResponseBody body);

        @Override
        ListAppGroupMappingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppGroupMappingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppGroupMappingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppGroupMappingResponse response) {
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
        public Builder body(ListAppGroupMappingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppGroupMappingResponse build() {
            return new ListAppGroupMappingResponse(this);
        } 

    } 

}
