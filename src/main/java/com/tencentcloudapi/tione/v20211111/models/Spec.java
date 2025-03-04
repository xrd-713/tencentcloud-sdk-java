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

public class Spec extends AbstractModel{

    /**
    * 计费项标签
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 计费项名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 计费项显示名称
    */
    @SerializedName("SpecAlias")
    @Expose
    private String SpecAlias;

    /**
    * 是否售罄
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 当前资源售罄时，可用的区域有哪些
    */
    @SerializedName("AvailableRegion")
    @Expose
    private String [] AvailableRegion;

    /**
     * Get 计费项标签 
     * @return SpecId 计费项标签
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 计费项标签
     * @param SpecId 计费项标签
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 计费项名称 
     * @return SpecName 计费项名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 计费项名称
     * @param SpecName 计费项名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 计费项显示名称 
     * @return SpecAlias 计费项显示名称
     */
    public String getSpecAlias() {
        return this.SpecAlias;
    }

    /**
     * Set 计费项显示名称
     * @param SpecAlias 计费项显示名称
     */
    public void setSpecAlias(String SpecAlias) {
        this.SpecAlias = SpecAlias;
    }

    /**
     * Get 是否售罄 
     * @return Available 是否售罄
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 是否售罄
     * @param Available 是否售罄
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 当前资源售罄时，可用的区域有哪些 
     * @return AvailableRegion 当前资源售罄时，可用的区域有哪些
     */
    public String [] getAvailableRegion() {
        return this.AvailableRegion;
    }

    /**
     * Set 当前资源售罄时，可用的区域有哪些
     * @param AvailableRegion 当前资源售罄时，可用的区域有哪些
     */
    public void setAvailableRegion(String [] AvailableRegion) {
        this.AvailableRegion = AvailableRegion;
    }

    public Spec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Spec(Spec source) {
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.SpecAlias != null) {
            this.SpecAlias = new String(source.SpecAlias);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.AvailableRegion != null) {
            this.AvailableRegion = new String[source.AvailableRegion.length];
            for (int i = 0; i < source.AvailableRegion.length; i++) {
                this.AvailableRegion[i] = new String(source.AvailableRegion[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "SpecAlias", this.SpecAlias);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamArraySimple(map, prefix + "AvailableRegion.", this.AvailableRegion);

    }
}

