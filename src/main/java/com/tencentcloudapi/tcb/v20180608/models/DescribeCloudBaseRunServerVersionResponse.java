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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunServerVersionResponse extends AbstractModel{

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Dockefile的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DockerfilePath")
    @Expose
    private String DockerfilePath;

    /**
    * DockerBuild的目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * 请使用CPUSize
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 请使用MemSize
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * 副本最小值
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * 副本最大值
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
    * 策略类型
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略阈值
    */
    @SerializedName("PolicyThreshold")
    @Expose
    private Float PolicyThreshold;

    /**
    * 环境变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 版本的IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionIP")
    @Expose
    private String VersionIP;

    /**
    * 版本的端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionPort")
    @Expose
    private Long VersionPort;

    /**
    * 版本状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 代码包的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 代码版本的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 枚举（package/repository/image)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * Repo的类型(gitlab/github/coding)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 分支
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * 服务名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 是否对于外网开放
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * 监听端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 延迟多长时间开始健康检查（单位s）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * CPU 大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuSize")
    @Expose
    private Float CpuSize;

    /**
    * MEM 大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Float MemSize;

    /**
    * 是否有Dockerfile：0-default has, 1-has, 2-has not
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasDockerfile")
    @Expose
    private Long HasDockerfile;

    /**
    * 基础镜像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseImage")
    @Expose
    private String BaseImage;

    /**
    * 容器启动入口命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntryPoint")
    @Expose
    private String EntryPoint;

    /**
    * 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoLanguage")
    @Expose
    private String RepoLanguage;

    /**
    * 自动扩缩容策略组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyDetail")
    @Expose
    private HpaPolicy [] PolicyDetail;

    /**
    * Tke集群信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TkeClusterInfo")
    @Expose
    private TkeClusterInfo TkeClusterInfo;

    /**
    * 版本工作负载类型；deployment/deamonset
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TkeWorkloadType")
    @Expose
    private String TkeWorkloadType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Dockefile的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DockerfilePath Dockefile的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDockerfilePath() {
        return this.DockerfilePath;
    }

    /**
     * Set Dockefile的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param DockerfilePath Dockefile的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDockerfilePath(String DockerfilePath) {
        this.DockerfilePath = DockerfilePath;
    }

    /**
     * Get DockerBuild的目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildDir DockerBuild的目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set DockerBuild的目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildDir DockerBuild的目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get 请使用CPUSize 
     * @return Cpu 请使用CPUSize
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 请使用CPUSize
     * @param Cpu 请使用CPUSize
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 请使用MemSize 
     * @return Mem 请使用MemSize
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set 请使用MemSize
     * @param Mem 请使用MemSize
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 副本最小值 
     * @return MinNum 副本最小值
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 副本最小值
     * @param MinNum 副本最小值
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 副本最大值 
     * @return MaxNum 副本最大值
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 副本最大值
     * @param MaxNum 副本最大值
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get 策略类型 
     * @return PolicyType 策略类型
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型
     * @param PolicyType 策略类型
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略阈值 
     * @return PolicyThreshold 策略阈值
     */
    public Float getPolicyThreshold() {
        return this.PolicyThreshold;
    }

    /**
     * Set 策略阈值
     * @param PolicyThreshold 策略阈值
     */
    public void setPolicyThreshold(Float PolicyThreshold) {
        this.PolicyThreshold = PolicyThreshold;
    }

    /**
     * Get 环境变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvParams 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvParams 环境变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 版本的IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionIP 版本的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionIP() {
        return this.VersionIP;
    }

    /**
     * Set 版本的IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionIP 版本的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionIP(String VersionIP) {
        this.VersionIP = VersionIP;
    }

    /**
     * Get 版本的端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionPort 版本的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionPort() {
        return this.VersionPort;
    }

    /**
     * Set 版本的端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionPort 版本的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionPort(Long VersionPort) {
        this.VersionPort = VersionPort;
    }

    /**
     * Get 版本状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 版本状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 版本状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 代码包的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName 代码包的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 代码包的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 代码包的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 代码版本的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion 代码版本的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 代码版本的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion 代码版本的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 枚举（package/repository/image)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadType 枚举（package/repository/image)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set 枚举（package/repository/image)
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadType 枚举（package/repository/image)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get Repo的类型(gitlab/github/coding)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType Repo的类型(gitlab/github/coding)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set Repo的类型(gitlab/github/coding)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType Repo的类型(gitlab/github/coding)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repo 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repo 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get 分支
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branch 分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 分支
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branch 分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get 服务名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerName 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerName 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 是否对于外网开放
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPublic 是否对于外网开放
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否对于外网开放
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPublic 是否对于外网开放
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get vpc id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds 子网实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds 子网实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomLogs 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomLogs 日志采集路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get 监听端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerPort 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerPort 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 延迟多长时间开始健康检查（单位s）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitialDelaySeconds 延迟多长时间开始健康检查（单位s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 延迟多长时间开始健康检查（单位s）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitialDelaySeconds 延迟多长时间开始健康检查（单位s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get 镜像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get CPU 大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuSize CPU 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set CPU 大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuSize CPU 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuSize(Float CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get MEM 大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize MEM 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemSize() {
        return this.MemSize;
    }

    /**
     * Set MEM 大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize MEM 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Float MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 是否有Dockerfile：0-default has, 1-has, 2-has not
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasDockerfile 是否有Dockerfile：0-default has, 1-has, 2-has not
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHasDockerfile() {
        return this.HasDockerfile;
    }

    /**
     * Set 是否有Dockerfile：0-default has, 1-has, 2-has not
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasDockerfile 是否有Dockerfile：0-default has, 1-has, 2-has not
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasDockerfile(Long HasDockerfile) {
        this.HasDockerfile = HasDockerfile;
    }

    /**
     * Get 基础镜像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseImage 基础镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaseImage() {
        return this.BaseImage;
    }

    /**
     * Set 基础镜像
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseImage 基础镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseImage(String BaseImage) {
        this.BaseImage = BaseImage;
    }

    /**
     * Get 容器启动入口命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntryPoint 容器启动入口命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set 容器启动入口命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntryPoint 容器启动入口命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get 仓库语言
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoLanguage 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoLanguage() {
        return this.RepoLanguage;
    }

    /**
     * Set 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoLanguage 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoLanguage(String RepoLanguage) {
        this.RepoLanguage = RepoLanguage;
    }

    /**
     * Get 自动扩缩容策略组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyDetail 自动扩缩容策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HpaPolicy [] getPolicyDetail() {
        return this.PolicyDetail;
    }

    /**
     * Set 自动扩缩容策略组
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyDetail 自动扩缩容策略组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyDetail(HpaPolicy [] PolicyDetail) {
        this.PolicyDetail = PolicyDetail;
    }

    /**
     * Get Tke集群信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TkeClusterInfo Tke集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TkeClusterInfo getTkeClusterInfo() {
        return this.TkeClusterInfo;
    }

    /**
     * Set Tke集群信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TkeClusterInfo Tke集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTkeClusterInfo(TkeClusterInfo TkeClusterInfo) {
        this.TkeClusterInfo = TkeClusterInfo;
    }

    /**
     * Get 版本工作负载类型；deployment/deamonset
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TkeWorkloadType 版本工作负载类型；deployment/deamonset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTkeWorkloadType() {
        return this.TkeWorkloadType;
    }

    /**
     * Set 版本工作负载类型；deployment/deamonset
注意：此字段可能返回 null，表示取不到有效值。
     * @param TkeWorkloadType 版本工作负载类型；deployment/deamonset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTkeWorkloadType(String TkeWorkloadType) {
        this.TkeWorkloadType = TkeWorkloadType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloudBaseRunServerVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunServerVersionResponse(DescribeCloudBaseRunServerVersionResponse source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DockerfilePath != null) {
            this.DockerfilePath = new String(source.DockerfilePath);
        }
        if (source.BuildDir != null) {
            this.BuildDir = new String(source.BuildDir);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.MinNum != null) {
            this.MinNum = new Long(source.MinNum);
        }
        if (source.MaxNum != null) {
            this.MaxNum = new Long(source.MaxNum);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyThreshold != null) {
            this.PolicyThreshold = new Float(source.PolicyThreshold);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.VersionIP != null) {
            this.VersionIP = new String(source.VersionIP);
        }
        if (source.VersionPort != null) {
            this.VersionPort = new Long(source.VersionPort);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.CustomLogs != null) {
            this.CustomLogs = new String(source.CustomLogs);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Float(source.CpuSize);
        }
        if (source.MemSize != null) {
            this.MemSize = new Float(source.MemSize);
        }
        if (source.HasDockerfile != null) {
            this.HasDockerfile = new Long(source.HasDockerfile);
        }
        if (source.BaseImage != null) {
            this.BaseImage = new String(source.BaseImage);
        }
        if (source.EntryPoint != null) {
            this.EntryPoint = new String(source.EntryPoint);
        }
        if (source.RepoLanguage != null) {
            this.RepoLanguage = new String(source.RepoLanguage);
        }
        if (source.PolicyDetail != null) {
            this.PolicyDetail = new HpaPolicy[source.PolicyDetail.length];
            for (int i = 0; i < source.PolicyDetail.length; i++) {
                this.PolicyDetail[i] = new HpaPolicy(source.PolicyDetail[i]);
            }
        }
        if (source.TkeClusterInfo != null) {
            this.TkeClusterInfo = new TkeClusterInfo(source.TkeClusterInfo);
        }
        if (source.TkeWorkloadType != null) {
            this.TkeWorkloadType = new String(source.TkeWorkloadType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DockerfilePath", this.DockerfilePath);
        this.setParamSimple(map, prefix + "BuildDir", this.BuildDir);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyThreshold", this.PolicyThreshold);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "VersionIP", this.VersionIP);
        this.setParamSimple(map, prefix + "VersionPort", this.VersionPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "CustomLogs", this.CustomLogs);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "HasDockerfile", this.HasDockerfile);
        this.setParamSimple(map, prefix + "BaseImage", this.BaseImage);
        this.setParamSimple(map, prefix + "EntryPoint", this.EntryPoint);
        this.setParamSimple(map, prefix + "RepoLanguage", this.RepoLanguage);
        this.setParamArrayObj(map, prefix + "PolicyDetail.", this.PolicyDetail);
        this.setParamObj(map, prefix + "TkeClusterInfo.", this.TkeClusterInfo);
        this.setParamSimple(map, prefix + "TkeWorkloadType", this.TkeWorkloadType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

