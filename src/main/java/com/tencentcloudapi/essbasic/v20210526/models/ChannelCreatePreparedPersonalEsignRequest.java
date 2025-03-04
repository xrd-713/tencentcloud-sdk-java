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

public class ChannelCreatePreparedPersonalEsignRequest extends AbstractModel{

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 个人用户姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 身份证件号码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 印章图片的base64，最大不超过 8M
    */
    @SerializedName("SealImage")
    @Expose
    private String SealImage;

    /**
    * 操作者信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 身份证件类型
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
    */
    @SerializedName("SealImageCompress")
    @Expose
    private Boolean SealImageCompress;

    /**
    * 手机号码；当需要开通自动签时，该参数必传
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 是否开通自动签，该功能需联系运营工作人员开通后使用
    */
    @SerializedName("EnableAutoSign")
    @Expose
    private Boolean EnableAutoSign;

    /**
    * 设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减	
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 个人用户姓名 
     * @return UserName 个人用户姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 个人用户姓名
     * @param UserName 个人用户姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 身份证件号码 
     * @return IdCardNumber 身份证件号码
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证件号码
     * @param IdCardNumber 身份证件号码
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 印章名称 
     * @return SealName 印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 印章名称
     * @param SealName 印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 印章图片的base64，最大不超过 8M 
     * @return SealImage 印章图片的base64，最大不超过 8M
     */
    public String getSealImage() {
        return this.SealImage;
    }

    /**
     * Set 印章图片的base64，最大不超过 8M
     * @param SealImage 印章图片的base64，最大不超过 8M
     */
    public void setSealImage(String SealImage) {
        this.SealImage = SealImage;
    }

    /**
     * Get 操作者信息 
     * @return Operator 操作者信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者信息
     * @param Operator 操作者信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 身份证件类型 
     * @return IdCardType 身份证件类型
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 身份证件类型
     * @param IdCardType 身份证件类型
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。 
     * @return SealImageCompress 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
     */
    public Boolean getSealImageCompress() {
        return this.SealImageCompress;
    }

    /**
     * Set 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
     * @param SealImageCompress 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
     */
    public void setSealImageCompress(Boolean SealImageCompress) {
        this.SealImageCompress = SealImageCompress;
    }

    /**
     * Get 手机号码；当需要开通自动签时，该参数必传 
     * @return Mobile 手机号码；当需要开通自动签时，该参数必传
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号码；当需要开通自动签时，该参数必传
     * @param Mobile 手机号码；当需要开通自动签时，该参数必传
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 是否开通自动签，该功能需联系运营工作人员开通后使用 
     * @return EnableAutoSign 是否开通自动签，该功能需联系运营工作人员开通后使用
     */
    public Boolean getEnableAutoSign() {
        return this.EnableAutoSign;
    }

    /**
     * Set 是否开通自动签，该功能需联系运营工作人员开通后使用
     * @param EnableAutoSign 是否开通自动签，该功能需联系运营工作人员开通后使用
     */
    public void setEnableAutoSign(Boolean EnableAutoSign) {
        this.EnableAutoSign = EnableAutoSign;
    }

    /**
     * Get 设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减	 
     * @return LicenseType 设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减	
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减	
     * @param LicenseType 设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减	
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    public ChannelCreatePreparedPersonalEsignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreatePreparedPersonalEsignRequest(ChannelCreatePreparedPersonalEsignRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.SealImage != null) {
            this.SealImage = new String(source.SealImage);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.SealImageCompress != null) {
            this.SealImageCompress = new Boolean(source.SealImageCompress);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.EnableAutoSign != null) {
            this.EnableAutoSign = new Boolean(source.EnableAutoSign);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "SealImage", this.SealImage);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "SealImageCompress", this.SealImageCompress);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "EnableAutoSign", this.EnableAutoSign);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

