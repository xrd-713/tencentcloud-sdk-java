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
package com.tencentcloudapi.ccc.v20200210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ccc.v20200210.models.*;

public class CccClient extends AbstractClient{
    private static String endpoint = "ccc.tencentcloudapi.com";
    private static String service = "ccc";
    private static String version = "2020-02-10";
    
    public CccClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CccClient(Credential credential, String region, ClientProfile profile) {
        super(CccClient.endpoint, CccClient.version, credential, region, profile);
    }

    /**
     *绑定号码外呼技能组
     * @param req BindNumberCallOutSkillGroupRequest
     * @return BindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindNumberCallOutSkillGroupResponse BindNumberCallOutSkillGroup(BindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindNumberCallOutSkillGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindNumberCallOutSkillGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindNumberCallOutSkillGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定坐席所属技能组
     * @param req BindStaffSkillGroupListRequest
     * @return BindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public BindStaffSkillGroupListResponse BindStaffSkillGroupList(BindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindStaffSkillGroupListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindStaffSkillGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindStaffSkillGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建管理端访问链接
     * @param req CreateAdminURLRequest
     * @return CreateAdminURLResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdminURLResponse CreateAdminURL(CreateAdminURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAdminURLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAdminURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAdminURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自动外呼任务
     * @param req CreateAutoCalloutTaskRequest
     * @return CreateAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoCalloutTaskResponse CreateAutoCalloutTask(CreateAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoCalloutTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoCalloutTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAutoCalloutTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建技能组
     * @param req CreateCCCSkillGroupRequest
     * @return CreateCCCSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCCSkillGroupResponse CreateCCCSkillGroup(CreateCCCSkillGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCCSkillGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCCCSkillGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCCCSkillGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建外呼会话，当前仅支持双呼，即先使用平台号码呼出到坐席手机上，坐席接听后，然后再外呼用户，而且由于运营商频率限制，坐席手机号必须先加白名单，避免频控导致外呼失败。
     * @param req CreateCallOutSessionRequest
     * @return CreateCallOutSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCallOutSessionResponse CreateCallOutSession(CreateCallOutSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCallOutSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCallOutSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCallOutSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于无限频率地呼叫坐席手机
     * @param req CreateCarrierPrivilegeNumberApplicantRequest
     * @return CreateCarrierPrivilegeNumberApplicantResponse
     * @throws TencentCloudSDKException
     */
    public CreateCarrierPrivilegeNumberApplicantResponse CreateCarrierPrivilegeNumberApplicant(CreateCarrierPrivilegeNumberApplicantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCarrierPrivilegeNumberApplicantResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCarrierPrivilegeNumberApplicantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCarrierPrivilegeNumberApplicant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建话机账号
     * @param req CreateExtensionRequest
     * @return CreateExtensionResponse
     * @throws TencentCloudSDKException
     */
    public CreateExtensionResponse CreateExtension(CreateExtensionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExtensionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExtensionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExtension");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 SDK 登录 Token。
     * @param req CreateSDKLoginTokenRequest
     * @return CreateSDKLoginTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateSDKLoginTokenResponse CreateSDKLoginToken(CreateSDKLoginTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSDKLoginTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSDKLoginTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSDKLoginToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建客服账号。
     * @param req CreateStaffRequest
     * @return CreateStaffResponse
     * @throws TencentCloudSDKException
     */
    public CreateStaffResponse CreateStaff(CreateStaffRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStaffResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStaffResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStaff");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户数据签名
     * @param req CreateUserSigRequest
     * @return CreateUserSigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSigResponse CreateUserSig(CreateUserSigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserSigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserSigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserSig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除话机账号
     * @param req DeleteExtensionRequest
     * @return DeleteExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExtensionResponse DeleteExtension(DeleteExtensionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteExtensionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteExtensionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteExtension");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除坐席信息
     * @param req DeleteStaffRequest
     * @return DeleteStaffResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStaffResponse DeleteStaff(DeleteStaffRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStaffResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteStaffResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteStaff");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询生效运营商白名单规则
     * @param req DescribeActiveCarrierPrivilegeNumberRequest
     * @return DescribeActiveCarrierPrivilegeNumberResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActiveCarrierPrivilegeNumberResponse DescribeActiveCarrierPrivilegeNumber(DescribeActiveCarrierPrivilegeNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeActiveCarrierPrivilegeNumberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeActiveCarrierPrivilegeNumberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeActiveCarrierPrivilegeNumber");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询自动外呼任务详情
     * @param req DescribeAutoCalloutTaskRequest
     * @return DescribeAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTaskResponse DescribeAutoCalloutTask(DescribeAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoCalloutTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoCalloutTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoCalloutTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量查询自动任务外呼
     * @param req DescribeAutoCalloutTasksRequest
     * @return DescribeAutoCalloutTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTasksResponse DescribeAutoCalloutTasks(DescribeAutoCalloutTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoCalloutTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoCalloutTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoCalloutTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户购买信息列表
     * @param req DescribeCCCBuyInfoListRequest
     * @return DescribeCCCBuyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCCBuyInfoListResponse DescribeCCCBuyInfoList(DescribeCCCBuyInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCCBuyInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCCBuyInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCCBuyInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取呼入实时数据统计指标
     * @param req DescribeCallInMetricsRequest
     * @return DescribeCallInMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallInMetricsResponse DescribeCallInMetrics(DescribeCallInMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCallInMetricsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCallInMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCallInMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单状态
     * @param req DescribeCarrierPrivilegeNumberApplicantsRequest
     * @return DescribeCarrierPrivilegeNumberApplicantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCarrierPrivilegeNumberApplicantsResponse DescribeCarrierPrivilegeNumberApplicants(DescribeCarrierPrivilegeNumberApplicantsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCarrierPrivilegeNumberApplicantsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCarrierPrivilegeNumberApplicantsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCarrierPrivilegeNumberApplicants");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定服务记录文本聊天内容，需要先使用查询在线客服记录（DescribeIMCdrs） API 获取服务记录 SessionId。

文本聊天记录只保存了 1 年内的，1 年之前会自动清理。
     * @param req DescribeChatMessagesRequest
     * @return DescribeChatMessagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChatMessagesResponse DescribeChatMessages(DescribeChatMessagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChatMessagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChatMessagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChatMessages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取话机信息
     * @param req DescribeExtensionRequest
     * @return DescribeExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionResponse DescribeExtension(DescribeExtensionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExtensionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExtensionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExtension");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询话机列表信息
     * @param req DescribeExtensionsRequest
     * @return DescribeExtensionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionsResponse DescribeExtensions(DescribeExtensionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExtensionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExtensionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExtensions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取包括全媒体和文本会话两种类型的服务记录。
     * @param req DescribeIMCdrsRequest
     * @return DescribeIMCdrsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMCdrsResponse DescribeIMCdrs(DescribeIMCdrsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIMCdrsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIMCdrsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIMCdrs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询号码列表
     * @param req DescribeNumbersRequest
     * @return DescribeNumbersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNumbersResponse DescribeNumbers(DescribeNumbersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNumbersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNumbersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNumbers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前正在通话的会话列表
     * @param req DescribePSTNActiveSessionListRequest
     * @return DescribePSTNActiveSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePSTNActiveSessionListResponse DescribePSTNActiveSessionList(DescribePSTNActiveSessionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePSTNActiveSessionListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePSTNActiveSessionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePSTNActiveSessionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取主被叫受保护的电话服务记录与录音
     * @param req DescribeProtectedTelCdrRequest
     * @return DescribeProtectedTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectedTelCdrResponse DescribeProtectedTelCdr(DescribeProtectedTelCdrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProtectedTelCdrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProtectedTelCdrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProtectedTelCdr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取技能组信息列表
     * @param req DescribeSkillGroupInfoListRequest
     * @return DescribeSkillGroupInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillGroupInfoListResponse DescribeSkillGroupInfoList(DescribeSkillGroupInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSkillGroupInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSkillGroupInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSkillGroupInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取坐席信息列表
     * @param req DescribeStaffInfoListRequest
     * @return DescribeStaffInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffInfoListResponse DescribeStaffInfoList(DescribeStaffInfoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStaffInfoListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStaffInfoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStaffInfoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取坐席实时状态统计指标
     * @param req DescribeStaffStatusMetricsRequest
     * @return DescribeStaffStatusMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffStatusMetricsResponse DescribeStaffStatusMetrics(DescribeStaffStatusMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStaffStatusMetricsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStaffStatusMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStaffStatusMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按实例获取电话消耗统计
     * @param req DescribeTelCallInfoRequest
     * @return DescribeTelCallInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCallInfoResponse DescribeTelCallInfo(DescribeTelCallInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTelCallInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTelCallInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTelCallInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取电话服务记录与录音
     * @param req DescribeTelCdrRequest
     * @return DescribeTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCdrResponse DescribeTelCdr(DescribeTelCdrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTelCdrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTelCdrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTelCdr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取 PSTN 会话信息
     * @param req DescribeTelSessionRequest
     * @return DescribeTelSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelSessionResponse DescribeTelSession(DescribeTelSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTelSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTelSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTelSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停用号码
     * @param req DisableCCCPhoneNumberRequest
     * @return DisableCCCPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public DisableCCCPhoneNumberResponse DisableCCCPhoneNumber(DisableCCCPhoneNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCCCPhoneNumberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCCCPhoneNumberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableCCCPhoneNumber");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *挂断电话
     * @param req HangUpCallRequest
     * @return HangUpCallResponse
     * @throws TencentCloudSDKException
     */
    public HangUpCallResponse HangUpCall(HangUpCallRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HangUpCallResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<HangUpCallResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HangUpCall");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改话机账号(绑定技能组、绑定坐席账号)
     * @param req ModifyExtensionRequest
     * @return ModifyExtensionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExtensionResponse ModifyExtension(ModifyExtensionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyExtensionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyExtensionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyExtension");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改客服账号
     * @param req ModifyStaffRequest
     * @return ModifyStaffResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStaffResponse ModifyStaff(ModifyStaffRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStaffResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyStaffResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyStaff");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置话机注册密码
     * @param req ResetExtensionPasswordRequest
     * @return ResetExtensionPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetExtensionPasswordResponse ResetExtensionPassword(ResetExtensionPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetExtensionPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResetExtensionPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetExtensionPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止自动外呼任务
     * @param req StopAutoCalloutTaskRequest
     * @return StopAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopAutoCalloutTaskResponse StopAutoCalloutTask(StopAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopAutoCalloutTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopAutoCalloutTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopAutoCalloutTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑号码外呼技能组
     * @param req UnbindNumberCallOutSkillGroupRequest
     * @return UnbindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public UnbindNumberCallOutSkillGroupResponse UnbindNumberCallOutSkillGroup(UnbindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindNumberCallOutSkillGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindNumberCallOutSkillGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindNumberCallOutSkillGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑坐席所属技能组
     * @param req UnbindStaffSkillGroupListRequest
     * @return UnbindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public UnbindStaffSkillGroupListResponse UnbindStaffSkillGroupList(UnbindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindStaffSkillGroupListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindStaffSkillGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindStaffSkillGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
