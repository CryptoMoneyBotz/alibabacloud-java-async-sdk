// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("UserList")
    private UserList userList;

    private ListUsersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userList
     */
    public UserList getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private UserList userList; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UserList.
         */
        public Builder userList(UserList userList) {
            this.userList = userList;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    public static class RoleIdList extends TeaModel {
        @NameInMap("RoleIds")
        private java.util.List < Integer > roleIds;

        private RoleIdList(Builder builder) {
            this.roleIds = builder.roleIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleIdList create() {
            return builder().build();
        }

        /**
         * @return roleIds
         */
        public java.util.List < Integer > getRoleIds() {
            return this.roleIds;
        }

        public static final class Builder {
            private java.util.List < Integer > roleIds; 

            /**
             * RoleIds.
             */
            public Builder roleIds(java.util.List < Integer > roleIds) {
                this.roleIds = roleIds;
                return this;
            }

            public RoleIdList build() {
                return new RoleIdList(this);
            } 

        } 

    }
    public static class RoleNameList extends TeaModel {
        @NameInMap("RoleNames")
        private java.util.List < String > roleNames;

        private RoleNameList(Builder builder) {
            this.roleNames = builder.roleNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleNameList create() {
            return builder().build();
        }

        /**
         * @return roleNames
         */
        public java.util.List < String > getRoleNames() {
            return this.roleNames;
        }

        public static final class Builder {
            private java.util.List < String > roleNames; 

            /**
             * RoleNames.
             */
            public Builder roleNames(java.util.List < String > roleNames) {
                this.roleNames = roleNames;
                return this;
            }

            public RoleNameList build() {
                return new RoleNameList(this);
            } 

        } 

    }
    public static class User extends TeaModel {
        @NameInMap("CurExecuteCount")
        private Long curExecuteCount;

        @NameInMap("CurResultCount")
        private Long curResultCount;

        @NameInMap("DingRobot")
        private String dingRobot;

        @NameInMap("Email")
        private String email;

        @NameInMap("LastLoginTime")
        private String lastLoginTime;

        @NameInMap("MaxExecuteCount")
        private Long maxExecuteCount;

        @NameInMap("MaxResultCount")
        private Long maxResultCount;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("NotificationMode")
        private String notificationMode;

        @NameInMap("ParentUid")
        private String parentUid;

        @NameInMap("RoleIdList")
        private RoleIdList roleIdList;

        @NameInMap("RoleNameList")
        private RoleNameList roleNameList;

        @NameInMap("SignatureMethod")
        private String signatureMethod;

        @NameInMap("State")
        private String state;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Webhook")
        private String webhook;

        private User(Builder builder) {
            this.curExecuteCount = builder.curExecuteCount;
            this.curResultCount = builder.curResultCount;
            this.dingRobot = builder.dingRobot;
            this.email = builder.email;
            this.lastLoginTime = builder.lastLoginTime;
            this.maxExecuteCount = builder.maxExecuteCount;
            this.maxResultCount = builder.maxResultCount;
            this.mobile = builder.mobile;
            this.nickName = builder.nickName;
            this.notificationMode = builder.notificationMode;
            this.parentUid = builder.parentUid;
            this.roleIdList = builder.roleIdList;
            this.roleNameList = builder.roleNameList;
            this.signatureMethod = builder.signatureMethod;
            this.state = builder.state;
            this.uid = builder.uid;
            this.userId = builder.userId;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return curExecuteCount
         */
        public Long getCurExecuteCount() {
            return this.curExecuteCount;
        }

        /**
         * @return curResultCount
         */
        public Long getCurResultCount() {
            return this.curResultCount;
        }

        /**
         * @return dingRobot
         */
        public String getDingRobot() {
            return this.dingRobot;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return lastLoginTime
         */
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        /**
         * @return maxExecuteCount
         */
        public Long getMaxExecuteCount() {
            return this.maxExecuteCount;
        }

        /**
         * @return maxResultCount
         */
        public Long getMaxResultCount() {
            return this.maxResultCount;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return notificationMode
         */
        public String getNotificationMode() {
            return this.notificationMode;
        }

        /**
         * @return parentUid
         */
        public String getParentUid() {
            return this.parentUid;
        }

        /**
         * @return roleIdList
         */
        public RoleIdList getRoleIdList() {
            return this.roleIdList;
        }

        /**
         * @return roleNameList
         */
        public RoleNameList getRoleNameList() {
            return this.roleNameList;
        }

        /**
         * @return signatureMethod
         */
        public String getSignatureMethod() {
            return this.signatureMethod;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private Long curExecuteCount; 
            private Long curResultCount; 
            private String dingRobot; 
            private String email; 
            private String lastLoginTime; 
            private Long maxExecuteCount; 
            private Long maxResultCount; 
            private String mobile; 
            private String nickName; 
            private String notificationMode; 
            private String parentUid; 
            private RoleIdList roleIdList; 
            private RoleNameList roleNameList; 
            private String signatureMethod; 
            private String state; 
            private String uid; 
            private String userId; 
            private String webhook; 

            /**
             * CurExecuteCount.
             */
            public Builder curExecuteCount(Long curExecuteCount) {
                this.curExecuteCount = curExecuteCount;
                return this;
            }

            /**
             * CurResultCount.
             */
            public Builder curResultCount(Long curResultCount) {
                this.curResultCount = curResultCount;
                return this;
            }

            /**
             * DingRobot.
             */
            public Builder dingRobot(String dingRobot) {
                this.dingRobot = dingRobot;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * LastLoginTime.
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * MaxExecuteCount.
             */
            public Builder maxExecuteCount(Long maxExecuteCount) {
                this.maxExecuteCount = maxExecuteCount;
                return this;
            }

            /**
             * MaxResultCount.
             */
            public Builder maxResultCount(Long maxResultCount) {
                this.maxResultCount = maxResultCount;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * NotificationMode.
             */
            public Builder notificationMode(String notificationMode) {
                this.notificationMode = notificationMode;
                return this;
            }

            /**
             * ParentUid.
             */
            public Builder parentUid(String parentUid) {
                this.parentUid = parentUid;
                return this;
            }

            /**
             * RoleIdList.
             */
            public Builder roleIdList(RoleIdList roleIdList) {
                this.roleIdList = roleIdList;
                return this;
            }

            /**
             * RoleNameList.
             */
            public Builder roleNameList(RoleNameList roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            /**
             * SignatureMethod.
             */
            public Builder signatureMethod(String signatureMethod) {
                this.signatureMethod = signatureMethod;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class UserList extends TeaModel {
        @NameInMap("User")
        private java.util.List < User> user;

        private UserList(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List < User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List < User> user; 

            /**
             * User.
             */
            public Builder user(java.util.List < User> user) {
                this.user = user;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
