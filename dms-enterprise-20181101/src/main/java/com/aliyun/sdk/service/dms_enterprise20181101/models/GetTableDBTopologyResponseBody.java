// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDBTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableDBTopologyResponseBody</p>
 */
public class GetTableDBTopologyResponseBody extends TeaModel {
    @NameInMap("DBTopology")
    private DBTopology DBTopology;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetTableDBTopologyResponseBody(Builder builder) {
        this.DBTopology = builder.DBTopology;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDBTopologyResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBTopology
     */
    public DBTopology getDBTopology() {
        return this.DBTopology;
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
        private DBTopology DBTopology; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * DBTopology.
         */
        public Builder DBTopology(DBTopology DBTopology) {
            this.DBTopology = DBTopology;
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

        public GetTableDBTopologyResponseBody build() {
            return new GetTableDBTopologyResponseBody(this);
        } 

    } 

    public static class TableList extends TeaModel {
        @NameInMap("TableId")
        private String tableId;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TableType")
        private String tableType;

        private TableList(Builder builder) {
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableList create() {
            return builder().build();
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        public static final class Builder {
            private String tableId; 
            private String tableName; 
            private String tableType; 

            /**
             * TableId.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableType.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
    public static class DatabaseList extends TeaModel {
        @NameInMap("DbId")
        private String dbId;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("TableList")
        private java.util.List < TableList> tableList;

        private DatabaseList(Builder builder) {
            this.dbId = builder.dbId;
            this.dbName = builder.dbName;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.tableList = builder.tableList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return tableList
         */
        public java.util.List < TableList> getTableList() {
            return this.tableList;
        }

        public static final class Builder {
            private String dbId; 
            private String dbName; 
            private String dbType; 
            private String envType; 
            private java.util.List < TableList> tableList; 

            /**
             * DbId.
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * TableList.
             */
            public Builder tableList(java.util.List < TableList> tableList) {
                this.tableList = tableList;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
    public static class DataSourceList extends TeaModel {
        @NameInMap("DatabaseList")
        private java.util.List < DatabaseList> databaseList;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Host")
        private String host;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Sid")
        private String sid;

        private DataSourceList(Builder builder) {
            this.databaseList = builder.databaseList;
            this.dbType = builder.dbType;
            this.host = builder.host;
            this.port = builder.port;
            this.sid = builder.sid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceList create() {
            return builder().build();
        }

        /**
         * @return databaseList
         */
        public java.util.List < DatabaseList> getDatabaseList() {
            return this.databaseList;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        public static final class Builder {
            private java.util.List < DatabaseList> databaseList; 
            private String dbType; 
            private String host; 
            private Integer port; 
            private String sid; 

            /**
             * DatabaseList.
             */
            public Builder databaseList(java.util.List < DatabaseList> databaseList) {
                this.databaseList = databaseList;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Sid.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            public DataSourceList build() {
                return new DataSourceList(this);
            } 

        } 

    }
    public static class DBTopology extends TeaModel {
        @NameInMap("DataSourceList")
        private java.util.List < DataSourceList> dataSourceList;

        @NameInMap("TableGuid")
        private String tableGuid;

        @NameInMap("TableName")
        private String tableName;

        private DBTopology(Builder builder) {
            this.dataSourceList = builder.dataSourceList;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBTopology create() {
            return builder().build();
        }

        /**
         * @return dataSourceList
         */
        public java.util.List < DataSourceList> getDataSourceList() {
            return this.dataSourceList;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List < DataSourceList> dataSourceList; 
            private String tableGuid; 
            private String tableName; 

            /**
             * DataSourceList.
             */
            public Builder dataSourceList(java.util.List < DataSourceList> dataSourceList) {
                this.dataSourceList = dataSourceList;
                return this;
            }

            /**
             * TableGuid.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public DBTopology build() {
                return new DBTopology(this);
            } 

        } 

    }
}
