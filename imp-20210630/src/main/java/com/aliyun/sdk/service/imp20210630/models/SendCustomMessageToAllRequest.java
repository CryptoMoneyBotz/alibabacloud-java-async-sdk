// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCustomMessageToAllRequest} extends {@link RequestModel}
 *
 * <p>SendCustomMessageToAllRequest</p>
 */
public class SendCustomMessageToAllRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    private SendCustomMessageToAllRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.body = builder.body;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCustomMessageToAllRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    public static final class Builder extends Request.Builder<SendCustomMessageToAllRequest, Builder> {
        private String appId; 
        private String body; 
        private String regionId; 
        private String roomId; 

        private Builder() {
            super();
        } 

        private Builder(SendCustomMessageToAllRequest request) {
            super(request);
            this.appId = request.appId;
            this.body = request.body;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
        } 

        /**
         * 应用唯一标识，由6位小写字母、数字组成。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 消息体内容。
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 房间唯一标识，由调用CreateRoom返回。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        @Override
        public SendCustomMessageToAllRequest build() {
            return new SendCustomMessageToAllRequest(this);
        } 

    } 

}
