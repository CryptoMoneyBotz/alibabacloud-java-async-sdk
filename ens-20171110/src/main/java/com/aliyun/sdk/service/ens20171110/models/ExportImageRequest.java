// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportImageRequest} extends {@link RequestModel}
 *
 * <p>ExportImageRequest</p>
 */
public class ExportImageRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("OSSBucket")
    @Validation(required = true)
    private String OSSBucket;

    @Query
    @NameInMap("OSSPrefix")
    private String OSSPrefix;

    @Query
    @NameInMap("OSSRegionId")
    @Validation(required = true)
    private String OSSRegionId;

    @Query
    @NameInMap("RoleName")
    private String roleName;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private ExportImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.OSSBucket = builder.OSSBucket;
        this.OSSPrefix = builder.OSSPrefix;
        this.OSSRegionId = builder.OSSRegionId;
        this.roleName = builder.roleName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return OSSPrefix
     */
    public String getOSSPrefix() {
        return this.OSSPrefix;
    }

    /**
     * @return OSSRegionId
     */
    public String getOSSRegionId() {
        return this.OSSRegionId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ExportImageRequest, Builder> {
        private String imageId; 
        private String OSSBucket; 
        private String OSSPrefix; 
        private String OSSRegionId; 
        private String roleName; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ExportImageRequest response) {
            super(response);
            this.imageId = response.imageId;
            this.OSSBucket = response.OSSBucket;
            this.OSSPrefix = response.OSSPrefix;
            this.OSSRegionId = response.OSSRegionId;
            this.roleName = response.roleName;
            this.version = response.version;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * OSSBucket.
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * OSSPrefix.
         */
        public Builder OSSPrefix(String OSSPrefix) {
            this.putQueryParameter("OSSPrefix", OSSPrefix);
            this.OSSPrefix = OSSPrefix;
            return this;
        }

        /**
         * OSSRegionId.
         */
        public Builder OSSRegionId(String OSSRegionId) {
            this.putQueryParameter("OSSRegionId", OSSRegionId);
            this.OSSRegionId = OSSRegionId;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ExportImageRequest build() {
            return new ExportImageRequest(this);
        } 

    } 

}
