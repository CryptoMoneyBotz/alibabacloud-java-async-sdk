// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNASDefaultMountTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyNASDefaultMountTargetRequest</p>
 */
public class ModifyNASDefaultMountTargetRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("MountTargetDomain")
    @Validation(required = true)
    private String mountTargetDomain;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyNASDefaultMountTargetRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.mountTargetDomain = builder.mountTargetDomain;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNASDefaultMountTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return mountTargetDomain
     */
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyNASDefaultMountTargetRequest, Builder> {
        private String fileSystemId; 
        private String mountTargetDomain; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNASDefaultMountTargetRequest response) {
            super(response);
            this.fileSystemId = response.fileSystemId;
            this.mountTargetDomain = response.mountTargetDomain;
            this.regionId = response.regionId;
        } 

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * MountTargetDomain.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.putQueryParameter("MountTargetDomain", mountTargetDomain);
            this.mountTargetDomain = mountTargetDomain;
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
        public ModifyNASDefaultMountTargetRequest build() {
            return new ModifyNASDefaultMountTargetRequest(this);
        } 

    } 

}
