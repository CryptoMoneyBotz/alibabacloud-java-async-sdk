// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkPackageEnabledRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkPackageEnabledRequest</p>
 */
public class ModifyNetworkPackageEnabledRequest extends Request {
    @Query
    @NameInMap("Enabled")
    private Boolean enabled;

    @Query
    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    private String networkPackageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyNetworkPackageEnabledRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.networkPackageId = builder.networkPackageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkPackageEnabledRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return networkPackageId
     */
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkPackageEnabledRequest, Builder> {
        private Boolean enabled; 
        private String networkPackageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkPackageEnabledRequest response) {
            super(response);
            this.enabled = response.enabled;
            this.networkPackageId = response.networkPackageId;
            this.regionId = response.regionId;
        } 

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * NetworkPackageId.
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
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

        @Override
        public ModifyNetworkPackageEnabledRequest build() {
            return new ModifyNetworkPackageEnabledRequest(this);
        } 

    } 

}
