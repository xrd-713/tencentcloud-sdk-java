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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSpartaProtectionRequest extends AbstractModel{

    /**
    * 需要防御的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 证书类型，0表示没有证书，CertType=1表示自有证书,2 为托管证书
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 表示是否开启了CDN代理，1：有部署CDN，0：未部署CDN
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * 回源类型，0表示通过IP回源,1 表示通过域名回源
    */
    @SerializedName("UpstreamType")
    @Expose
    private Long UpstreamType;

    /**
    * 是否开启WebSocket支持，1表示开启，0不开启
    */
    @SerializedName("IsWebsocket")
    @Expose
    private Long IsWebsocket;

    /**
    * 负载均衡策略，0表示轮询，1表示IP hash
    */
    @SerializedName("LoadBalance")
    @Expose
    private String LoadBalance;

    /**
    * 值为1时，需要填次参数，表示证书内容
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * CertType=1时，需要填次参数，表示证书的私钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * CertType=2时，需要填次参数，表示证书的ID
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * Waf的资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * HTTPS回源协议，填http或者https
    */
    @SerializedName("UpstreamScheme")
    @Expose
    private String UpstreamScheme;

    /**
    * HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段
    */
    @SerializedName("HttpsUpstreamPort")
    @Expose
    private String HttpsUpstreamPort;

    /**
    * 是否开启灰度，0表示不开启灰度
    */
    @SerializedName("IsGray")
    @Expose
    private Long IsGray;

    /**
    * 灰度的地区
    */
    @SerializedName("GrayAreas")
    @Expose
    private String [] GrayAreas;

    /**
    * UpstreamType=1时，填次字段表示回源域名
    */
    @SerializedName("UpstreamDomain")
    @Expose
    private String UpstreamDomain;

    /**
    * UpstreamType=0时，填次字段表示回源IP
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * 是否开启HTTP2,开启HTTP2需要HTTPS支持
    */
    @SerializedName("IsHttp2")
    @Expose
    private Long IsHttp2;

    /**
    * 表示是否强制跳转到HTTPS，1强制跳转Https，0不强制跳转
    */
    @SerializedName("HttpsRewrite")
    @Expose
    private Long HttpsRewrite;

    /**
    * 服务有多端口需要设置此字段
    */
    @SerializedName("Ports")
    @Expose
    private PortItem [] Ports;

    /**
    * WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF，cdn-waf表示CDN上的Web防护能力
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 是否开启长连接，仅IP回源时可以用填次参数，域名回源时这个参数无效
    */
    @SerializedName("IsKeepAlive")
    @Expose
    private String IsKeepAlive;

    /**
    * 实例id，上线之后带上此字段
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * anycast IP类型开关： 0 普通IP 1 Anycast IP
    */
    @SerializedName("Anycast")
    @Expose
    private Long Anycast;

    /**
    * src权重
    */
    @SerializedName("Weights")
    @Expose
    private Long [] Weights;

    /**
    * 是否开启主动健康检测，1表示开启，0表示不开启
    */
    @SerializedName("ActiveCheck")
    @Expose
    private Long ActiveCheck;

    /**
    * TLS版本信息
    */
    @SerializedName("TLSVersion")
    @Expose
    private Long TLSVersion;

    /**
    * 加密套件信息
    */
    @SerializedName("Ciphers")
    @Expose
    private Long [] Ciphers;

    /**
    * 0:不支持选择：默认模版  1:通用型模版 2:安全型模版 3:自定义模版
    */
    @SerializedName("CipherTemplate")
    @Expose
    private Long CipherTemplate;

    /**
    * 300s
    */
    @SerializedName("ProxyReadTimeout")
    @Expose
    private Long ProxyReadTimeout;

    /**
    * 300s
    */
    @SerializedName("ProxySendTimeout")
    @Expose
    private Long ProxySendTimeout;

    /**
    * 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
    */
    @SerializedName("SniType")
    @Expose
    private Long SniType;

    /**
    * SniType=3时，需要填此参数，表示自定义的host；
    */
    @SerializedName("SniHost")
    @Expose
    private String SniHost;

    /**
    * is_cdn=3时，需要填此参数，表示自定义header
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * 0:关闭xff重置；1:开启xff重置
    */
    @SerializedName("XFFReset")
    @Expose
    private Long XFFReset;

    /**
     * Get 需要防御的域名 
     * @return Domain 需要防御的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要防御的域名
     * @param Domain 需要防御的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 证书类型，0表示没有证书，CertType=1表示自有证书,2 为托管证书 
     * @return CertType 证书类型，0表示没有证书，CertType=1表示自有证书,2 为托管证书
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型，0表示没有证书，CertType=1表示自有证书,2 为托管证书
     * @param CertType 证书类型，0表示没有证书，CertType=1表示自有证书,2 为托管证书
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 表示是否开启了CDN代理，1：有部署CDN，0：未部署CDN 
     * @return IsCdn 表示是否开启了CDN代理，1：有部署CDN，0：未部署CDN
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set 表示是否开启了CDN代理，1：有部署CDN，0：未部署CDN
     * @param IsCdn 表示是否开启了CDN代理，1：有部署CDN，0：未部署CDN
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 回源类型，0表示通过IP回源,1 表示通过域名回源 
     * @return UpstreamType 回源类型，0表示通过IP回源,1 表示通过域名回源
     */
    public Long getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set 回源类型，0表示通过IP回源,1 表示通过域名回源
     * @param UpstreamType 回源类型，0表示通过IP回源,1 表示通过域名回源
     */
    public void setUpstreamType(Long UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get 是否开启WebSocket支持，1表示开启，0不开启 
     * @return IsWebsocket 是否开启WebSocket支持，1表示开启，0不开启
     */
    public Long getIsWebsocket() {
        return this.IsWebsocket;
    }

    /**
     * Set 是否开启WebSocket支持，1表示开启，0不开启
     * @param IsWebsocket 是否开启WebSocket支持，1表示开启，0不开启
     */
    public void setIsWebsocket(Long IsWebsocket) {
        this.IsWebsocket = IsWebsocket;
    }

    /**
     * Get 负载均衡策略，0表示轮询，1表示IP hash 
     * @return LoadBalance 负载均衡策略，0表示轮询，1表示IP hash
     */
    public String getLoadBalance() {
        return this.LoadBalance;
    }

    /**
     * Set 负载均衡策略，0表示轮询，1表示IP hash
     * @param LoadBalance 负载均衡策略，0表示轮询，1表示IP hash
     */
    public void setLoadBalance(String LoadBalance) {
        this.LoadBalance = LoadBalance;
    }

    /**
     * Get 值为1时，需要填次参数，表示证书内容 
     * @return Cert 值为1时，需要填次参数，表示证书内容
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 值为1时，需要填次参数，表示证书内容
     * @param Cert 值为1时，需要填次参数，表示证书内容
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get CertType=1时，需要填次参数，表示证书的私钥 
     * @return PrivateKey CertType=1时，需要填次参数，表示证书的私钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set CertType=1时，需要填次参数，表示证书的私钥
     * @param PrivateKey CertType=1时，需要填次参数，表示证书的私钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get CertType=2时，需要填次参数，表示证书的ID 
     * @return SSLId CertType=2时，需要填次参数，表示证书的ID
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set CertType=2时，需要填次参数，表示证书的ID
     * @param SSLId CertType=2时，需要填次参数，表示证书的ID
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * Get Waf的资源ID 
     * @return ResourceId Waf的资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Waf的资源ID
     * @param ResourceId Waf的资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get HTTPS回源协议，填http或者https 
     * @return UpstreamScheme HTTPS回源协议，填http或者https
     */
    public String getUpstreamScheme() {
        return this.UpstreamScheme;
    }

    /**
     * Set HTTPS回源协议，填http或者https
     * @param UpstreamScheme HTTPS回源协议，填http或者https
     */
    public void setUpstreamScheme(String UpstreamScheme) {
        this.UpstreamScheme = UpstreamScheme;
    }

    /**
     * Get HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段 
     * @return HttpsUpstreamPort HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段
     */
    public String getHttpsUpstreamPort() {
        return this.HttpsUpstreamPort;
    }

    /**
     * Set HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段
     * @param HttpsUpstreamPort HTTPS回源端口,仅UpstreamScheme为http时需要填当前字段
     */
    public void setHttpsUpstreamPort(String HttpsUpstreamPort) {
        this.HttpsUpstreamPort = HttpsUpstreamPort;
    }

    /**
     * Get 是否开启灰度，0表示不开启灰度 
     * @return IsGray 是否开启灰度，0表示不开启灰度
     */
    public Long getIsGray() {
        return this.IsGray;
    }

    /**
     * Set 是否开启灰度，0表示不开启灰度
     * @param IsGray 是否开启灰度，0表示不开启灰度
     */
    public void setIsGray(Long IsGray) {
        this.IsGray = IsGray;
    }

    /**
     * Get 灰度的地区 
     * @return GrayAreas 灰度的地区
     */
    public String [] getGrayAreas() {
        return this.GrayAreas;
    }

    /**
     * Set 灰度的地区
     * @param GrayAreas 灰度的地区
     */
    public void setGrayAreas(String [] GrayAreas) {
        this.GrayAreas = GrayAreas;
    }

    /**
     * Get UpstreamType=1时，填次字段表示回源域名 
     * @return UpstreamDomain UpstreamType=1时，填次字段表示回源域名
     */
    public String getUpstreamDomain() {
        return this.UpstreamDomain;
    }

    /**
     * Set UpstreamType=1时，填次字段表示回源域名
     * @param UpstreamDomain UpstreamType=1时，填次字段表示回源域名
     */
    public void setUpstreamDomain(String UpstreamDomain) {
        this.UpstreamDomain = UpstreamDomain;
    }

    /**
     * Get UpstreamType=0时，填次字段表示回源IP 
     * @return SrcList UpstreamType=0时，填次字段表示回源IP
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set UpstreamType=0时，填次字段表示回源IP
     * @param SrcList UpstreamType=0时，填次字段表示回源IP
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get 是否开启HTTP2,开启HTTP2需要HTTPS支持 
     * @return IsHttp2 是否开启HTTP2,开启HTTP2需要HTTPS支持
     */
    public Long getIsHttp2() {
        return this.IsHttp2;
    }

    /**
     * Set 是否开启HTTP2,开启HTTP2需要HTTPS支持
     * @param IsHttp2 是否开启HTTP2,开启HTTP2需要HTTPS支持
     */
    public void setIsHttp2(Long IsHttp2) {
        this.IsHttp2 = IsHttp2;
    }

    /**
     * Get 表示是否强制跳转到HTTPS，1强制跳转Https，0不强制跳转 
     * @return HttpsRewrite 表示是否强制跳转到HTTPS，1强制跳转Https，0不强制跳转
     */
    public Long getHttpsRewrite() {
        return this.HttpsRewrite;
    }

    /**
     * Set 表示是否强制跳转到HTTPS，1强制跳转Https，0不强制跳转
     * @param HttpsRewrite 表示是否强制跳转到HTTPS，1强制跳转Https，0不强制跳转
     */
    public void setHttpsRewrite(Long HttpsRewrite) {
        this.HttpsRewrite = HttpsRewrite;
    }

    /**
     * Get 服务有多端口需要设置此字段 
     * @return Ports 服务有多端口需要设置此字段
     */
    public PortItem [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 服务有多端口需要设置此字段
     * @param Ports 服务有多端口需要设置此字段
     */
    public void setPorts(PortItem [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF，cdn-waf表示CDN上的Web防护能力 
     * @return Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF，cdn-waf表示CDN上的Web防护能力
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF，cdn-waf表示CDN上的Web防护能力
     * @param Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF，cdn-waf表示CDN上的Web防护能力
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 是否开启长连接，仅IP回源时可以用填次参数，域名回源时这个参数无效 
     * @return IsKeepAlive 是否开启长连接，仅IP回源时可以用填次参数，域名回源时这个参数无效
     */
    public String getIsKeepAlive() {
        return this.IsKeepAlive;
    }

    /**
     * Set 是否开启长连接，仅IP回源时可以用填次参数，域名回源时这个参数无效
     * @param IsKeepAlive 是否开启长连接，仅IP回源时可以用填次参数，域名回源时这个参数无效
     */
    public void setIsKeepAlive(String IsKeepAlive) {
        this.IsKeepAlive = IsKeepAlive;
    }

    /**
     * Get 实例id，上线之后带上此字段 
     * @return InstanceID 实例id，上线之后带上此字段
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id，上线之后带上此字段
     * @param InstanceID 实例id，上线之后带上此字段
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get anycast IP类型开关： 0 普通IP 1 Anycast IP 
     * @return Anycast anycast IP类型开关： 0 普通IP 1 Anycast IP
     */
    public Long getAnycast() {
        return this.Anycast;
    }

    /**
     * Set anycast IP类型开关： 0 普通IP 1 Anycast IP
     * @param Anycast anycast IP类型开关： 0 普通IP 1 Anycast IP
     */
    public void setAnycast(Long Anycast) {
        this.Anycast = Anycast;
    }

    /**
     * Get src权重 
     * @return Weights src权重
     */
    public Long [] getWeights() {
        return this.Weights;
    }

    /**
     * Set src权重
     * @param Weights src权重
     */
    public void setWeights(Long [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get 是否开启主动健康检测，1表示开启，0表示不开启 
     * @return ActiveCheck 是否开启主动健康检测，1表示开启，0表示不开启
     */
    public Long getActiveCheck() {
        return this.ActiveCheck;
    }

    /**
     * Set 是否开启主动健康检测，1表示开启，0表示不开启
     * @param ActiveCheck 是否开启主动健康检测，1表示开启，0表示不开启
     */
    public void setActiveCheck(Long ActiveCheck) {
        this.ActiveCheck = ActiveCheck;
    }

    /**
     * Get TLS版本信息 
     * @return TLSVersion TLS版本信息
     */
    public Long getTLSVersion() {
        return this.TLSVersion;
    }

    /**
     * Set TLS版本信息
     * @param TLSVersion TLS版本信息
     */
    public void setTLSVersion(Long TLSVersion) {
        this.TLSVersion = TLSVersion;
    }

    /**
     * Get 加密套件信息 
     * @return Ciphers 加密套件信息
     */
    public Long [] getCiphers() {
        return this.Ciphers;
    }

    /**
     * Set 加密套件信息
     * @param Ciphers 加密套件信息
     */
    public void setCiphers(Long [] Ciphers) {
        this.Ciphers = Ciphers;
    }

    /**
     * Get 0:不支持选择：默认模版  1:通用型模版 2:安全型模版 3:自定义模版 
     * @return CipherTemplate 0:不支持选择：默认模版  1:通用型模版 2:安全型模版 3:自定义模版
     */
    public Long getCipherTemplate() {
        return this.CipherTemplate;
    }

    /**
     * Set 0:不支持选择：默认模版  1:通用型模版 2:安全型模版 3:自定义模版
     * @param CipherTemplate 0:不支持选择：默认模版  1:通用型模版 2:安全型模版 3:自定义模版
     */
    public void setCipherTemplate(Long CipherTemplate) {
        this.CipherTemplate = CipherTemplate;
    }

    /**
     * Get 300s 
     * @return ProxyReadTimeout 300s
     */
    public Long getProxyReadTimeout() {
        return this.ProxyReadTimeout;
    }

    /**
     * Set 300s
     * @param ProxyReadTimeout 300s
     */
    public void setProxyReadTimeout(Long ProxyReadTimeout) {
        this.ProxyReadTimeout = ProxyReadTimeout;
    }

    /**
     * Get 300s 
     * @return ProxySendTimeout 300s
     */
    public Long getProxySendTimeout() {
        return this.ProxySendTimeout;
    }

    /**
     * Set 300s
     * @param ProxySendTimeout 300s
     */
    public void setProxySendTimeout(Long ProxySendTimeout) {
        this.ProxySendTimeout = ProxySendTimeout;
    }

    /**
     * Get 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost； 
     * @return SniType 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
     */
    public Long getSniType() {
        return this.SniType;
    }

    /**
     * Set 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
     * @param SniType 0:关闭SNI；1:开启SNI，SNI=源请求host；2:开启SNI，SNI=修改为源站host；3：开启SNI，自定义host，SNI=SniHost；
     */
    public void setSniType(Long SniType) {
        this.SniType = SniType;
    }

    /**
     * Get SniType=3时，需要填此参数，表示自定义的host； 
     * @return SniHost SniType=3时，需要填此参数，表示自定义的host；
     */
    public String getSniHost() {
        return this.SniHost;
    }

    /**
     * Set SniType=3时，需要填此参数，表示自定义的host；
     * @param SniHost SniType=3时，需要填此参数，表示自定义的host；
     */
    public void setSniHost(String SniHost) {
        this.SniHost = SniHost;
    }

    /**
     * Get is_cdn=3时，需要填此参数，表示自定义header 
     * @return IpHeaders is_cdn=3时，需要填此参数，表示自定义header
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set is_cdn=3时，需要填此参数，表示自定义header
     * @param IpHeaders is_cdn=3时，需要填此参数，表示自定义header
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get 0:关闭xff重置；1:开启xff重置 
     * @return XFFReset 0:关闭xff重置；1:开启xff重置
     */
    public Long getXFFReset() {
        return this.XFFReset;
    }

    /**
     * Set 0:关闭xff重置；1:开启xff重置
     * @param XFFReset 0:关闭xff重置；1:开启xff重置
     */
    public void setXFFReset(Long XFFReset) {
        this.XFFReset = XFFReset;
    }

    public AddSpartaProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSpartaProtectionRequest(AddSpartaProtectionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new Long(source.UpstreamType);
        }
        if (source.IsWebsocket != null) {
            this.IsWebsocket = new Long(source.IsWebsocket);
        }
        if (source.LoadBalance != null) {
            this.LoadBalance = new String(source.LoadBalance);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.UpstreamScheme != null) {
            this.UpstreamScheme = new String(source.UpstreamScheme);
        }
        if (source.HttpsUpstreamPort != null) {
            this.HttpsUpstreamPort = new String(source.HttpsUpstreamPort);
        }
        if (source.IsGray != null) {
            this.IsGray = new Long(source.IsGray);
        }
        if (source.GrayAreas != null) {
            this.GrayAreas = new String[source.GrayAreas.length];
            for (int i = 0; i < source.GrayAreas.length; i++) {
                this.GrayAreas[i] = new String(source.GrayAreas[i]);
            }
        }
        if (source.UpstreamDomain != null) {
            this.UpstreamDomain = new String(source.UpstreamDomain);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
        }
        if (source.IsHttp2 != null) {
            this.IsHttp2 = new Long(source.IsHttp2);
        }
        if (source.HttpsRewrite != null) {
            this.HttpsRewrite = new Long(source.HttpsRewrite);
        }
        if (source.Ports != null) {
            this.Ports = new PortItem[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortItem(source.Ports[i]);
            }
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.IsKeepAlive != null) {
            this.IsKeepAlive = new String(source.IsKeepAlive);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Anycast != null) {
            this.Anycast = new Long(source.Anycast);
        }
        if (source.Weights != null) {
            this.Weights = new Long[source.Weights.length];
            for (int i = 0; i < source.Weights.length; i++) {
                this.Weights[i] = new Long(source.Weights[i]);
            }
        }
        if (source.ActiveCheck != null) {
            this.ActiveCheck = new Long(source.ActiveCheck);
        }
        if (source.TLSVersion != null) {
            this.TLSVersion = new Long(source.TLSVersion);
        }
        if (source.Ciphers != null) {
            this.Ciphers = new Long[source.Ciphers.length];
            for (int i = 0; i < source.Ciphers.length; i++) {
                this.Ciphers[i] = new Long(source.Ciphers[i]);
            }
        }
        if (source.CipherTemplate != null) {
            this.CipherTemplate = new Long(source.CipherTemplate);
        }
        if (source.ProxyReadTimeout != null) {
            this.ProxyReadTimeout = new Long(source.ProxyReadTimeout);
        }
        if (source.ProxySendTimeout != null) {
            this.ProxySendTimeout = new Long(source.ProxySendTimeout);
        }
        if (source.SniType != null) {
            this.SniType = new Long(source.SniType);
        }
        if (source.SniHost != null) {
            this.SniHost = new String(source.SniHost);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.XFFReset != null) {
            this.XFFReset = new Long(source.XFFReset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "IsWebsocket", this.IsWebsocket);
        this.setParamSimple(map, prefix + "LoadBalance", this.LoadBalance);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "UpstreamScheme", this.UpstreamScheme);
        this.setParamSimple(map, prefix + "HttpsUpstreamPort", this.HttpsUpstreamPort);
        this.setParamSimple(map, prefix + "IsGray", this.IsGray);
        this.setParamArraySimple(map, prefix + "GrayAreas.", this.GrayAreas);
        this.setParamSimple(map, prefix + "UpstreamDomain", this.UpstreamDomain);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamSimple(map, prefix + "IsHttp2", this.IsHttp2);
        this.setParamSimple(map, prefix + "HttpsRewrite", this.HttpsRewrite);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "IsKeepAlive", this.IsKeepAlive);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Anycast", this.Anycast);
        this.setParamArraySimple(map, prefix + "Weights.", this.Weights);
        this.setParamSimple(map, prefix + "ActiveCheck", this.ActiveCheck);
        this.setParamSimple(map, prefix + "TLSVersion", this.TLSVersion);
        this.setParamArraySimple(map, prefix + "Ciphers.", this.Ciphers);
        this.setParamSimple(map, prefix + "CipherTemplate", this.CipherTemplate);
        this.setParamSimple(map, prefix + "ProxyReadTimeout", this.ProxyReadTimeout);
        this.setParamSimple(map, prefix + "ProxySendTimeout", this.ProxySendTimeout);
        this.setParamSimple(map, prefix + "SniType", this.SniType);
        this.setParamSimple(map, prefix + "SniHost", this.SniHost);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "XFFReset", this.XFFReset);

    }
}

