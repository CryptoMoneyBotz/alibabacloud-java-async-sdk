// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListHostGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListHostGroupsRequest</p>
 */
public class ListHostGroupsRequest extends Request {
    @Query
    @NameInMap("HostGroupName")
    private String hostGroupName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;


    private ListHostGroupsRequest(Builder builder) {
        super(builder);
        this.hostGroupName = builder.hostGroupName;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsRequest create() {
        return builder().build();
    }

    /**
     * @return hostGroupName
     */
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String hostGroupName; 
        private String instanceId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 

        /**
         * <p>HostGroupName.</p>
         */
        public Builder hostGroupName(String hostGroupName) {
            this.putQueryParameter("HostGroupName", hostGroupName);
            this.hostGroupName = hostGroupName;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public ListHostGroupsRequest build() {
            return new ListHostGroupsRequest(this);
        } 

    } 

}
