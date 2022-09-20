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

public class DescribeTimingL7AnalysisDataRequest extends AbstractModel{

    /**
    * 开始时间。
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
    * 指标列表，取值有:
<li>l7Flow_outFlux: 访问流量；</li>
<li>l7Flow_request: 访问请求数；</li>
<li>l7Flow_outBandwidth: 访问带宽。</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 站点集合，不填默认选择全部站点。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 查询时间粒度，取值有：
<li>min: 1分钟；</li>
<li>5min: 5分钟；</li>
<li>hour: 1小时；</li>
<li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 筛选条件，key可选的值有：
<li>country：国家/地区；</li>
<li>domain：域名；</li>
<li>protocol：协议类型；</li>
<li>resourceType：资源类型；</li>
<li>statusCode：状态码；</li>
<li> browserType：浏览器类型；</li>
<li>deviceType：设备类型；</li>
<li>operatingSystemType：操作系统类型；</li>
<li>tlsVersion：tls版本；</li>
<li>url：url地址；</li>
<li>referer：refer头信息；</li>
<li>ipVersion：ip版本；</li>
<li>tagKey：标签Key；</li>
<li>tagValue：标签Value。</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户的地域智能选择地区。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
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
     * Get 指标列表，取值有:
<li>l7Flow_outFlux: 访问流量；</li>
<li>l7Flow_request: 访问请求数；</li>
<li>l7Flow_outBandwidth: 访问带宽。</li> 
     * @return MetricNames 指标列表，取值有:
<li>l7Flow_outFlux: 访问流量；</li>
<li>l7Flow_request: 访问请求数；</li>
<li>l7Flow_outBandwidth: 访问带宽。</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 指标列表，取值有:
<li>l7Flow_outFlux: 访问流量；</li>
<li>l7Flow_request: 访问请求数；</li>
<li>l7Flow_outBandwidth: 访问带宽。</li>
     * @param MetricNames 指标列表，取值有:
<li>l7Flow_outFlux: 访问流量；</li>
<li>l7Flow_request: 访问请求数；</li>
<li>l7Flow_outBandwidth: 访问带宽。</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 站点集合，不填默认选择全部站点。 
     * @return ZoneIds 站点集合，不填默认选择全部站点。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点集合，不填默认选择全部站点。
     * @param ZoneIds 站点集合，不填默认选择全部站点。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 查询时间粒度，取值有：
<li>min: 1分钟；</li>
<li>5min: 5分钟；</li>
<li>hour: 1小时；</li>
<li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。 
     * @return Interval 查询时间粒度，取值有：
<li>min: 1分钟；</li>
<li>5min: 5分钟；</li>
<li>hour: 1小时；</li>
<li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间粒度，取值有：
<li>min: 1分钟；</li>
<li>5min: 5分钟；</li>
<li>hour: 1小时；</li>
<li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     * @param Interval 查询时间粒度，取值有：
<li>min: 1分钟；</li>
<li>5min: 5分钟；</li>
<li>hour: 1小时；</li>
<li>day: 1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 筛选条件，key可选的值有：
<li>country：国家/地区；</li>
<li>domain：域名；</li>
<li>protocol：协议类型；</li>
<li>resourceType：资源类型；</li>
<li>statusCode：状态码；</li>
<li> browserType：浏览器类型；</li>
<li>deviceType：设备类型；</li>
<li>operatingSystemType：操作系统类型；</li>
<li>tlsVersion：tls版本；</li>
<li>url：url地址；</li>
<li>referer：refer头信息；</li>
<li>ipVersion：ip版本；</li>
<li>tagKey：标签Key；</li>
<li>tagValue：标签Value。</li> 
     * @return Filters 筛选条件，key可选的值有：
<li>country：国家/地区；</li>
<li>domain：域名；</li>
<li>protocol：协议类型；</li>
<li>resourceType：资源类型；</li>
<li>statusCode：状态码；</li>
<li> browserType：浏览器类型；</li>
<li>deviceType：设备类型；</li>
<li>operatingSystemType：操作系统类型；</li>
<li>tlsVersion：tls版本；</li>
<li>url：url地址；</li>
<li>referer：refer头信息；</li>
<li>ipVersion：ip版本；</li>
<li>tagKey：标签Key；</li>
<li>tagValue：标签Value。</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件，key可选的值有：
<li>country：国家/地区；</li>
<li>domain：域名；</li>
<li>protocol：协议类型；</li>
<li>resourceType：资源类型；</li>
<li>statusCode：状态码；</li>
<li> browserType：浏览器类型；</li>
<li>deviceType：设备类型；</li>
<li>operatingSystemType：操作系统类型；</li>
<li>tlsVersion：tls版本；</li>
<li>url：url地址；</li>
<li>referer：refer头信息；</li>
<li>ipVersion：ip版本；</li>
<li>tagKey：标签Key；</li>
<li>tagValue：标签Value。</li>
     * @param Filters 筛选条件，key可选的值有：
<li>country：国家/地区；</li>
<li>domain：域名；</li>
<li>protocol：协议类型；</li>
<li>resourceType：资源类型；</li>
<li>statusCode：状态码；</li>
<li> browserType：浏览器类型；</li>
<li>deviceType：设备类型；</li>
<li>operatingSystemType：操作系统类型；</li>
<li>tlsVersion：tls版本；</li>
<li>url：url地址；</li>
<li>referer：refer头信息；</li>
<li>ipVersion：ip版本；</li>
<li>tagKey：标签Key；</li>
<li>tagValue：标签Value。</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户的地域智能选择地区。 
     * @return Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户的地域智能选择地区。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户的地域智能选择地区。
     * @param Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户的地域智能选择地区。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTimingL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7AnalysisDataRequest(DescribeTimingL7AnalysisDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

