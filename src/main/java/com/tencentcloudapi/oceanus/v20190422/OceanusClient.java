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
package com.tencentcloudapi.oceanus.v20190422;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.oceanus.v20190422.models.*;

public class OceanusClient extends AbstractClient{
    private static String endpoint = "oceanus.tencentcloudapi.com";
    private static String service = "oceanus";
    private static String version = "2019-04-22";
    
    public OceanusClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OceanusClient(Credential credential, String region, ClientProfile profile) {
        super(OceanusClient.endpoint, OceanusClient.version, credential, region, profile);
    }

    /**
     *检查快照是否可用
     * @param req CheckSavepointRequest
     * @return CheckSavepointResponse
     * @throws TencentCloudSDKException
     */
    public CheckSavepointResponse CheckSavepoint(CheckSavepointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckSavepointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckSavepointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckSavepoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *单条和批量复制作业
     * @param req CopyJobsRequest
     * @return CopyJobsResponse
     * @throws TencentCloudSDKException
     */
    public CopyJobsResponse CopyJobs(CopyJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CopyJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopyJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *作业列表页面新建文件夹请求
     * @param req CreateFolderRequest
     * @return CreateFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateFolderResponse CreateFolder(CreateFolderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFolderResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFolderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFolder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建作业接口，一个 AppId 最多允许创建1000个作业
     * @param req CreateJobRequest
     * @return CreateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobResponse CreateJob(CreateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建作业配置，一个作业最多有100个配置版本
     * @param req CreateJobConfigRequest
     * @return CreateJobConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobConfigResponse CreateJobConfig(CreateJobConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateJobConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateJobConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateJobConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建资源接口
     * @param req CreateResourceRequest
     * @return CreateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceResponse CreateResource(CreateResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建资源配置接口
     * @param req CreateResourceConfigRequest
     * @return CreateResourceConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceConfigResponse CreateResourceConfig(CreateResourceConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourceConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourceConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResourceConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除作业接口，批量操作数量上限20
     * @param req DeleteJobsRequest
     * @return DeleteJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobsResponse DeleteJobs(DeleteJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除资源版本
     * @param req DeleteResourceConfigsRequest
     * @return DeleteResourceConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceConfigsResponse DeleteResourceConfigs(DeleteResourceConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResourceConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除资源接口
     * @param req DeleteResourcesRequest
     * @return DeleteResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourcesResponse DeleteResources(DeleteResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除作业表配置
     * @param req DeleteTableConfigRequest
     * @return DeleteTableConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableConfigResponse DeleteTableConfig(DeleteTableConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTableConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTableConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTableConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询作业配置列表，一次最多查询100个
     * @param req DescribeJobConfigsRequest
     * @return DescribeJobConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobConfigsResponse DescribeJobConfigs(DescribeJobConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查找Savepoint列表
     * @param req DescribeJobSavepointRequest
     * @return DescribeJobSavepointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSavepointResponse DescribeJobSavepoint(DescribeJobSavepointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobSavepointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobSavepointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobSavepoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询作业实例启动日志
     * @param req DescribeJobSubmissionLogRequest
     * @return DescribeJobSubmissionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobSubmissionLogResponse DescribeJobSubmissionLog(DescribeJobSubmissionLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobSubmissionLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobSubmissionLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobSubmissionLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询作业
     * @param req DescribeJobsRequest
     * @return DescribeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobsResponse DescribeJobs(DescribeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述资源配置接口
     * @param req DescribeResourceConfigsRequest
     * @return DescribeResourceConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceConfigsResponse DescribeResourceConfigs(DescribeResourceConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资源关联作业信息
     * @param req DescribeResourceRelatedJobsRequest
     * @return DescribeResourceRelatedJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceRelatedJobsResponse DescribeResourceRelatedJobs(DescribeResourceRelatedJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceRelatedJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceRelatedJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceRelatedJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述资源接口
     * @param req DescribeResourcesRequest
     * @return DescribeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesResponse DescribeResources(DescribeResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述系统资源接口
     * @param req DescribeSystemResourcesRequest
     * @return DescribeSystemResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemResourcesResponse DescribeSystemResources(DescribeSystemResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSystemResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSystemResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSystemResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成树状作业显示结构
     * @param req DescribeTreeJobsRequest
     * @return DescribeTreeJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTreeJobsResponse DescribeTreeJobs(DescribeTreeJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTreeJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTreeJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTreeJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询树状结构资源列表
     * @param req DescribeTreeResourcesRequest
     * @return DescribeTreeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTreeResourcesResponse DescribeTreeResources(DescribeTreeResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTreeResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTreeResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTreeResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *授权工作空间列表
     * @param req DescribeWorkSpacesRequest
     * @return DescribeWorkSpacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkSpacesResponse DescribeWorkSpaces(DescribeWorkSpacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkSpacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkSpacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWorkSpaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新作业属性，仅允许以下3种操作，不支持组合操作：
(1)	更新作业名称
(2)	更新作业备注 
(3)	更新作业最大并行度
变更前提：WorkerCuNum<=MaxParallelism
如果MaxParallelism变小，不重启作业，待下一次重启生效
如果MaxParallelism变大，则要求入参RestartAllowed必须为True
假设作业运行状态，则先停止作业，再启动作业，中间状态丢失
假设作业暂停状态，则将作业更改为停止状态，中间状态丢失


     * @param req ModifyJobRequest
     * @return ModifyJobResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJobResponse ModifyJob(ModifyJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量启动或者恢复作业，批量操作数量上限20
     * @param req RunJobsRequest
     * @return RunJobsResponse
     * @throws TencentCloudSDKException
     */
    public RunJobsResponse RunJobs(RunJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量停止作业，批量操作数量上限为20
     * @param req StopJobsRequest
     * @return StopJobsResponse
     * @throws TencentCloudSDKException
     */
    public StopJobsResponse StopJobs(StopJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *触发Savepoint
     * @param req TriggerJobSavepointRequest
     * @return TriggerJobSavepointResponse
     * @throws TencentCloudSDKException
     */
    public TriggerJobSavepointResponse TriggerJobSavepoint(TriggerJobSavepointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TriggerJobSavepointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TriggerJobSavepointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TriggerJobSavepoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
