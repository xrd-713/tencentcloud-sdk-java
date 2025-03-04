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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInstanceResponse extends AbstractModel{

    /**
    * 任务实例详情
    */
    @SerializedName("TaskInstanceDetail")
    @Expose
    private TaskInstanceDetail TaskInstanceDetail;

    /**
    * 任务实例详情。与TaskInstanceDetail相同含义，优先取Data，Data为空时，取TaskInstanceDetail
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private TaskInstanceDetail Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务实例详情 
     * @return TaskInstanceDetail 任务实例详情
     */
    public TaskInstanceDetail getTaskInstanceDetail() {
        return this.TaskInstanceDetail;
    }

    /**
     * Set 任务实例详情
     * @param TaskInstanceDetail 任务实例详情
     */
    public void setTaskInstanceDetail(TaskInstanceDetail TaskInstanceDetail) {
        this.TaskInstanceDetail = TaskInstanceDetail;
    }

    /**
     * Get 任务实例详情。与TaskInstanceDetail相同含义，优先取Data，Data为空时，取TaskInstanceDetail
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 任务实例详情。与TaskInstanceDetail相同含义，优先取Data，Data为空时，取TaskInstanceDetail
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskInstanceDetail getData() {
        return this.Data;
    }

    /**
     * Set 任务实例详情。与TaskInstanceDetail相同含义，优先取Data，Data为空时，取TaskInstanceDetail
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 任务实例详情。与TaskInstanceDetail相同含义，优先取Data，Data为空时，取TaskInstanceDetail
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(TaskInstanceDetail Data) {
        this.Data = Data;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInstanceResponse(DescribeTaskInstanceResponse source) {
        if (source.TaskInstanceDetail != null) {
            this.TaskInstanceDetail = new TaskInstanceDetail(source.TaskInstanceDetail);
        }
        if (source.Data != null) {
            this.Data = new TaskInstanceDetail(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskInstanceDetail.", this.TaskInstanceDetail);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

