// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryQualificationDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryQualificationDetailRequest</p>
 */
public class QueryQualificationDetailRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("QualificationType")
    @Validation(required = true)
    private String qualificationType;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryQualificationDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.qualificationType = builder.qualificationType;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQualificationDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return qualificationType
     */
    public String getQualificationType() {
        return this.qualificationType;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryQualificationDetailRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String qualificationType; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryQualificationDetailRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.lang = response.lang;
            this.qualificationType = response.qualificationType;
            this.userClientIp = response.userClientIp;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * QualificationType.
         */
        public Builder qualificationType(String qualificationType) {
            this.putQueryParameter("QualificationType", qualificationType);
            this.qualificationType = qualificationType;
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
        public QueryQualificationDetailRequest build() {
            return new QueryQualificationDetailRequest(this);
        } 

    } 

}
