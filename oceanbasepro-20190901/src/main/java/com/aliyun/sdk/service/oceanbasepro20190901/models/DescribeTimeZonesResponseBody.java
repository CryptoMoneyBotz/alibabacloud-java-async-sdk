// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTimeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTimeZonesResponseBody</p>
 */
public class DescribeTimeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeZones")
    private TimeZones timeZones;

    private DescribeTimeZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeZones = builder.timeZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTimeZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeZones
     */
    public TimeZones getTimeZones() {
        return this.timeZones;
    }

    public static final class Builder {
        private String requestId; 
        private TimeZones timeZones; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 租户允许的时区信息。
         */
        public Builder timeZones(TimeZones timeZones) {
            this.timeZones = timeZones;
            return this;
        }

        public DescribeTimeZonesResponseBody build() {
            return new DescribeTimeZonesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("TimeZone")
        private String timeZone;

        private List(Builder builder) {
            this.description = builder.description;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String description; 
            private String timeZone; 

            /**
             * 时区描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 时区名称。
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class TimeZones extends TeaModel {
        @NameInMap("Default")
        private String _default;

        @NameInMap("List")
        private java.util.List < List> list;

        private TimeZones(Builder builder) {
            this._default = builder._default;
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeZones create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public String get_default() {
            return this._default;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        public static final class Builder {
            private String _default; 
            private java.util.List < List> list; 

            /**
             * 默认时区。
             */
            public Builder _default(String _default) {
                this._default = _default;
                return this;
            }

            /**
             * 时区列表信息。
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            public TimeZones build() {
                return new TimeZones(this);
            } 

        } 

    }
}