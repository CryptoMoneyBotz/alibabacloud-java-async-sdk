// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncJobDetailResponse} extends {@link TeaModel}
 *
 * <p>GetStructSyncJobDetailResponse</p>
 */
public class GetStructSyncJobDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStructSyncJobDetailResponseBody body;

    private GetStructSyncJobDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStructSyncJobDetailResponse create() {
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
    public GetStructSyncJobDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStructSyncJobDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStructSyncJobDetailResponseBody body);

        @Override
        GetStructSyncJobDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStructSyncJobDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStructSyncJobDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStructSyncJobDetailResponse response) {
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
        public Builder body(GetStructSyncJobDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStructSyncJobDetailResponse build() {
            return new GetStructSyncJobDetailResponse(this);
        } 

    } 

}
