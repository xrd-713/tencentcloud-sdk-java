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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicySet extends AbstractModel{

    /**
    * 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 出站规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Egress")
    @Expose
    private SecurityGroupPolicy [] Egress;

    /**
    * 入站规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ingress")
    @Expose
    private SecurityGroupPolicy [] Ingress;

    /**
     * Get 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 安全组规则当前版本。用户每次更新安全规则版本会自动加1，防止更新的路由规则已过期，不填不考虑冲突。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 出站规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Egress 出站规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityGroupPolicy [] getEgress() {
        return this.Egress;
    }

    /**
     * Set 出站规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Egress 出站规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEgress(SecurityGroupPolicy [] Egress) {
        this.Egress = Egress;
    }

    /**
     * Get 入站规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ingress 入站规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityGroupPolicy [] getIngress() {
        return this.Ingress;
    }

    /**
     * Set 入站规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ingress 入站规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIngress(SecurityGroupPolicy [] Ingress) {
        this.Ingress = Ingress;
    }

    public SecurityGroupPolicySet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicySet(SecurityGroupPolicySet source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Egress != null) {
            this.Egress = new SecurityGroupPolicy[source.Egress.length];
            for (int i = 0; i < source.Egress.length; i++) {
                this.Egress[i] = new SecurityGroupPolicy(source.Egress[i]);
            }
        }
        if (source.Ingress != null) {
            this.Ingress = new SecurityGroupPolicy[source.Ingress.length];
            for (int i = 0; i < source.Ingress.length; i++) {
                this.Ingress[i] = new SecurityGroupPolicy(source.Ingress[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "Egress.", this.Egress);
        this.setParamArrayObj(map, prefix + "Ingress.", this.Ingress);

    }
}

