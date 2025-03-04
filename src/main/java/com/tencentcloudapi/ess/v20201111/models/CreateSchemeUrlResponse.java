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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSchemeUrlResponse extends AbstractModel{

    /**
    * 小程序链接地址，有效期90天。如果EndPoint是App，得到的链接Path如’weixin://dl/business/?t= *TICKET*‘，用于客户APP、小程序直接拉起电子签小程序；其他EndPoint得到的https链接如'https://essurl.cn/xxx'，点击链接会打开一个H5页面，然后拉起电子签小程序。
    */
    @SerializedName("SchemeUrl")
    @Expose
    private String SchemeUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 小程序链接地址，有效期90天。如果EndPoint是App，得到的链接Path如’weixin://dl/business/?t= *TICKET*‘，用于客户APP、小程序直接拉起电子签小程序；其他EndPoint得到的https链接如'https://essurl.cn/xxx'，点击链接会打开一个H5页面，然后拉起电子签小程序。 
     * @return SchemeUrl 小程序链接地址，有效期90天。如果EndPoint是App，得到的链接Path如’weixin://dl/business/?t= *TICKET*‘，用于客户APP、小程序直接拉起电子签小程序；其他EndPoint得到的https链接如'https://essurl.cn/xxx'，点击链接会打开一个H5页面，然后拉起电子签小程序。
     */
    public String getSchemeUrl() {
        return this.SchemeUrl;
    }

    /**
     * Set 小程序链接地址，有效期90天。如果EndPoint是App，得到的链接Path如’weixin://dl/business/?t= *TICKET*‘，用于客户APP、小程序直接拉起电子签小程序；其他EndPoint得到的https链接如'https://essurl.cn/xxx'，点击链接会打开一个H5页面，然后拉起电子签小程序。
     * @param SchemeUrl 小程序链接地址，有效期90天。如果EndPoint是App，得到的链接Path如’weixin://dl/business/?t= *TICKET*‘，用于客户APP、小程序直接拉起电子签小程序；其他EndPoint得到的https链接如'https://essurl.cn/xxx'，点击链接会打开一个H5页面，然后拉起电子签小程序。
     */
    public void setSchemeUrl(String SchemeUrl) {
        this.SchemeUrl = SchemeUrl;
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

    public CreateSchemeUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSchemeUrlResponse(CreateSchemeUrlResponse source) {
        if (source.SchemeUrl != null) {
            this.SchemeUrl = new String(source.SchemeUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SchemeUrl", this.SchemeUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

