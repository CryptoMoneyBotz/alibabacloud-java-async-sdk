// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataCorrectExecSQLResponse} extends {@link TeaModel}
 *
 * <p>ModifyDataCorrectExecSQLResponse</p>
 */
public class ModifyDataCorrectExecSQLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDataCorrectExecSQLResponseBody body;

    private ModifyDataCorrectExecSQLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDataCorrectExecSQLResponse create() {
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
    public ModifyDataCorrectExecSQLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDataCorrectExecSQLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDataCorrectExecSQLResponseBody body);

        @Override
        ModifyDataCorrectExecSQLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDataCorrectExecSQLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDataCorrectExecSQLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDataCorrectExecSQLResponse response) {
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
        public Builder body(ModifyDataCorrectExecSQLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDataCorrectExecSQLResponse build() {
            return new ModifyDataCorrectExecSQLResponse(this);
        } 

    } 

}
