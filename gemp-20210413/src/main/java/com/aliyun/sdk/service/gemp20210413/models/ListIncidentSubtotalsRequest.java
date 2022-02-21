// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentSubtotalsRequest} extends {@link RequestModel}
 *
 * <p>ListIncidentSubtotalsRequest</p>
 */
public class ListIncidentSubtotalsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("incidentId")
    private Long incidentId;

    private ListIncidentSubtotalsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.incidentId = builder.incidentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentSubtotalsRequest create() {
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
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    public static final class Builder extends Request.Builder<ListIncidentSubtotalsRequest, Builder> {
        private String clientToken; 
        private Long incidentId; 

        private Builder() {
            super();
        } 

        private Builder(ListIncidentSubtotalsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.incidentId = response.incidentId;
        } 

        /**
         * 幂等校验
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 事件ID
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        @Override
        public ListIncidentSubtotalsRequest build() {
            return new ListIncidentSubtotalsRequest(this);
        } 

    } 

}
