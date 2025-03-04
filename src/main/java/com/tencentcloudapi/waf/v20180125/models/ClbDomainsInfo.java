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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbDomainsInfo extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名id
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * waf类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 是否是cdn
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * 负载均衡算法
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancerPackageNew [] LoadBalancerSet;

    /**
    * 镜像模式
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * 绑定clb状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 负载均衡类型，clb或者apisix
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * cdc类型会增加集群信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名id 
     * @return DomainId 域名id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名id
     * @param DomainId 域名id
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get waf类型 
     * @return Edition waf类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set waf类型
     * @param Edition waf类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 是否是cdn 
     * @return IsCdn 是否是cdn
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set 是否是cdn
     * @param IsCdn 是否是cdn
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 负载均衡算法 
     * @return LoadBalancerSet 负载均衡算法
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set 负载均衡算法
     * @param LoadBalancerSet 负载均衡算法
     */
    public void setLoadBalancerSet(LoadBalancerPackageNew [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get 镜像模式 
     * @return FlowMode 镜像模式
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set 镜像模式
     * @param FlowMode 镜像模式
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get 绑定clb状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 绑定clb状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 绑定clb状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 绑定clb状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 负载均衡类型，clb或者apisix
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbType 负载均衡类型，clb或者apisix
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 负载均衡类型，clb或者apisix
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbType 负载均衡类型，clb或者apisix
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpHeaders IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpHeaders IsCdn=3时，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get cdc类型会增加集群信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcClusters cdc类型会增加集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set cdc类型会增加集群信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcClusters cdc类型会增加集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    public ClbDomainsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbDomainsInfo(ClbDomainsInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancerPackageNew[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancerPackageNew(source.LoadBalancerSet[i]);
            }
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String(source.CdcClusters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "CdcClusters", this.CdcClusters);

    }
}

