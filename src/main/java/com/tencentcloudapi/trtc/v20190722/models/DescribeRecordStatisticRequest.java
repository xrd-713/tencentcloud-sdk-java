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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordStatisticRequest extends AbstractModel{

    /**
    * 查询开始日期。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束日期。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get 查询开始日期。 
     * @return StartTime 查询开始日期。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始日期。
     * @param StartTime 查询开始日期。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束日期。 
     * @return EndTime 查询结束日期。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束日期。
     * @param EndTime 查询结束日期。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。 
     * @return SdkAppId 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
     * @param SdkAppId 应用ID，可不传。传应用ID时返回的是该应用的用量，不传时返回多个应用的合计值。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

