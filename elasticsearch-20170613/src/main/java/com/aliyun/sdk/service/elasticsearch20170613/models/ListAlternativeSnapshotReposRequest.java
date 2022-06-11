// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlternativeSnapshotReposRequest} extends {@link RequestModel}
 *
 * <p>ListAlternativeSnapshotReposRequest</p>
 */
public class ListAlternativeSnapshotReposRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("alreadySetItems")
    private Boolean alreadySetItems;

    @Body
    @NameInMap("body")
    private String body;

    private ListAlternativeSnapshotReposRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.alreadySetItems = builder.alreadySetItems;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlternativeSnapshotReposRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return alreadySetItems
     */
    public Boolean getAlreadySetItems() {
        return this.alreadySetItems;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListAlternativeSnapshotReposRequest, Builder> {
        private String instanceId; 
        private Boolean alreadySetItems; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(ListAlternativeSnapshotReposRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.alreadySetItems = request.alreadySetItems;
            this.body = request.body;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * alreadySetItems.
         */
        public Builder alreadySetItems(Boolean alreadySetItems) {
            this.putQueryParameter("alreadySetItems", alreadySetItems);
            this.alreadySetItems = alreadySetItems;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListAlternativeSnapshotReposRequest build() {
            return new ListAlternativeSnapshotReposRequest(this);
        } 

    } 

}
