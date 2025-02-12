// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonMetadataRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonMetadataRequest</p>
 */
public class DescribeClusterAddonMetadataRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("component_id")
    @Validation(required = true)
    private String componentId;

    @Path
    @NameInMap("version")
    private String version;

    private DescribeClusterAddonMetadataRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentId = builder.componentId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAddonMetadataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAddonMetadataRequest, Builder> {
        private String clusterId; 
        private String componentId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAddonMetadataRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentId = request.componentId;
            this.version = request.version;
        } 

        /**
         * 集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 组件ID
         */
        public Builder componentId(String componentId) {
            this.putPathParameter("component_id", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * 组件版本
         */
        public Builder version(String version) {
            this.putPathParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeClusterAddonMetadataRequest build() {
            return new DescribeClusterAddonMetadataRequest(this);
        } 

    } 

}
