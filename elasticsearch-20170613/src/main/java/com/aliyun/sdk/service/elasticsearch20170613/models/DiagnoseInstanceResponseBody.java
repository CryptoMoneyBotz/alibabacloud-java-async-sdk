// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DiagnoseInstanceResponseBody</p>
 */
public class DiagnoseInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DiagnoseInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnoseInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DiagnoseInstanceResponseBody build() {
            return new DiagnoseInstanceResponseBody(this);
        } 

    } 

    public static class DiagnoseItems extends TeaModel {
        @NameInMap("item")
        private String item;

        private DiagnoseItems(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseItems create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        public static final class Builder {
            private String item; 

            /**
             * item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            public DiagnoseItems build() {
                return new DiagnoseItems(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("diagnoseItems")
        private java.util.List < DiagnoseItems> diagnoseItems;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("reportId")
        private String reportId;

        @NameInMap("state")
        private String state;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.diagnoseItems = builder.diagnoseItems;
            this.instanceId = builder.instanceId;
            this.reportId = builder.reportId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return diagnoseItems
         */
        public java.util.List < DiagnoseItems> getDiagnoseItems() {
            return this.diagnoseItems;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.List < DiagnoseItems> diagnoseItems; 
            private String instanceId; 
            private String reportId; 
            private String state; 

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * diagnoseItems.
             */
            public Builder diagnoseItems(java.util.List < DiagnoseItems> diagnoseItems) {
                this.diagnoseItems = diagnoseItems;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * reportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}