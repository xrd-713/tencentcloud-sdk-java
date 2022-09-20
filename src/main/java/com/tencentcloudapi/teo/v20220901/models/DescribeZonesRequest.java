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

public class DescribeZonesRequest extends AbstractModel{

    /**
    * 分页查询偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目。默认值：20，最大值：1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone-name<br>   按照【<strong>站点名称</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>zone-id<br>   按照【<strong>站点ID</strong>】进行过滤。站点ID形如：zone-xxx。<br>   类型：String<br>   必选：否<li>status<br>   按照【<strong>站点状态</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-key<br>   按照【<strong>标签键</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-value<br>   按照【<strong>标签值</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>Fuzzy<br>   按照【<strong>是否模糊查询</strong>】进行过滤。仅支持过滤字段名为zone-name。模糊查询时，Values长度最小为1。<br>   类型：Boolean<br>   必选：否<br>   默认值：false
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get 分页查询偏移量。默认值：0。 
     * @return Offset 分页查询偏移量。默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量。默认值：0。
     * @param Offset 分页查询偏移量。默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目。默认值：20，最大值：1000。 
     * @return Limit 分页查询限制数目。默认值：20，最大值：1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目。默认值：20，最大值：1000。
     * @param Limit 分页查询限制数目。默认值：20，最大值：1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone-name<br>   按照【<strong>站点名称</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>zone-id<br>   按照【<strong>站点ID</strong>】进行过滤。站点ID形如：zone-xxx。<br>   类型：String<br>   必选：否<li>status<br>   按照【<strong>站点状态</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-key<br>   按照【<strong>标签键</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-value<br>   按照【<strong>标签值</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>Fuzzy<br>   按照【<strong>是否模糊查询</strong>】进行过滤。仅支持过滤字段名为zone-name。模糊查询时，Values长度最小为1。<br>   类型：Boolean<br>   必选：否<br>   默认值：false 
     * @return Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone-name<br>   按照【<strong>站点名称</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>zone-id<br>   按照【<strong>站点ID</strong>】进行过滤。站点ID形如：zone-xxx。<br>   类型：String<br>   必选：否<li>status<br>   按照【<strong>站点状态</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-key<br>   按照【<strong>标签键</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-value<br>   按照【<strong>标签值</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>Fuzzy<br>   按照【<strong>是否模糊查询</strong>】进行过滤。仅支持过滤字段名为zone-name。模糊查询时，Values长度最小为1。<br>   类型：Boolean<br>   必选：否<br>   默认值：false
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone-name<br>   按照【<strong>站点名称</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>zone-id<br>   按照【<strong>站点ID</strong>】进行过滤。站点ID形如：zone-xxx。<br>   类型：String<br>   必选：否<li>status<br>   按照【<strong>站点状态</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-key<br>   按照【<strong>标签键</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-value<br>   按照【<strong>标签值</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>Fuzzy<br>   按照【<strong>是否模糊查询</strong>】进行过滤。仅支持过滤字段名为zone-name。模糊查询时，Values长度最小为1。<br>   类型：Boolean<br>   必选：否<br>   默认值：false
     * @param Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone-name<br>   按照【<strong>站点名称</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>zone-id<br>   按照【<strong>站点ID</strong>】进行过滤。站点ID形如：zone-xxx。<br>   类型：String<br>   必选：否<li>status<br>   按照【<strong>站点状态</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-key<br>   按照【<strong>标签键</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>tag-value<br>   按照【<strong>标签值</strong>】进行过滤。<br>   类型：String<br>   必选：否<li>Fuzzy<br>   按照【<strong>是否模糊查询</strong>】进行过滤。仅支持过滤字段名为zone-name。模糊查询时，Values长度最小为1。<br>   类型：Boolean<br>   必选：否<br>   默认值：false
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
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

