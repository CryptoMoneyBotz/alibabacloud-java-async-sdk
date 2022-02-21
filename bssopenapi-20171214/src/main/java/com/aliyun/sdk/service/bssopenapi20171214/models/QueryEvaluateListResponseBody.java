// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEvaluateListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEvaluateListResponseBody</p>
 */
public class QueryEvaluateListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryEvaluateListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEvaluateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public QueryEvaluateListResponseBody build() {
            return new QueryEvaluateListResponseBody(this);
        } 

    } 

    public static class Evaluate extends TeaModel {
        @NameInMap("BillCycle")
        private String billCycle;

        @NameInMap("BillId")
        private Long billId;

        @NameInMap("BizTime")
        private String bizTime;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CanInvoiceAmount")
        private Long canInvoiceAmount;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InvoicedAmount")
        private Long invoicedAmount;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OffsetAcceptAmount")
        private Long offsetAcceptAmount;

        @NameInMap("OffsetCostAmount")
        private Long offsetCostAmount;

        @NameInMap("OpId")
        private String opId;

        @NameInMap("OriginalAmount")
        private Long originalAmount;

        @NameInMap("OutBizId")
        private String outBizId;

        @NameInMap("PresentAmount")
        private Long presentAmount;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserNick")
        private String userNick;

        private Evaluate(Builder builder) {
            this.billCycle = builder.billCycle;
            this.billId = builder.billId;
            this.bizTime = builder.bizTime;
            this.bizType = builder.bizType;
            this.canInvoiceAmount = builder.canInvoiceAmount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.invoicedAmount = builder.invoicedAmount;
            this.itemId = builder.itemId;
            this.name = builder.name;
            this.offsetAcceptAmount = builder.offsetAcceptAmount;
            this.offsetCostAmount = builder.offsetCostAmount;
            this.opId = builder.opId;
            this.originalAmount = builder.originalAmount;
            this.outBizId = builder.outBizId;
            this.presentAmount = builder.presentAmount;
            this.status = builder.status;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Evaluate create() {
            return builder().build();
        }

        /**
         * @return billCycle
         */
        public String getBillCycle() {
            return this.billCycle;
        }

        /**
         * @return billId
         */
        public Long getBillId() {
            return this.billId;
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return canInvoiceAmount
         */
        public Long getCanInvoiceAmount() {
            return this.canInvoiceAmount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return invoicedAmount
         */
        public Long getInvoicedAmount() {
            return this.invoicedAmount;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offsetAcceptAmount
         */
        public Long getOffsetAcceptAmount() {
            return this.offsetAcceptAmount;
        }

        /**
         * @return offsetCostAmount
         */
        public Long getOffsetCostAmount() {
            return this.offsetCostAmount;
        }

        /**
         * @return opId
         */
        public String getOpId() {
            return this.opId;
        }

        /**
         * @return originalAmount
         */
        public Long getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return outBizId
         */
        public String getOutBizId() {
            return this.outBizId;
        }

        /**
         * @return presentAmount
         */
        public Long getPresentAmount() {
            return this.presentAmount;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String billCycle; 
            private Long billId; 
            private String bizTime; 
            private String bizType; 
            private Long canInvoiceAmount; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long invoicedAmount; 
            private Long itemId; 
            private String name; 
            private Long offsetAcceptAmount; 
            private Long offsetCostAmount; 
            private String opId; 
            private Long originalAmount; 
            private String outBizId; 
            private Long presentAmount; 
            private Integer status; 
            private Integer type; 
            private Long userId; 
            private String userNick; 

            /**
             * BillCycle.
             */
            public Builder billCycle(String billCycle) {
                this.billCycle = billCycle;
                return this;
            }

            /**
             * BillId.
             */
            public Builder billId(Long billId) {
                this.billId = billId;
                return this;
            }

            /**
             * BizTime.
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * CanInvoiceAmount.
             */
            public Builder canInvoiceAmount(Long canInvoiceAmount) {
                this.canInvoiceAmount = canInvoiceAmount;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InvoicedAmount.
             */
            public Builder invoicedAmount(Long invoicedAmount) {
                this.invoicedAmount = invoicedAmount;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OffsetAcceptAmount.
             */
            public Builder offsetAcceptAmount(Long offsetAcceptAmount) {
                this.offsetAcceptAmount = offsetAcceptAmount;
                return this;
            }

            /**
             * OffsetCostAmount.
             */
            public Builder offsetCostAmount(Long offsetCostAmount) {
                this.offsetCostAmount = offsetCostAmount;
                return this;
            }

            /**
             * OpId.
             */
            public Builder opId(String opId) {
                this.opId = opId;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(Long originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * OutBizId.
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * PresentAmount.
             */
            public Builder presentAmount(Long presentAmount) {
                this.presentAmount = presentAmount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public Evaluate build() {
                return new Evaluate(this);
            } 

        } 

    }
    public static class EvaluateList extends TeaModel {
        @NameInMap("Evaluate")
        private java.util.List < Evaluate> evaluate;

        private EvaluateList(Builder builder) {
            this.evaluate = builder.evaluate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluateList create() {
            return builder().build();
        }

        /**
         * @return evaluate
         */
        public java.util.List < Evaluate> getEvaluate() {
            return this.evaluate;
        }

        public static final class Builder {
            private java.util.List < Evaluate> evaluate; 

            /**
             * Evaluate.
             */
            public Builder evaluate(java.util.List < Evaluate> evaluate) {
                this.evaluate = evaluate;
                return this;
            }

            public EvaluateList build() {
                return new EvaluateList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EvaluateList")
        private EvaluateList evaluateList;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalInvoiceAmount")
        private Long totalInvoiceAmount;

        @NameInMap("TotalUnAppliedInvoiceAmount")
        private Long totalUnAppliedInvoiceAmount;

        private Data(Builder builder) {
            this.evaluateList = builder.evaluateList;
            this.hostId = builder.hostId;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalInvoiceAmount = builder.totalInvoiceAmount;
            this.totalUnAppliedInvoiceAmount = builder.totalUnAppliedInvoiceAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return evaluateList
         */
        public EvaluateList getEvaluateList() {
            return this.evaluateList;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalInvoiceAmount
         */
        public Long getTotalInvoiceAmount() {
            return this.totalInvoiceAmount;
        }

        /**
         * @return totalUnAppliedInvoiceAmount
         */
        public Long getTotalUnAppliedInvoiceAmount() {
            return this.totalUnAppliedInvoiceAmount;
        }

        public static final class Builder {
            private EvaluateList evaluateList; 
            private String hostId; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Long totalInvoiceAmount; 
            private Long totalUnAppliedInvoiceAmount; 

            /**
             * EvaluateList.
             */
            public Builder evaluateList(EvaluateList evaluateList) {
                this.evaluateList = evaluateList;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalInvoiceAmount.
             */
            public Builder totalInvoiceAmount(Long totalInvoiceAmount) {
                this.totalInvoiceAmount = totalInvoiceAmount;
                return this;
            }

            /**
             * TotalUnAppliedInvoiceAmount.
             */
            public Builder totalUnAppliedInvoiceAmount(Long totalUnAppliedInvoiceAmount) {
                this.totalUnAppliedInvoiceAmount = totalUnAppliedInvoiceAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
