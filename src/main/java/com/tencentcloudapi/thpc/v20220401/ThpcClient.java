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
package com.tencentcloudapi.thpc.v20220401;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.thpc.v20220401.models.*;

public class ThpcClient extends AbstractClient{
    private static String endpoint = "thpc.tencentcloudapi.com";
    private static String service = "thpc";
    private static String version = "2022-04-01";

    public ThpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ThpcClient(Credential credential, String region, ClientProfile profile) {
        super(ThpcClient.endpoint, ThpcClient.version, credential, region, profile);
    }

    /**
     *本接口(AddNodes)用于添加一个或者多个计算节点或者登录节点到指定集群。
     * @param req AddNodesRequest
     * @return AddNodesResponse
     * @throws TencentCloudSDKException
     */
    public AddNodesResponse AddNodes(AddNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(BindAutoScalingGroup)用于为集群队列绑定弹性伸缩组
     * @param req BindAutoScalingGroupRequest
     * @return BindAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoScalingGroupResponse BindAutoScalingGroup(BindAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAutoScalingGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindAutoScalingGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindAutoScalingGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateCluster) 用于创建并启动集群。
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
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
     *本接口（DeleteCluster）用于删除一个指定的集群。
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteNodes)用于删除指定集群中一个或者多个计算节点或者登录节点。
     * @param req DeleteNodesRequest
     * @return DeleteNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodesResponse DeleteNodes(DeleteNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeClusterActivities）用于查询集群活动历史记录列表。
     * @param req DescribeClusterActivitiesRequest
     * @return DescribeClusterActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterActivitiesResponse DescribeClusterActivities(DescribeClusterActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterActivitiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterActivitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterActivities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeClusters）用于查询集群列表。
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
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
     *本接口(SetAutoScalingConfiguration)用于为集群设置集群弹性伸缩配置信息。
     * @param req SetAutoScalingConfigurationRequest
     * @return SetAutoScalingConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public SetAutoScalingConfigurationResponse SetAutoScalingConfiguration(SetAutoScalingConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetAutoScalingConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetAutoScalingConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetAutoScalingConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
