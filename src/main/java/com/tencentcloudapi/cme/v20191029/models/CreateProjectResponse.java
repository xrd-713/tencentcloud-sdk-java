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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectResponse extends AbstractModel{

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 输入源推流信息。
 <li> 当 Catagory 为 STREAM_CONNECT 时，数组返回长度为 2 ，第 0 个代表主输入源，第 1 个代表备输入源。只有当各自输入源类型为推流时才有有效内容。</li>
    */
    @SerializedName("RtmpPushInputInfoSet")
    @Expose
    private RtmpPushInputInfo [] RtmpPushInputInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 输入源推流信息。
 <li> 当 Catagory 为 STREAM_CONNECT 时，数组返回长度为 2 ，第 0 个代表主输入源，第 1 个代表备输入源。只有当各自输入源类型为推流时才有有效内容。</li> 
     * @return RtmpPushInputInfoSet 输入源推流信息。
 <li> 当 Catagory 为 STREAM_CONNECT 时，数组返回长度为 2 ，第 0 个代表主输入源，第 1 个代表备输入源。只有当各自输入源类型为推流时才有有效内容。</li>
     */
    public RtmpPushInputInfo [] getRtmpPushInputInfoSet() {
        return this.RtmpPushInputInfoSet;
    }

    /**
     * Set 输入源推流信息。
 <li> 当 Catagory 为 STREAM_CONNECT 时，数组返回长度为 2 ，第 0 个代表主输入源，第 1 个代表备输入源。只有当各自输入源类型为推流时才有有效内容。</li>
     * @param RtmpPushInputInfoSet 输入源推流信息。
 <li> 当 Catagory 为 STREAM_CONNECT 时，数组返回长度为 2 ，第 0 个代表主输入源，第 1 个代表备输入源。只有当各自输入源类型为推流时才有有效内容。</li>
     */
    public void setRtmpPushInputInfoSet(RtmpPushInputInfo [] RtmpPushInputInfoSet) {
        this.RtmpPushInputInfoSet = RtmpPushInputInfoSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "RtmpPushInputInfoSet.", this.RtmpPushInputInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

