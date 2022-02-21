// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthLimitationResponseBody</p>
 */
public class DescribeBandwidthLimitationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Bandwidths")
    private Bandwidths bandwidths;

    private DescribeBandwidthLimitationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.bandwidths = builder.bandwidths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthLimitationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return bandwidths
     */
    public Bandwidths getBandwidths() {
        return this.bandwidths;
    }

    public static final class Builder {
        private String requestId; 
        private Bandwidths bandwidths; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A collection of Internet bandwidth limits.
         */
        public Builder bandwidths(Bandwidths bandwidths) {
            this.bandwidths = bandwidths;
            return this;
        }

        public DescribeBandwidthLimitationResponseBody build() {
            return new DescribeBandwidthLimitationResponseBody(this);
        } 

    } 

    public static class Bandwidth extends TeaModel {
        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Unit")
        private String unit;

        private Bandwidth(Builder builder) {
            this.internetChargeType = builder.internetChargeType;
            this.max = builder.max;
            this.min = builder.min;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidth create() {
            return builder().build();
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String internetChargeType; 
            private Integer max; 
            private Integer min; 
            private String unit; 

            /**
             * Public network bandwidth billing. Valid values:
             * <p>
             * 
             * -PayByBandwidth: pay-by-bandwidth.
             * -PayByTraffic: pay by traffic.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * Public network bandwidth maximum value.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * The minimum public bandwidth.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Public network bandwidth units.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Bandwidth build() {
                return new Bandwidth(this);
            } 

        } 

    }
    public static class Bandwidths extends TeaModel {
        @NameInMap("Bandwidth")
        private java.util.List < Bandwidth> bandwidth;

        private Bandwidths(Builder builder) {
            this.bandwidth = builder.bandwidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidths create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public java.util.List < Bandwidth> getBandwidth() {
            return this.bandwidth;
        }

        public static final class Builder {
            private java.util.List < Bandwidth> bandwidth; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(java.util.List < Bandwidth> bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            public Bandwidths build() {
                return new Bandwidths(this);
            } 

        } 

    }
}