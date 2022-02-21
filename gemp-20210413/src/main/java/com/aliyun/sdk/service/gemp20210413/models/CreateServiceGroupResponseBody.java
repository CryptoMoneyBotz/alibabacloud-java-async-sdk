// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceGroupResponseBody</p>
 */
public class CreateServiceGroupResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateServiceGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * 服务组ID
         */
        public Builder data(Data data) {
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

        public CreateServiceGroupResponseBody build() {
            return new CreateServiceGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        private Data(Builder builder) {
            this.serviceGroupId = builder.serviceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public static final class Builder {
            private Long serviceGroupId; 

            /**
             * 服务组ID
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
