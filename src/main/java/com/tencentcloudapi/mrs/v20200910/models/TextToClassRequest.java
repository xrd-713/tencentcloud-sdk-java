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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToClassRequest extends AbstractModel{

    /**
    * 报告文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 用户类型，新客户传1，老客户可不传
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
     * Get 报告文本 
     * @return Text 报告文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 报告文本
     * @param Text 报告文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 用户类型，新客户传1，老客户可不传 
     * @return UserType 用户类型，新客户传1，老客户可不传
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型，新客户传1，老客户可不传
     * @param UserType 用户类型，新客户传1，老客户可不传
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    public TextToClassRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToClassRequest(TextToClassRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

