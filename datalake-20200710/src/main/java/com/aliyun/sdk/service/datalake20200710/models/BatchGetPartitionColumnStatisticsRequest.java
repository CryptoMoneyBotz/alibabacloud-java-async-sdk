// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetPartitionColumnStatisticsRequest} extends {@link RequestModel}
 *
 * <p>BatchGetPartitionColumnStatisticsRequest</p>
 */
public class BatchGetPartitionColumnStatisticsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("ColumnNames")
    private java.util.List < String > columnNames;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("PartitionNames")
    private java.util.List < String > partitionNames;

    @Body
    @NameInMap("TableName")
    private String tableName;

    private BatchGetPartitionColumnStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.columnNames = builder.columnNames;
        this.databaseName = builder.databaseName;
        this.partitionNames = builder.partitionNames;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetPartitionColumnStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return columnNames
     */
    public java.util.List < String > getColumnNames() {
        return this.columnNames;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return partitionNames
     */
    public java.util.List < String > getPartitionNames() {
        return this.partitionNames;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<BatchGetPartitionColumnStatisticsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private java.util.List < String > columnNames; 
        private String databaseName; 
        private java.util.List < String > partitionNames; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetPartitionColumnStatisticsRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.catalogId = response.catalogId;
            this.columnNames = response.columnNames;
            this.databaseName = response.databaseName;
            this.partitionNames = response.partitionNames;
            this.tableName = response.tableName;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * ColumnNames.
         */
        public Builder columnNames(java.util.List < String > columnNames) {
            this.putBodyParameter("ColumnNames", columnNames);
            this.columnNames = columnNames;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * PartitionNames.
         */
        public Builder partitionNames(java.util.List < String > partitionNames) {
            this.putBodyParameter("PartitionNames", partitionNames);
            this.partitionNames = partitionNames;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public BatchGetPartitionColumnStatisticsRequest build() {
            return new BatchGetPartitionColumnStatisticsRequest(this);
        } 

    } 

}