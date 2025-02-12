// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartDataForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListChartDataForUserResponseBody</p>
 */
public class ListChartDataForUserResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private ListChartDataForUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartDataForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListChartDataForUserResponseBody build() {
            return new ListChartDataForUserResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("effectionLevel")
        private java.util.Map < String, ? > effectionLevel;

        @NameInMap("escalationIncidentCount")
        private Long escalationIncidentCount;

        @NameInMap("incidentCount")
        private Long incidentCount;

        @NameInMap("meanTimeToAcknowledge")
        private Long meanTimeToAcknowledge;

        @NameInMap("meanTimeToRepair")
        private Long meanTimeToRepair;

        @NameInMap("time")
        private String time;

        @NameInMap("totalMeanTimeToAcknowledge")
        private Long totalMeanTimeToAcknowledge;

        @NameInMap("totalMeanTimeToRepair")
        private Long totalMeanTimeToRepair;

        @NameInMap("unAcknowledgedEscalationIncidentCount")
        private Long unAcknowledgedEscalationIncidentCount;

        @NameInMap("unFinishEscalationIncidentCount")
        private Long unFinishEscalationIncidentCount;

        private Data(Builder builder) {
            this.effectionLevel = builder.effectionLevel;
            this.escalationIncidentCount = builder.escalationIncidentCount;
            this.incidentCount = builder.incidentCount;
            this.meanTimeToAcknowledge = builder.meanTimeToAcknowledge;
            this.meanTimeToRepair = builder.meanTimeToRepair;
            this.time = builder.time;
            this.totalMeanTimeToAcknowledge = builder.totalMeanTimeToAcknowledge;
            this.totalMeanTimeToRepair = builder.totalMeanTimeToRepair;
            this.unAcknowledgedEscalationIncidentCount = builder.unAcknowledgedEscalationIncidentCount;
            this.unFinishEscalationIncidentCount = builder.unFinishEscalationIncidentCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return effectionLevel
         */
        public java.util.Map < String, ? > getEffectionLevel() {
            return this.effectionLevel;
        }

        /**
         * @return escalationIncidentCount
         */
        public Long getEscalationIncidentCount() {
            return this.escalationIncidentCount;
        }

        /**
         * @return incidentCount
         */
        public Long getIncidentCount() {
            return this.incidentCount;
        }

        /**
         * @return meanTimeToAcknowledge
         */
        public Long getMeanTimeToAcknowledge() {
            return this.meanTimeToAcknowledge;
        }

        /**
         * @return meanTimeToRepair
         */
        public Long getMeanTimeToRepair() {
            return this.meanTimeToRepair;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return totalMeanTimeToAcknowledge
         */
        public Long getTotalMeanTimeToAcknowledge() {
            return this.totalMeanTimeToAcknowledge;
        }

        /**
         * @return totalMeanTimeToRepair
         */
        public Long getTotalMeanTimeToRepair() {
            return this.totalMeanTimeToRepair;
        }

        /**
         * @return unAcknowledgedEscalationIncidentCount
         */
        public Long getUnAcknowledgedEscalationIncidentCount() {
            return this.unAcknowledgedEscalationIncidentCount;
        }

        /**
         * @return unFinishEscalationIncidentCount
         */
        public Long getUnFinishEscalationIncidentCount() {
            return this.unFinishEscalationIncidentCount;
        }

        public static final class Builder {
            private java.util.Map < String, ? > effectionLevel; 
            private Long escalationIncidentCount; 
            private Long incidentCount; 
            private Long meanTimeToAcknowledge; 
            private Long meanTimeToRepair; 
            private String time; 
            private Long totalMeanTimeToAcknowledge; 
            private Long totalMeanTimeToRepair; 
            private Long unAcknowledgedEscalationIncidentCount; 
            private Long unFinishEscalationIncidentCount; 

            /**
             * 根据影响等级时间等级分组统计数量
             */
            public Builder effectionLevel(java.util.Map < String, ? > effectionLevel) {
                this.effectionLevel = effectionLevel;
                return this;
            }

            /**
             * 升级事件数
             */
            public Builder escalationIncidentCount(Long escalationIncidentCount) {
                this.escalationIncidentCount = escalationIncidentCount;
                return this;
            }

            /**
             * 时间总数
             */
            public Builder incidentCount(Long incidentCount) {
                this.incidentCount = incidentCount;
                return this;
            }

            /**
             * 当日平均响应时间单位秒
             */
            public Builder meanTimeToAcknowledge(Long meanTimeToAcknowledge) {
                this.meanTimeToAcknowledge = meanTimeToAcknowledge;
                return this;
            }

            /**
             * 当日平均完结时间单位秒
             */
            public Builder meanTimeToRepair(Long meanTimeToRepair) {
                this.meanTimeToRepair = meanTimeToRepair;
                return this;
            }

            /**
             * 时间
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * 总平均响应时间
             */
            public Builder totalMeanTimeToAcknowledge(Long totalMeanTimeToAcknowledge) {
                this.totalMeanTimeToAcknowledge = totalMeanTimeToAcknowledge;
                return this;
            }

            /**
             * 总平均完结时间
             */
            public Builder totalMeanTimeToRepair(Long totalMeanTimeToRepair) {
                this.totalMeanTimeToRepair = totalMeanTimeToRepair;
                return this;
            }

            /**
             * 未响应升级事件数
             */
            public Builder unAcknowledgedEscalationIncidentCount(Long unAcknowledgedEscalationIncidentCount) {
                this.unAcknowledgedEscalationIncidentCount = unAcknowledgedEscalationIncidentCount;
                return this;
            }

            /**
             * 未完结升级事件数
             */
            public Builder unFinishEscalationIncidentCount(Long unFinishEscalationIncidentCount) {
                this.unFinishEscalationIncidentCount = unFinishEscalationIncidentCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
