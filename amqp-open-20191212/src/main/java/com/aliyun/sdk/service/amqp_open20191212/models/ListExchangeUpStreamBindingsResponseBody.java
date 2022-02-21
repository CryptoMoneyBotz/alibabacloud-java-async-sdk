// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExchangeUpStreamBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExchangeUpStreamBindingsResponseBody</p>
 */
public class ListExchangeUpStreamBindingsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListExchangeUpStreamBindingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExchangeUpStreamBindingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public ListExchangeUpStreamBindingsResponseBody build() {
            return new ListExchangeUpStreamBindingsResponseBody(this);
        } 

    } 

    public static class Bindings extends TeaModel {
        @NameInMap("Argument")
        private String argument;

        @NameInMap("BindingKey")
        private String bindingKey;

        @NameInMap("BindingType")
        private String bindingType;

        @NameInMap("DestinationName")
        private String destinationName;

        @NameInMap("SourceExchange")
        private String sourceExchange;

        private Bindings(Builder builder) {
            this.argument = builder.argument;
            this.bindingKey = builder.bindingKey;
            this.bindingType = builder.bindingType;
            this.destinationName = builder.destinationName;
            this.sourceExchange = builder.sourceExchange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bindings create() {
            return builder().build();
        }

        /**
         * @return argument
         */
        public String getArgument() {
            return this.argument;
        }

        /**
         * @return bindingKey
         */
        public String getBindingKey() {
            return this.bindingKey;
        }

        /**
         * @return bindingType
         */
        public String getBindingType() {
            return this.bindingType;
        }

        /**
         * @return destinationName
         */
        public String getDestinationName() {
            return this.destinationName;
        }

        /**
         * @return sourceExchange
         */
        public String getSourceExchange() {
            return this.sourceExchange;
        }

        public static final class Builder {
            private String argument; 
            private String bindingKey; 
            private String bindingType; 
            private String destinationName; 
            private String sourceExchange; 

            /**
             * Argument.
             */
            public Builder argument(String argument) {
                this.argument = argument;
                return this;
            }

            /**
             * BindingKey.
             */
            public Builder bindingKey(String bindingKey) {
                this.bindingKey = bindingKey;
                return this;
            }

            /**
             * BindingType.
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * DestinationName.
             */
            public Builder destinationName(String destinationName) {
                this.destinationName = destinationName;
                return this;
            }

            /**
             * SourceExchange.
             */
            public Builder sourceExchange(String sourceExchange) {
                this.sourceExchange = sourceExchange;
                return this;
            }

            public Bindings build() {
                return new Bindings(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Bindings")
        private java.util.List < Bindings> bindings;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.bindings = builder.bindings;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindings
         */
        public java.util.List < Bindings> getBindings() {
            return this.bindings;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List < Bindings> bindings; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * Bindings.
             */
            public Builder bindings(java.util.List < Bindings> bindings) {
                this.bindings = bindings;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
