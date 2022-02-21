// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeListenerAccessControlAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListenerAccessControlAttributeResponseBody</p>
 */
public class DescribeListenerAccessControlAttributeResponseBody extends TeaModel {
    @NameInMap("AccessControlStatus")
    private String accessControlStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceItems")
    private String sourceItems;

    private DescribeListenerAccessControlAttributeResponseBody(Builder builder) {
        this.accessControlStatus = builder.accessControlStatus;
        this.requestId = builder.requestId;
        this.sourceItems = builder.sourceItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListenerAccessControlAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessControlStatus
     */
    public String getAccessControlStatus() {
        return this.accessControlStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceItems
     */
    public String getSourceItems() {
        return this.sourceItems;
    }

    public static final class Builder {
        private String accessControlStatus; 
        private String requestId; 
        private String sourceItems; 

        /**
         * AccessControlStatus.
         */
        public Builder accessControlStatus(String accessControlStatus) {
            this.accessControlStatus = accessControlStatus;
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
         * SourceItems.
         */
        public Builder sourceItems(String sourceItems) {
            this.sourceItems = sourceItems;
            return this;
        }

        public DescribeListenerAccessControlAttributeResponseBody build() {
            return new DescribeListenerAccessControlAttributeResponseBody(this);
        } 

    } 

}