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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDetail extends AbstractModel{

    /**
    * 子客企业唯一标识
    */
    @SerializedName("ProxyOrganizationOpenId")
    @Expose
    private String ProxyOrganizationOpenId;

    /**
    * 子客企业名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyOrganizationName")
    @Expose
    private String ProxyOrganizationName;

    /**
    * 日期，当需要汇总数据时日期为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 消耗数量
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
    * 撤回数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cancel")
    @Expose
    private Long Cancel;

    /**
    * 消耗渠道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowChannel")
    @Expose
    private String FlowChannel;

    /**
     * Get 子客企业唯一标识 
     * @return ProxyOrganizationOpenId 子客企业唯一标识
     */
    public String getProxyOrganizationOpenId() {
        return this.ProxyOrganizationOpenId;
    }

    /**
     * Set 子客企业唯一标识
     * @param ProxyOrganizationOpenId 子客企业唯一标识
     */
    public void setProxyOrganizationOpenId(String ProxyOrganizationOpenId) {
        this.ProxyOrganizationOpenId = ProxyOrganizationOpenId;
    }

    /**
     * Get 子客企业名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyOrganizationName 子客企业名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set 子客企业名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyOrganizationName 子客企业名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyOrganizationName(String ProxyOrganizationName) {
        this.ProxyOrganizationName = ProxyOrganizationName;
    }

    /**
     * Get 日期，当需要汇总数据时日期为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 日期，当需要汇总数据时日期为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期，当需要汇总数据时日期为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 日期，当需要汇总数据时日期为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 消耗数量 
     * @return Usage 消耗数量
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set 消耗数量
     * @param Usage 消耗数量
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 撤回数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cancel 撤回数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCancel() {
        return this.Cancel;
    }

    /**
     * Set 撤回数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cancel 撤回数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancel(Long Cancel) {
        this.Cancel = Cancel;
    }

    /**
     * Get 消耗渠道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowChannel 消耗渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowChannel() {
        return this.FlowChannel;
    }

    /**
     * Set 消耗渠道
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowChannel 消耗渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowChannel(String FlowChannel) {
        this.FlowChannel = FlowChannel;
    }

    public UsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetail(UsageDetail source) {
        if (source.ProxyOrganizationOpenId != null) {
            this.ProxyOrganizationOpenId = new String(source.ProxyOrganizationOpenId);
        }
        if (source.ProxyOrganizationName != null) {
            this.ProxyOrganizationName = new String(source.ProxyOrganizationName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
        if (source.Cancel != null) {
            this.Cancel = new Long(source.Cancel);
        }
        if (source.FlowChannel != null) {
            this.FlowChannel = new String(source.FlowChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenId", this.ProxyOrganizationOpenId);
        this.setParamSimple(map, prefix + "ProxyOrganizationName", this.ProxyOrganizationName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "Cancel", this.Cancel);
        this.setParamSimple(map, prefix + "FlowChannel", this.FlowChannel);

    }
}

