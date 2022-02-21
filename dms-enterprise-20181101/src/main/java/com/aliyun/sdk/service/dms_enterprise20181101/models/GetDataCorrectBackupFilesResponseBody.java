// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCorrectBackupFilesResponseBody</p>
 */
public class GetDataCorrectBackupFilesResponseBody extends TeaModel {
    @NameInMap("DataCorrectBackupFiles")
    private DataCorrectBackupFiles dataCorrectBackupFiles;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataCorrectBackupFilesResponseBody(Builder builder) {
        this.dataCorrectBackupFiles = builder.dataCorrectBackupFiles;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCorrectBackupFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCorrectBackupFiles
     */
    public DataCorrectBackupFiles getDataCorrectBackupFiles() {
        return this.dataCorrectBackupFiles;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private DataCorrectBackupFiles dataCorrectBackupFiles; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * DataCorrectBackupFiles.
         */
        public Builder dataCorrectBackupFiles(DataCorrectBackupFiles dataCorrectBackupFiles) {
            this.dataCorrectBackupFiles = dataCorrectBackupFiles;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetDataCorrectBackupFilesResponseBody build() {
            return new GetDataCorrectBackupFilesResponseBody(this);
        } 

    } 

    public static class DataCorrectBackupFiles extends TeaModel {
        @NameInMap("FileUrl")
        private java.util.List < String > fileUrl;

        private DataCorrectBackupFiles(Builder builder) {
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCorrectBackupFiles create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public java.util.List < String > getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private java.util.List < String > fileUrl; 

            /**
             * FileUrl.
             */
            public Builder fileUrl(java.util.List < String > fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public DataCorrectBackupFiles build() {
                return new DataCorrectBackupFiles(this);
            } 

        } 

    }
}
