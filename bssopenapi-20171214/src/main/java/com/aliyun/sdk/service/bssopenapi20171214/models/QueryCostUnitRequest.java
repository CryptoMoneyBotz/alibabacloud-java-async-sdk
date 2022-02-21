// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCostUnitRequest} extends {@link RequestModel}
 *
 * <p>QueryCostUnitRequest</p>
 */
public class QueryCostUnitRequest extends Request {
    @Query
    @NameInMap("OwnerUid")
    @Validation(required = true)
    private Long ownerUid;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParentUnitId")
    @Validation(required = true)
    private Long parentUnitId;

    private QueryCostUnitRequest(Builder builder) {
        super(builder);
        this.ownerUid = builder.ownerUid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.parentUnitId = builder.parentUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerUid
     */
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentUnitId
     */
    public Long getParentUnitId() {
        return this.parentUnitId;
    }

    public static final class Builder extends Request.Builder<QueryCostUnitRequest, Builder> {
        private Long ownerUid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long parentUnitId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCostUnitRequest response) {
            super(response);
            this.ownerUid = response.ownerUid;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.parentUnitId = response.parentUnitId;
        } 

        /**
         * OwnerUid.
         */
        public Builder ownerUid(Long ownerUid) {
            this.putQueryParameter("OwnerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ParentUnitId.
         */
        public Builder parentUnitId(Long parentUnitId) {
            this.putQueryParameter("ParentUnitId", parentUnitId);
            this.parentUnitId = parentUnitId;
            return this;
        }

        @Override
        public QueryCostUnitRequest build() {
            return new QueryCostUnitRequest(this);
        } 

    } 

}
