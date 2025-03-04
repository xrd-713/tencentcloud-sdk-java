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

public class ChannelCreateConvertTaskApiRequest extends AbstractModel{

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 资源类型 支持doc,docx,html,xls,xlsx,jpg,jpeg,png,bmp文件类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源名称，长度限制为256字符
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 文件Id，通过UploadFiles获取
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 调用方用户信息，不用传
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 暂未开放
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 资源类型 支持doc,docx,html,xls,xlsx,jpg,jpeg,png,bmp文件类型 
     * @return ResourceType 资源类型 支持doc,docx,html,xls,xlsx,jpg,jpeg,png,bmp文件类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型 支持doc,docx,html,xls,xlsx,jpg,jpeg,png,bmp文件类型
     * @param ResourceType 资源类型 支持doc,docx,html,xls,xlsx,jpg,jpeg,png,bmp文件类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名称，长度限制为256字符 
     * @return ResourceName 资源名称，长度限制为256字符
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，长度限制为256字符
     * @param ResourceName 资源名称，长度限制为256字符
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 文件Id，通过UploadFiles获取 
     * @return ResourceId 文件Id，通过UploadFiles获取
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 文件Id，通过UploadFiles获取
     * @param ResourceId 文件Id，通过UploadFiles获取
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 调用方用户信息，不用传 
     * @return Operator 调用方用户信息，不用传
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，不用传
     * @param Operator 调用方用户信息，不用传
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 暂未开放 
     * @return Organization 暂未开放
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 暂未开放
     * @param Organization 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    public ChannelCreateConvertTaskApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateConvertTaskApiRequest(ChannelCreateConvertTaskApiRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Organization.", this.Organization);

    }
}

