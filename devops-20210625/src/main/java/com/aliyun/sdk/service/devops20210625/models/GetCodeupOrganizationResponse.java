// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCodeupOrganizationResponse} extends {@link TeaModel}
 *
 * <p>GetCodeupOrganizationResponse</p>
 */
public class GetCodeupOrganizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCodeupOrganizationResponseBody body;

    private GetCodeupOrganizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCodeupOrganizationResponse create() {
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
    public GetCodeupOrganizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCodeupOrganizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCodeupOrganizationResponseBody body);

        @Override
        GetCodeupOrganizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCodeupOrganizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCodeupOrganizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCodeupOrganizationResponse response) {
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
        public Builder body(GetCodeupOrganizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCodeupOrganizationResponse build() {
            return new GetCodeupOrganizationResponse(this);
        } 

    } 

}