// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppCmsGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListAppCmsGroupsResponse</p>
 */
public class ListAppCmsGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppCmsGroupsResponseBody body;

    private ListAppCmsGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppCmsGroupsResponse create() {
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
    public ListAppCmsGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppCmsGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppCmsGroupsResponseBody body);

        @Override
        ListAppCmsGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppCmsGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppCmsGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppCmsGroupsResponse response) {
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
        public Builder body(ListAppCmsGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppCmsGroupsResponse build() {
            return new ListAppCmsGroupsResponse(this);
        } 

    } 

}
