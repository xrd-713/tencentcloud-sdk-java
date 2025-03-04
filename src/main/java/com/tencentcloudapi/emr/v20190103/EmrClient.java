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
package com.tencentcloudapi.emr.v20190103;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.emr.v20190103.models.*;

public class EmrClient extends AbstractClient{
    private static String endpoint = "emr.tencentcloudapi.com";
    private static String service = "emr";
    private static String version = "2019-01-03";
    
    public EmrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EmrClient(Credential credential, String region, ClientProfile profile) {
        super(EmrClient.endpoint, EmrClient.version, credential, region, profile);
    }

    /**
     *该接口支持安装了OpenLdap组件的集群。
新增用户列表（用户管理）。
     * @param req AddUsersForUserManagerRequest
     * @return AddUsersForUserManagerResponse
     * @throws TencentCloudSDKException
     */
    public AddUsersForUserManagerResponse AddUsersForUserManager(AddUsersForUserManagerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUsersForUserManagerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddUsersForUserManagerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUsersForUserManager");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建EMR集群实例
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建EMR集群实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户列表（用户管理）
     * @param req DeleteUserManagerUserListRequest
     * @return DeleteUserManagerUserListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserManagerUserListResponse DeleteUserManagerUserList(DeleteUserManagerUserListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserManagerUserListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserManagerUserListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserManagerUserList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群节点信息
     * @param req DescribeClusterNodesRequest
     * @return DescribeClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodesResponse DescribeClusterNodes(DescribeClusterNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取账户的CVM配额
     * @param req DescribeCvmQuotaRequest
     * @return DescribeCvmQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCvmQuotaResponse DescribeCvmQuota(DescribeCvmQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCvmQuotaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCvmQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCvmQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * yarn application 统计接口查询
     * @param req DescribeEmrApplicationStaticsRequest
     * @return DescribeEmrApplicationStaticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmrApplicationStaticsResponse DescribeEmrApplicationStatics(DescribeEmrApplicationStaticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEmrApplicationStaticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEmrApplicationStaticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEmrApplicationStatics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取hive查询信息
     * @param req DescribeHiveQueriesRequest
     * @return DescribeHiveQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHiveQueriesResponse DescribeHiveQueries(DescribeHiveQueriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHiveQueriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHiveQueriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHiveQueries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeImpalaQueries
     * @param req DescribeImpalaQueriesRequest
     * @return DescribeImpalaQueriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImpalaQueriesResponse DescribeImpalaQueries(DescribeImpalaQueriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImpalaQueriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImpalaQueriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImpalaQueries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询待续费节点信息
     * @param req DescribeInstanceRenewNodesRequest
     * @return DescribeInstanceRenewNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceRenewNodesResponse DescribeInstanceRenewNodes(DescribeInstanceRenewNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceRenewNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceRenewNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceRenewNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群实例信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群列表
     * @param req DescribeInstancesListRequest
     * @return DescribeInstancesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesListResponse DescribeInstancesList(DescribeInstancesListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流程任务
     * @param req DescribeJobFlowRequest
     * @return DescribeJobFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobFlowResponse DescribeJobFlow(DescribeJobFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询YARN资源调度数据信息
     * @param req DescribeResourceScheduleRequest
     * @return DescribeResourceScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceScheduleResponse DescribeResourceSchedule(DescribeResourceScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceScheduleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口支持安装了OpenLdap组件的集群。
批量导出用户。对于kerberos集群，如果需要kertab文件下载地址，可以将NeedKeytabInfo设置为true；注意SupportDownLoadKeyTab为true，但是DownLoadKeyTabUrl为空字符串，表示keytab文件在后台没有准备好（正在生成）。
     * @param req DescribeUsersForUserManagerRequest
     * @return DescribeUsersForUserManagerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersForUserManagerResponse DescribeUsersForUserManager(DescribeUsersForUserManagerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsersForUserManagerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsersForUserManagerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsersForUserManager");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeYarnApplications
     * @param req DescribeYarnApplicationsRequest
     * @return DescribeYarnApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYarnApplicationsResponse DescribeYarnApplications(DescribeYarnApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeYarnApplicationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeYarnApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeYarnApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集群续费询价。
     * @param req InquirePriceRenewEmrRequest
     * @return InquirePriceRenewEmrResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewEmrResponse InquirePriceRenewEmr(InquirePriceRenewEmrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceRenewEmrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceRenewEmrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceRenewEmr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建实例询价
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *续费询价。
     * @param req InquiryPriceRenewInstanceRequest
     * @return InquiryPriceRenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewInstanceResponse InquiryPriceRenewInstance(InquiryPriceRenewInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceRenewInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扩容询价. 当扩容时候，请通过该接口查询价格。
     * @param req InquiryPriceScaleOutInstanceRequest
     * @return InquiryPriceScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceScaleOutInstanceResponse InquiryPriceScaleOutInstance(InquiryPriceScaleOutInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceScaleOutInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceScaleOutInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceScaleOutInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *变配询价
     * @param req InquiryPriceUpdateInstanceRequest
     * @return InquiryPriceUpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpdateInstanceResponse InquiryPriceUpdateInstance(InquiryPriceUpdateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceUpdateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceUpdateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceUpdateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *刷新YARN的动态资源池
     * @param req ModifyResourcePoolsRequest
     * @return ModifyResourcePoolsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcePoolsResponse ModifyResourcePools(ModifyResourcePoolsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourcePoolsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourcePoolsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourcePools");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改YARN资源调度的资源配置
     * @param req ModifyResourceScheduleConfigRequest
     * @return ModifyResourceScheduleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceScheduleConfigResponse ModifyResourceScheduleConfig(ModifyResourceScheduleConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceScheduleConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceScheduleConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourceScheduleConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改了yarn的资源调度器，点击部署生效
     * @param req ModifyResourceSchedulerRequest
     * @return ModifyResourceSchedulerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceSchedulerResponse ModifyResourceScheduler(ModifyResourceSchedulerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceSchedulerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceSchedulerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourceScheduler");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *强制修改标签
     * @param req ModifyResourcesTagsRequest
     * @return ModifyResourcesTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourcesTagsResponse ModifyResourcesTags(ModifyResourcesTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourcesTagsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourcesTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourcesTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建流程作业
     * @param req RunJobFlowRequest
     * @return RunJobFlowResponse
     * @throws TencentCloudSDKException
     */
    public RunJobFlowResponse RunJobFlow(RunJobFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunJobFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunJobFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunJobFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扩容集群节点
     * @param req ScaleOutClusterRequest
     * @return ScaleOutClusterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutClusterResponse ScaleOutCluster(ScaleOutClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleOutClusterResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleOutClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleOutCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扩容节点
     * @param req ScaleOutInstanceRequest
     * @return ScaleOutInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutInstanceResponse ScaleOutInstance(ScaleOutInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleOutInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleOutInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleOutInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于启停服务 重启服务等功能
     * @param req StartStopServiceOrMonitorRequest
     * @return StartStopServiceOrMonitorResponse
     * @throws TencentCloudSDKException
     */
    public StartStopServiceOrMonitorResponse StartStopServiceOrMonitor(StartStopServiceOrMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartStopServiceOrMonitorResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartStopServiceOrMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartStopServiceOrMonitor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *EMR同步TKE中POD状态
     * @param req SyncPodStateRequest
     * @return SyncPodStateResponse
     * @throws TencentCloudSDKException
     */
    public SyncPodStateResponse SyncPodState(SyncPodStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncPodStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SyncPodStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncPodState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁集群节点
     * @param req TerminateClusterNodesRequest
     * @return TerminateClusterNodesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateClusterNodesResponse TerminateClusterNodes(TerminateClusterNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateClusterNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateClusterNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateClusterNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁EMR实例。此接口仅支持弹性MapReduce正式计费版本。
     * @param req TerminateInstanceRequest
     * @return TerminateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstanceResponse TerminateInstance(TerminateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *缩容Task节点
     * @param req TerminateTasksRequest
     * @return TerminateTasksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateTasksResponse TerminateTasks(TerminateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
