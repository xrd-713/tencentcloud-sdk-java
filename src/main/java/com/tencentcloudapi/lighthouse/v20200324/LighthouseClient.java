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
package com.tencentcloudapi.lighthouse.v20200324;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.lighthouse.v20200324.models.*;

public class LighthouseClient extends AbstractClient{
    private static String endpoint = "lighthouse.tencentcloudapi.com";
    private static String service = "lighthouse";
    private static String version = "2020-03-24";
    
    public LighthouseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public LighthouseClient(Credential credential, String region, ClientProfile profile) {
        super(LighthouseClient.endpoint, LighthouseClient.version, credential, region, profile);
    }

    /**
     *本接口（ApplyDiskBackup）用于回滚指定云硬盘的备份点。
* 仅支持回滚到原云硬盘。
* 用于回滚的云硬盘备份点必须处于 NORMAL 状态。
  云硬盘备份点状态可以通过  [DescribeDiskBackups](https://cloud.tencent.com/document/api/1207/84379) 接口查询。
* 回滚云硬盘备份点时，云硬盘的状态必须为 UNATTACHED或ATTACHED。
  云硬盘状态可通过 [DescribeDisks](https://cloud.tencent.com/document/api/1207/66093) 接口查询。
* 如果云硬盘处于 ATTACHED状态，相关RUNNING 状态的实例会强制关机，然后回滚云硬盘备份点。
     * @param req ApplyDiskBackupRequest
     * @return ApplyDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyDiskBackupResponse ApplyDiskBackup(ApplyDiskBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyDiskBackupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyDiskBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyDiskBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ApplyFirewallTemplate) 用于应用防火墙模板到多个实例。
     * @param req ApplyFirewallTemplateRequest
     * @return ApplyFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyFirewallTemplateResponse ApplyFirewallTemplate(ApplyFirewallTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyFirewallTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyFirewallTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyFirewallTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ApplyInstanceSnapshot）用于回滚指定实例的系统盘快照。
<li>仅支持回滚到原系统盘。</li>
<li>用于回滚的快照必须处于 NORMAL 状态。快照状态可以通过 DescribeSnapshots 接口查询，见输出参数中 SnapshotState 字段解释。</li>
<li>回滚快照时，实例的状态必须为 STOPPED 或 RUNNING，可通过 DescribeInstances 接口查询实例状态。处于 RUNNING 状态的实例会强制关机，然后回滚快照。</li>
     * @param req ApplyInstanceSnapshotRequest
     * @return ApplyInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ApplyInstanceSnapshotResponse ApplyInstanceSnapshot(ApplyInstanceSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyInstanceSnapshotResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyInstanceSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyInstanceSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssociateInstancesKeyPairs）用于绑定用户指定密钥对到实例。
* 只支持 [RUNNING, STOPPED] 状态的 LINUX_UNIX 操作系统的实例。处于 RUNNING 状态的实例会强制关机，然后绑定。
* 将密钥的公钥写入到实例的 SSH 配置当中，用户就可以通过该密钥的私钥来登录实例。
* 如果实例原来绑定过密钥，那么原来的密钥将失效。
* 如果实例原来是通过密码登录，绑定密钥后无法使用密码登录。
* 支持批量操作。每次请求批量实例的上限为 100。如果批量实例存在不允许操作的实例，操作会以特定错误码返回。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req AssociateInstancesKeyPairsRequest
     * @return AssociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateInstancesKeyPairsResponse AssociateInstancesKeyPairs(AssociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateInstancesKeyPairsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateInstancesKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateInstancesKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (AttachCcn) 用于建立与云联网的关联。
     * @param req AttachCcnRequest
     * @return AttachCcnResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnResponse AttachCcn(AttachCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCcnResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCcnResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachCcn");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachDisks）用于挂载一个或多个云硬盘。
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AttachDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateBlueprint) 用于创建镜像。
     * @param req CreateBlueprintRequest
     * @return CreateBlueprintResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlueprintResponse CreateBlueprint(CreateBlueprintRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBlueprintResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBlueprintResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBlueprint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( CreateDiskBackup  ) 用于创建指定云硬盘（当前只支持数据盘）的备份点。
     * @param req CreateDiskBackupRequest
     * @return CreateDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDiskBackupResponse CreateDiskBackup(CreateDiskBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDiskBackupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDiskBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDiskBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDisks)用于创建一个或多个云硬盘。
     * @param req CreateDisksRequest
     * @return CreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisksResponse CreateDisks(CreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateFirewallRules）用于在实例上添加防火墙规则。


* FirewallVersion 为防火墙版本号，用户每次更新防火墙规则版本会自动加1，防止您更新的规则已过期，不填不考虑冲突。

在 FirewallRules 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req CreateFirewallRulesRequest
     * @return CreateFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirewallRulesResponse CreateFirewallRules(CreateFirewallRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFirewallRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFirewallRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFirewallRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateFirewallTemplate) 用于创建防火墙模板。
     * @param req CreateFirewallTemplateRequest
     * @return CreateFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirewallTemplateResponse CreateFirewallTemplate(CreateFirewallTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFirewallTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFirewallTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFirewallTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateFirewallTemplateRules) 用于创建防火墙模板规则。
     * @param req CreateFirewallTemplateRulesRequest
     * @return CreateFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFirewallTemplateRulesResponse CreateFirewallTemplateRules(CreateFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFirewallTemplateRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFirewallTemplateRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFirewallTemplateRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateInstanceSnapshot）用于创建指定实例的系统盘快照。
     * @param req CreateInstanceSnapshotRequest
     * @return CreateInstanceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceSnapshotResponse CreateInstanceSnapshot(CreateInstanceSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceSnapshotResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstanceSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateInstances)用于创建一个或多个指定套餐的轻量应用服务器实例。
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateKeyPair）用于创建一个密钥对。
     * @param req CreateKeyPairRequest
     * @return CreateKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyPairResponse CreateKeyPair(CreateKeyPairRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKeyPairResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKeyPairResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateKeyPair");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteBlueprints) 用于删除镜像。
     * @param req DeleteBlueprintsRequest
     * @return DeleteBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlueprintsResponse DeleteBlueprints(DeleteBlueprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBlueprintsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBlueprintsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBlueprints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteDiskBackups）用于删除云硬盘备份点。
云硬盘备份点必须处于 NORMAL 状态，云硬盘备份点状态可以通过 [DescribeDiskBackups](https://cloud.tencent.com/document/api/1207/84379)接口查询，见输出参数中 DiskBackupState 字段解释。
     * @param req DeleteDiskBackupsRequest
     * @return DeleteDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDiskBackupsResponse DeleteDiskBackups(DeleteDiskBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDiskBackupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDiskBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDiskBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteFirewallRules）用于删除实例的防火墙规则。

* FirewallVersion 用于指定要操作的防火墙的版本。传入 FirewallVersion 版本号若不等于当前防火墙的最新版本，将返回失败；若不传 FirewallVersion 则直接删除指定的规则。

在 FirewallRules 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req DeleteFirewallRulesRequest
     * @return DeleteFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirewallRulesResponse DeleteFirewallRules(DeleteFirewallRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFirewallRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFirewallRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFirewallRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteFirewallTemplate) 用于删除防火墙模板。
     * @param req DeleteFirewallTemplateRequest
     * @return DeleteFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirewallTemplateResponse DeleteFirewallTemplate(DeleteFirewallTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFirewallTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFirewallTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFirewallTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteFirewallTemplateRules) 用于删除防火墙模板规则。
     * @param req DeleteFirewallTemplateRulesRequest
     * @return DeleteFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirewallTemplateRulesResponse DeleteFirewallTemplateRules(DeleteFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFirewallTemplateRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFirewallTemplateRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFirewallTemplateRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteKeyPairs）用于删除密钥对。
     * @param req DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKeyPairsResponse DeleteKeyPairs(DeleteKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteKeyPairsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSnapshots）用于删除快照。
快照必须处于 NORMAL 状态，快照状态可以通过 DescribeSnapshots 接口查询，见输出参数中 SnapshotState 字段解释。
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeAllScenes)用于查询全地域使用场景列表。
     * @param req DescribeAllScenesRequest
     * @return DescribeAllScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllScenesResponse DescribeAllScenes(DescribeAllScenesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllScenesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllScenesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllScenes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBlueprintInstances）用于查询镜像实例信息。
     * @param req DescribeBlueprintInstancesRequest
     * @return DescribeBlueprintInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlueprintInstancesResponse DescribeBlueprintInstances(DescribeBlueprintInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlueprintInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlueprintInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlueprintInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBlueprints）用于查询镜像信息。
     * @param req DescribeBlueprintsRequest
     * @return DescribeBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlueprintsResponse DescribeBlueprints(DescribeBlueprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlueprintsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlueprintsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlueprints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBundleDiscount）用于查询套餐折扣信息。
     * @param req DescribeBundleDiscountRequest
     * @return DescribeBundleDiscountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBundleDiscountResponse DescribeBundleDiscount(DescribeBundleDiscountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBundleDiscountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBundleDiscountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBundleDiscount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBundles）用于查询套餐信息。
     * @param req DescribeBundlesRequest
     * @return DescribeBundlesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBundlesResponse DescribeBundles(DescribeBundlesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBundlesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBundlesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBundles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeCcnAttachedInstances) 用于查询云联网关联的实例信息。
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnAttachedInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnAttachedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcnAttachedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDiskBackups）用于查询云硬盘备份点的详细信息。
     * @param req DescribeDiskBackupsRequest
     * @return DescribeDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskBackupsResponse DescribeDiskBackups(DescribeDiskBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskBackupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDiskBackupsDeniedActions）用于查询一个或多个云硬盘备份点的操作限制列表信息。
     * @param req DescribeDiskBackupsDeniedActionsRequest
     * @return DescribeDiskBackupsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskBackupsDeniedActionsResponse DescribeDiskBackupsDeniedActions(DescribeDiskBackupsDeniedActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskBackupsDeniedActionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskBackupsDeniedActionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskBackupsDeniedActions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDiskConfigs）用于查询云硬盘配置。
     * @param req DescribeDiskConfigsRequest
     * @return DescribeDiskConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskConfigsResponse DescribeDiskConfigs(DescribeDiskConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDiskDiscount)用于查询云硬盘折扣信息。
     * @param req DescribeDiskDiscountRequest
     * @return DescribeDiskDiscountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskDiscountResponse DescribeDiskDiscount(DescribeDiskDiscountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskDiscountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskDiscountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskDiscount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDisks）用于查询云硬盘信息。
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDisksDeniedActions）用于查询一个或多个云硬盘的操作限制列表信息。
     * @param req DescribeDisksDeniedActionsRequest
     * @return DescribeDisksDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksDeniedActionsResponse DescribeDisksDeniedActions(DescribeDisksDeniedActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisksDeniedActionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisksDeniedActionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDisksDeniedActions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDisksReturnable）用于查询云硬盘是否可退还。
     * @param req DescribeDisksReturnableRequest
     * @return DescribeDisksReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksReturnableResponse DescribeDisksReturnable(DescribeDisksReturnableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisksReturnableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisksReturnableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDisksReturnable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例内的Docker活动列表。
     * @param req DescribeDockerActivitiesRequest
     * @return DescribeDockerActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerActivitiesResponse DescribeDockerActivities(DescribeDockerActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDockerActivitiesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDockerActivitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDockerActivities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例内的Docker容器配置信息
     * @param req DescribeDockerContainerConfigurationRequest
     * @return DescribeDockerContainerConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerContainerConfigurationResponse DescribeDockerContainerConfiguration(DescribeDockerContainerConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDockerContainerConfigurationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDockerContainerConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDockerContainerConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例内的Docker容器详情
     * @param req DescribeDockerContainerDetailRequest
     * @return DescribeDockerContainerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerContainerDetailResponse DescribeDockerContainerDetail(DescribeDockerContainerDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDockerContainerDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDockerContainerDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDockerContainerDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例内的容器列表。
     * @param req DescribeDockerContainersRequest
     * @return DescribeDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDockerContainersResponse DescribeDockerContainers(DescribeDockerContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDockerContainersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDockerContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDockerContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFirewallRules）用于查询实例的防火墙规则。
     * @param req DescribeFirewallRulesRequest
     * @return DescribeFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallRulesResponse DescribeFirewallRules(DescribeFirewallRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFirewallRulesTemplate）用于查询防火墙规则模板。
     * @param req DescribeFirewallRulesTemplateRequest
     * @return DescribeFirewallRulesTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallRulesTemplateResponse DescribeFirewallRulesTemplate(DescribeFirewallRulesTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallRulesTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallRulesTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallRulesTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeFirewallTemplateApplyRecords) 用于查询防火墙模板应用记录列表。
     * @param req DescribeFirewallTemplateApplyRecordsRequest
     * @return DescribeFirewallTemplateApplyRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateApplyRecordsResponse DescribeFirewallTemplateApplyRecords(DescribeFirewallTemplateApplyRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallTemplateApplyRecordsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallTemplateApplyRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallTemplateApplyRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeFirewallTemplateQuota) 用于查询防火墙模板配额。
     * @param req DescribeFirewallTemplateQuotaRequest
     * @return DescribeFirewallTemplateQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateQuotaResponse DescribeFirewallTemplateQuota(DescribeFirewallTemplateQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallTemplateQuotaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallTemplateQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallTemplateQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeFirewallTemplateRuleQuota) 用于查询防火墙模板规则配额。
     * @param req DescribeFirewallTemplateRuleQuotaRequest
     * @return DescribeFirewallTemplateRuleQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateRuleQuotaResponse DescribeFirewallTemplateRuleQuota(DescribeFirewallTemplateRuleQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallTemplateRuleQuotaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallTemplateRuleQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallTemplateRuleQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeFirewallTemplateRules) 用于查询防火墙模板规则列表。
     * @param req DescribeFirewallTemplateRulesRequest
     * @return DescribeFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplateRulesResponse DescribeFirewallTemplateRules(DescribeFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallTemplateRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallTemplateRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallTemplateRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeFirewallTemplates) 用于查询防火墙模板列表。
     * @param req DescribeFirewallTemplatesRequest
     * @return DescribeFirewallTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirewallTemplatesResponse DescribeFirewallTemplates(DescribeFirewallTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirewallTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirewallTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirewallTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGeneralResourceQuotas）用于查询通用资源配额信息。
     * @param req DescribeGeneralResourceQuotasRequest
     * @return DescribeGeneralResourceQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralResourceQuotasResponse DescribeGeneralResourceQuotas(DescribeGeneralResourceQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGeneralResourceQuotasResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGeneralResourceQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGeneralResourceQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询实例默认登录密钥属性。
     * @param req DescribeInstanceLoginKeyPairAttributeRequest
     * @return DescribeInstanceLoginKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLoginKeyPairAttributeResponse DescribeInstanceLoginKeyPairAttribute(DescribeInstanceLoginKeyPairAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLoginKeyPairAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLoginKeyPairAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLoginKeyPairAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 ( DescribeInstanceVncUrl ) 用于查询实例管理终端地址，获取的地址可用于实例的 VNC 登录。

* 处于 `STOPPED` 状态的机器无法使用此功能。
* 管理终端地址的有效期为 15 秒，调用接口成功后如果 15 秒内不使用该链接进行访问，管理终端地址自动失效，您需要重新查询。
* 管理终端地址一旦被访问，将自动失效，您需要重新查询。
* 如果连接断开，每分钟内重新连接的次数不能超过 30 次。
* 参数 `InstanceVncUrl` ：调用接口成功后会返回的 `InstanceVncUrl` 的值。
获取到 `InstanceVncUrl` 后，您需要在链接 `https://img.qcloud.com/qcloud/app/active_vnc/index.html?` 末尾加上参数 `InstanceVncUrl=xxxx`。
 最后组成的 URL 格式如下：

```
https://img.qcloud.com/qcloud/app/active_vnc/index.html?InstanceVncUrl=wss%3A%2F%2Fbjvnc.qcloud.com%3A26789%2Fvnc%3Fs%3DaHpjWnRVMFNhYmxKdDM5MjRHNlVTSVQwajNUSW0wb2tBbmFtREFCTmFrcy8vUUNPMG0wSHZNOUUxRm5PMmUzWmFDcWlOdDJIbUJxSTZDL0RXcHZxYnZZMmRkWWZWcEZia2lyb09XMzdKNmM9
```

     * @param req DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceVncUrlResponse DescribeInstanceVncUrl(DescribeInstanceVncUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceVncUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceVncUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceVncUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstances）用于查询一个或多个实例的详细信息。

* 可以根据实例 ID、实例名称或者实例的内网 IP 查询实例的详细信息。
* 过滤信息详细请见过滤器 [Filters](https://cloud.tencent.com/document/product/1207/47576#Filter) 。
* 如果参数为空，返回当前用户一定数量（Limit 所指定的数量，默认为 20）的实例。
* 支持查询实例的最新操作（LatestOperation）以及最新操作状态（LatestOperationState）。
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
     *本接口（DescribeInstancesDeniedActions）用于查询一个或多个实例的操作限制列表信息。
     * @param req DescribeInstancesDeniedActionsRequest
     * @return DescribeInstancesDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDeniedActionsResponse DescribeInstancesDeniedActions(DescribeInstancesDeniedActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDeniedActionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDeniedActionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesDeniedActions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeInstancesDiskNum)用于查询实例挂载云硬盘数量。
     * @param req DescribeInstancesDiskNumRequest
     * @return DescribeInstancesDiskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDiskNumResponse DescribeInstancesDiskNum(DescribeInstancesDiskNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDiskNumResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDiskNumResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesDiskNum");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstancesReturnable）用于查询实例是否可退还。
     * @param req DescribeInstancesReturnableRequest
     * @return DescribeInstancesReturnableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesReturnableResponse DescribeInstancesReturnable(DescribeInstancesReturnableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesReturnableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesReturnableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesReturnable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstancesTrafficPackages）用于查询一个或多个实例的流量包详情。
     * @param req DescribeInstancesTrafficPackagesRequest
     * @return DescribeInstancesTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesTrafficPackagesResponse DescribeInstancesTrafficPackages(DescribeInstancesTrafficPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesTrafficPackagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesTrafficPackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesTrafficPackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeKeyPairs) 用于查询用户密钥对信息。
     * @param req DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyPairsResponse DescribeKeyPairs(DescribeKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeyPairsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeModifyInstanceBundles）用于查询实例可变更套餐列表。
     * @param req DescribeModifyInstanceBundlesRequest
     * @return DescribeModifyInstanceBundlesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyInstanceBundlesResponse DescribeModifyInstanceBundles(DescribeModifyInstanceBundlesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModifyInstanceBundlesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModifyInstanceBundlesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModifyInstanceBundles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRegions）用于查询地域信息。
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeResetInstanceBlueprints）查询重置实例的镜像信息。
     * @param req DescribeResetInstanceBlueprintsRequest
     * @return DescribeResetInstanceBlueprintsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResetInstanceBlueprintsResponse DescribeResetInstanceBlueprints(DescribeResetInstanceBlueprintsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResetInstanceBlueprintsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResetInstanceBlueprintsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResetInstanceBlueprints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeScenes)用于查看使用场景列表。
     * @param req DescribeScenesRequest
     * @return DescribeScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenesResponse DescribeScenes(DescribeScenesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScenesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScenesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScenes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSnapshots）用于查询快照的详细信息。
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSnapshotsDeniedActions）用于查询一个或多个快照的操作限制列表信息。
     * @param req DescribeSnapshotsDeniedActionsRequest
     * @return DescribeSnapshotsDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsDeniedActionsResponse DescribeSnapshotsDeniedActions(DescribeSnapshotsDeniedActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotsDeniedActionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotsDeniedActionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotsDeniedActions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询地域下可用区
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DetachCcn) 用于解除与云联网的关联。
     * @param req DetachCcnRequest
     * @return DetachCcnResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnResponse DetachCcn(DetachCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCcnResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCcnResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachCcn");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachDisks）用于卸载一个或多个云硬盘。
     * @param req DetachDisksRequest
     * @return DetachDisksResponse
     * @throws TencentCloudSDKException
     */
    public DetachDisksResponse DetachDisks(DetachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DetachDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisassociateInstancesKeyPairs）用于解除实例与指定密钥对的绑定关系。

* 只支持 [RUNNING, STOPPED] 状态的 LINUX_UNIX 操作系统的实例。处于 RUNNING 状态的实例会强制关机，然后解绑。
* 解绑密钥后，实例可以通过原来设置的密码登录。
* 如果原来没有设置密码，解绑后将无法使用 SSH 登录。可以调用 ResetInstancesPassword 接口来设置登录密码。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req DisassociateInstancesKeyPairsRequest
     * @return DisassociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateInstancesKeyPairsResponse DisassociateInstancesKeyPairs(DisassociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateInstancesKeyPairsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateInstancesKeyPairsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateInstancesKeyPairs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ImportKeyPair）用于导入用户指定密钥对。
     * @param req ImportKeyPairRequest
     * @return ImportKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyPairResponse ImportKeyPair(ImportKeyPairRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportKeyPairResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ImportKeyPairResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportKeyPair");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (InquirePriceCreateBlueprint) 用于创建镜像询价。
     * @param req InquirePriceCreateBlueprintRequest
     * @return InquirePriceCreateBlueprintResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateBlueprintResponse InquirePriceCreateBlueprint(InquirePriceCreateBlueprintRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceCreateBlueprintResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceCreateBlueprintResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceCreateBlueprint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquirePriceCreateDisks）用于新购云硬盘询价。
     * @param req InquirePriceCreateDisksRequest
     * @return InquirePriceCreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDisksResponse InquirePriceCreateDisks(InquirePriceCreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceCreateDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceCreateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceCreateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceCreateInstances）用于创建实例询价。
     * @param req InquirePriceCreateInstancesRequest
     * @return InquirePriceCreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateInstancesResponse InquirePriceCreateInstances(InquirePriceCreateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceCreateInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceCreateInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceCreateInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquirePriceRenewDisks）用于续费云硬盘询价。
     * @param req InquirePriceRenewDisksRequest
     * @return InquirePriceRenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewDisksResponse InquirePriceRenewDisks(InquirePriceRenewDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceRenewDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceRenewDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceRenewDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquirePriceRenewInstances）用于续费实例询价。
     * @param req InquirePriceRenewInstancesRequest
     * @return InquirePriceRenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewInstancesResponse InquirePriceRenewInstances(InquirePriceRenewInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceRenewInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceRenewInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceRenewInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(IsolateDisks)用于退还一个或多个轻量应用服务器云硬盘。

只有状态为 UNATTACHED 的数据盘才可以进行此操作。
接口调用成功后，云硬盘会进入SHUTDOWN 状态。
支持批量操作。每次请求批量资源的上限为 20。
本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。云硬盘操作结果可以通过调用 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询，如果云硬盘的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req IsolateDisksRequest
     * @return IsolateDisksResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDisksResponse IsolateDisks(IsolateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(IsolateInstances)用于退还一个或多个轻量应用服务器实例。
* 只有状态为 RUNNING 或 STOPPED 的实例才可以进行此操作。
* 接口调用成功后，实例会进入SHUTDOWN 状态。
* 支持批量操作。每次请求批量资源（包括实例与数据盘）的上限为 20。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req IsolateInstancesRequest
     * @return IsolateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public IsolateInstancesResponse IsolateInstances(IsolateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IsolateInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyBlueprintAttribute) 用于修改镜像属性。
     * @param req ModifyBlueprintAttributeRequest
     * @return ModifyBlueprintAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlueprintAttributeResponse ModifyBlueprintAttribute(ModifyBlueprintAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBlueprintAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBlueprintAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBlueprintAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyDiskBackupsAttribute) 用于修改云硬盘备份点属性。
     * @param req ModifyDiskBackupsAttributeRequest
     * @return ModifyDiskBackupsAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskBackupsAttributeResponse ModifyDiskBackupsAttribute(ModifyDiskBackupsAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskBackupsAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskBackupsAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiskBackupsAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDisksAttribute)用于修改云硬盘属性。
     * @param req ModifyDisksAttributeRequest
     * @return ModifyDisksAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksAttributeResponse ModifyDisksAttribute(ModifyDisksAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisksAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisksAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDisksAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDisksRenewFlag）用于修改云硬盘续费标识。
     * @param req ModifyDisksRenewFlagRequest
     * @return ModifyDisksRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksRenewFlagResponse ModifyDisksRenewFlag(ModifyDisksRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisksRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisksRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDisksRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例内的Docker容器，之后可以通过返回的ActivityId调用DescribeDockerActivities接口查询重建情况。
请注意：本接口会重新创建并运行实例内的Docker容器。
     * @param req ModifyDockerContainerRequest
     * @return ModifyDockerContainerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDockerContainerResponse ModifyDockerContainer(ModifyDockerContainerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDockerContainerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDockerContainerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDockerContainer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyFirewallRuleDescription）用于修改单条防火墙规则描述。

* FirewallVersion 用于指定要操作的防火墙的版本。传入 FirewallVersion 版本号若不等于当前防火墙的最新版本，将返回失败；若不传 FirewallVersion 则直接修改防火墙规则备注。

在 FirewallRule 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req ModifyFirewallRuleDescriptionRequest
     * @return ModifyFirewallRuleDescriptionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallRuleDescriptionResponse ModifyFirewallRuleDescription(ModifyFirewallRuleDescriptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFirewallRuleDescriptionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFirewallRuleDescriptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFirewallRuleDescription");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyFirewallRules）用于重置实例防火墙规则。

本接口先删除当前实例的所有防火墙规则，然后添加新的规则。

* FirewallVersion 用于指定要操作的防火墙的版本。传入 FirewallVersion 版本号若不等于当前防火墙的最新版本，将返回失败；若不传 FirewallVersion 则直接重置防火墙规则。

在 FirewallRules 参数中：
* Protocol 字段支持输入 TCP，UDP，ICMP，ALL。
* Port 字段允许输入 ALL，或者一个单独的端口号，或者用逗号分隔的离散端口号，或者用减号分隔的两个端口号代表的端口范围。当 Port 为范围时，减号分隔的第一个端口号小于第二个端口号。当 Protocol 字段不是 TCP 或 UDP 时，Port 字段只能为空或 ALL。Port 字段长度不得超过 64。
* CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。租户之间网络隔离规则优先于防火墙中的内网规则。
* Action 字段只允许输入 ACCEPT 或 DROP。
* FirewallRuleDescription 字段长度不得超过 64。
     * @param req ModifyFirewallRulesRequest
     * @return ModifyFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallRulesResponse ModifyFirewallRules(ModifyFirewallRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFirewallRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFirewallRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFirewallRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyFirewallTemplate) 用于修改防火墙模板。
     * @param req ModifyFirewallTemplateRequest
     * @return ModifyFirewallTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFirewallTemplateResponse ModifyFirewallTemplate(ModifyFirewallTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFirewallTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFirewallTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFirewallTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyInstancesAttribute）用于修改实例的属性。
* “实例名称”仅为方便用户自己管理之用。
* 支持批量操作。每次请求批量实例的上限为 100。
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyInstancesBundle)用于变更一个或多个轻量应用服务器实例套餐。
* 只有状态为 RUNNING，STOPPED的实例才可以进行此操作。
* 支持批量操作。每次请求批量实例的上限为 30。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req ModifyInstancesBundleRequest
     * @return ModifyInstancesBundleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesBundleResponse ModifyInstancesBundle(ModifyInstancesBundleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesBundleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesBundleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancesBundle");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于设置实例默认登录密钥对属性。


     * @param req ModifyInstancesLoginKeyPairAttributeRequest
     * @return ModifyInstancesLoginKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesLoginKeyPairAttributeResponse ModifyInstancesLoginKeyPairAttribute(ModifyInstancesLoginKeyPairAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesLoginKeyPairAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesLoginKeyPairAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancesLoginKeyPairAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyInstancesRenewFlag) 用于修改包年包月实例续费标识。

* 实例被标识为自动续费后，每次在实例到期时，会自动续费一个月。
* 支持批量操作。每次请求批量实例的上限为100。
     * @param req ModifyInstancesRenewFlagRequest
     * @return ModifyInstancesRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesRenewFlagResponse ModifyInstancesRenewFlag(ModifyInstancesRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstancesRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySnapshotAttribute）用于修改指定快照的属性。
<li>“快照名称”仅为方便用户自己管理之用。</li>
     * @param req ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RebootInstances）用于重启实例。

* 只有状态为 RUNNING 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 REBOOTING 状态；重启实例成功时，实例会进入 RUNNING 状态。
* 支持批量操作，每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebootInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RebootInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RebootInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除实例内的Docker容器，之后可以通过返回的ActivityId调用DescribeDockerActivities接口查询删除情况。
     * @param req RemoveDockerContainersRequest
     * @return RemoveDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveDockerContainersResponse RemoveDockerContainers(RemoveDockerContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveDockerContainersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveDockerContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveDockerContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重命名实例内的Docker容器，之后可以通过返回的ActivityId调用DescribeDockerActivities接口查询重命名情况。
     * @param req RenameDockerContainerRequest
     * @return RenameDockerContainerResponse
     * @throws TencentCloudSDKException
     */
    public RenameDockerContainerResponse RenameDockerContainer(RenameDockerContainerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenameDockerContainerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RenameDockerContainerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenameDockerContainer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(RenewDisks)用于续费一个或多个轻量应用服务器云硬盘。

只有状态为 ATTACHED，UNATTACHED 或 SHUTDOWN 的数据盘才可以进行此操作。
支持批量操作。每次请求批量云硬盘的上限为 50。
本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。云硬盘操作结果可以通过调用 [DescribeDisks](https://cloud.tencent.com/document/product/1207/66093) 接口查询，如果云硬盘的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req RenewDisksRequest
     * @return RenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public RenewDisksResponse RenewDisks(RenewDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(RenewInstances)用于续费一个或多个轻量应用服务器实例。
* 只有状态为 RUNNING，STOPPED 或 SHUTDOWN 的实例才可以进行此操作。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req RenewInstancesRequest
     * @return RenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstancesResponse RenewInstances(RenewInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ReplaceFirewallTemplateRules) 用于替换防火墙模板规则。
     * @param req ReplaceFirewallTemplateRuleRequest
     * @return ReplaceFirewallTemplateRuleResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceFirewallTemplateRuleResponse ReplaceFirewallTemplateRule(ReplaceFirewallTemplateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceFirewallTemplateRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceFirewallTemplateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceFirewallTemplateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新创建并运行实例内的Docker容器，之后可以通过返回的ActivityId调用DescribeDockerActivities接口查询重建情况。
     * @param req RerunDockerContainerRequest
     * @return RerunDockerContainerResponse
     * @throws TencentCloudSDKException
     */
    public RerunDockerContainerResponse RerunDockerContainer(RerunDockerContainerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RerunDockerContainerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RerunDockerContainerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RerunDockerContainer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ResetAttachCcn) 用于关联云联网实例申请过期时，重新申请关联操作。
     * @param req ResetAttachCcnRequest
     * @return ResetAttachCcnResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnResponse ResetAttachCcn(ResetAttachCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAttachCcnResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAttachCcnResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetAttachCcn");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ResetFirewallTemplateRules) 用于重置防火墙模板下所有规则。
     * @param req ResetFirewallTemplateRulesRequest
     * @return ResetFirewallTemplateRulesResponse
     * @throws TencentCloudSDKException
     */
    public ResetFirewallTemplateRulesResponse ResetFirewallTemplateRules(ResetFirewallTemplateRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetFirewallTemplateRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResetFirewallTemplateRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetFirewallTemplateRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetInstance）用于重装指定实例上的镜像。

* 如果指定了 BlueprintId 参数，则使用指定的镜像重装；否则按照当前实例使用的镜像进行重装。
* 系统盘将会被格式化，并重置；请确保系统盘中无重要文件。
* 目前不支持实例使用该接口实现 LINUX_UNIX 和 WINDOWS 操作系统切换。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req ResetInstanceRequest
     * @return ResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstanceResponse ResetInstance(ResetInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetInstancesPassword）用于将实例操作系统的密码重置为用户指定的密码。
* 只修改管理员帐号的密码。实例的操作系统不同，管理员帐号也会不一样（Windows 为 Administrator，Ubuntu 为 ubuntu ，其它系统为 root）。
* 支持批量操作。将多个实例操作系统的密码重置为相同的密码。每次请求批量实例的上限为 100。
* 建议对运行中的实例先手动关机，然后再进行密码重置。如实例处于运行中状态，本接口操作过程中会对实例进行关机操作，尝试正常关机失败后进行强制关机。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
注意：强制关机的效果等同于关闭物理计算机的电源开关。强制关机可能会导致数据丢失或文件系统损坏。
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetInstancesPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启实例内的Docker容器，之后可以通过返回的ActivityId调用DescribeDockerActivities接口查询重启情况。
     * @param req RestartDockerContainersRequest
     * @return RestartDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public RestartDockerContainersResponse RestartDockerContainers(RestartDockerContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartDockerContainersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartDockerContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartDockerContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建并运行多个Docker容器，之后可以通过返回的ActivityIds调用DescribeDockerActivities接口查询创建情况。
     * @param req RunDockerContainersRequest
     * @return RunDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public RunDockerContainersResponse RunDockerContainers(RunDockerContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunDockerContainersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RunDockerContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunDockerContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动实例内的Docker容器，之后可以通过返回的ActivityId调用DescribeDockerActivities接口查询启动情况。
     * @param req StartDockerContainersRequest
     * @return StartDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public StartDockerContainersResponse StartDockerContainers(StartDockerContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartDockerContainersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartDockerContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartDockerContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StartInstances）用于启动一个或多个实例。

* 只有状态为 STOPPED 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 STARTING 状态；启动实例成功时，实例会进入 RUNNING 状态。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止实例内的Docker容器，之后可以通过返回的ActivityId调用DescribeDockerActivities接口查询停止情况。
     * @param req StopDockerContainersRequest
     * @return StopDockerContainersResponse
     * @throws TencentCloudSDKException
     */
    public StopDockerContainersResponse StopDockerContainers(StopDockerContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopDockerContainersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopDockerContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopDockerContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（StopInstances）用于关闭一个或多个实例。
* 只有状态为 RUNNING 的实例才可以进行此操作。
* 接口调用成功时，实例会进入 STOPPING 状态；关闭实例成功时，实例会进入 STOPPED 状态。
* 支持批量操作。每次请求批量实例的上限为 100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态（LatestOperationState）为“SUCCESS”，则代表操作成功。
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（TerminateDisks）用于销毁一个或多个云硬盘。
     * @param req TerminateDisksRequest
     * @return TerminateDisksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDisksResponse TerminateDisks(TerminateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateDisksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (TerminateInstances) 用于销毁实例。

* 处于 SHUTDOWN 状态的实例，可通过本接口销毁，且不可恢复。
* 支持批量操作，每次请求批量实例的上限为100。
* 本接口为异步接口，请求发送成功后会返回一个 RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeInstances 接口查询，如果实例的最新操作状态 (LatestOperationState) 为“SUCCESS”，则代表操作成功。
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
