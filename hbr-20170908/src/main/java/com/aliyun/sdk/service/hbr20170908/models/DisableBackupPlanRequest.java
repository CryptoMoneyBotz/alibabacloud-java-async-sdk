// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>DisableBackupPlanRequest</p>
 */
public class DisableBackupPlanRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private DisableBackupPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.sourceType = builder.sourceType;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DisableBackupPlanRequest, Builder> {
        private String planId; 
        private String sourceType; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DisableBackupPlanRequest response) {
            super(response);
            this.planId = response.planId;
            this.sourceType = response.sourceType;
            this.vaultId = response.vaultId;
        } 

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * VaultId.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public DisableBackupPlanRequest build() {
            return new DisableBackupPlanRequest(this);
        } 

    } 

}
