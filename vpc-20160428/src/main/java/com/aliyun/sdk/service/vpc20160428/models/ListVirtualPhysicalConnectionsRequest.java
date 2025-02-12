// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualPhysicalConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListVirtualPhysicalConnectionsRequest</p>
 */
public class ListVirtualPhysicalConnectionsRequest extends Request {
    @Query
    @NameInMap("IsConfirmed")
    private Boolean isConfirmed;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalConnectionId")
    private String physicalConnectionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VirtualPhysicalConnectionAliUids")
    private java.util.List < String > virtualPhysicalConnectionAliUids;

    @Query
    @NameInMap("VirtualPhysicalConnectionBusinessStatus")
    private String virtualPhysicalConnectionBusinessStatus;

    @Query
    @NameInMap("VirtualPhysicalConnectionIds")
    private java.util.List < String > virtualPhysicalConnectionIds;

    @Query
    @NameInMap("VirtualPhysicalConnectionStatuses")
    private java.util.List < String > virtualPhysicalConnectionStatuses;

    @Query
    @NameInMap("VlanIds")
    private java.util.List < String > vlanIds;

    private ListVirtualPhysicalConnectionsRequest(Builder builder) {
        super(builder);
        this.isConfirmed = builder.isConfirmed;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
        this.virtualPhysicalConnectionAliUids = builder.virtualPhysicalConnectionAliUids;
        this.virtualPhysicalConnectionBusinessStatus = builder.virtualPhysicalConnectionBusinessStatus;
        this.virtualPhysicalConnectionIds = builder.virtualPhysicalConnectionIds;
        this.virtualPhysicalConnectionStatuses = builder.virtualPhysicalConnectionStatuses;
        this.vlanIds = builder.vlanIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualPhysicalConnectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isConfirmed
     */
    public Boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return virtualPhysicalConnectionAliUids
     */
    public java.util.List < String > getVirtualPhysicalConnectionAliUids() {
        return this.virtualPhysicalConnectionAliUids;
    }

    /**
     * @return virtualPhysicalConnectionBusinessStatus
     */
    public String getVirtualPhysicalConnectionBusinessStatus() {
        return this.virtualPhysicalConnectionBusinessStatus;
    }

    /**
     * @return virtualPhysicalConnectionIds
     */
    public java.util.List < String > getVirtualPhysicalConnectionIds() {
        return this.virtualPhysicalConnectionIds;
    }

    /**
     * @return virtualPhysicalConnectionStatuses
     */
    public java.util.List < String > getVirtualPhysicalConnectionStatuses() {
        return this.virtualPhysicalConnectionStatuses;
    }

    /**
     * @return vlanIds
     */
    public java.util.List < String > getVlanIds() {
        return this.vlanIds;
    }

    public static final class Builder extends Request.Builder<ListVirtualPhysicalConnectionsRequest, Builder> {
        private Boolean isConfirmed; 
        private Integer maxResults; 
        private String nextToken; 
        private String physicalConnectionId; 
        private String regionId; 
        private java.util.List < String > virtualPhysicalConnectionAliUids; 
        private String virtualPhysicalConnectionBusinessStatus; 
        private java.util.List < String > virtualPhysicalConnectionIds; 
        private java.util.List < String > virtualPhysicalConnectionStatuses; 
        private java.util.List < String > vlanIds; 

        private Builder() {
            super();
        } 

        private Builder(ListVirtualPhysicalConnectionsRequest response) {
            super(response);
            this.isConfirmed = response.isConfirmed;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.physicalConnectionId = response.physicalConnectionId;
            this.regionId = response.regionId;
            this.virtualPhysicalConnectionAliUids = response.virtualPhysicalConnectionAliUids;
            this.virtualPhysicalConnectionBusinessStatus = response.virtualPhysicalConnectionBusinessStatus;
            this.virtualPhysicalConnectionIds = response.virtualPhysicalConnectionIds;
            this.virtualPhysicalConnectionStatuses = response.virtualPhysicalConnectionStatuses;
            this.vlanIds = response.vlanIds;
        } 

        /**
         * Vpconn是否被确认
         */
        public Builder isConfirmed(Boolean isConfirmed) {
            this.putQueryParameter("IsConfirmed", isConfirmed);
            this.isConfirmed = isConfirmed;
            return this;
        }

        /**
         * 单次查询最大量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 单次查询最大量
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Vpconn的主Pconn
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Vpconn的OwnerUid
         */
        public Builder virtualPhysicalConnectionAliUids(java.util.List < String > virtualPhysicalConnectionAliUids) {
            this.putQueryParameter("VirtualPhysicalConnectionAliUids", virtualPhysicalConnectionAliUids);
            this.virtualPhysicalConnectionAliUids = virtualPhysicalConnectionAliUids;
            return this;
        }

        /**
         * Vpconn的商业状态
         */
        public Builder virtualPhysicalConnectionBusinessStatus(String virtualPhysicalConnectionBusinessStatus) {
            this.putQueryParameter("VirtualPhysicalConnectionBusinessStatus", virtualPhysicalConnectionBusinessStatus);
            this.virtualPhysicalConnectionBusinessStatus = virtualPhysicalConnectionBusinessStatus;
            return this;
        }

        /**
         * 根据Vpconn的ID列表过滤
         */
        public Builder virtualPhysicalConnectionIds(java.util.List < String > virtualPhysicalConnectionIds) {
            this.putQueryParameter("VirtualPhysicalConnectionIds", virtualPhysicalConnectionIds);
            this.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
            return this;
        }

        /**
         * Vpconn的状态
         */
        public Builder virtualPhysicalConnectionStatuses(java.util.List < String > virtualPhysicalConnectionStatuses) {
            this.putQueryParameter("VirtualPhysicalConnectionStatuses", virtualPhysicalConnectionStatuses);
            this.virtualPhysicalConnectionStatuses = virtualPhysicalConnectionStatuses;
            return this;
        }

        /**
         * Vpconn的vlanId
         */
        public Builder vlanIds(java.util.List < String > vlanIds) {
            this.putQueryParameter("VlanIds", vlanIds);
            this.vlanIds = vlanIds;
            return this;
        }

        @Override
        public ListVirtualPhysicalConnectionsRequest build() {
            return new ListVirtualPhysicalConnectionsRequest(this);
        } 

    } 

}
