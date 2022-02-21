// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancePatchStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancePatchStatesResponseBody</p>
 */
public class ListInstancePatchStatesResponseBody extends TeaModel {
    @NameInMap("InstancePatchStates")
    private java.util.List < InstancePatchStates> instancePatchStates;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstancePatchStatesResponseBody(Builder builder) {
        this.instancePatchStates = builder.instancePatchStates;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancePatchStatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancePatchStates
     */
    public java.util.List < InstancePatchStates> getInstancePatchStates() {
        return this.instancePatchStates;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstancePatchStates> instancePatchStates; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * InstancePatchStates.
         */
        public Builder instancePatchStates(java.util.List < InstancePatchStates> instancePatchStates) {
            this.instancePatchStates = instancePatchStates;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancePatchStatesResponseBody build() {
            return new ListInstancePatchStatesResponseBody(this);
        } 

    } 

    public static class InstancePatchStates extends TeaModel {
        @NameInMap("BaselineId")
        private String baselineId;

        @NameInMap("FailedCount")
        private String failedCount;

        @NameInMap("InstalledCount")
        private String installedCount;

        @NameInMap("InstalledOtherCount")
        private String installedOtherCount;

        @NameInMap("InstalledPendingRebootCount")
        private String installedPendingRebootCount;

        @NameInMap("InstalledRejectedCount")
        private String installedRejectedCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MissingCount")
        private String missingCount;

        @NameInMap("OperationEndTime")
        private String operationEndTime;

        @NameInMap("OperationStartTime")
        private String operationStartTime;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("OwnerInformation")
        private String ownerInformation;

        @NameInMap("PatchGroup")
        private String patchGroup;

        private InstancePatchStates(Builder builder) {
            this.baselineId = builder.baselineId;
            this.failedCount = builder.failedCount;
            this.installedCount = builder.installedCount;
            this.installedOtherCount = builder.installedOtherCount;
            this.installedPendingRebootCount = builder.installedPendingRebootCount;
            this.installedRejectedCount = builder.installedRejectedCount;
            this.instanceId = builder.instanceId;
            this.missingCount = builder.missingCount;
            this.operationEndTime = builder.operationEndTime;
            this.operationStartTime = builder.operationStartTime;
            this.operationType = builder.operationType;
            this.ownerInformation = builder.ownerInformation;
            this.patchGroup = builder.patchGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancePatchStates create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public String getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return failedCount
         */
        public String getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return installedCount
         */
        public String getInstalledCount() {
            return this.installedCount;
        }

        /**
         * @return installedOtherCount
         */
        public String getInstalledOtherCount() {
            return this.installedOtherCount;
        }

        /**
         * @return installedPendingRebootCount
         */
        public String getInstalledPendingRebootCount() {
            return this.installedPendingRebootCount;
        }

        /**
         * @return installedRejectedCount
         */
        public String getInstalledRejectedCount() {
            return this.installedRejectedCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return missingCount
         */
        public String getMissingCount() {
            return this.missingCount;
        }

        /**
         * @return operationEndTime
         */
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        /**
         * @return operationStartTime
         */
        public String getOperationStartTime() {
            return this.operationStartTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return ownerInformation
         */
        public String getOwnerInformation() {
            return this.ownerInformation;
        }

        /**
         * @return patchGroup
         */
        public String getPatchGroup() {
            return this.patchGroup;
        }

        public static final class Builder {
            private String baselineId; 
            private String failedCount; 
            private String installedCount; 
            private String installedOtherCount; 
            private String installedPendingRebootCount; 
            private String installedRejectedCount; 
            private String instanceId; 
            private String missingCount; 
            private String operationEndTime; 
            private String operationStartTime; 
            private String operationType; 
            private String ownerInformation; 
            private String patchGroup; 

            /**
             * BaselineId.
             */
            public Builder baselineId(String baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(String failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * InstalledCount.
             */
            public Builder installedCount(String installedCount) {
                this.installedCount = installedCount;
                return this;
            }

            /**
             * InstalledOtherCount.
             */
            public Builder installedOtherCount(String installedOtherCount) {
                this.installedOtherCount = installedOtherCount;
                return this;
            }

            /**
             * InstalledPendingRebootCount.
             */
            public Builder installedPendingRebootCount(String installedPendingRebootCount) {
                this.installedPendingRebootCount = installedPendingRebootCount;
                return this;
            }

            /**
             * InstalledRejectedCount.
             */
            public Builder installedRejectedCount(String installedRejectedCount) {
                this.installedRejectedCount = installedRejectedCount;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MissingCount.
             */
            public Builder missingCount(String missingCount) {
                this.missingCount = missingCount;
                return this;
            }

            /**
             * OperationEndTime.
             */
            public Builder operationEndTime(String operationEndTime) {
                this.operationEndTime = operationEndTime;
                return this;
            }

            /**
             * OperationStartTime.
             */
            public Builder operationStartTime(String operationStartTime) {
                this.operationStartTime = operationStartTime;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * OwnerInformation.
             */
            public Builder ownerInformation(String ownerInformation) {
                this.ownerInformation = ownerInformation;
                return this;
            }

            /**
             * PatchGroup.
             */
            public Builder patchGroup(String patchGroup) {
                this.patchGroup = patchGroup;
                return this;
            }

            public InstancePatchStates build() {
                return new InstancePatchStates(this);
            } 

        } 

    }
}
