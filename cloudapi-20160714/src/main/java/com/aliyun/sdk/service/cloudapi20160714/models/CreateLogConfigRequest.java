// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLogConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateLogConfigRequest</p>
 */
public class CreateLogConfigRequest extends Request {
    @Query
    @NameInMap("LogType")
    private String logType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SlsLogStore")
    @Validation(required = true)
    private String slsLogStore;

    @Query
    @NameInMap("SlsProject")
    @Validation(required = true)
    private String slsProject;

    private CreateLogConfigRequest(Builder builder) {
        super(builder);
        this.logType = builder.logType;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
        this.slsLogStore = builder.slsLogStore;
        this.slsProject = builder.slsProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return slsLogStore
     */
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    public static final class Builder extends Request.Builder<CreateLogConfigRequest, Builder> {
        private String logType; 
        private String regionId; 
        private String securityToken; 
        private String slsLogStore; 
        private String slsProject; 

        private Builder() {
            super();
        } 

        private Builder(CreateLogConfigRequest response) {
            super(response);
            this.logType = response.logType;
            this.regionId = response.regionId;
            this.securityToken = response.securityToken;
            this.slsLogStore = response.slsLogStore;
            this.slsProject = response.slsProject;
        } 

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SlsLogStore.
         */
        public Builder slsLogStore(String slsLogStore) {
            this.putQueryParameter("SlsLogStore", slsLogStore);
            this.slsLogStore = slsLogStore;
            return this;
        }

        /**
         * SlsProject.
         */
        public Builder slsProject(String slsProject) {
            this.putQueryParameter("SlsProject", slsProject);
            this.slsProject = slsProject;
            return this;
        }

        @Override
        public CreateLogConfigRequest build() {
            return new CreateLogConfigRequest(this);
        } 

    } 

}
