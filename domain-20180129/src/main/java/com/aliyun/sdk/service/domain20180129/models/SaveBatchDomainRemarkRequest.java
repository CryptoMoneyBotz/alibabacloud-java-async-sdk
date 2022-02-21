// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchDomainRemarkRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchDomainRemarkRequest</p>
 */
public class SaveBatchDomainRemarkRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchDomainRemarkRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.lang = builder.lang;
        this.remark = builder.remark;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchDomainRemarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveBatchDomainRemarkRequest, Builder> {
        private String instanceIds; 
        private String lang; 
        private String remark; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchDomainRemarkRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
            this.lang = response.lang;
            this.remark = response.remark;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveBatchDomainRemarkRequest build() {
            return new SaveBatchDomainRemarkRequest(this);
        } 

    } 

}
