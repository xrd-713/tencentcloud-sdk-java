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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFlowStatisticRequest extends AbstractModel{

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 开始查找时间
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 流量种类（1：上行流量，2：下行流量）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 时间粒度（1：按小时统计，2：按天统计）
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 开始查找时间 
     * @return BeginTime 开始查找时间
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始查找时间
     * @param BeginTime 开始查找时间
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 截止时间 
     * @return EndTime 截止时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间
     * @param EndTime 截止时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 流量种类（1：上行流量，2：下行流量） 
     * @return Type 流量种类（1：上行流量，2：下行流量）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 流量种类（1：上行流量，2：下行流量）
     * @param Type 流量种类（1：上行流量，2：下行流量）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 时间粒度（1：按小时统计，2：按天统计） 
     * @return TimeGranularity 时间粒度（1：按小时统计，2：按天统计）
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set 时间粒度（1：按小时统计，2：按天统计）
     * @param TimeGranularity 时间粒度（1：按小时统计，2：按天统计）
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    public GetFlowStatisticRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFlowStatisticRequest(GetFlowStatisticRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TimeGranularity != null) {
            this.TimeGranularity = new Long(source.TimeGranularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);

    }
}

