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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGeneralMetricDataRequest extends AbstractModel{

    /**
    * 要过滤的维度信息：
service_metric视图支持：service.name（服务名）、span.kind（客户端/服务端视角）为维度进行过滤，service.name（服务名）必填。
span.kind:
	server:服务端视角
	client:客户端视角
默认为服务端视角进行查询。
runtime_metric视图支持：service.name（服务名）维度进行过滤，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.instance（数据库名称）、db.ip（数据库实例ip）维度进行过滤，查询service_slow_sql_count（慢sql）指标时service.name必填，查询sql_duration_avg（耗时）指标时db.instance（数据库名称）必填。
    */
    @SerializedName("Filters")
    @Expose
    private GeneralFilter [] Filters;

    /**
    * 需要查询的指标，不可自定义输入。
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * 业务系统ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 视图名称，不可自定义输入。支持：service_metric、runtime_metric、sql_metric。
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 聚合维度：
service_metric视图支持：service.name（服务名）、span.kind （客户端/服务端视角）维度进行聚合，service.name（服务名）必填。
runtime_metric视图支持：service.name（服务名）维度进行聚合，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.statement（sql语句）维度进行聚合，查询service_slow_sql_count（慢sql）时service.name（服务名）必填，查询sql_duration_avg（耗时）指标时service.name（服务名）、db.statement（sql语句）必填。
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * 起始时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 聚合粒度，单位为秒，最小为60s，即一分钟的聚合粒度；如果为空或0则计算开始时间到截止时间的指标数据，上报其他值会报错。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 对查询指标进行排序：
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
asc:对查询指标进行升序排序
desc：对查询指标进行降序排序
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 要过滤的维度信息：
service_metric视图支持：service.name（服务名）、span.kind（客户端/服务端视角）为维度进行过滤，service.name（服务名）必填。
span.kind:
	server:服务端视角
	client:客户端视角
默认为服务端视角进行查询。
runtime_metric视图支持：service.name（服务名）维度进行过滤，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.instance（数据库名称）、db.ip（数据库实例ip）维度进行过滤，查询service_slow_sql_count（慢sql）指标时service.name必填，查询sql_duration_avg（耗时）指标时db.instance（数据库名称）必填。 
     * @return Filters 要过滤的维度信息：
service_metric视图支持：service.name（服务名）、span.kind（客户端/服务端视角）为维度进行过滤，service.name（服务名）必填。
span.kind:
	server:服务端视角
	client:客户端视角
默认为服务端视角进行查询。
runtime_metric视图支持：service.name（服务名）维度进行过滤，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.instance（数据库名称）、db.ip（数据库实例ip）维度进行过滤，查询service_slow_sql_count（慢sql）指标时service.name必填，查询sql_duration_avg（耗时）指标时db.instance（数据库名称）必填。
     */
    public GeneralFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 要过滤的维度信息：
service_metric视图支持：service.name（服务名）、span.kind（客户端/服务端视角）为维度进行过滤，service.name（服务名）必填。
span.kind:
	server:服务端视角
	client:客户端视角
默认为服务端视角进行查询。
runtime_metric视图支持：service.name（服务名）维度进行过滤，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.instance（数据库名称）、db.ip（数据库实例ip）维度进行过滤，查询service_slow_sql_count（慢sql）指标时service.name必填，查询sql_duration_avg（耗时）指标时db.instance（数据库名称）必填。
     * @param Filters 要过滤的维度信息：
service_metric视图支持：service.name（服务名）、span.kind（客户端/服务端视角）为维度进行过滤，service.name（服务名）必填。
span.kind:
	server:服务端视角
	client:客户端视角
默认为服务端视角进行查询。
runtime_metric视图支持：service.name（服务名）维度进行过滤，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.instance（数据库名称）、db.ip（数据库实例ip）维度进行过滤，查询service_slow_sql_count（慢sql）指标时service.name必填，查询sql_duration_avg（耗时）指标时db.instance（数据库名称）必填。
     */
    public void setFilters(GeneralFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 需要查询的指标，不可自定义输入。
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。 
     * @return Metrics 需要查询的指标，不可自定义输入。
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 需要查询的指标，不可自定义输入。
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
     * @param Metrics 需要查询的指标，不可自定义输入。
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 业务系统ID 
     * @return InstanceId 业务系统ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统ID
     * @param InstanceId 业务系统ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 视图名称，不可自定义输入。支持：service_metric、runtime_metric、sql_metric。 
     * @return ViewName 视图名称，不可自定义输入。支持：service_metric、runtime_metric、sql_metric。
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图名称，不可自定义输入。支持：service_metric、runtime_metric、sql_metric。
     * @param ViewName 视图名称，不可自定义输入。支持：service_metric、runtime_metric、sql_metric。
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 聚合维度：
service_metric视图支持：service.name（服务名）、span.kind （客户端/服务端视角）维度进行聚合，service.name（服务名）必填。
runtime_metric视图支持：service.name（服务名）维度进行聚合，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.statement（sql语句）维度进行聚合，查询service_slow_sql_count（慢sql）时service.name（服务名）必填，查询sql_duration_avg（耗时）指标时service.name（服务名）、db.statement（sql语句）必填。 
     * @return GroupBy 聚合维度：
service_metric视图支持：service.name（服务名）、span.kind （客户端/服务端视角）维度进行聚合，service.name（服务名）必填。
runtime_metric视图支持：service.name（服务名）维度进行聚合，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.statement（sql语句）维度进行聚合，查询service_slow_sql_count（慢sql）时service.name（服务名）必填，查询sql_duration_avg（耗时）指标时service.name（服务名）、db.statement（sql语句）必填。
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 聚合维度：
service_metric视图支持：service.name（服务名）、span.kind （客户端/服务端视角）维度进行聚合，service.name（服务名）必填。
runtime_metric视图支持：service.name（服务名）维度进行聚合，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.statement（sql语句）维度进行聚合，查询service_slow_sql_count（慢sql）时service.name（服务名）必填，查询sql_duration_avg（耗时）指标时service.name（服务名）、db.statement（sql语句）必填。
     * @param GroupBy 聚合维度：
service_metric视图支持：service.name（服务名）、span.kind （客户端/服务端视角）维度进行聚合，service.name（服务名）必填。
runtime_metric视图支持：service.name（服务名）维度进行聚合，service.name（服务名）必填。
sql_metric视图支持：service.name（服务名）、db.statement（sql语句）维度进行聚合，查询service_slow_sql_count（慢sql）时service.name（服务名）必填，查询sql_duration_avg（耗时）指标时service.name（服务名）、db.statement（sql语句）必填。
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get 起始时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。 
     * @return StartTime 起始时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
     * @param StartTime 起始时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。 
     * @return EndTime 结束时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
     * @param EndTime 结束时间的时间戳，单位为秒，只支持查询2天内最多1小时的指标数据。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 聚合粒度，单位为秒，最小为60s，即一分钟的聚合粒度；如果为空或0则计算开始时间到截止时间的指标数据，上报其他值会报错。 
     * @return Period 聚合粒度，单位为秒，最小为60s，即一分钟的聚合粒度；如果为空或0则计算开始时间到截止时间的指标数据，上报其他值会报错。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 聚合粒度，单位为秒，最小为60s，即一分钟的聚合粒度；如果为空或0则计算开始时间到截止时间的指标数据，上报其他值会报错。
     * @param Period 聚合粒度，单位为秒，最小为60s，即一分钟的聚合粒度；如果为空或0则计算开始时间到截止时间的指标数据，上报其他值会报错。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 对查询指标进行排序：
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
asc:对查询指标进行升序排序
desc：对查询指标进行降序排序 
     * @return OrderBy 对查询指标进行排序：
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
asc:对查询指标进行升序排序
desc：对查询指标进行降序排序
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 对查询指标进行排序：
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
asc:对查询指标进行升序排序
desc：对查询指标进行降序排序
     * @param OrderBy 对查询指标进行排序：
service_metric视图支持：service_request_count（总请求）、service_duration（平均响应时间）、service_error_req_rate（平均错误率）、service_slow_call_count（慢调用）、service_error_request_count（异常数量）。
runtime_metric视图支持：service_gc_full_count（Full GC）。
sql_metric视图支持：service_slow_sql_count（慢sql）、sql_duration_avg（耗时）。
asc:对查询指标进行升序排序
desc：对查询指标进行降序排序
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。 
     * @return PageSize 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
     * @param PageSize 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeGeneralMetricDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralMetricDataRequest(DescribeGeneralMetricDataRequest source) {
        if (source.Filters != null) {
            this.Filters = new GeneralFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new GeneralFilter(source.Filters[i]);
            }
        }
        if (source.Metrics != null) {
            this.Metrics = new String[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new String(source.Metrics[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

