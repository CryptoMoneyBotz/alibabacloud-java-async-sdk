// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TurnOnSecondSwitchResponse} extends {@link TeaModel}
 *
 * <p>TurnOnSecondSwitchResponse</p>
 */
public class TurnOnSecondSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TurnOnSecondSwitchResponseBody body;

    private TurnOnSecondSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TurnOnSecondSwitchResponse create() {
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
    public TurnOnSecondSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TurnOnSecondSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TurnOnSecondSwitchResponseBody body);

        @Override
        TurnOnSecondSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TurnOnSecondSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TurnOnSecondSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TurnOnSecondSwitchResponse response) {
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
        public Builder body(TurnOnSecondSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TurnOnSecondSwitchResponse build() {
            return new TurnOnSecondSwitchResponse(this);
        } 

    } 

}
