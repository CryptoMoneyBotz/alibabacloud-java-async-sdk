// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelLifecycleRetrieveJobRequest} extends {@link RequestModel}
 *
 * <p>CancelLifecycleRetrieveJobRequest</p>
 */
public class CancelLifecycleRetrieveJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private CancelLifecycleRetrieveJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelLifecycleRetrieveJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<CancelLifecycleRetrieveJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(CancelLifecycleRetrieveJobRequest response) {
            super(response);
            this.jobId = response.jobId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public CancelLifecycleRetrieveJobRequest build() {
            return new CancelLifecycleRetrieveJobRequest(this);
        } 

    } 

}