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

public class DescribeTemplatesRequest extends AbstractModel{

    /**
    * 应用相关信息。 
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 模板唯一标识，查询单个模板时使用
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 查询内容：
0-模板列表及详情（默认），
1-仅模板列表
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 指定每页多少条数据，如果不传默认为20，单页最大100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询结果分页返回，此处指定第几页，如果不传默从第一页返回。页码从0开始，即首页为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 是否返回所有组件信息。
默认false，只返回发起方控件；
true，返回所有签署方控件
    */
    @SerializedName("QueryAllComponents")
    @Expose
    private Boolean QueryAllComponents;

    /**
    * 模糊搜索模板名称，最大长度200
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 是否获取模板预览链接，
默认false-不获取
true-获取
    */
    @SerializedName("WithPreviewUrl")
    @Expose
    private Boolean WithPreviewUrl;

    /**
    * 是否获取模板的PDF文件链接。
默认false-不获取
true-获取
请联系客户经理开白后使用。
    */
    @SerializedName("WithPdfUrl")
    @Expose
    private Boolean WithPdfUrl;

    /**
    * 对应第三方应用平台企业的模板ID
    */
    @SerializedName("ChannelTemplateId")
    @Expose
    private String ChannelTemplateId;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 应用相关信息。 
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId必填。 
     * @return Agent 应用相关信息。 
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId必填。
     * @param Agent 应用相关信息。 
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 模板唯一标识，查询单个模板时使用 
     * @return TemplateId 模板唯一标识，查询单个模板时使用
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板唯一标识，查询单个模板时使用
     * @param TemplateId 模板唯一标识，查询单个模板时使用
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 查询内容：
0-模板列表及详情（默认），
1-仅模板列表 
     * @return ContentType 查询内容：
0-模板列表及详情（默认），
1-仅模板列表
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 查询内容：
0-模板列表及详情（默认），
1-仅模板列表
     * @param ContentType 查询内容：
0-模板列表及详情（默认），
1-仅模板列表
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 指定每页多少条数据，如果不传默认为20，单页最大100。 
     * @return Limit 指定每页多少条数据，如果不传默认为20，单页最大100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定每页多少条数据，如果不传默认为20，单页最大100。
     * @param Limit 指定每页多少条数据，如果不传默认为20，单页最大100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询结果分页返回，此处指定第几页，如果不传默从第一页返回。页码从0开始，即首页为0。 
     * @return Offset 查询结果分页返回，此处指定第几页，如果不传默从第一页返回。页码从0开始，即首页为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果分页返回，此处指定第几页，如果不传默从第一页返回。页码从0开始，即首页为0。
     * @param Offset 查询结果分页返回，此处指定第几页，如果不传默从第一页返回。页码从0开始，即首页为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 是否返回所有组件信息。
默认false，只返回发起方控件；
true，返回所有签署方控件 
     * @return QueryAllComponents 是否返回所有组件信息。
默认false，只返回发起方控件；
true，返回所有签署方控件
     */
    public Boolean getQueryAllComponents() {
        return this.QueryAllComponents;
    }

    /**
     * Set 是否返回所有组件信息。
默认false，只返回发起方控件；
true，返回所有签署方控件
     * @param QueryAllComponents 是否返回所有组件信息。
默认false，只返回发起方控件；
true，返回所有签署方控件
     */
    public void setQueryAllComponents(Boolean QueryAllComponents) {
        this.QueryAllComponents = QueryAllComponents;
    }

    /**
     * Get 模糊搜索模板名称，最大长度200 
     * @return TemplateName 模糊搜索模板名称，最大长度200
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模糊搜索模板名称，最大长度200
     * @param TemplateName 模糊搜索模板名称，最大长度200
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 是否获取模板预览链接，
默认false-不获取
true-获取 
     * @return WithPreviewUrl 是否获取模板预览链接，
默认false-不获取
true-获取
     */
    public Boolean getWithPreviewUrl() {
        return this.WithPreviewUrl;
    }

    /**
     * Set 是否获取模板预览链接，
默认false-不获取
true-获取
     * @param WithPreviewUrl 是否获取模板预览链接，
默认false-不获取
true-获取
     */
    public void setWithPreviewUrl(Boolean WithPreviewUrl) {
        this.WithPreviewUrl = WithPreviewUrl;
    }

    /**
     * Get 是否获取模板的PDF文件链接。
默认false-不获取
true-获取
请联系客户经理开白后使用。 
     * @return WithPdfUrl 是否获取模板的PDF文件链接。
默认false-不获取
true-获取
请联系客户经理开白后使用。
     */
    public Boolean getWithPdfUrl() {
        return this.WithPdfUrl;
    }

    /**
     * Set 是否获取模板的PDF文件链接。
默认false-不获取
true-获取
请联系客户经理开白后使用。
     * @param WithPdfUrl 是否获取模板的PDF文件链接。
默认false-不获取
true-获取
请联系客户经理开白后使用。
     */
    public void setWithPdfUrl(Boolean WithPdfUrl) {
        this.WithPdfUrl = WithPdfUrl;
    }

    /**
     * Get 对应第三方应用平台企业的模板ID 
     * @return ChannelTemplateId 对应第三方应用平台企业的模板ID
     */
    public String getChannelTemplateId() {
        return this.ChannelTemplateId;
    }

    /**
     * Set 对应第三方应用平台企业的模板ID
     * @param ChannelTemplateId 对应第三方应用平台企业的模板ID
     */
    public void setChannelTemplateId(String ChannelTemplateId) {
        this.ChannelTemplateId = ChannelTemplateId;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public DescribeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplatesRequest(DescribeTemplatesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.QueryAllComponents != null) {
            this.QueryAllComponents = new Boolean(source.QueryAllComponents);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.WithPreviewUrl != null) {
            this.WithPreviewUrl = new Boolean(source.WithPreviewUrl);
        }
        if (source.WithPdfUrl != null) {
            this.WithPdfUrl = new Boolean(source.WithPdfUrl);
        }
        if (source.ChannelTemplateId != null) {
            this.ChannelTemplateId = new String(source.ChannelTemplateId);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "QueryAllComponents", this.QueryAllComponents);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "WithPreviewUrl", this.WithPreviewUrl);
        this.setParamSimple(map, prefix + "WithPdfUrl", this.WithPdfUrl);
        this.setParamSimple(map, prefix + "ChannelTemplateId", this.ChannelTemplateId);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

