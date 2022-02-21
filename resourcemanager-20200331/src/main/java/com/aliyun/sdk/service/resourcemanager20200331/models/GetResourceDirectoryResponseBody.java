// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceDirectoryResponseBody</p>
 */
public class GetResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceDirectory")
    private ResourceDirectory resourceDirectory;

    private GetResourceDirectoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceDirectory = builder.resourceDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceDirectory
     */
    public ResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceDirectory resourceDirectory; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceDirectory.
         */
        public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }

        public GetResourceDirectoryResponseBody build() {
            return new GetResourceDirectoryResponseBody(this);
        } 

    } 

    public static class ResourceDirectory extends TeaModel {
        @NameInMap("ControlPolicyStatus")
        private String controlPolicyStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MasterAccountId")
        private String masterAccountId;

        @NameInMap("MasterAccountName")
        private String masterAccountName;

        @NameInMap("MemberDeletionStatus")
        private String memberDeletionStatus;

        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("RootFolderId")
        private String rootFolderId;

        private ResourceDirectory(Builder builder) {
            this.controlPolicyStatus = builder.controlPolicyStatus;
            this.createTime = builder.createTime;
            this.masterAccountId = builder.masterAccountId;
            this.masterAccountName = builder.masterAccountName;
            this.memberDeletionStatus = builder.memberDeletionStatus;
            this.resourceDirectoryId = builder.resourceDirectoryId;
            this.rootFolderId = builder.rootFolderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDirectory create() {
            return builder().build();
        }

        /**
         * @return controlPolicyStatus
         */
        public String getControlPolicyStatus() {
            return this.controlPolicyStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return masterAccountId
         */
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        /**
         * @return masterAccountName
         */
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        /**
         * @return memberDeletionStatus
         */
        public String getMemberDeletionStatus() {
            return this.memberDeletionStatus;
        }

        /**
         * @return resourceDirectoryId
         */
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        /**
         * @return rootFolderId
         */
        public String getRootFolderId() {
            return this.rootFolderId;
        }

        public static final class Builder {
            private String controlPolicyStatus; 
            private String createTime; 
            private String masterAccountId; 
            private String masterAccountName; 
            private String memberDeletionStatus; 
            private String resourceDirectoryId; 
            private String rootFolderId; 

            /**
             * ControlPolicyStatus.
             */
            public Builder controlPolicyStatus(String controlPolicyStatus) {
                this.controlPolicyStatus = controlPolicyStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MasterAccountId.
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * MasterAccountName.
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * MemberDeletionStatus.
             */
            public Builder memberDeletionStatus(String memberDeletionStatus) {
                this.memberDeletionStatus = memberDeletionStatus;
                return this;
            }

            /**
             * ResourceDirectoryId.
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * RootFolderId.
             */
            public Builder rootFolderId(String rootFolderId) {
                this.rootFolderId = rootFolderId;
                return this;
            }

            public ResourceDirectory build() {
                return new ResourceDirectory(this);
            } 

        } 

    }
}