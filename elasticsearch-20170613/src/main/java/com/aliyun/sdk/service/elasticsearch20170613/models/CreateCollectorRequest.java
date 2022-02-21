// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCollectorRequest} extends {@link RequestModel}
 *
 * <p>CreateCollectorRequest</p>
 */
public class CreateCollectorRequest extends Request {
    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private CreateCollectorRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCollectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateCollectorRequest, Builder> {
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateCollectorRequest response) {
            super(response);
            this.clientToken = response.clientToken;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateCollectorRequest build() {
            return new CreateCollectorRequest(this);
        } 

    } 

}