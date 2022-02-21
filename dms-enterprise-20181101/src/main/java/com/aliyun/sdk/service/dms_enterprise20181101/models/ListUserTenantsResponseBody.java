// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserTenantsResponseBody</p>
 */
public class ListUserTenantsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TenantList")
    private java.util.List < TenantList> tenantList;

    private ListUserTenantsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tenantList = builder.tenantList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserTenantsResponseBody create() {
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
     * @return tenantList
     */
    public java.util.List < TenantList> getTenantList() {
        return this.tenantList;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TenantList> tenantList; 

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
         * TenantList.
         */
        public Builder tenantList(java.util.List < TenantList> tenantList) {
            this.tenantList = tenantList;
            return this;
        }

        public ListUserTenantsResponseBody build() {
            return new ListUserTenantsResponseBody(this);
        } 

    } 

    public static class TenantList extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("Tid")
        private Long tid;

        private TenantList(Builder builder) {
            this.status = builder.status;
            this.tenantName = builder.tenantName;
            this.tid = builder.tid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return tid
         */
        public Long getTid() {
            return this.tid;
        }

        public static final class Builder {
            private String status; 
            private String tenantName; 
            private Long tid; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Tid.
             */
            public Builder tid(Long tid) {
                this.tid = tid;
                return this;
            }

            public TenantList build() {
                return new TenantList(this);
            } 

        } 

    }
}
