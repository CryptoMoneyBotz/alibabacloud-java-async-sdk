// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobRequest} extends {@link RequestModel}
 *
 * <p>ListJobRequest</p>
 */
public class ListJobRequest extends Request {
    @Query
    @NameInMap("EndOfJobCreatedTimeRange")
    private String endOfJobCreatedTimeRange;

    @Query
    @NameInMap("MaximumPageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long maximumPageSize;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StartOfJobCreatedTimeRange")
    private String startOfJobCreatedTimeRange;

    @Query
    @NameInMap("State")
    private String state;

    private ListJobRequest(Builder builder) {
        super(builder);
        this.endOfJobCreatedTimeRange = builder.endOfJobCreatedTimeRange;
        this.maximumPageSize = builder.maximumPageSize;
        this.nextPageToken = builder.nextPageToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startOfJobCreatedTimeRange = builder.startOfJobCreatedTimeRange;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endOfJobCreatedTimeRange
     */
    public String getEndOfJobCreatedTimeRange() {
        return this.endOfJobCreatedTimeRange;
    }

    /**
     * @return maximumPageSize
     */
    public Long getMaximumPageSize() {
        return this.maximumPageSize;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startOfJobCreatedTimeRange
     */
    public String getStartOfJobCreatedTimeRange() {
        return this.startOfJobCreatedTimeRange;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListJobRequest, Builder> {
        private String endOfJobCreatedTimeRange; 
        private Long maximumPageSize; 
        private String nextPageToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startOfJobCreatedTimeRange; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListJobRequest response) {
            super(response);
            this.endOfJobCreatedTimeRange = response.endOfJobCreatedTimeRange;
            this.maximumPageSize = response.maximumPageSize;
            this.nextPageToken = response.nextPageToken;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pipelineId = response.pipelineId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.startOfJobCreatedTimeRange = response.startOfJobCreatedTimeRange;
            this.state = response.state;
        } 

        /**
         * EndOfJobCreatedTimeRange.
         */
        public Builder endOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
            this.putQueryParameter("EndOfJobCreatedTimeRange", endOfJobCreatedTimeRange);
            this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
            return this;
        }

        /**
         * MaximumPageSize.
         */
        public Builder maximumPageSize(Long maximumPageSize) {
            this.putQueryParameter("MaximumPageSize", maximumPageSize);
            this.maximumPageSize = maximumPageSize;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * StartOfJobCreatedTimeRange.
         */
        public Builder startOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
            this.putQueryParameter("StartOfJobCreatedTimeRange", startOfJobCreatedTimeRange);
            this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListJobRequest build() {
            return new ListJobRequest(this);
        } 

    } 

}
