// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentSubtotalCountRequest} extends {@link RequestModel}
 *
 * <p>GetIncidentSubtotalCountRequest</p>
 */
public class GetIncidentSubtotalCountRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("incidentIds")
    @Validation(required = true)
    private java.util.List < Long > incidentIds;

    private GetIncidentSubtotalCountRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.incidentIds = builder.incidentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentSubtotalCountRequest create() {
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

    /**
     * @return incidentIds
     */
    public java.util.List < Long > getIncidentIds() {
        return this.incidentIds;
    }

    public static final class Builder extends Request.Builder<GetIncidentSubtotalCountRequest, Builder> {
        private String clientToken; 
        private java.util.List < Long > incidentIds; 

        private Builder() {
            super();
        } 

        private Builder(GetIncidentSubtotalCountRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.incidentIds = response.incidentIds;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 事件id列表
         */
        public Builder incidentIds(java.util.List < Long > incidentIds) {
            this.putBodyParameter("incidentIds", incidentIds);
            this.incidentIds = incidentIds;
            return this;
        }

        @Override
        public GetIncidentSubtotalCountRequest build() {
            return new GetIncidentSubtotalCountRequest(this);
        } 

    } 

}
