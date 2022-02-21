// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowRequest</p>
 */
public class CreateFlowRequest extends Request {
    @Query
    @NameInMap("AlertConf")
    private String alertConf;

    @Query
    @NameInMap("AlertDingDingGroupBizId")
    private String alertDingDingGroupBizId;

    @Query
    @NameInMap("AlertUserGroupBizId")
    private String alertUserGroupBizId;

    @Query
    @NameInMap("Application")
    private String application;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CreateCluster")
    private Boolean createCluster;

    @Query
    @NameInMap("CronExpr")
    private String cronExpr;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("EndSchedule")
    private Long endSchedule;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("Lifecycle")
    private String lifecycle;

    @Query
    @NameInMap("LogArchiveLocation")
    private String logArchiveLocation;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("ParentCategory")
    private String parentCategory;

    @Query
    @NameInMap("ParentFlowList")
    private String parentFlowList;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartSchedule")
    private Long startSchedule;

    private CreateFlowRequest(Builder builder) {
        super(builder);
        this.alertConf = builder.alertConf;
        this.alertDingDingGroupBizId = builder.alertDingDingGroupBizId;
        this.alertUserGroupBizId = builder.alertUserGroupBizId;
        this.application = builder.application;
        this.clusterId = builder.clusterId;
        this.createCluster = builder.createCluster;
        this.cronExpr = builder.cronExpr;
        this.description = builder.description;
        this.endSchedule = builder.endSchedule;
        this.hostName = builder.hostName;
        this.lifecycle = builder.lifecycle;
        this.logArchiveLocation = builder.logArchiveLocation;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.parentCategory = builder.parentCategory;
        this.parentFlowList = builder.parentFlowList;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startSchedule = builder.startSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertConf
     */
    public String getAlertConf() {
        return this.alertConf;
    }

    /**
     * @return alertDingDingGroupBizId
     */
    public String getAlertDingDingGroupBizId() {
        return this.alertDingDingGroupBizId;
    }

    /**
     * @return alertUserGroupBizId
     */
    public String getAlertUserGroupBizId() {
        return this.alertUserGroupBizId;
    }

    /**
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createCluster
     */
    public Boolean getCreateCluster() {
        return this.createCluster;
    }

    /**
     * @return cronExpr
     */
    public String getCronExpr() {
        return this.cronExpr;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endSchedule
     */
    public Long getEndSchedule() {
        return this.endSchedule;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return lifecycle
     */
    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @return logArchiveLocation
     */
    public String getLogArchiveLocation() {
        return this.logArchiveLocation;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return parentCategory
     */
    public String getParentCategory() {
        return this.parentCategory;
    }

    /**
     * @return parentFlowList
     */
    public String getParentFlowList() {
        return this.parentFlowList;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startSchedule
     */
    public Long getStartSchedule() {
        return this.startSchedule;
    }

    public static final class Builder extends Request.Builder<CreateFlowRequest, Builder> {
        private String alertConf; 
        private String alertDingDingGroupBizId; 
        private String alertUserGroupBizId; 
        private String application; 
        private String clusterId; 
        private Boolean createCluster; 
        private String cronExpr; 
        private String description; 
        private Long endSchedule; 
        private String hostName; 
        private String lifecycle; 
        private String logArchiveLocation; 
        private String name; 
        private String namespace; 
        private String parentCategory; 
        private String parentFlowList; 
        private String projectId; 
        private String regionId; 
        private Long startSchedule; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowRequest response) {
            super(response);
            this.alertConf = response.alertConf;
            this.alertDingDingGroupBizId = response.alertDingDingGroupBizId;
            this.alertUserGroupBizId = response.alertUserGroupBizId;
            this.application = response.application;
            this.clusterId = response.clusterId;
            this.createCluster = response.createCluster;
            this.cronExpr = response.cronExpr;
            this.description = response.description;
            this.endSchedule = response.endSchedule;
            this.hostName = response.hostName;
            this.lifecycle = response.lifecycle;
            this.logArchiveLocation = response.logArchiveLocation;
            this.name = response.name;
            this.namespace = response.namespace;
            this.parentCategory = response.parentCategory;
            this.parentFlowList = response.parentFlowList;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.startSchedule = response.startSchedule;
        } 

        /**
         * AlertConf.
         */
        public Builder alertConf(String alertConf) {
            this.putQueryParameter("AlertConf", alertConf);
            this.alertConf = alertConf;
            return this;
        }

        /**
         * AlertDingDingGroupBizId.
         */
        public Builder alertDingDingGroupBizId(String alertDingDingGroupBizId) {
            this.putQueryParameter("AlertDingDingGroupBizId", alertDingDingGroupBizId);
            this.alertDingDingGroupBizId = alertDingDingGroupBizId;
            return this;
        }

        /**
         * AlertUserGroupBizId.
         */
        public Builder alertUserGroupBizId(String alertUserGroupBizId) {
            this.putQueryParameter("AlertUserGroupBizId", alertUserGroupBizId);
            this.alertUserGroupBizId = alertUserGroupBizId;
            return this;
        }

        /**
         * Application.
         */
        public Builder application(String application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CreateCluster.
         */
        public Builder createCluster(Boolean createCluster) {
            this.putQueryParameter("CreateCluster", createCluster);
            this.createCluster = createCluster;
            return this;
        }

        /**
         * CronExpr.
         */
        public Builder cronExpr(String cronExpr) {
            this.putQueryParameter("CronExpr", cronExpr);
            this.cronExpr = cronExpr;
            return this;
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
         * EndSchedule.
         */
        public Builder endSchedule(Long endSchedule) {
            this.putQueryParameter("EndSchedule", endSchedule);
            this.endSchedule = endSchedule;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Lifecycle.
         */
        public Builder lifecycle(String lifecycle) {
            this.putQueryParameter("Lifecycle", lifecycle);
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * LogArchiveLocation.
         */
        public Builder logArchiveLocation(String logArchiveLocation) {
            this.putQueryParameter("LogArchiveLocation", logArchiveLocation);
            this.logArchiveLocation = logArchiveLocation;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ParentCategory.
         */
        public Builder parentCategory(String parentCategory) {
            this.putQueryParameter("ParentCategory", parentCategory);
            this.parentCategory = parentCategory;
            return this;
        }

        /**
         * ParentFlowList.
         */
        public Builder parentFlowList(String parentFlowList) {
            this.putQueryParameter("ParentFlowList", parentFlowList);
            this.parentFlowList = parentFlowList;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * StartSchedule.
         */
        public Builder startSchedule(Long startSchedule) {
            this.putQueryParameter("StartSchedule", startSchedule);
            this.startSchedule = startSchedule;
            return this;
        }

        @Override
        public CreateFlowRequest build() {
            return new CreateFlowRequest(this);
        } 

    } 

}