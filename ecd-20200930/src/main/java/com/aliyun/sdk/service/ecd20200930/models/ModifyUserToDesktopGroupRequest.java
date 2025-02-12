// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserToDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserToDesktopGroupRequest</p>
 */
public class ModifyUserToDesktopGroupRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("NewEndUserIds")
    @Validation(required = true)
    private java.util.List < String > newEndUserIds;

    @Query
    @NameInMap("OldEndUserIds")
    @Validation(required = true)
    private java.util.List < String > oldEndUserIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyUserToDesktopGroupRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.newEndUserIds = builder.newEndUserIds;
        this.oldEndUserIds = builder.oldEndUserIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserToDesktopGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return newEndUserIds
     */
    public java.util.List < String > getNewEndUserIds() {
        return this.newEndUserIds;
    }

    /**
     * @return oldEndUserIds
     */
    public java.util.List < String > getOldEndUserIds() {
        return this.oldEndUserIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyUserToDesktopGroupRequest, Builder> {
        private String desktopGroupId; 
        private java.util.List < String > newEndUserIds; 
        private java.util.List < String > oldEndUserIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserToDesktopGroupRequest response) {
            super(response);
            this.desktopGroupId = response.desktopGroupId;
            this.newEndUserIds = response.newEndUserIds;
            this.oldEndUserIds = response.oldEndUserIds;
            this.regionId = response.regionId;
        } 

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * NewEndUserIds.
         */
        public Builder newEndUserIds(java.util.List < String > newEndUserIds) {
            this.putQueryParameter("NewEndUserIds", newEndUserIds);
            this.newEndUserIds = newEndUserIds;
            return this;
        }

        /**
         * OldEndUserIds.
         */
        public Builder oldEndUserIds(java.util.List < String > oldEndUserIds) {
            this.putQueryParameter("OldEndUserIds", oldEndUserIds);
            this.oldEndUserIds = oldEndUserIds;
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
        public ModifyUserToDesktopGroupRequest build() {
            return new ModifyUserToDesktopGroupRequest(this);
        } 

    } 

}
