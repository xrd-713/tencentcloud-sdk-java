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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWafInfoResponse extends AbstractModel{

    /**
    * 返回的WAF信息数组的长度，为0则表示没有查询到对应的信息
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 对应的WAF信息的数组。
    */
    @SerializedName("HostList")
    @Expose
    private ClbHostResult [] HostList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的WAF信息数组的长度，为0则表示没有查询到对应的信息 
     * @return Total 返回的WAF信息数组的长度，为0则表示没有查询到对应的信息
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 返回的WAF信息数组的长度，为0则表示没有查询到对应的信息
     * @param Total 返回的WAF信息数组的长度，为0则表示没有查询到对应的信息
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 对应的WAF信息的数组。 
     * @return HostList 对应的WAF信息的数组。
     */
    public ClbHostResult [] getHostList() {
        return this.HostList;
    }

    /**
     * Set 对应的WAF信息的数组。
     * @param HostList 对应的WAF信息的数组。
     */
    public void setHostList(ClbHostResult [] HostList) {
        this.HostList = HostList;
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

    public DescribeWafInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWafInfoResponse(DescribeWafInfoResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.HostList != null) {
            this.HostList = new ClbHostResult[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new ClbHostResult(source.HostList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "HostList.", this.HostList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

