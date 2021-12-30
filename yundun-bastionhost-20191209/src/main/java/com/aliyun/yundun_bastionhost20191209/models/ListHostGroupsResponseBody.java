// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListHostGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostGroupsResponseBody</p>
 */
public class ListHostGroupsResponseBody extends TeaModel {
    @NameInMap("HostGroups")
    private java.util.List < HostGroups> hostGroups;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;


    private ListHostGroupsResponseBody(Builder builder) {
        this.hostGroups = builder.hostGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostGroups
     */
    public java.util.List < HostGroups> getHostGroups() {
        return this.hostGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < HostGroups> hostGroups; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>HostGroups.</p>
         */
        public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostGroupsResponseBody build() {
            return new ListHostGroupsResponseBody(this);
        } 

    } 

    public static class HostGroups extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("MemberCount")
        private Integer memberCount;


        private HostGroups(Builder builder) {
            this.comment = builder.comment;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
            this.memberCount = builder.memberCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroups create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return memberCount
         */
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public static final class Builder {
            private String comment; 
            private String hostGroupId; 
            private String hostGroupName; 
            private Integer memberCount; 

            /**
             * <p>Comment.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>HostGroupId.</p>
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * <p>HostGroupName.</p>
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * <p>MemberCount.</p>
             */
            public Builder memberCount(Integer memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            public HostGroups build() {
                return new HostGroups(this);
            } 

        } 

    }
}
