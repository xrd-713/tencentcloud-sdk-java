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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateDBInstancesRequest extends AbstractModel{

    /**
    * 实例所属区域及可用区信息。格式：ap-guangzhou-2。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 每个分片的主从节点数量。
取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinNodeNum与MaxNodeNum分别对应其最小值与最大值。
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 实例内存大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 实例版本信息。具体支持的版本，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：
- MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本。
- MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 机器类型。
- HIO：高IO型。
- HIO10G：高IO万兆型。
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 实例数量，取值范围为[1,10]。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例类型。
- REPLSET：副本集。
- SHARD：分片集群。
- STANDALONE：单节点。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 副本集个数。
- 创建副本集实例时，该参数固定设置为1。
- 创建分片集群时，指分片数量，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
- 若为单节点实例，该参数固定设置为0。
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * 选择包年包月计费模式时，您需要设定购买实例的时长。即<b>InstanceChargeType</b>设定为<b>PREPAID</b>时，该参数必须配置。
- 单位：月。
- 可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 实例付费方式。
- PREPAID：包年包月计费。
- POSTPAID_BY_HOUR：按量计费。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 分片实例询价必填参数，指 Mongos CPU核数，取值范围为[1,16]。
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * 分片实例询价必填参数，指 Mongos 内存，取值范围为[2,32]，单位：GB。
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * 分片实例询价必填参数，指 Mongos 个数，取值范围为[3,32]。
    */
    @SerializedName("MongosNum")
    @Expose
    private Long MongosNum;

    /**
    * 分片实例询价必填参数，指 ConfigServer CPU核数，取值为1，单位：GB。
    */
    @SerializedName("ConfigServerCpu")
    @Expose
    private Long ConfigServerCpu;

    /**
    * 分片实例询价必填参数，指 ConfigServer 内存大小，取值为2，单位：GB。
    */
    @SerializedName("ConfigServerMemory")
    @Expose
    private Long ConfigServerMemory;

    /**
    * 分片实例询价必填参数，指 ConfigServer 磁盘大小，取值为 20，单位：GB。
    */
    @SerializedName("ConfigServerVolume")
    @Expose
    private Long ConfigServerVolume;

    /**
     * Get 实例所属区域及可用区信息。格式：ap-guangzhou-2。 
     * @return Zone 实例所属区域及可用区信息。格式：ap-guangzhou-2。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属区域及可用区信息。格式：ap-guangzhou-2。
     * @param Zone 实例所属区域及可用区信息。格式：ap-guangzhou-2。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 每个分片的主从节点数量。
取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinNodeNum与MaxNodeNum分别对应其最小值与最大值。 
     * @return NodeNum 每个分片的主从节点数量。
取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinNodeNum与MaxNodeNum分别对应其最小值与最大值。
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 每个分片的主从节点数量。
取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinNodeNum与MaxNodeNum分别对应其最小值与最大值。
     * @param NodeNum 每个分片的主从节点数量。
取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinNodeNum与MaxNodeNum分别对应其最小值与最大值。
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 实例内存大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。 
     * @return Memory 实例内存大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。
     * @param Memory 实例内存大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。 
     * @return Volume 实例硬盘大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。
     * @param Volume 实例硬盘大小。
- 单位：GB。
- 取值范围：请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 实例版本信息。具体支持的版本，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：
- MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本。
- MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。 
     * @return MongoVersion 实例版本信息。具体支持的版本，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：
- MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本。
- MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 实例版本信息。具体支持的版本，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：
- MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本。
- MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
     * @param MongoVersion 实例版本信息。具体支持的版本，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：
- MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本。
- MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 机器类型。
- HIO：高IO型。
- HIO10G：高IO万兆型。 
     * @return MachineCode 机器类型。
- HIO：高IO型。
- HIO10G：高IO万兆型。
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set 机器类型。
- HIO：高IO型。
- HIO10G：高IO万兆型。
     * @param MachineCode 机器类型。
- HIO：高IO型。
- HIO10G：高IO万兆型。
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get 实例数量，取值范围为[1,10]。 
     * @return GoodsNum 实例数量，取值范围为[1,10]。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，取值范围为[1,10]。
     * @param GoodsNum 实例数量，取值范围为[1,10]。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例类型。
- REPLSET：副本集。
- SHARD：分片集群。
- STANDALONE：单节点。 
     * @return ClusterType 实例类型。
- REPLSET：副本集。
- SHARD：分片集群。
- STANDALONE：单节点。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 实例类型。
- REPLSET：副本集。
- SHARD：分片集群。
- STANDALONE：单节点。
     * @param ClusterType 实例类型。
- REPLSET：副本集。
- SHARD：分片集群。
- STANDALONE：单节点。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 副本集个数。
- 创建副本集实例时，该参数固定设置为1。
- 创建分片集群时，指分片数量，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
- 若为单节点实例，该参数固定设置为0。 
     * @return ReplicateSetNum 副本集个数。
- 创建副本集实例时，该参数固定设置为1。
- 创建分片集群时，指分片数量，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
- 若为单节点实例，该参数固定设置为0。
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set 副本集个数。
- 创建副本集实例时，该参数固定设置为1。
- 创建分片集群时，指分片数量，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
- 若为单节点实例，该参数固定设置为0。
     * @param ReplicateSetNum 副本集个数。
- 创建副本集实例时，该参数固定设置为1。
- 创建分片集群时，指分片数量，请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
- 若为单节点实例，该参数固定设置为0。
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get 选择包年包月计费模式时，您需要设定购买实例的时长。即<b>InstanceChargeType</b>设定为<b>PREPAID</b>时，该参数必须配置。
- 单位：月。
- 可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]。 
     * @return Period 选择包年包月计费模式时，您需要设定购买实例的时长。即<b>InstanceChargeType</b>设定为<b>PREPAID</b>时，该参数必须配置。
- 单位：月。
- 可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 选择包年包月计费模式时，您需要设定购买实例的时长。即<b>InstanceChargeType</b>设定为<b>PREPAID</b>时，该参数必须配置。
- 单位：月。
- 可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     * @param Period 选择包年包月计费模式时，您需要设定购买实例的时长。即<b>InstanceChargeType</b>设定为<b>PREPAID</b>时，该参数必须配置。
- 单位：月。
- 可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 实例付费方式。
- PREPAID：包年包月计费。
- POSTPAID_BY_HOUR：按量计费。 
     * @return InstanceChargeType 实例付费方式。
- PREPAID：包年包月计费。
- POSTPAID_BY_HOUR：按量计费。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例付费方式。
- PREPAID：包年包月计费。
- POSTPAID_BY_HOUR：按量计费。
     * @param InstanceChargeType 实例付费方式。
- PREPAID：包年包月计费。
- POSTPAID_BY_HOUR：按量计费。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 分片实例询价必填参数，指 Mongos CPU核数，取值范围为[1,16]。 
     * @return MongosCpu 分片实例询价必填参数，指 Mongos CPU核数，取值范围为[1,16]。
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set 分片实例询价必填参数，指 Mongos CPU核数，取值范围为[1,16]。
     * @param MongosCpu 分片实例询价必填参数，指 Mongos CPU核数，取值范围为[1,16]。
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get 分片实例询价必填参数，指 Mongos 内存，取值范围为[2,32]，单位：GB。 
     * @return MongosMemory 分片实例询价必填参数，指 Mongos 内存，取值范围为[2,32]，单位：GB。
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set 分片实例询价必填参数，指 Mongos 内存，取值范围为[2,32]，单位：GB。
     * @param MongosMemory 分片实例询价必填参数，指 Mongos 内存，取值范围为[2,32]，单位：GB。
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get 分片实例询价必填参数，指 Mongos 个数，取值范围为[3,32]。 
     * @return MongosNum 分片实例询价必填参数，指 Mongos 个数，取值范围为[3,32]。
     */
    public Long getMongosNum() {
        return this.MongosNum;
    }

    /**
     * Set 分片实例询价必填参数，指 Mongos 个数，取值范围为[3,32]。
     * @param MongosNum 分片实例询价必填参数，指 Mongos 个数，取值范围为[3,32]。
     */
    public void setMongosNum(Long MongosNum) {
        this.MongosNum = MongosNum;
    }

    /**
     * Get 分片实例询价必填参数，指 ConfigServer CPU核数，取值为1，单位：GB。 
     * @return ConfigServerCpu 分片实例询价必填参数，指 ConfigServer CPU核数，取值为1，单位：GB。
     */
    public Long getConfigServerCpu() {
        return this.ConfigServerCpu;
    }

    /**
     * Set 分片实例询价必填参数，指 ConfigServer CPU核数，取值为1，单位：GB。
     * @param ConfigServerCpu 分片实例询价必填参数，指 ConfigServer CPU核数，取值为1，单位：GB。
     */
    public void setConfigServerCpu(Long ConfigServerCpu) {
        this.ConfigServerCpu = ConfigServerCpu;
    }

    /**
     * Get 分片实例询价必填参数，指 ConfigServer 内存大小，取值为2，单位：GB。 
     * @return ConfigServerMemory 分片实例询价必填参数，指 ConfigServer 内存大小，取值为2，单位：GB。
     */
    public Long getConfigServerMemory() {
        return this.ConfigServerMemory;
    }

    /**
     * Set 分片实例询价必填参数，指 ConfigServer 内存大小，取值为2，单位：GB。
     * @param ConfigServerMemory 分片实例询价必填参数，指 ConfigServer 内存大小，取值为2，单位：GB。
     */
    public void setConfigServerMemory(Long ConfigServerMemory) {
        this.ConfigServerMemory = ConfigServerMemory;
    }

    /**
     * Get 分片实例询价必填参数，指 ConfigServer 磁盘大小，取值为 20，单位：GB。 
     * @return ConfigServerVolume 分片实例询价必填参数，指 ConfigServer 磁盘大小，取值为 20，单位：GB。
     */
    public Long getConfigServerVolume() {
        return this.ConfigServerVolume;
    }

    /**
     * Set 分片实例询价必填参数，指 ConfigServer 磁盘大小，取值为 20，单位：GB。
     * @param ConfigServerVolume 分片实例询价必填参数，指 ConfigServer 磁盘大小，取值为 20，单位：GB。
     */
    public void setConfigServerVolume(Long ConfigServerVolume) {
        this.ConfigServerVolume = ConfigServerVolume;
    }

    public InquirePriceCreateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateDBInstancesRequest(InquirePriceCreateDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.MongosCpu != null) {
            this.MongosCpu = new Long(source.MongosCpu);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosNum != null) {
            this.MongosNum = new Long(source.MongosNum);
        }
        if (source.ConfigServerCpu != null) {
            this.ConfigServerCpu = new Long(source.ConfigServerCpu);
        }
        if (source.ConfigServerMemory != null) {
            this.ConfigServerMemory = new Long(source.ConfigServerMemory);
        }
        if (source.ConfigServerVolume != null) {
            this.ConfigServerVolume = new Long(source.ConfigServerVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "MongosCpu", this.MongosCpu);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosNum", this.MongosNum);
        this.setParamSimple(map, prefix + "ConfigServerCpu", this.ConfigServerCpu);
        this.setParamSimple(map, prefix + "ConfigServerMemory", this.ConfigServerMemory);
        this.setParamSimple(map, prefix + "ConfigServerVolume", this.ConfigServerVolume);

    }
}

