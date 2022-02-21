// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPredefinedScopesRequest} extends {@link RequestModel}
 *
 * <p>ListPredefinedScopesRequest</p>
 */
public class ListPredefinedScopesRequest extends Request {
    @Query
    @NameInMap("AppType")
    private String appType;

    private ListPredefinedScopesRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPredefinedScopesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    public static final class Builder extends Request.Builder<ListPredefinedScopesRequest, Builder> {
        private String appType; 

        private Builder() {
            super();
        } 

        private Builder(ListPredefinedScopesRequest response) {
            super(response);
            this.appType = response.appType;
        } 

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        @Override
        public ListPredefinedScopesRequest build() {
            return new ListPredefinedScopesRequest(this);
        } 

    } 

}