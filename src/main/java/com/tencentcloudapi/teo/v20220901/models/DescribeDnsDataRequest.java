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

public class DescribeDnsDataRequest extends AbstractModel{

    /**
    * 起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone<br>   按照【<strong>站点名称</strong>】进行过滤。站点名称形如：tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个站点
<li>host<br>   按照【<strong>域名</strong>】进行过滤。域名形如：test.tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个域名
<li>type<br>   按照【<strong>DNS解析类型</strong>】进行过滤<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：A记录<br>   AAAA：AAAA记录<br>   CNAME：CNAME记录<br>   MX：MX记录<br>   TXT：TXT记录<br>   NS：NS记录<br>   SRV：SRV记录<br>   CAA：CAA记录
<li>code<br>   按照【<strong>DNS解析状态码</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   NoError：成功<br>   NXDomain：请求域不存在<br>   NotImp：不支持的请求类型<br>   Refused：域名服务器因为策略的原因拒绝执行请求
<li>area<br>   按照【<strong>DNS解析地域</strong>】进行过滤。<br>   类型：String<br>   必选：否。<br>   可选项：<br>   亚洲：Asia<br>   欧洲：Europe<br>   非洲：Africa<br>   大洋洲：Oceania<br>   美洲：Americas
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 时间粒度，取值有：
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度。</li>不填写，默认值为：min。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get 起始时间。 
     * @return StartTime 起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间。
     * @param StartTime 起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone<br>   按照【<strong>站点名称</strong>】进行过滤。站点名称形如：tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个站点
<li>host<br>   按照【<strong>域名</strong>】进行过滤。域名形如：test.tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个域名
<li>type<br>   按照【<strong>DNS解析类型</strong>】进行过滤<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：A记录<br>   AAAA：AAAA记录<br>   CNAME：CNAME记录<br>   MX：MX记录<br>   TXT：TXT记录<br>   NS：NS记录<br>   SRV：SRV记录<br>   CAA：CAA记录
<li>code<br>   按照【<strong>DNS解析状态码</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   NoError：成功<br>   NXDomain：请求域不存在<br>   NotImp：不支持的请求类型<br>   Refused：域名服务器因为策略的原因拒绝执行请求
<li>area<br>   按照【<strong>DNS解析地域</strong>】进行过滤。<br>   类型：String<br>   必选：否。<br>   可选项：<br>   亚洲：Asia<br>   欧洲：Europe<br>   非洲：Africa<br>   大洋洲：Oceania<br>   美洲：Americas 
     * @return Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone<br>   按照【<strong>站点名称</strong>】进行过滤。站点名称形如：tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个站点
<li>host<br>   按照【<strong>域名</strong>】进行过滤。域名形如：test.tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个域名
<li>type<br>   按照【<strong>DNS解析类型</strong>】进行过滤<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：A记录<br>   AAAA：AAAA记录<br>   CNAME：CNAME记录<br>   MX：MX记录<br>   TXT：TXT记录<br>   NS：NS记录<br>   SRV：SRV记录<br>   CAA：CAA记录
<li>code<br>   按照【<strong>DNS解析状态码</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   NoError：成功<br>   NXDomain：请求域不存在<br>   NotImp：不支持的请求类型<br>   Refused：域名服务器因为策略的原因拒绝执行请求
<li>area<br>   按照【<strong>DNS解析地域</strong>】进行过滤。<br>   类型：String<br>   必选：否。<br>   可选项：<br>   亚洲：Asia<br>   欧洲：Europe<br>   非洲：Africa<br>   大洋洲：Oceania<br>   美洲：Americas
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone<br>   按照【<strong>站点名称</strong>】进行过滤。站点名称形如：tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个站点
<li>host<br>   按照【<strong>域名</strong>】进行过滤。域名形如：test.tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个域名
<li>type<br>   按照【<strong>DNS解析类型</strong>】进行过滤<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：A记录<br>   AAAA：AAAA记录<br>   CNAME：CNAME记录<br>   MX：MX记录<br>   TXT：TXT记录<br>   NS：NS记录<br>   SRV：SRV记录<br>   CAA：CAA记录
<li>code<br>   按照【<strong>DNS解析状态码</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   NoError：成功<br>   NXDomain：请求域不存在<br>   NotImp：不支持的请求类型<br>   Refused：域名服务器因为策略的原因拒绝执行请求
<li>area<br>   按照【<strong>DNS解析地域</strong>】进行过滤。<br>   类型：String<br>   必选：否。<br>   可选项：<br>   亚洲：Asia<br>   欧洲：Europe<br>   非洲：Africa<br>   大洋洲：Oceania<br>   美洲：Americas
     * @param Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：
<li>zone<br>   按照【<strong>站点名称</strong>】进行过滤。站点名称形如：tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个站点
<li>host<br>   按照【<strong>域名</strong>】进行过滤。域名形如：test.tencent.com<br>   类型：String<br>   必选：否，仅支持填写一个域名
<li>type<br>   按照【<strong>DNS解析类型</strong>】进行过滤<br>   类型：String<br>   必选：否<br>   可选项：<br>   A：A记录<br>   AAAA：AAAA记录<br>   CNAME：CNAME记录<br>   MX：MX记录<br>   TXT：TXT记录<br>   NS：NS记录<br>   SRV：SRV记录<br>   CAA：CAA记录
<li>code<br>   按照【<strong>DNS解析状态码</strong>】进行过滤。<br>   类型：String<br>   必选：否<br>   可选项：<br>   NoError：成功<br>   NXDomain：请求域不存在<br>   NotImp：不支持的请求类型<br>   Refused：域名服务器因为策略的原因拒绝执行请求
<li>area<br>   按照【<strong>DNS解析地域</strong>】进行过滤。<br>   类型：String<br>   必选：否。<br>   可选项：<br>   亚洲：Asia<br>   欧洲：Europe<br>   非洲：Africa<br>   大洋洲：Oceania<br>   美洲：Americas
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 时间粒度，取值有：
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度。</li>不填写，默认值为：min。 
     * @return Interval 时间粒度，取值有：
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度。</li>不填写，默认值为：min。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间粒度，取值有：
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度。</li>不填写，默认值为：min。
     * @param Interval 时间粒度，取值有：
<li>min：1分钟粒度；</li>
<li>5min：5分钟粒度；</li>
<li>hour：1小时粒度；</li>
<li>day：天粒度。</li>不填写，默认值为：min。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeDnsDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnsDataRequest(DescribeDnsDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

