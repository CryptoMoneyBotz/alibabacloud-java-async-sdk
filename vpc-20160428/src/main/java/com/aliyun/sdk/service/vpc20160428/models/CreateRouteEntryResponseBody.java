// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteEntryResponseBody</p>
 */
public class CreateRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteEntryId")
    private String routeEntryId;

    private CreateRouteEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeEntryId = builder.routeEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeEntryId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteEntryId.
         */
        public Builder routeEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }

        public CreateRouteEntryResponseBody build() {
            return new CreateRouteEntryResponseBody(this);
        } 

    } 

}