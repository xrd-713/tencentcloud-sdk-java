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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopCreatingImageRequest extends AbstractModel{

    /**
    * 镜像保存记录ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
     * Get 镜像保存记录ID 
     * @return RecordId 镜像保存记录ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 镜像保存记录ID
     * @param RecordId 镜像保存记录ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    public StopCreatingImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopCreatingImageRequest(StopCreatingImageRequest source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);

    }
}

