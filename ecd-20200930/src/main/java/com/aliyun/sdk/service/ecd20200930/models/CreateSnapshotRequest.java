// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotRequest</p>
 */
public class CreateSnapshotRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private String desktopId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SnapshotName")
    @Validation(required = true)
    private String snapshotName;

    @Query
    @NameInMap("SourceDiskType")
    @Validation(required = true)
    private String sourceDiskType;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.desktopId = builder.desktopId;
        this.regionId = builder.regionId;
        this.snapshotName = builder.snapshotName;
        this.sourceDiskType = builder.sourceDiskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return sourceDiskType
     */
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String description; 
        private String desktopId; 
        private String regionId; 
        private String snapshotName; 
        private String sourceDiskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest response) {
            super(response);
            this.description = response.description;
            this.desktopId = response.desktopId;
            this.regionId = response.regionId;
            this.snapshotName = response.snapshotName;
            this.sourceDiskType = response.sourceDiskType;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
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
         * SnapshotName.
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * SourceDiskType.
         */
        public Builder sourceDiskType(String sourceDiskType) {
            this.putQueryParameter("SourceDiskType", sourceDiskType);
            this.sourceDiskType = sourceDiskType;
            return this;
        }

        @Override
        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest(this);
        } 

    } 

}
