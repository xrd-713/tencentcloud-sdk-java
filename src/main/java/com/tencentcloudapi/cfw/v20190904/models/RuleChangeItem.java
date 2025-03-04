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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleChangeItem extends AbstractModel{

    /**
    * 原始sequence 值
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 新的sequence 值
    */
    @SerializedName("NewOrderIndex")
    @Expose
    private Long NewOrderIndex;

    /**
     * Get 原始sequence 值 
     * @return OrderIndex 原始sequence 值
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 原始sequence 值
     * @param OrderIndex 原始sequence 值
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 新的sequence 值 
     * @return NewOrderIndex 新的sequence 值
     */
    public Long getNewOrderIndex() {
        return this.NewOrderIndex;
    }

    /**
     * Set 新的sequence 值
     * @param NewOrderIndex 新的sequence 值
     */
    public void setNewOrderIndex(Long NewOrderIndex) {
        this.NewOrderIndex = NewOrderIndex;
    }

    public RuleChangeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleChangeItem(RuleChangeItem source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.NewOrderIndex != null) {
            this.NewOrderIndex = new Long(source.NewOrderIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "NewOrderIndex", this.NewOrderIndex);

    }
}

