// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAiOutboundTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAiOutboundTaskRequest</p>
 */
public class CreateAiOutboundTaskRequest extends Request {
    @Query
    @NameInMap("ConcurrentRate")
    private Integer concurrentRate;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 100)
    private String description;

    @Query
    @NameInMap("ExecutionTime")
    @Validation(required = true)
    private String executionTime;

    @Query
    @NameInMap("ForecastCallRate")
    @Validation(maximum = 100, minimum = 1)
    private Float forecastCallRate;

    @Query
    @NameInMap("HandlerId")
    @Validation(required = true)
    private Long handlerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true, maxLength = 15, minLength = 1)
    private String name;

    @Query
    @NameInMap("NumRepeated")
    @Validation(required = true)
    private Integer numRepeated;

    @Query
    @NameInMap("OutboundNums")
    @Validation(required = true)
    private java.util.List < String > outboundNums;

    @Query
    @NameInMap("RecallRule")
    private RecallRule recallRule;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private CreateAiOutboundTaskRequest(Builder builder) {
        super(builder);
        this.concurrentRate = builder.concurrentRate;
        this.description = builder.description;
        this.executionTime = builder.executionTime;
        this.forecastCallRate = builder.forecastCallRate;
        this.handlerId = builder.handlerId;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.numRepeated = builder.numRepeated;
        this.outboundNums = builder.outboundNums;
        this.recallRule = builder.recallRule;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiOutboundTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrentRate
     */
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionTime
     */
    public String getExecutionTime() {
        return this.executionTime;
    }

    /**
     * @return forecastCallRate
     */
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    /**
     * @return handlerId
     */
    public Long getHandlerId() {
        return this.handlerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return numRepeated
     */
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    /**
     * @return outboundNums
     */
    public java.util.List < String > getOutboundNums() {
        return this.outboundNums;
    }

    /**
     * @return recallRule
     */
    public RecallRule getRecallRule() {
        return this.recallRule;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAiOutboundTaskRequest, Builder> {
        private Integer concurrentRate; 
        private String description; 
        private String executionTime; 
        private Float forecastCallRate; 
        private Long handlerId; 
        private String instanceId; 
        private String name; 
        private Integer numRepeated; 
        private java.util.List < String > outboundNums; 
        private RecallRule recallRule; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiOutboundTaskRequest response) {
            super(response);
            this.concurrentRate = response.concurrentRate;
            this.description = response.description;
            this.executionTime = response.executionTime;
            this.forecastCallRate = response.forecastCallRate;
            this.handlerId = response.handlerId;
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.numRepeated = response.numRepeated;
            this.outboundNums = response.outboundNums;
            this.recallRule = response.recallRule;
            this.type = response.type;
        } 

        /**
         * 自动外呼的呼叫并发
         */
        public Builder concurrentRate(Integer concurrentRate) {
            this.putQueryParameter("ConcurrentRate", concurrentRate);
            this.concurrentRate = concurrentRate;
            return this;
        }

        /**
         * 任务描述（0～100字符）
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 任务执行时间
         */
        public Builder executionTime(String executionTime) {
            this.putQueryParameter("ExecutionTime", executionTime);
            this.executionTime = executionTime;
            return this;
        }

        /**
         * 预测式外呼固定外呼比例（>=1）
         */
        public Builder forecastCallRate(Float forecastCallRate) {
            this.putQueryParameter("ForecastCallRate", forecastCallRate);
            this.forecastCallRate = forecastCallRate;
            return this;
        }

        /**
         * 技能组id（预测式外呼）或者ivr id（自动外呼）
         */
        public Builder handlerId(Long handlerId) {
            this.putQueryParameter("HandlerId", handlerId);
            this.handlerId = handlerId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 任务名（1～15字符）
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 被叫号码重复策略（0任务内去重，1不去重）
         */
        public Builder numRepeated(Integer numRepeated) {
            this.putQueryParameter("NumRepeated", numRepeated);
            this.numRepeated = numRepeated;
            return this;
        }

        /**
         * 外呼主叫号码
         */
        public Builder outboundNums(java.util.List < String > outboundNums) {
            this.putQueryParameter("OutboundNums", outboundNums);
            this.outboundNums = outboundNums;
            return this;
        }

        /**
         * 失败重呼策略（为空则不重呼）
         */
        public Builder recallRule(RecallRule recallRule) {
            this.putQueryParameter("RecallRule", recallRule);
            this.recallRule = recallRule;
            return this;
        }

        /**
         * 任务类型（2:预测式外呼3:自动外呼）
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateAiOutboundTaskRequest build() {
            return new CreateAiOutboundTaskRequest(this);
        } 

    } 

    public static class RecallRule extends TeaModel {
        @NameInMap("Count")
        @Validation(maximum = 3, minimum = 1)
        private Integer count;

        @NameInMap("Interval")
        @Validation(maximum = 60, minimum = 1)
        private Integer interval;

        private RecallRule(Builder builder) {
            this.count = builder.count;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallRule create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private Integer count; 
            private Integer interval; 

            /**
             * 重呼次数（1～3）
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * 重呼间隔时间（1～60分钟）
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            public RecallRule build() {
                return new RecallRule(this);
            } 

        } 

    }
}
