// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeVMDeployOrderRequest} extends {@link RequestModel}
 *
 * <p>ResumeVMDeployOrderRequest</p>
 */
public class ResumeVMDeployOrderRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Path
    @NameInMap("deployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    private ResumeVMDeployOrderRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.deployOrderId = builder.deployOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeVMDeployOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return deployOrderId
     */
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    public static final class Builder extends Request.Builder<ResumeVMDeployOrderRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long deployOrderId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeVMDeployOrderRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.pipelineId = response.pipelineId;
            this.deployOrderId = response.deployOrderId;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 12222
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * 部署单ID
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putPathParameter("deployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        @Override
        public ResumeVMDeployOrderRequest build() {
            return new ResumeVMDeployOrderRequest(this);
        } 

    } 

}