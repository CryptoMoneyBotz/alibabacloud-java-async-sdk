// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteContinuouslyPushRequest} extends {@link RequestModel}
 *
 * <p>CompleteContinuouslyPushRequest</p>
 */
public class CompleteContinuouslyPushRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("MessageId")
    @Validation(required = true)
    private String messageId;

    private CompleteContinuouslyPushRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteContinuouslyPushRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<CompleteContinuouslyPushRequest, Builder> {
        private Long appKey; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(CompleteContinuouslyPushRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.messageId = response.messageId;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public CompleteContinuouslyPushRequest build() {
            return new CompleteContinuouslyPushRequest(this);
        } 

    } 

}