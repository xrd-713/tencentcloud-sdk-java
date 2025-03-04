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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskChargePrepaid extends AbstractModel{

    /**
    * 新购周期。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费。
NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费，用户需要手动续费。
DISABLE_NOTIFY_AND_AUTO_RENEW：不自动续费，且不通知。

默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，云盘到期后将按月自动续费。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 新购单位. 默认值: "m"。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
     * Get 新购周期。 
     * @return Period 新购周期。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 新购周期。
     * @param Period 新购周期。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费。
NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费，用户需要手动续费。
DISABLE_NOTIFY_AND_AUTO_RENEW：不自动续费，且不通知。

默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，云盘到期后将按月自动续费。 
     * @return RenewFlag 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费。
NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费，用户需要手动续费。
DISABLE_NOTIFY_AND_AUTO_RENEW：不自动续费，且不通知。

默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，云盘到期后将按月自动续费。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费。
NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费，用户需要手动续费。
DISABLE_NOTIFY_AND_AUTO_RENEW：不自动续费，且不通知。

默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，云盘到期后将按月自动续费。
     * @param RenewFlag 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费。
NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费，用户需要手动续费。
DISABLE_NOTIFY_AND_AUTO_RENEW：不自动续费，且不通知。

默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，云盘到期后将按月自动续费。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 新购单位. 默认值: "m"。 
     * @return TimeUnit 新购单位. 默认值: "m"。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 新购单位. 默认值: "m"。
     * @param TimeUnit 新购单位. 默认值: "m"。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    public DiskChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskChargePrepaid(DiskChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

