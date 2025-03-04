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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventPage extends AbstractModel{

    /**
    * 事件详情集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventsResponse")
    @Expose
    private EventDto [] EventsResponse;

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 事件详情集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventsResponse 事件详情集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventDto [] getEventsResponse() {
        return this.EventsResponse;
    }

    /**
     * Set 事件详情集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventsResponse 事件详情集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventsResponse(EventDto [] EventsResponse) {
        this.EventsResponse = EventsResponse;
    }

    /**
     * Get 总条数 
     * @return TotalCount 总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
     * @param TotalCount 总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public EventPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventPage(EventPage source) {
        if (source.EventsResponse != null) {
            this.EventsResponse = new EventDto[source.EventsResponse.length];
            for (int i = 0; i < source.EventsResponse.length; i++) {
                this.EventsResponse[i] = new EventDto(source.EventsResponse[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventsResponse.", this.EventsResponse);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

