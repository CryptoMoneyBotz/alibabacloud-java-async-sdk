// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrendForSourceEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrendForSourceEventResponseBody</p>
 */
public class ListTrendForSourceEventResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private ListTrendForSourceEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrendForSourceEventResponseBody create() {
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
         * 统计列表
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

        public ListTrendForSourceEventResponseBody build() {
            return new ListTrendForSourceEventResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("convergenceRate")
        private String convergenceRate;

        @NameInMap("maxSustainTime")
        private Long maxSustainTime;

        @NameInMap("skipDay")
        private Boolean skipDay;

        @NameInMap("sourceEventsStatMap")
        private java.util.Map < String, ? > sourceEventsStatMap;

        @NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.convergenceRate = builder.convergenceRate;
            this.maxSustainTime = builder.maxSustainTime;
            this.skipDay = builder.skipDay;
            this.sourceEventsStatMap = builder.sourceEventsStatMap;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return convergenceRate
         */
        public String getConvergenceRate() {
            return this.convergenceRate;
        }

        /**
         * @return maxSustainTime
         */
        public Long getMaxSustainTime() {
            return this.maxSustainTime;
        }

        /**
         * @return skipDay
         */
        public Boolean getSkipDay() {
            return this.skipDay;
        }

        /**
         * @return sourceEventsStatMap
         */
        public java.util.Map < String, ? > getSourceEventsStatMap() {
            return this.sourceEventsStatMap;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String convergenceRate; 
            private Long maxSustainTime; 
            private Boolean skipDay; 
            private java.util.Map < String, ? > sourceEventsStatMap; 
            private String unit; 

            /**
             * 收敛率
             */
            public Builder convergenceRate(String convergenceRate) {
                this.convergenceRate = convergenceRate;
                return this;
            }

            /**
             * 最大持续时长
             */
            public Builder maxSustainTime(Long maxSustainTime) {
                this.maxSustainTime = maxSustainTime;
                return this;
            }

            /**
             * 是否跨天
             */
            public Builder skipDay(Boolean skipDay) {
                this.skipDay = skipDay;
                return this;
            }

            /**
             * 按监控源分组统计数据
             */
            public Builder sourceEventsStatMap(java.util.Map < String, ? > sourceEventsStatMap) {
                this.sourceEventsStatMap = sourceEventsStatMap;
                return this;
            }

            /**
             * 时间单位
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
