// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFpDBDeleteJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitFpDBDeleteJobRequest</p>
 */
public class SubmitFpDBDeleteJobRequest extends Request {
    @Query
    @NameInMap("DelType")
    private String delType;

    @Query
    @NameInMap("FpDBId")
    @Validation(required = true)
    private String fpDBId;

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
    @NameInMap("UserData")
    private String userData;

    private SubmitFpDBDeleteJobRequest(Builder builder) {
        super(builder);
        this.delType = builder.delType;
        this.fpDBId = builder.fpDBId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitFpDBDeleteJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delType
     */
    public String getDelType() {
        return this.delType;
    }

    /**
     * @return fpDBId
     */
    public String getFpDBId() {
        return this.fpDBId;
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitFpDBDeleteJobRequest, Builder> {
        private String delType; 
        private String fpDBId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitFpDBDeleteJobRequest response) {
            super(response);
            this.delType = response.delType;
            this.fpDBId = response.fpDBId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pipelineId = response.pipelineId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.userData = response.userData;
        } 

        /**
         * DelType.
         */
        public Builder delType(String delType) {
            this.putQueryParameter("DelType", delType);
            this.delType = delType;
            return this;
        }

        /**
         * FpDBId.
         */
        public Builder fpDBId(String fpDBId) {
            this.putQueryParameter("FpDBId", fpDBId);
            this.fpDBId = fpDBId;
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
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitFpDBDeleteJobRequest build() {
            return new SubmitFpDBDeleteJobRequest(this);
        } 

    } 

}
