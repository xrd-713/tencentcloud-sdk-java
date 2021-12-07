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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComplianceAssetPolicyItemListResponse extends AbstractModel{

    /**
    * 返回检测项的总数。如果用户未启用基线检查，此处返回0。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回某个资产下的检测项的列表。
    */
    @SerializedName("AssetPolicyItemList")
    @Expose
    private ComplianceAssetPolicyItem [] AssetPolicyItemList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回检测项的总数。如果用户未启用基线检查，此处返回0。 
     * @return TotalCount 返回检测项的总数。如果用户未启用基线检查，此处返回0。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回检测项的总数。如果用户未启用基线检查，此处返回0。
     * @param TotalCount 返回检测项的总数。如果用户未启用基线检查，此处返回0。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回某个资产下的检测项的列表。 
     * @return AssetPolicyItemList 返回某个资产下的检测项的列表。
     */
    public ComplianceAssetPolicyItem [] getAssetPolicyItemList() {
        return this.AssetPolicyItemList;
    }

    /**
     * Set 返回某个资产下的检测项的列表。
     * @param AssetPolicyItemList 返回某个资产下的检测项的列表。
     */
    public void setAssetPolicyItemList(ComplianceAssetPolicyItem [] AssetPolicyItemList) {
        this.AssetPolicyItemList = AssetPolicyItemList;
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

    public DescribeComplianceAssetPolicyItemListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceAssetPolicyItemListResponse(DescribeComplianceAssetPolicyItemListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AssetPolicyItemList != null) {
            this.AssetPolicyItemList = new ComplianceAssetPolicyItem[source.AssetPolicyItemList.length];
            for (int i = 0; i < source.AssetPolicyItemList.length; i++) {
                this.AssetPolicyItemList[i] = new ComplianceAssetPolicyItem(source.AssetPolicyItemList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AssetPolicyItemList.", this.AssetPolicyItemList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

