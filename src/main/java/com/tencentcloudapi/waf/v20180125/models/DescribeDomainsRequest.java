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

public class DescribeDomainsRequest extends AbstractModel{

    /**
    * 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回域名的数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤数组
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整 
     * @return Offset 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
     * @param Offset 分页偏移量，取Limit整数倍。最小值为0，最大值= Total/Limit向上取整
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回域名的数量 
     * @return Limit 返回域名的数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回域名的数量
     * @param Limit 返回域名的数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤数组 
     * @return Filters 过滤数组
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组
     * @param Filters 过滤数组
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainsRequest(DescribeDomainsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

