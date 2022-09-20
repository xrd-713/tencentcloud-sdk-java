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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroup extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 源站组ID。
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * 源站类型，取值有：
<li>self：自有源站；</li>
<li>third_party：第三方源站；</li>
<li>cos：腾讯云COS源站。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 源站组名称。
    */
    @SerializedName("OriginGroupName")
    @Expose
    private String OriginGroupName;

    /**
    * 源站配置类型，当OriginType=self时，取值有：
<li>area：按区域配置；</li>
<li>weight： 按权重配置。</li>
<li>proto： 按HTTP协议配置。</li>当OriginType=third_party/cos时放空。
    */
    @SerializedName("ConfigurationType")
    @Expose
    private String ConfigurationType;

    /**
    * 源站记录信息。
    */
    @SerializedName("OriginRecords")
    @Expose
    private OriginRecord [] OriginRecords;

    /**
    * 源站组更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 源站组ID。 
     * @return OriginGroupId 源站组ID。
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set 源站组ID。
     * @param OriginGroupId 源站组ID。
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get 源站类型，取值有：
<li>self：自有源站；</li>
<li>third_party：第三方源站；</li>
<li>cos：腾讯云COS源站。</li> 
     * @return OriginType 源站类型，取值有：
<li>self：自有源站；</li>
<li>third_party：第三方源站；</li>
<li>cos：腾讯云COS源站。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型，取值有：
<li>self：自有源站；</li>
<li>third_party：第三方源站；</li>
<li>cos：腾讯云COS源站。</li>
     * @param OriginType 源站类型，取值有：
<li>self：自有源站；</li>
<li>third_party：第三方源站；</li>
<li>cos：腾讯云COS源站。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 源站组名称。 
     * @return OriginGroupName 源站组名称。
     */
    public String getOriginGroupName() {
        return this.OriginGroupName;
    }

    /**
     * Set 源站组名称。
     * @param OriginGroupName 源站组名称。
     */
    public void setOriginGroupName(String OriginGroupName) {
        this.OriginGroupName = OriginGroupName;
    }

    /**
     * Get 源站配置类型，当OriginType=self时，取值有：
<li>area：按区域配置；</li>
<li>weight： 按权重配置。</li>
<li>proto： 按HTTP协议配置。</li>当OriginType=third_party/cos时放空。 
     * @return ConfigurationType 源站配置类型，当OriginType=self时，取值有：
<li>area：按区域配置；</li>
<li>weight： 按权重配置。</li>
<li>proto： 按HTTP协议配置。</li>当OriginType=third_party/cos时放空。
     */
    public String getConfigurationType() {
        return this.ConfigurationType;
    }

    /**
     * Set 源站配置类型，当OriginType=self时，取值有：
<li>area：按区域配置；</li>
<li>weight： 按权重配置。</li>
<li>proto： 按HTTP协议配置。</li>当OriginType=third_party/cos时放空。
     * @param ConfigurationType 源站配置类型，当OriginType=self时，取值有：
<li>area：按区域配置；</li>
<li>weight： 按权重配置。</li>
<li>proto： 按HTTP协议配置。</li>当OriginType=third_party/cos时放空。
     */
    public void setConfigurationType(String ConfigurationType) {
        this.ConfigurationType = ConfigurationType;
    }

    /**
     * Get 源站记录信息。 
     * @return OriginRecords 源站记录信息。
     */
    public OriginRecord [] getOriginRecords() {
        return this.OriginRecords;
    }

    /**
     * Set 源站记录信息。
     * @param OriginRecords 源站记录信息。
     */
    public void setOriginRecords(OriginRecord [] OriginRecords) {
        this.OriginRecords = OriginRecords;
    }

    /**
     * Get 源站组更新时间。 
     * @return UpdateTime 源站组更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 源站组更新时间。
     * @param UpdateTime 源站组更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public OriginGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroup(OriginGroup source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.OriginGroupName != null) {
            this.OriginGroupName = new String(source.OriginGroupName);
        }
        if (source.ConfigurationType != null) {
            this.ConfigurationType = new String(source.ConfigurationType);
        }
        if (source.OriginRecords != null) {
            this.OriginRecords = new OriginRecord[source.OriginRecords.length];
            for (int i = 0; i < source.OriginRecords.length; i++) {
                this.OriginRecords[i] = new OriginRecord(source.OriginRecords[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "OriginGroupName", this.OriginGroupName);
        this.setParamSimple(map, prefix + "ConfigurationType", this.ConfigurationType);
        this.setParamArrayObj(map, prefix + "OriginRecords.", this.OriginRecords);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

