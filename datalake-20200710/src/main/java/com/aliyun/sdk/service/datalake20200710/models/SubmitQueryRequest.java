// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitQueryRequest} extends {@link RequestModel}
 *
 * <p>SubmitQueryRequest</p>
 */
public class SubmitQueryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Sql")
    private String sql;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private SubmitQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sql = builder.sql;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitQueryRequest, Builder> {
        private String regionId; 
        private String sql; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitQueryRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.sql = response.sql;
            this.workspaceId = response.workspaceId;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Sql.
         */
        public Builder sql(String sql) {
            this.putBodyParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitQueryRequest build() {
            return new SubmitQueryRequest(this);
        } 

    } 

}