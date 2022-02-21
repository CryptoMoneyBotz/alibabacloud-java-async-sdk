// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionLogsRequest} extends {@link RequestModel}
 *
 * <p>ListExecutionLogsRequest</p>
 */
public class ListExecutionLogsRequest extends Request {
    @Query
    @NameInMap("ExecutionId")
    @Validation(required = true)
    private String executionId;

    @Query
    @NameInMap("LogType")
    private String logType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskExecutionId")
    private String taskExecutionId;

    private ListExecutionLogsRequest(Builder builder) {
        super(builder);
        this.executionId = builder.executionId;
        this.logType = builder.logType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.taskExecutionId = builder.taskExecutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskExecutionId
     */
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public static final class Builder extends Request.Builder<ListExecutionLogsRequest, Builder> {
        private String executionId; 
        private String logType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String taskExecutionId; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutionLogsRequest response) {
            super(response);
            this.executionId = response.executionId;
            this.logType = response.logType;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.taskExecutionId = response.taskExecutionId;
        } 

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * TaskExecutionId.
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        @Override
        public ListExecutionLogsRequest build() {
            return new ListExecutionLogsRequest(this);
        } 

    } 

}
