// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInsightsPathsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkInsightsPathsRequest</p>
 */
public class DescribeNetworkInsightsPathsRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100)
    private Integer maxResults;

    @Query
    @NameInMap("NetworkInsightsPathId")
    private java.util.List < String > networkInsightsPathId;

    @Query
    @NameInMap("NetworkPathFound")
    private String networkPathFound;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeNetworkInsightsPathsRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.maxResults = builder.maxResults;
        this.networkInsightsPathId = builder.networkInsightsPathId;
        this.networkPathFound = builder.networkPathFound;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceRegionId = builder.sourceRegionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInsightsPathsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkInsightsPathId
     */
    public java.util.List < String > getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    /**
     * @return networkPathFound
     */
    public String getNetworkPathFound() {
        return this.networkPathFound;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInsightsPathsRequest, Builder> {
        private Boolean dryRun; 
        private Integer maxResults; 
        private java.util.List < String > networkInsightsPathId; 
        private String networkPathFound; 
        private String nextToken; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String sourceRegionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInsightsPathsRequest response) {
            super(response);
            this.dryRun = response.dryRun;
            this.maxResults = response.maxResults;
            this.networkInsightsPathId = response.networkInsightsPathId;
            this.networkPathFound = response.networkPathFound;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceRegionId = response.sourceRegionId;
            this.status = response.status;
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 本次读取的最大数据记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NetworkInsightsPathId.
         */
        public Builder networkInsightsPathId(java.util.List < String > networkInsightsPathId) {
            this.putQueryParameter("NetworkInsightsPathId", networkInsightsPathId);
            this.networkInsightsPathId = networkInsightsPathId;
            return this;
        }

        /**
         * NetworkPathFound.
         */
        public Builder networkPathFound(String networkPathFound) {
            this.putQueryParameter("NetworkPathFound", networkPathFound);
            this.networkPathFound = networkPathFound;
            return this;
        }

        /**
         * 标记当前开始读取的位置，置空表示从头开始
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeNetworkInsightsPathsRequest build() {
            return new DescribeNetworkInsightsPathsRequest(this);
        } 

    } 

}
