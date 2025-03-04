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

public class ChannelCreateMultiFlowSignQRCodeRequest extends AbstractModel{

    /**
    * 应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 模版ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 签署流程名称，最大长度200个字符。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 最大可发起签署流程份数
<br/>默认5份
<br/>备注：发起签署流程数量超过此上限后，二维码自动失效。
    */
    @SerializedName("MaxFlowNum")
    @Expose
    private Long MaxFlowNum;

    /**
    * 签署流程有效天数 默认7天 最高设置不超过30天
    */
    @SerializedName("FlowEffectiveDay")
    @Expose
    private Long FlowEffectiveDay;

    /**
    * 二维码有效天数 默认7天 最高设置不超过90天
    */
    @SerializedName("QrEffectiveDay")
    @Expose
    private Long QrEffectiveDay;

    /**
    * 指定的签署二维码签署人
<br/>指定后，只允许知道的人操作和签署
    */
    @SerializedName("Restrictions")
    @Expose
    private ApproverRestriction [] Restrictions;

    /**
    * 已废弃，回调配置统一使用企业应用管理-应用集成-第三方应用中的配置
<br/> 通过一码多扫二维码发起的合同，回调消息可参考文档 https://qian.tencent.com/developers/partner/callback_types_contracts_sign
<br/> 用户通过签署二维码发起合同时，因企业额度不足导致失败 会触发签署二维码相关回调,具体参考文档 https://qian.tencent.com/developers/partner/callback_types_commons#%E7%AD%BE%E7%BD%B2%E4%BA%8C%E7%BB%B4%E7%A0%81%E7%9B%B8%E5%85%B3%E5%9B%9E%E8%B0%83
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 限制二维码用户条件（已弃用）
    */
    @SerializedName("ApproverRestrictions")
    @Expose
    private ApproverRestriction ApproverRestrictions;

    /**
    * 暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。 
     * @return Agent 应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     * @param Agent 应用相关信息。
此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 模版ID 
     * @return TemplateId 模版ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版ID
     * @param TemplateId 模版ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 签署流程名称，最大长度200个字符。 
     * @return FlowName 签署流程名称，最大长度200个字符。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 签署流程名称，最大长度200个字符。
     * @param FlowName 签署流程名称，最大长度200个字符。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 最大可发起签署流程份数
<br/>默认5份
<br/>备注：发起签署流程数量超过此上限后，二维码自动失效。 
     * @return MaxFlowNum 最大可发起签署流程份数
<br/>默认5份
<br/>备注：发起签署流程数量超过此上限后，二维码自动失效。
     */
    public Long getMaxFlowNum() {
        return this.MaxFlowNum;
    }

    /**
     * Set 最大可发起签署流程份数
<br/>默认5份
<br/>备注：发起签署流程数量超过此上限后，二维码自动失效。
     * @param MaxFlowNum 最大可发起签署流程份数
<br/>默认5份
<br/>备注：发起签署流程数量超过此上限后，二维码自动失效。
     */
    public void setMaxFlowNum(Long MaxFlowNum) {
        this.MaxFlowNum = MaxFlowNum;
    }

    /**
     * Get 签署流程有效天数 默认7天 最高设置不超过30天 
     * @return FlowEffectiveDay 签署流程有效天数 默认7天 最高设置不超过30天
     */
    public Long getFlowEffectiveDay() {
        return this.FlowEffectiveDay;
    }

    /**
     * Set 签署流程有效天数 默认7天 最高设置不超过30天
     * @param FlowEffectiveDay 签署流程有效天数 默认7天 最高设置不超过30天
     */
    public void setFlowEffectiveDay(Long FlowEffectiveDay) {
        this.FlowEffectiveDay = FlowEffectiveDay;
    }

    /**
     * Get 二维码有效天数 默认7天 最高设置不超过90天 
     * @return QrEffectiveDay 二维码有效天数 默认7天 最高设置不超过90天
     */
    public Long getQrEffectiveDay() {
        return this.QrEffectiveDay;
    }

    /**
     * Set 二维码有效天数 默认7天 最高设置不超过90天
     * @param QrEffectiveDay 二维码有效天数 默认7天 最高设置不超过90天
     */
    public void setQrEffectiveDay(Long QrEffectiveDay) {
        this.QrEffectiveDay = QrEffectiveDay;
    }

    /**
     * Get 指定的签署二维码签署人
<br/>指定后，只允许知道的人操作和签署 
     * @return Restrictions 指定的签署二维码签署人
<br/>指定后，只允许知道的人操作和签署
     */
    public ApproverRestriction [] getRestrictions() {
        return this.Restrictions;
    }

    /**
     * Set 指定的签署二维码签署人
<br/>指定后，只允许知道的人操作和签署
     * @param Restrictions 指定的签署二维码签署人
<br/>指定后，只允许知道的人操作和签署
     */
    public void setRestrictions(ApproverRestriction [] Restrictions) {
        this.Restrictions = Restrictions;
    }

