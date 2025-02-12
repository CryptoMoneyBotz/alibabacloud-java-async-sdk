// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaListRequest} extends {@link RequestModel}
 *
 * <p>QueryMediaListRequest</p>
 */
public class QueryMediaListRequest extends Request {
    @Query
    @NameInMap("IncludeMediaInfo")
    private Boolean includeMediaInfo;

    @Query
    @NameInMap("IncludePlayList")
    private Boolean includePlayList;

    @Query
    @NameInMap("IncludeSnapshotList")
    private Boolean includeSnapshotList;

    @Query
    @NameInMap("IncludeSummaryList")
    private Boolean includeSummaryList;

    @Query
    @NameInMap("MediaIds")
    @Validation(required = true)
    private String mediaIds;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryMediaListRequest(Builder builder) {
        super(builder);
        this.includeMediaInfo = builder.includeMediaInfo;
        this.includePlayList = builder.includePlayList;
        this.includeSnapshotList = builder.includeSnapshotList;
        this.includeSummaryList = builder.includeSummaryList;
        this.mediaIds = builder.mediaIds;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeMediaInfo
     */
    public Boolean getIncludeMediaInfo() {
        return this.includeMediaInfo;
    }

    /**
     * @return includePlayList
     */
    public Boolean getIncludePlayList() {
        return this.includePlayList;
    }

    /**
     * @return includeSnapshotList
     */
    public Boolean getIncludeSnapshotList() {
        return this.includeSnapshotList;
    }

    /**
     * @return includeSummaryList
     */
    public Boolean getIncludeSummaryList() {
        return this.includeSummaryList;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
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

    public static final class Builder extends Request.Builder<QueryMediaListRequest, Builder> {
        private Boolean includeMediaInfo; 
        private Boolean includePlayList; 
        private Boolean includeSnapshotList; 
        private Boolean includeSummaryList; 
        private String mediaIds; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMediaListRequest response) {
            super(response);
            this.includeMediaInfo = response.includeMediaInfo;
            this.includePlayList = response.includePlayList;
            this.includeSnapshotList = response.includeSnapshotList;
            this.includeSummaryList = response.includeSummaryList;
            this.mediaIds = response.mediaIds;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * IncludeMediaInfo.
         */
        public Builder includeMediaInfo(Boolean includeMediaInfo) {
            this.putQueryParameter("IncludeMediaInfo", includeMediaInfo);
            this.includeMediaInfo = includeMediaInfo;
            return this;
        }

        /**
         * IncludePlayList.
         */
        public Builder includePlayList(Boolean includePlayList) {
            this.putQueryParameter("IncludePlayList", includePlayList);
            this.includePlayList = includePlayList;
            return this;
        }

        /**
         * IncludeSnapshotList.
         */
        public Builder includeSnapshotList(Boolean includeSnapshotList) {
            this.putQueryParameter("IncludeSnapshotList", includeSnapshotList);
            this.includeSnapshotList = includeSnapshotList;
            return this;
        }

        /**
         * IncludeSummaryList.
         */
        public Builder includeSummaryList(Boolean includeSummaryList) {
            this.putQueryParameter("IncludeSummaryList", includeSummaryList);
            this.includeSummaryList = includeSummaryList;
            return this;
        }

        /**
         * MediaIds.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
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

        @Override
        public QueryMediaListRequest build() {
            return new QueryMediaListRequest(this);
        } 

    } 

}
