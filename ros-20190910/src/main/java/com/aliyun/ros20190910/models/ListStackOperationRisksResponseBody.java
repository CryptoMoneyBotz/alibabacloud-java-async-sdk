// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListStackOperationRisksResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackOperationRisksResponseBody</p>
 */
public class ListStackOperationRisksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskResources")
    private java.util.List < RiskResources> riskResources;


    private ListStackOperationRisksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskResources = builder.riskResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackOperationRisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskResources
     */
    public java.util.List < RiskResources> getRiskResources() {
        return this.riskResources;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RiskResources> riskResources; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>RiskResources.</p>
         */
        public Builder riskResources(java.util.List < RiskResources> riskResources) {
            this.riskResources = riskResources;
            return this;
        }

        public ListStackOperationRisksResponseBody build() {
            return new ListStackOperationRisksResponseBody(this);
        } 

    } 

    public static class RiskResources extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("RiskType")
        private String riskType;


        private RiskResources(Builder builder) {
            this.code = builder.code;
            this.logicalResourceId = builder.logicalResourceId;
            this.message = builder.message;
            this.physicalResourceId = builder.physicalResourceId;
            this.reason = builder.reason;
            this.requestId = builder.requestId;
            this.resourceType = builder.resourceType;
            this.riskType = builder.riskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskResources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return physicalResourceId
         */
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        public static final class Builder {
            private String code; 
            private String logicalResourceId; 
            private String message; 
            private String physicalResourceId; 
            private String reason; 
            private String requestId; 
            private String resourceType; 
            private String riskType; 

            /**
             * <p>Code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>LogicalResourceId.</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>Message.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>PhysicalResourceId.</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>Reason.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * <p>ResourceType.</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>RiskType.</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            public RiskResources build() {
                return new RiskResources(this);
            } 

        } 

    }
}