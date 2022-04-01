// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksFullStatusResponseBody</p>
 */
public class DescribeDisksFullStatusResponseBody extends TeaModel {
    @NameInMap("DiskFullStatusSet")
    private DiskFullStatusSet diskFullStatusSet;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDisksFullStatusResponseBody(Builder builder) {
        this.diskFullStatusSet = builder.diskFullStatusSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksFullStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskFullStatusSet
     */
    public DiskFullStatusSet getDiskFullStatusSet() {
        return this.diskFullStatusSet;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private DiskFullStatusSet diskFullStatusSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DiskFullStatusSet.
         */
        public Builder diskFullStatusSet(DiskFullStatusSet diskFullStatusSet) {
            this.diskFullStatusSet = diskFullStatusSet;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDisksFullStatusResponseBody build() {
            return new DescribeDisksFullStatusResponseBody(this);
        } 

    } 

    public static class EventType extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private EventType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventType build() {
                return new EventType(this);
            } 

        } 

    }
    public static class DiskEventType extends TeaModel {
        @NameInMap("EventEndTime")
        private String eventEndTime;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventTime")
        private String eventTime;

        @NameInMap("EventType")
        private EventType eventType;

        @NameInMap("ImpactLevel")
        private String impactLevel;

        private DiskEventType(Builder builder) {
            this.eventEndTime = builder.eventEndTime;
            this.eventId = builder.eventId;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
            this.impactLevel = builder.impactLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEventType create() {
            return builder().build();
        }

        /**
         * @return eventEndTime
         */
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public EventType getEventType() {
            return this.eventType;
        }

        /**
         * @return impactLevel
         */
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public static final class Builder {
            private String eventEndTime; 
            private String eventId; 
            private String eventTime; 
            private EventType eventType; 
            private String impactLevel; 

            /**
             * EventEndTime.
             */
            public Builder eventEndTime(String eventEndTime) {
                this.eventEndTime = eventEndTime;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * ImpactLevel.
             */
            public Builder impactLevel(String impactLevel) {
                this.impactLevel = impactLevel;
                return this;
            }

            public DiskEventType build() {
                return new DiskEventType(this);
            } 

        } 

    }
    public static class DiskEventSet extends TeaModel {
        @NameInMap("DiskEventType")
        private java.util.List < DiskEventType> diskEventType;

        private DiskEventSet(Builder builder) {
            this.diskEventType = builder.diskEventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEventSet create() {
            return builder().build();
        }

        /**
         * @return diskEventType
         */
        public java.util.List < DiskEventType> getDiskEventType() {
            return this.diskEventType;
        }

        public static final class Builder {
            private java.util.List < DiskEventType> diskEventType; 

            /**
             * DiskEventType.
             */
            public Builder diskEventType(java.util.List < DiskEventType> diskEventType) {
                this.diskEventType = diskEventType;
                return this;
            }

            public DiskEventSet build() {
                return new DiskEventSet(this);
            } 

        } 

    }
    public static class HealthStatus extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private HealthStatus(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public HealthStatus build() {
                return new HealthStatus(this);
            } 

        } 

    }
    public static class Status extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private Status(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    public static class DiskFullStatusType extends TeaModel {
        @NameInMap("Device")
        private String device;

        @NameInMap("DiskEventSet")
        private DiskEventSet diskEventSet;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("HealthStatus")
        private HealthStatus healthStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private Status status;

        private DiskFullStatusType(Builder builder) {
            this.device = builder.device;
            this.diskEventSet = builder.diskEventSet;
            this.diskId = builder.diskId;
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskFullStatusType create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskEventSet
         */
        public DiskEventSet getDiskEventSet() {
            return this.diskEventSet;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return healthStatus
         */
        public HealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String device; 
            private DiskEventSet diskEventSet; 
            private String diskId; 
            private HealthStatus healthStatus; 
            private String instanceId; 
            private Status status; 

            /**
             * Device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * DiskEventSet.
             */
            public Builder diskEventSet(DiskEventSet diskEventSet) {
                this.diskEventSet = diskEventSet;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(HealthStatus healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public DiskFullStatusType build() {
                return new DiskFullStatusType(this);
            } 

        } 

    }
    public static class DiskFullStatusSet extends TeaModel {
        @NameInMap("DiskFullStatusType")
        private java.util.List < DiskFullStatusType> diskFullStatusType;

        private DiskFullStatusSet(Builder builder) {
            this.diskFullStatusType = builder.diskFullStatusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskFullStatusSet create() {
            return builder().build();
        }

        /**
         * @return diskFullStatusType
         */
        public java.util.List < DiskFullStatusType> getDiskFullStatusType() {
            return this.diskFullStatusType;
        }

        public static final class Builder {
            private java.util.List < DiskFullStatusType> diskFullStatusType; 

            /**
             * DiskFullStatusType.
             */
            public Builder diskFullStatusType(java.util.List < DiskFullStatusType> diskFullStatusType) {
                this.diskFullStatusType = diskFullStatusType;
                return this;
            }

            public DiskFullStatusSet build() {
                return new DiskFullStatusSet(this);
            } 

        } 

    }
}
