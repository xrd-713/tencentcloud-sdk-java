/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trp.v20210515;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trp.v20210515.models.*;

public class TrpClient extends AbstractClient{
    private static String endpoint = "trp.tencentcloudapi.com";
    private static String service = "trp";
    private static String version = "2021-05-15";

    public TrpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrpClient(Credential credential, String region, ClientProfile profile) {
        super(TrpClient.endpoint, TrpClient.version, credential, region, profile);
    }

    /**
     *接收客户侧的用户已授权的号码。
     * @param req AuthorizedTransferRequest
     * @return AuthorizedTransferResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizedTransferResponse AuthorizedTransfer(AuthorizedTransferRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuthorizedTransferResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AuthorizedTransferResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AuthorizedTransfer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增批次
     * @param req CreateCodeBatchRequest
     * @return CreateCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodeBatchResponse CreateCodeBatch(CreateCodeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCodeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCodeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCodeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成普通码包
     * @param req CreateCodePackRequest
     * @return CreateCodePackResponse
     * @throws TencentCloudSDKException
     */
    public CreateCodePackResponse CreateCodePack(CreateCodePackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCodePackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCodePackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCodePack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *以订单方式新建企业信息/配额信息
     * @param req CreateCorporationOrderRequest
     * @return CreateCorporationOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCorporationOrderResponse CreateCorporationOrder(CreateCorporationOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCorporationOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCorporationOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCorporationOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成自定义码包
     * @param req CreateCustomPackRequest
     * @return CreateCustomPackResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomPackResponse CreateCustomPack(CreateCustomPackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomPackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomPackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomPack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建自定义码规则
     * @param req CreateCustomRuleRequest
     * @return CreateCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomRuleResponse CreateCustomRule(CreateCustomRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建商户
     * @param req CreateMerchantRequest
     * @return CreateMerchantResponse
     * @throws TencentCloudSDKException
     */
    public CreateMerchantResponse CreateMerchant(CreateMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建商品
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上链溯源信息
     * @param req CreateTraceChainRequest
     * @return CreateTraceChainResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceChainResponse CreateTraceChain(CreateTraceChainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceChainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceChainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTraceChain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量绑定指定批次并激活二维码，只支持平台发的码，且只会激活没有使用过的码
     * @param req CreateTraceCodesRequest
     * @return CreateTraceCodesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceCodesResponse CreateTraceCodes(CreateTraceCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceCodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTraceCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *异步导入激活码包，如果是第三方码包，需要域名跟配置的匹配
     * @param req CreateTraceCodesAsyncRequest
     * @return CreateTraceCodesAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceCodesAsyncResponse CreateTraceCodesAsync(CreateTraceCodesAsyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceCodesAsyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceCodesAsyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTraceCodesAsync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增溯源信息
     * @param req CreateTraceDataRequest
     * @return CreateTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceDataResponse CreateTraceData(CreateTraceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTraceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTraceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTraceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除批次
     * @param req DeleteCodeBatchRequest
     * @return DeleteCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCodeBatchResponse DeleteCodeBatch(DeleteCodeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCodeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCodeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCodeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除商户
     * @param req DeleteMerchantRequest
     * @return DeleteMerchantResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMerchantResponse DeleteMerchant(DeleteMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除商品，如果商品被使用，则不可删除
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除溯源信息，如果已经上链则不可删除
     * @param req DeleteTraceDataRequest
     * @return DeleteTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTraceDataResponse DeleteTraceData(DeleteTraceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTraceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTraceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTraceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询渠道企业列表
     * @param req DescribeAgentCorpsRequest
     * @return DescribeAgentCorpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentCorpsResponse DescribeAgentCorps(DescribeAgentCorpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentCorpsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentCorpsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgentCorps");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询批次信息
     * @param req DescribeCodeBatchByIdRequest
     * @return DescribeCodeBatchByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeBatchByIdResponse DescribeCodeBatchById(DescribeCodeBatchByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodeBatchByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeBatchByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodeBatchById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询批次列表
     * @param req DescribeCodeBatchsRequest
     * @return DescribeCodeBatchsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodeBatchsResponse DescribeCodeBatchs(DescribeCodeBatchsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodeBatchsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodeBatchsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodeBatchs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询码包状态
     * @param req DescribeCodePackStatusRequest
     * @return DescribeCodePackStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodePackStatusResponse DescribeCodePackStatus(DescribeCodePackStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodePackStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodePackStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodePackStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询码包地址
     * @param req DescribeCodePackUrlRequest
     * @return DescribeCodePackUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodePackUrlResponse DescribeCodePackUrl(DescribeCodePackUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodePackUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodePackUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodePackUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询码包列表
     * @param req DescribeCodePacksRequest
     * @return DescribeCodePacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodePacksResponse DescribeCodePacks(DescribeCodePacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodePacksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodePacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodePacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询码包的二维码列表，上限 3 万
     * @param req DescribeCodesByPackRequest
     * @return DescribeCodesByPackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCodesByPackResponse DescribeCodesByPack(DescribeCodesByPackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCodesByPackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCodesByPackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCodesByPack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询渠道商下属企业额度使用情况
     * @param req DescribeCorpQuotasRequest
     * @return DescribeCorpQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCorpQuotasResponse DescribeCorpQuotas(DescribeCorpQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCorpQuotasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCorpQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCorpQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查自定义码规则
     * @param req DescribeCustomRuleByIdRequest
     * @return DescribeCustomRuleByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRuleByIdResponse DescribeCustomRuleById(DescribeCustomRuleByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomRuleByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomRuleByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomRuleById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查自定义码规则列表
     * @param req DescribeCustomRulesRequest
     * @return DescribeCustomRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRulesResponse DescribeCustomRules(DescribeCustomRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取异步任务的输出地址
     * @param req DescribeJobFileUrlRequest
     * @return DescribeJobFileUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobFileUrlResponse DescribeJobFileUrl(DescribeJobFileUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobFileUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobFileUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobFileUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商户信息
     * @param req DescribeMerchantByIdRequest
     * @return DescribeMerchantByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMerchantByIdResponse DescribeMerchantById(DescribeMerchantByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMerchantByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMerchantByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMerchantById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商户列表
     * @param req DescribeMerchantsRequest
     * @return DescribeMerchantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMerchantsResponse DescribeMerchants(DescribeMerchantsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMerchantsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMerchantsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMerchants");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商品信息
     * @param req DescribeProductByIdRequest
     * @return DescribeProductByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductByIdResponse DescribeProductById(DescribeProductByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询商品列表
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProducts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持增量查询扫码日志，通常提供给数据同步使用，调用时需要指定从哪一行开始查询数据
     * @param req DescribeRawScanLogsRequest
     * @return DescribeRawScanLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRawScanLogsResponse DescribeRawScanLogs(DescribeRawScanLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRawScanLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRawScanLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRawScanLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询扫码日志明细
     * @param req DescribeScanLogsRequest
     * @return DescribeScanLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanLogsResponse DescribeScanLogs(DescribeScanLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询扫码的统计信息列表，支持按照商户ID，产品ID，批次ID，安心码筛选，筛选条件至少有一个
没有被扫过的不会返回
     * @param req DescribeScanStatsRequest
     * @return DescribeScanStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStatsResponse DescribeScanStats(DescribeScanStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanStatsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanStatsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanStats");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询临时Token，主要用于上传接口
     * @param req DescribeTmpTokenRequest
     * @return DescribeTmpTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTmpTokenResponse DescribeTmpToken(DescribeTmpTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTmpTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTmpTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTmpToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询二维码信息
     * @param req DescribeTraceCodeByIdRequest
     * @return DescribeTraceCodeByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceCodeByIdResponse DescribeTraceCodeById(DescribeTraceCodeByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTraceCodeByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTraceCodeByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTraceCodeById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询二维码列表
     * @param req DescribeTraceCodesRequest
     * @return DescribeTraceCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceCodesResponse DescribeTraceCodes(DescribeTraceCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTraceCodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTraceCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTraceCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询溯源ID查溯源信息，通常溯源信息跟生产批次绑定，即一个批次的所有溯源信息都是一样的
     * @param req DescribeTraceDataByIdRequest
     * @return DescribeTraceDataByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceDataByIdResponse DescribeTraceDataById(DescribeTraceDataByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTraceDataByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTraceDataByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTraceDataById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询溯源信息，通常溯源信息跟生产批次绑定，即一个批次的所有溯源信息都是一样的
     * @param req DescribeTraceDataListRequest
     * @return DescribeTraceDataListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceDataListResponse DescribeTraceDataList(DescribeTraceDataListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTraceDataListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTraceDataListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTraceDataList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接收客户反馈的各环节数据
     * @param req EffectFeedbackRequest
     * @return EffectFeedbackResponse
     * @throws TencentCloudSDKException
     */
    public EffectFeedbackResponse EffectFeedback(EffectFeedbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EffectFeedbackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EffectFeedbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EffectFeedback");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改批次
     * @param req ModifyCodeBatchRequest
     * @return ModifyCodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCodeBatchResponse ModifyCodeBatch(ModifyCodeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCodeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCodeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCodeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改自定义码规则
     * @param req ModifyCustomRuleRequest
     * @return ModifyCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleResponse ModifyCustomRule(ModifyCustomRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新自定义码规则状态
     * @param req ModifyCustomRuleStatusRequest
     * @return ModifyCustomRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleStatusResponse ModifyCustomRuleStatus(ModifyCustomRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑商户
     * @param req ModifyMerchantRequest
     * @return ModifyMerchantResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMerchantResponse ModifyMerchant(ModifyMerchantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMerchantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMerchantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMerchant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑商品
     * @param req ModifyProductRequest
     * @return ModifyProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductResponse ModifyProduct(ModifyProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *冻结或者激活二维码，所属的批次的冻结状态优先级大于单个二维码的状态，即如果批次是冻结的，那么该批次下二维码的状态都是冻结的
     * @param req ModifyTraceCodeRequest
     * @return ModifyTraceCodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceCodeResponse ModifyTraceCode(ModifyTraceCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTraceCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTraceCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTraceCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑溯源码和批次的关系，让溯源码重置为未关联的状态，以便关联其他批次
注意：溯源码必须属于指定的批次才会解绑
     * @param req ModifyTraceCodeUnlinkRequest
     * @return ModifyTraceCodeUnlinkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceCodeUnlinkResponse ModifyTraceCodeUnlink(ModifyTraceCodeUnlinkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTraceCodeUnlinkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTraceCodeUnlinkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTraceCodeUnlink");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改溯源信息
     * @param req ModifyTraceDataRequest
     * @return ModifyTraceDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceDataResponse ModifyTraceData(ModifyTraceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTraceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTraceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTraceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改溯源信息的排序
     * @param req ModifyTraceDataRanksRequest
     * @return ModifyTraceDataRanksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTraceDataRanksResponse ModifyTraceDataRanks(ModifyTraceDataRanksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTraceDataRanksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTraceDataRanksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTraceDataRanks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接收离线筛选包回执，用于效果统计和分析。
     * @param req ReportBatchCallbackStatusRequest
     * @return ReportBatchCallbackStatusResponse
     * @throws TencentCloudSDKException
     */
    public ReportBatchCallbackStatusResponse ReportBatchCallbackStatus(ReportBatchCallbackStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportBatchCallbackStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReportBatchCallbackStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportBatchCallbackStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
