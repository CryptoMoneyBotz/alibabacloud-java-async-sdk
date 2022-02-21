// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagResponseBody</p>
 */
public class GetRepoTagResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Digest")
    private String digest;

    @NameInMap("ImageCreate")
    private Long imageCreate;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("ImageSize")
    private Long imageSize;

    @NameInMap("ImageUpdate")
    private Long imageUpdate;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Tag")
    private String tag;

    private GetRepoTagResponseBody(Builder builder) {
        this.code = builder.code;
        this.digest = builder.digest;
        this.imageCreate = builder.imageCreate;
        this.imageId = builder.imageId;
        this.imageSize = builder.imageSize;
        this.imageUpdate = builder.imageUpdate;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return imageCreate
     */
    public Long getImageCreate() {
        return this.imageCreate;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageSize
     */
    public Long getImageSize() {
        return this.imageSize;
    }

    /**
     * @return imageUpdate
     */
    public Long getImageUpdate() {
        return this.imageUpdate;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String code; 
        private String digest; 
        private Long imageCreate; 
        private String imageId; 
        private Long imageSize; 
        private Long imageUpdate; 
        private Boolean isSuccess; 
        private String requestId; 
        private String status; 
        private String tag; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Digest.
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * ImageCreate.
         */
        public Builder imageCreate(Long imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageSize.
         */
        public Builder imageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }

        /**
         * ImageUpdate.
         */
        public Builder imageUpdate(Long imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public GetRepoTagResponseBody build() {
            return new GetRepoTagResponseBody(this);
        } 

    } 

}
