// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTagScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRepoTagScanTaskRequest</p>
 */
public class CreateRepoTagScanTaskRequest extends Request {
    @Query
    @NameInMap("Digest")
    private String digest;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    @Validation(required = true)
    private String repoId;

    @Query
    @NameInMap("ScanService")
    private String scanService;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    private CreateRepoTagScanTaskRequest(Builder builder) {
        super(builder);
        this.digest = builder.digest;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
        this.scanService = builder.scanService;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTagScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return scanService
     */
    public String getScanService() {
        return this.scanService;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRepoTagScanTaskRequest, Builder> {
        private String digest; 
        private String instanceId; 
        private String regionId; 
        private String repoId; 
        private String scanService; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepoTagScanTaskRequest response) {
            super(response);
            this.digest = response.digest;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
            this.scanService = response.scanService;
            this.tag = response.tag;
        } 

        /**
         * Digest.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * ScanService.
         */
        public Builder scanService(String scanService) {
            this.putQueryParameter("ScanService", scanService);
            this.scanService = scanService;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRepoTagScanTaskRequest build() {
            return new CreateRepoTagScanTaskRequest(this);
        } 

    } 

}
