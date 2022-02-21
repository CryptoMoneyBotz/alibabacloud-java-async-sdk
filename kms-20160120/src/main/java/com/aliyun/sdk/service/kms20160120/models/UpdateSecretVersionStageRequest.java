// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretVersionStageRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecretVersionStageRequest</p>
 */
public class UpdateSecretVersionStageRequest extends Request {
    @Query
    @NameInMap("MoveToVersion")
    private String moveToVersion;

    @Query
    @NameInMap("RemoveFromVersion")
    private String removeFromVersion;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    @Query
    @NameInMap("VersionStage")
    @Validation(required = true)
    private String versionStage;

    private UpdateSecretVersionStageRequest(Builder builder) {
        super(builder);
        this.moveToVersion = builder.moveToVersion;
        this.removeFromVersion = builder.removeFromVersion;
        this.secretName = builder.secretName;
        this.versionStage = builder.versionStage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretVersionStageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moveToVersion
     */
    public String getMoveToVersion() {
        return this.moveToVersion;
    }

    /**
     * @return removeFromVersion
     */
    public String getRemoveFromVersion() {
        return this.removeFromVersion;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return versionStage
     */
    public String getVersionStage() {
        return this.versionStage;
    }

    public static final class Builder extends Request.Builder<UpdateSecretVersionStageRequest, Builder> {
        private String moveToVersion; 
        private String removeFromVersion; 
        private String secretName; 
        private String versionStage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecretVersionStageRequest response) {
            super(response);
            this.moveToVersion = response.moveToVersion;
            this.removeFromVersion = response.removeFromVersion;
            this.secretName = response.secretName;
            this.versionStage = response.versionStage;
        } 

        /**
         * MoveToVersion.
         */
        public Builder moveToVersion(String moveToVersion) {
            this.putQueryParameter("MoveToVersion", moveToVersion);
            this.moveToVersion = moveToVersion;
            return this;
        }

        /**
         * RemoveFromVersion.
         */
        public Builder removeFromVersion(String removeFromVersion) {
            this.putQueryParameter("RemoveFromVersion", removeFromVersion);
            this.removeFromVersion = removeFromVersion;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * VersionStage.
         */
        public Builder versionStage(String versionStage) {
            this.putQueryParameter("VersionStage", versionStage);
            this.versionStage = versionStage;
            return this;
        }

        @Override
        public UpdateSecretVersionStageRequest build() {
            return new UpdateSecretVersionStageRequest(this);
        } 

    } 

}