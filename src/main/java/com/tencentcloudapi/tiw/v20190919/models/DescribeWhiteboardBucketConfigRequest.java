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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWhiteboardBucketConfigRequest extends AbstractModel{

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get 客户的SdkAppId 
     * @return SdkAppId 客户的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 客户的SdkAppId
     * @param SdkAppId 客户的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 需要查询的任务类型
recording: 实时录制
transcode: 文档转码 
     * @return TaskType 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
     * @param TaskType 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    public DescribeWhiteboardBucketConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteboardBucketConfigRequest(DescribeWhiteboardBucketConfigRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

