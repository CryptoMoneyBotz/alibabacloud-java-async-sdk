// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansCoverageTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansCoverageTotalResponseBody</p>
 */
public class DescribeSavingsPlansCoverageTotalResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSavingsPlansCoverageTotalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansCoverageTotalResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeSavingsPlansCoverageTotalResponseBody build() {
            return new DescribeSavingsPlansCoverageTotalResponseBody(this);
        } 

    } 

    public static class PeriodCoverage extends TeaModel {
        @NameInMap("Percentage")
        private Float percentage;

        @NameInMap("Period")
        private String period;

        private PeriodCoverage(Builder builder) {
            this.percentage = builder.percentage;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodCoverage create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Float getPercentage() {
            return this.percentage;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private Float percentage; 
            private String period; 

            /**
             * Percentage.
             */
            public Builder percentage(Float percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            public PeriodCoverage build() {
                return new PeriodCoverage(this);
            } 

        } 

    }
    public static class TotalCoverage extends TeaModel {
        @NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @NameInMap("DeductAmount")
        private Float deductAmount;

        private TotalCoverage(Builder builder) {
            this.coveragePercentage = builder.coveragePercentage;
            this.deductAmount = builder.deductAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalCoverage create() {
            return builder().build();
        }

        /**
         * @return coveragePercentage
         */
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        /**
         * @return deductAmount
         */
        public Float getDeductAmount() {
            return this.deductAmount;
        }

        public static final class Builder {
            private Float coveragePercentage; 
            private Float deductAmount; 

            /**
             * CoveragePercentage.
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

            /**
             * DeductAmount.
             */
            public Builder deductAmount(Float deductAmount) {
                this.deductAmount = deductAmount;
                return this;
            }

            public TotalCoverage build() {
                return new TotalCoverage(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PeriodCoverage")
        private java.util.List < PeriodCoverage> periodCoverage;

        @NameInMap("TotalCoverage")
        private TotalCoverage totalCoverage;

        private Data(Builder builder) {
            this.periodCoverage = builder.periodCoverage;
            this.totalCoverage = builder.totalCoverage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return periodCoverage
         */
        public java.util.List < PeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        /**
         * @return totalCoverage
         */
        public TotalCoverage getTotalCoverage() {
            return this.totalCoverage;
        }

        public static final class Builder {
            private java.util.List < PeriodCoverage> periodCoverage; 
            private TotalCoverage totalCoverage; 

            /**
             * PeriodCoverage.
             */
            public Builder periodCoverage(java.util.List < PeriodCoverage> periodCoverage) {
                this.periodCoverage = periodCoverage;
                return this;
            }

            /**
             * TotalCoverage.
             */
            public Builder totalCoverage(TotalCoverage totalCoverage) {
                this.totalCoverage = totalCoverage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}