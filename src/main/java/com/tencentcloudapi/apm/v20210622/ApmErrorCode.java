package com.tencentcloudapi.apm.v20210622;
public enum ApmErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // AuthFailure.UnauthorizedOperation
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 访问标签失败。
     FAILEDOPERATION_ACCESSTAGFAIL("FailedOperation.AccessTagFail"),
     
    // appid和实例信息不匹配。
     FAILEDOPERATION_APPIDNOTMATCHINSTANCEINFO("FailedOperation.AppIdNotMatchInstanceInfo"),
     
    // 未命中白名单且实例id为官方demo实例id时，不允许修改接口。
     FAILEDOPERATION_DEMOINSTANCENOTALLOWMODIFIED("FailedOperation.DemoInstanceNotAllowModified"),
     
    // 实例ID为空。
     FAILEDOPERATION_INSTANCEIDISEMPTY("FailedOperation.InstanceIdIsEmpty"),
     
    // apm实例不存在。
     FAILEDOPERATION_INSTANCENOTFOUND("FailedOperation.InstanceNotFound"),
     
    // 非法实例id。
     FAILEDOPERATION_INVALIDINSTANCEID("FailedOperation.InvalidInstanceID"),
     
    // 查询指标类数据查询条件缺少过滤参数。
     FAILEDOPERATION_METRICFILTERSLACKPARAMS("FailedOperation.MetricFiltersLackParams"),
     
    // 非内网vpc。
     FAILEDOPERATION_NOTINNERVPC("FailedOperation.NotInnerVPC"),
     
    // 查询时间区间不支持。
     FAILEDOPERATION_QUERYTIMEINTERVALISNOTSUPPORTED("FailedOperation.QueryTimeIntervalIsNotSupported"),
     
    // 不支持该地域。
     FAILEDOPERATION_REGIONNOTSUPPORT("FailedOperation.RegionNotSupport"),
     
    // 发送查询请求失败。
     FAILEDOPERATION_SENDREQUEST("FailedOperation.SendRequest"),
     
    // 视图名不存在或非法。
     FAILEDOPERATION_VIEWNAMENOTEXISTORILLEGAL("FailedOperation.ViewNameNotExistOrIllegal"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // filters中的字段不存在或非法。
     INVALIDPARAMETER_FILTERSFIELDSNOTEXISTORILLEGAL("InvalidParameter.FiltersFieldsNotExistOrIllegal"),
     
    // groupby中的字段不存在或非法。
     INVALIDPARAMETER_GROUPBYFIELDSNOTEXISTORILLEGAL("InvalidParameter.GroupByFieldsNotExistOrIllegal"),
     
    // filters中必须存在service.name字段，否则会报错。
     INVALIDPARAMETER_METRICFILTERSLACKPARAMS("InvalidParameter.MetricFiltersLackParams"),
     
    // metrics中的字段不存在或非法。
     INVALIDPARAMETER_METRICSFIELDNOTEXISTORILLEGAL("InvalidParameter.MetricsFieldNotExistOrIllegal"),
     
    // metrics中不允许为空。
     INVALIDPARAMETER_METRICSFIELDSNOTALLOWEMPTY("InvalidParameter.MetricsFieldsNotAllowEmpty"),
     
    // period不为空，0或60。
     INVALIDPARAMETER_PERIODISILLEGAL("InvalidParameter.PeriodIsIllegal"),
     
    // 查询时间不支持，最多只能查询最近2天、最多一个小时的数据。
     INVALIDPARAMETER_QUERYTIMEINTERVALISNOTSUPPORTED("InvalidParameter.QueryTimeIntervalIsNotSupported"),
     
    // 视图名称不存在或非法。
     INVALIDPARAMETER_VIEWNAMENOTEXISTORILLEGAL("InvalidParameter.ViewNameNotExistOrIllegal");
     
    private String value;
    private ApmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

