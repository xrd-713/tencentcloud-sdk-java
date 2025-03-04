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
package com.tencentcloudapi.tsw.v20210412;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tsw.v20210412.models.*;

public class TswClient extends AbstractClient{
    private static String endpoint = "tsw.tencentcloudapi.com";
    private static String service = "tsw";
    private static String version = "2021-04-12";
    
    public TswClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TswClient(Credential credential, String region, ClientProfile profile) {
        super(TswClient.endpoint, TswClient.version, credential, region, profile);
    }

    /**
     *获取告警对象-组件告警
     * @param req DescribeComponentAlertObjectRequest
     * @return DescribeComponentAlertObjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentAlertObjectResponse DescribeComponentAlertObject(DescribeComponentAlertObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComponentAlertObjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComponentAlertObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComponentAlertObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取告警对象-服务告警表
     * @param req DescribeServiceAlertObjectRequest
     * @return DescribeServiceAlertObjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceAlertObjectResponse DescribeServiceAlertObject(DescribeServiceAlertObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceAlertObjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceAlertObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceAlertObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询token
     * @param req DescribeTokenRequest
     * @return DescribeTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTokenResponse DescribeToken(DescribeTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
