// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTADynamicUpgradeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateOTADynamicUpgradeJobRequest</p>
 */
public class CreateOTADynamicUpgradeJobRequest extends Request {
    @Query
    @NameInMap("DynamicMode")
    private Integer dynamicMode;

    @Query
    @NameInMap("FirmwareId")
    @Validation(required = true)
    private String firmwareId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("MaximumPerMinute")
    private Integer maximumPerMinute;

    @Query
    @NameInMap("NeedConfirm")
    private Boolean needConfirm;

    @Query
    @NameInMap("NeedPush")
    private Boolean needPush;

    @Query
    @NameInMap("OverwriteMode")
    private Integer overwriteMode;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("RetryCount")
    private Integer retryCount;

    @Query
    @NameInMap("RetryInterval")
    private Integer retryInterval;

    @Query
    @NameInMap("SrcVersion")
    @Validation(required = true)
    private java.util.List < String > srcVersion;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    private CreateOTADynamicUpgradeJobRequest(Builder builder) {
        super(builder);
        this.dynamicMode = builder.dynamicMode;
        this.firmwareId = builder.firmwareId;
        this.iotInstanceId = builder.iotInstanceId;
        this.maximumPerMinute = builder.maximumPerMinute;
        this.needConfirm = builder.needConfirm;
        this.needPush = builder.needPush;
        this.overwriteMode = builder.overwriteMode;
        this.productKey = builder.productKey;
        this.retryCount = builder.retryCount;
        this.retryInterval = builder.retryInterval;
        this.srcVersion = builder.srcVersion;
        this.tag = builder.tag;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOTADynamicUpgradeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicMode
     */
    public Integer getDynamicMode() {
        return this.dynamicMode;
    }

    /**
     * @return firmwareId
     */
    public String getFirmwareId() {
        return this.firmwareId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return maximumPerMinute
     */
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    /**
     * @return needConfirm
     */
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    /**
     * @return needPush
     */
    public Boolean getNeedPush() {
        return this.needPush;
    }

    /**
     * @return overwriteMode
     */
    public Integer getOverwriteMode() {
        return this.overwriteMode;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return retryCount
     */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return srcVersion
     */
    public java.util.List < String > getSrcVersion() {
        return this.srcVersion;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timeoutInMinutes
     */
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static final class Builder extends Request.Builder<CreateOTADynamicUpgradeJobRequest, Builder> {
        private Integer dynamicMode; 
        private String firmwareId; 
        private String iotInstanceId; 
        private Integer maximumPerMinute; 
        private Boolean needConfirm; 
        private Boolean needPush; 
        private Integer overwriteMode; 
        private String productKey; 
        private Integer retryCount; 
        private Integer retryInterval; 
        private java.util.List < String > srcVersion; 
        private java.util.List < Tag> tag; 
        private Integer timeoutInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(CreateOTADynamicUpgradeJobRequest response) {
            super(response);
            this.dynamicMode = response.dynamicMode;
            this.firmwareId = response.firmwareId;
            this.iotInstanceId = response.iotInstanceId;
            this.maximumPerMinute = response.maximumPerMinute;
            this.needConfirm = response.needConfirm;
            this.needPush = response.needPush;
            this.overwriteMode = response.overwriteMode;
            this.productKey = response.productKey;
            this.retryCount = response.retryCount;
            this.retryInterval = response.retryInterval;
            this.srcVersion = response.srcVersion;
            this.tag = response.tag;
            this.timeoutInMinutes = response.timeoutInMinutes;
        } 

        /**
         * DynamicMode.
         */
        public Builder dynamicMode(Integer dynamicMode) {
            this.putQueryParameter("DynamicMode", dynamicMode);
            this.dynamicMode = dynamicMode;
            return this;
        }

        /**
         * FirmwareId.
         */
        public Builder firmwareId(String firmwareId) {
            this.putQueryParameter("FirmwareId", firmwareId);
            this.firmwareId = firmwareId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * MaximumPerMinute.
         */
        public Builder maximumPerMinute(Integer maximumPerMinute) {
            this.putQueryParameter("MaximumPerMinute", maximumPerMinute);
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }

        /**
         * NeedConfirm.
         */
        public Builder needConfirm(Boolean needConfirm) {
            this.putQueryParameter("NeedConfirm", needConfirm);
            this.needConfirm = needConfirm;
            return this;
        }

        /**
         * NeedPush.
         */
        public Builder needPush(Boolean needPush) {
            this.putQueryParameter("NeedPush", needPush);
            this.needPush = needPush;
            return this;
        }

        /**
         * OverwriteMode.
         */
        public Builder overwriteMode(Integer overwriteMode) {
            this.putQueryParameter("OverwriteMode", overwriteMode);
            this.overwriteMode = overwriteMode;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * RetryCount.
         */
        public Builder retryCount(Integer retryCount) {
            this.putQueryParameter("RetryCount", retryCount);
            this.retryCount = retryCount;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * SrcVersion.
         */
        public Builder srcVersion(java.util.List < String > srcVersion) {
            this.putQueryParameter("SrcVersion", srcVersion);
            this.srcVersion = srcVersion;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TimeoutInMinutes.
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        @Override
        public CreateOTADynamicUpgradeJobRequest build() {
            return new CreateOTADynamicUpgradeJobRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
