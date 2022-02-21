// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProblemPictureLinkResponse} extends {@link TeaModel}
 *
 * <p>GenerateProblemPictureLinkResponse</p>
 */
public class GenerateProblemPictureLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateProblemPictureLinkResponseBody body;

    private GenerateProblemPictureLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateProblemPictureLinkResponse create() {
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
    public GenerateProblemPictureLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateProblemPictureLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateProblemPictureLinkResponseBody body);

        @Override
        GenerateProblemPictureLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateProblemPictureLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateProblemPictureLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateProblemPictureLinkResponse response) {
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
        public Builder body(GenerateProblemPictureLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateProblemPictureLinkResponse build() {
            return new GenerateProblemPictureLinkResponse(this);
        } 

    } 

}
