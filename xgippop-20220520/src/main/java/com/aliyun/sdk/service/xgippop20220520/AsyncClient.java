// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.xgippop20220520.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<ChangeApplicationInfoResponse> changeApplicationInfo(ChangeApplicationInfoRequest request);

    CompletableFuture<CreateApplicationInfoResponse> createApplicationInfo(CreateApplicationInfoRequest request);

    CompletableFuture<GetAliyunXgipTokenResponse> getAliyunXgipToken(GetAliyunXgipTokenRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetFreeFlowInstanceResponse> getFreeFlowInstance(GetFreeFlowInstanceRequest request);

    CompletableFuture<GetFreeFlowProductListResponse> getFreeFlowProductList(GetFreeFlowProductListRequest request);

    CompletableFuture<GetFreeFlowUsageResponse> getFreeFlowUsage(GetFreeFlowUsageRequest request);

    CompletableFuture<GetFreeFlowUsageStatisticResponse> getFreeFlowUsageStatistic(GetFreeFlowUsageStatisticRequest request);

    CompletableFuture<GetOrderFreeFlowProductStatusResponse> getOrderFreeFlowProductStatus(GetOrderFreeFlowProductStatusRequest request);

    CompletableFuture<ModifyApplicationResponse> modifyApplication(ModifyApplicationRequest request);

    CompletableFuture<OrderFreeFlowProductResponse> orderFreeFlowProduct(OrderFreeFlowProductRequest request);

    CompletableFuture<SaveApplicationInfoResponse> saveApplicationInfo(SaveApplicationInfoRequest request);

    CompletableFuture<SdkValidateStatusResponse> sdkValidateStatus(SdkValidateStatusRequest request);

    CompletableFuture<ValidateStatusResponse> validateStatus(ValidateStatusRequest request);

}