    /**
     * Get 已废弃，回调配置统一使用企业应用管理-应用集成-第三方应用中的配置
<br/> 通过一码多扫二维码发起的合同，回调消息可参考文档 https://qian.tencent.com/developers/partner/callback_types_contracts_sign
<br/> 用户通过签署二维码发起合同时，因企业额度不足导致失败 会触发签署二维码相关回调,具体参考文档 https://qian.tencent.com/developers/partner/callback_types_commons#%E7%AD%BE%E7%BD%B2%E4%BA%8C%E7%BB%B4%E7%A0%81%E7%9B%B8%E5%85%B3%E5%9B%9E%E8%B0%83 
     * @return CallbackUrl 已废弃，回调配置统一使用企业应用管理-应用集成-第三方应用中的配置
<br/> 通过一码多扫二维码发起的合同，回调消息可参考文档 https://qian.tencent.com/developers/partner/callback_types_contracts_sign
<br/> 用户通过签署二维码发起合同时，因企业额度不足导致失败 会触发签署二维码相关回调,具体参考文档 https://qian.tencent.com/developers/partner/callback_types_commons#%E7%AD%BE%E7%BD%B2%E4%BA%8C%E7%BB%B4%E7%A0%81%E7%9B%B8%E5%85%B3%E5%9B%9E%E8%B0%83
     * @deprecated
     */
    @Deprecated
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 已废弃，回调配置统一使用企业应用管理-应用集成-第三方应用中的配置
<br/> 通过一码多扫二维码发起的合同，回调消息可参考文档 https://qian.tencent.com/developers/partner/callback_types_contracts_sign
<br/> 用户通过签署二维码发起合同时，因企业额度不足导致失败 会触发签署二维码相关回调,具体参考文档 https://qian.tencent.com/developers/partner/callback_types_commons#%E7%AD%BE%E7%BD%B2%E4%BA%8C%E7%BB%B4%E7%A0%81%E7%9B%B8%E5%85%B3%E5%9B%9E%E8%B0%83
     * @param CallbackUrl 已废弃，回调配置统一使用企业应用管理-应用集成-第三方应用中的配置
<br/> 通过一码多扫二维码发起的合同，回调消息可参考文档 https://qian.tencent.com/developers/partner/callback_types_contracts_sign
<br/> 用户通过签署二维码发起合同时，因企业额度不足导致失败 会触发签署二维码相关回调,具体参考文档 https://qian.tencent.com/developers/partner/callback_types_commons#%E7%AD%BE%E7%BD%B2%E4%BA%8C%E7%BB%B4%E7%A0%81%E7%9B%B8%E5%85%B3%E5%9B%9E%E8%B0%83
     * @deprecated
     */
    @Deprecated
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 限制二维码用户条件（已弃用） 
     * @return ApproverRestrictions 限制二维码用户条件（已弃用）
     * @deprecated
     */
    @Deprecated
    public ApproverRestriction getApproverRestrictions() {
        return this.ApproverRestrictions;
    }

    /**
     * Set 限制二维码用户条件（已弃用）
     * @param ApproverRestrictions 限制二维码用户条件（已弃用）
     * @deprecated
     */
    @Deprecated
    public void setApproverRestrictions(ApproverRestriction ApproverRestrictions) {
        this.ApproverRestrictions = ApproverRestrictions;
    }

    /**
     * Get 暂未开放 
     * @return Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 暂未开放
     * @param Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateMultiFlowSignQRCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateMultiFlowSignQRCodeRequest(ChannelCreateMultiFlowSignQRCodeRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.MaxFlowNum != null) {
            this.MaxFlowNum = new Long(source.MaxFlowNum);
        }
        if (source.FlowEffectiveDay != null) {
            this.FlowEffectiveDay = new Long(source.FlowEffectiveDay);
        }
        if (source.QrEffectiveDay != null) {
            this.QrEffectiveDay = new Long(source.QrEffectiveDay);
        }
        if (source.Restrictions != null) {
            this.Restrictions = new ApproverRestriction[source.Restrictions.length];
            for (int i = 0; i < source.Restrictions.length; i++) {
                this.Restrictions[i] = new ApproverRestriction(source.Restrictions[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ApproverRestrictions != null) {
            this.ApproverRestrictions = new ApproverRestriction(source.ApproverRestrictions);
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
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "MaxFlowNum", this.MaxFlowNum);
        this.setParamSimple(map, prefix + "FlowEffectiveDay", this.FlowEffectiveDay);
        this.setParamSimple(map, prefix + "QrEffectiveDay", this.QrEffectiveDay);
        this.setParamArrayObj(map, prefix + "Restrictions.", this.Restrictions);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamObj(map, prefix + "ApproverRestrictions.", this.ApproverRestrictions);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

