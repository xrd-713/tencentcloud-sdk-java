package com.tencentcloudapi.tdid.v20210519;
public enum TdidErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 用户接口鉴权失败
     FAILEDOPERATION_INVALIDAUTH("FailedOperation.InvalidAuth"),
     
    // 操作失败。
     FAILEDOPERATION_OPERATIONEXCEPTION("FailedOperation.OperationException"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 服务器异常。
     INTERNALERROR_SERVEREXCEPTION("InternalError.ServerException"),
     
    // 服务错误，请稍后重试，或联系客服
     INTERNALERROR_SERVICEERROR("InternalError.ServiceError"),
     
    // 服务异常。
     INTERNALERROR_SERVICEPANIC("InternalError.ServicePanic"),
     
    // 服务错误，请稍后重试，或联系客服
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 请求参数格式错误，请按照格式要求重新填写
     INVALIDPARAMETERVALUE_ILLEGALVALUE("InvalidParameterValue.IllegalValue"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TdidErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

