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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 实例数量，参数默认值20，最大值为1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，取Limit整数倍。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 实例 ID，如：crs-6ubhgouj。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例排序依据，枚举值如下所示：<ul><li>projectId：项目ID。</li><li>createtime：实例创建时间。</li><li>instancename：实例名称。</li><li>type：实例类型。</li><li>curDeadline：实例到期时间。</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 实例排序方式，默认为倒序排序。<ul><li>1：倒序。</li><li>0：顺序。</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 设置模糊查询关键字，支持根据实例名称或实例ID模糊查询实例。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 项目 ID 组成的数组。
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * 私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * 地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 实例架构版本。<ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
    */
    @SerializedName("TypeVersion")
    @Expose
    private Long TypeVersion;

    /**
    * 存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 续费模式。<ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：明确不自动续费。</ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * 实例类型。<ul><li>1：Redis 老集群版。</li><li>2：Redis 2.8 主从版。</li><li>3：CKV 主从版。</li><li>4：CKV 集群版。</li><li>5：Redis 2.8 单机版。</li><li>6：Redis 4.0主从版。</li><li>7：Redis 4.0 集群版。</li><li>8：Redis 5.0 主从版。</li><li>9：Redis 5.0 集群版。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设置搜索关键字数组，可根据实例ID、实例名称、完整IP地址查询实例。
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * 内部参数，用户可忽略。
    */
    @SerializedName("TypeList")
    @Expose
    private Long [] TypeList;

    /**
    * 内部参数，用户可忽略。
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * 实例的产品版本。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。<ul><li>local：本地盘版。</li><li>cloud：云盘版。</li><li>cdc：独享集群版。</li></ul>
    */
    @SerializedName("ProductVersions")
    @Expose
    private String [] ProductVersions;

    /**
    * 批量查询指定的实例 ID，返回结果已 Limit 限制为主。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 可用区模式。<ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
    */
    @SerializedName("AzMode")
    @Expose
    private String AzMode;

    /**
     * Get 实例数量，参数默认值20，最大值为1000。 
     * @return Limit 实例数量，参数默认值20，最大值为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 实例数量，参数默认值20，最大值为1000。
     * @param Limit 实例数量，参数默认值20，最大值为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，取Limit整数倍。 
     * @return Offset 偏移量，取Limit整数倍。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取Limit整数倍。
     * @param Offset 偏移量，取Limit整数倍。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 实例 ID，如：crs-6ubhgouj。 
     * @return InstanceId 实例 ID，如：crs-6ubhgouj。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，如：crs-6ubhgouj。
     * @param InstanceId 实例 ID，如：crs-6ubhgouj。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例排序依据，枚举值如下所示：<ul><li>projectId：项目ID。</li><li>createtime：实例创建时间。</li><li>instancename：实例名称。</li><li>type：实例类型。</li><li>curDeadline：实例到期时间。</li></ul> 
     * @return OrderBy 实例排序依据，枚举值如下所示：<ul><li>projectId：项目ID。</li><li>createtime：实例创建时间。</li><li>instancename：实例名称。</li><li>type：实例类型。</li><li>curDeadline：实例到期时间。</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 实例排序依据，枚举值如下所示：<ul><li>projectId：项目ID。</li><li>createtime：实例创建时间。</li><li>instancename：实例名称。</li><li>type：实例类型。</li><li>curDeadline：实例到期时间。</li></ul>
     * @param OrderBy 实例排序依据，枚举值如下所示：<ul><li>projectId：项目ID。</li><li>createtime：实例创建时间。</li><li>instancename：实例名称。</li><li>type：实例类型。</li><li>curDeadline：实例到期时间。</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 实例排序方式，默认为倒序排序。<ul><li>1：倒序。</li><li>0：顺序。</li></ul> 
     * @return OrderType 实例排序方式，默认为倒序排序。<ul><li>1：倒序。</li><li>0：顺序。</li></ul>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 实例排序方式，默认为倒序排序。<ul><li>1：倒序。</li><li>0：顺序。</li></ul>
     * @param OrderType 实例排序方式，默认为倒序排序。<ul><li>1：倒序。</li><li>0：顺序。</li></ul>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。 
     * @return VpcIds 私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。
     * @param VpcIds 私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。 
     * @return SubnetIds 私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。
     * @param SubnetIds 私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 设置模糊查询关键字，支持根据实例名称或实例ID模糊查询实例。 
     * @return SearchKey 设置模糊查询关键字，支持根据实例名称或实例ID模糊查询实例。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 设置模糊查询关键字，支持根据实例名称或实例ID模糊查询实例。
     * @param SearchKey 设置模糊查询关键字，支持根据实例名称或实例ID模糊查询实例。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 项目 ID 组成的数组。 
     * @return ProjectIds 项目 ID 组成的数组。
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目 ID 组成的数组。
     * @param ProjectIds 项目 ID 组成的数组。
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。 
     * @return UniqVpcIds 私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set 私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。
     * @param UniqVpcIds 私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get 私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。 
     * @return UniqSubnetIds 私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set 私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。
     * @param UniqSubnetIds 私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get 地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。 
     * @return RegionIds 地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。
     * @param RegionIds 地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul> 
     * @return Status 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     * @param Status 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 实例架构版本。<ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul> 
     * @return TypeVersion 实例架构版本。<ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
     */
    public Long getTypeVersion() {
        return this.TypeVersion;
    }

    /**
     * Set 实例架构版本。<ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
     * @param TypeVersion 实例架构版本。<ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
     */
    public void setTypeVersion(Long TypeVersion) {
        this.TypeVersion = TypeVersion;
    }

    /**
     * Get 存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。 
     * @return EngineName 存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。
     * @param EngineName 存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 续费模式。<ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：明确不自动续费。</ul> 
     * @return AutoRenew 续费模式。<ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：明确不自动续费。</ul>
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 续费模式。<ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：明确不自动续费。</ul>
     * @param AutoRenew 续费模式。<ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：明确不自动续费。</ul>
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul> 
     * @return BillingMode 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     * @param BillingMode 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例类型。<ul><li>1：Redis 老集群版。</li><li>2：Redis 2.8 主从版。</li><li>3：CKV 主从版。</li><li>4：CKV 集群版。</li><li>5：Redis 2.8 单机版。</li><li>6：Redis 4.0主从版。</li><li>7：Redis 4.0 集群版。</li><li>8：Redis 5.0 主从版。</li><li>9：Redis 5.0 集群版。</li></ul> 
     * @return Type 实例类型。<ul><li>1：Redis 老集群版。</li><li>2：Redis 2.8 主从版。</li><li>3：CKV 主从版。</li><li>4：CKV 集群版。</li><li>5：Redis 2.8 单机版。</li><li>6：Redis 4.0主从版。</li><li>7：Redis 4.0 集群版。</li><li>8：Redis 5.0 主从版。</li><li>9：Redis 5.0 集群版。</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型。<ul><li>1：Redis 老集群版。</li><li>2：Redis 2.8 主从版。</li><li>3：CKV 主从版。</li><li>4：CKV 集群版。</li><li>5：Redis 2.8 单机版。</li><li>6：Redis 4.0主从版。</li><li>7：Redis 4.0 集群版。</li><li>8：Redis 5.0 主从版。</li><li>9：Redis 5.0 集群版。</li></ul>
     * @param Type 实例类型。<ul><li>1：Redis 老集群版。</li><li>2：Redis 2.8 主从版。</li><li>3：CKV 主从版。</li><li>4：CKV 集群版。</li><li>5：Redis 2.8 单机版。</li><li>6：Redis 4.0主从版。</li><li>7：Redis 4.0 集群版。</li><li>8：Redis 5.0 主从版。</li><li>9：Redis 5.0 集群版。</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设置搜索关键字数组，可根据实例ID、实例名称、完整IP地址查询实例。 
     * @return SearchKeys 设置搜索关键字数组，可根据实例ID、实例名称、完整IP地址查询实例。
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set 设置搜索关键字数组，可根据实例ID、实例名称、完整IP地址查询实例。
     * @param SearchKeys 设置搜索关键字数组，可根据实例ID、实例名称、完整IP地址查询实例。
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get 内部参数，用户可忽略。 
     * @return TypeList 内部参数，用户可忽略。
     */
    public Long [] getTypeList() {
        return this.TypeList;
    }

    /**
     * Set 内部参数，用户可忽略。
     * @param TypeList 内部参数，用户可忽略。
     */
    public void setTypeList(Long [] TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get 内部参数，用户可忽略。 
     * @return MonitorVersion 内部参数，用户可忽略。
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set 内部参数，用户可忽略。
     * @param MonitorVersion 内部参数，用户可忽略。
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。 
     * @return InstanceTags 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
     * @param InstanceTags 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。 
     * @return TagKeys 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
     * @param TagKeys 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get 实例的产品版本。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。<ul><li>local：本地盘版。</li><li>cloud：云盘版。</li><li>cdc：独享集群版。</li></ul> 
     * @return ProductVersions 实例的产品版本。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。<ul><li>local：本地盘版。</li><li>cloud：云盘版。</li><li>cdc：独享集群版。</li></ul>
     */
    public String [] getProductVersions() {
        return this.ProductVersions;
    }

    /**
     * Set 实例的产品版本。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。<ul><li>local：本地盘版。</li><li>cloud：云盘版。</li><li>cdc：独享集群版。</li></ul>
     * @param ProductVersions 实例的产品版本。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。<ul><li>local：本地盘版。</li><li>cloud：云盘版。</li><li>cdc：独享集群版。</li></ul>
     */
    public void setProductVersions(String [] ProductVersions) {
        this.ProductVersions = ProductVersions;
    }

    /**
     * Get 批量查询指定的实例 ID，返回结果已 Limit 限制为主。 
     * @return InstanceIds 批量查询指定的实例 ID，返回结果已 Limit 限制为主。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 批量查询指定的实例 ID，返回结果已 Limit 限制为主。
     * @param InstanceIds 批量查询指定的实例 ID，返回结果已 Limit 限制为主。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 可用区模式。<ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul> 
     * @return AzMode 可用区模式。<ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
     */
    public String getAzMode() {
        return this.AzMode;
    }

    /**
     * Set 可用区模式。<ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
     * @param AzMode 可用区模式。<ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
     */
    public void setAzMode(String AzMode) {
        this.AzMode = AzMode;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.UniqVpcIds != null) {
            this.UniqVpcIds = new String[source.UniqVpcIds.length];
            for (int i = 0; i < source.UniqVpcIds.length; i++) {
                this.UniqVpcIds[i] = new String(source.UniqVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.TypeVersion != null) {
            this.TypeVersion = new Long(source.TypeVersion);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long[source.AutoRenew.length];
            for (int i = 0; i < source.AutoRenew.length; i++) {
                this.AutoRenew[i] = new Long(source.AutoRenew[i]);
            }
        }
        if (source.BillingMode != null) {
            this.BillingMode = new String(source.BillingMode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.TypeList != null) {
            this.TypeList = new Long[source.TypeList.length];
            for (int i = 0; i < source.TypeList.length; i++) {
                this.TypeList[i] = new Long(source.TypeList[i]);
            }
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.ProductVersions != null) {
            this.ProductVersions = new String[source.ProductVersions.length];
            for (int i = 0; i < source.ProductVersions.length; i++) {
                this.ProductVersions[i] = new String(source.ProductVersions[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.AzMode != null) {
            this.AzMode = new String(source.AzMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "TypeVersion", this.TypeVersion);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamArraySimple(map, prefix + "AutoRenew.", this.AutoRenew);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "TypeList.", this.TypeList);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamArraySimple(map, prefix + "ProductVersions.", this.ProductVersions);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "AzMode", this.AzMode);

    }
}

