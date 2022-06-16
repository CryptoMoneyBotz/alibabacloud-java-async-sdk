// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClusterNodeRequest} extends {@link RequestModel}
 *
 * <p>AddClusterNodeRequest</p>
 */
public class AddClusterNodeRequest extends Request {
    @Query
    @NameInMap("ClusterInstanceId")
    @Validation(required = true)
    private String clusterInstanceId;

    @Query
    @NameInMap("EcsInstanceIdList")
    @Validation(required = true)
    private java.util.List < String > ecsInstanceIdList;

    private AddClusterNodeRequest(Builder builder) {
        super(builder);
        this.clusterInstanceId = builder.clusterInstanceId;
        this.ecsInstanceIdList = builder.ecsInstanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClusterNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterInstanceId
     */
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    /**
     * @return ecsInstanceIdList
     */
    public java.util.List < String > getEcsInstanceIdList() {
        return this.ecsInstanceIdList;
    }

    public static final class Builder extends Request.Builder<AddClusterNodeRequest, Builder> {
        private String clusterInstanceId; 
        private java.util.List < String > ecsInstanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(AddClusterNodeRequest request) {
            super(request);
            this.clusterInstanceId = request.clusterInstanceId;
            this.ecsInstanceIdList = request.ecsInstanceIdList;
        } 

        /**
         * ClusterInstanceId.
         */
        public Builder clusterInstanceId(String clusterInstanceId) {
            this.putQueryParameter("ClusterInstanceId", clusterInstanceId);
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }

        /**
         * EcsInstanceIdList.
         */
        public Builder ecsInstanceIdList(java.util.List < String > ecsInstanceIdList) {
            this.putQueryParameter("EcsInstanceIdList", ecsInstanceIdList);
            this.ecsInstanceIdList = ecsInstanceIdList;
            return this;
        }

        @Override
        public AddClusterNodeRequest build() {
            return new AddClusterNodeRequest(this);
        } 

    } 

}
