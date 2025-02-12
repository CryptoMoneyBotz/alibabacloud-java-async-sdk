// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProblemTimelineRequest} extends {@link RequestModel}
 *
 * <p>DeleteProblemTimelineRequest</p>
 */
public class DeleteProblemTimelineRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemTimelineId")
    private Long problemTimelineId;

    private DeleteProblemTimelineRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.problemId = builder.problemId;
        this.problemTimelineId = builder.problemTimelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProblemTimelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    /**
     * @return problemTimelineId
     */
    public Long getProblemTimelineId() {
        return this.problemTimelineId;
    }

    public static final class Builder extends Request.Builder<DeleteProblemTimelineRequest, Builder> {
        private String clientToken; 
        private Long problemId; 
        private Long problemTimelineId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProblemTimelineRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.problemId = response.problemId;
            this.problemTimelineId = response.problemTimelineId;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 故障id
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * ID
         */
        public Builder problemTimelineId(Long problemTimelineId) {
            this.putBodyParameter("problemTimelineId", problemTimelineId);
            this.problemTimelineId = problemTimelineId;
            return this;
        }

        @Override
        public DeleteProblemTimelineRequest build() {
            return new DeleteProblemTimelineRequest(this);
        } 

    } 

}
