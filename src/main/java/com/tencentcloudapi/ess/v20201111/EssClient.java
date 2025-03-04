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
package com.tencentcloudapi.ess.v20201111;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ess.v20201111.models.*;

public class EssClient extends AbstractClient{
    private static String endpoint = "ess.tencentcloudapi.com";
    private static String service = "ess";
    private static String version = "2020-11-11";
    
    public EssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EssClient(Credential credential, String region, ClientProfile profile) {
        super(EssClient.endpoint, EssClient.version, credential, region, profile);
    }

    /**
     *将电子签系统员工userId与客户系统员工openId进行绑定
     * @param req BindEmployeeUserIdWithClientOpenIdRequest
     * @return BindEmployeeUserIdWithClientOpenIdResponse
     * @throws TencentCloudSDKException
     */
    public BindEmployeeUserIdWithClientOpenIdResponse BindEmployeeUserIdWithClientOpenId(BindEmployeeUserIdWithClientOpenIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEmployeeUserIdWithClientOpenIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindEmployeeUserIdWithClientOpenIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindEmployeeUserIdWithClientOpenId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于撤销签署流程
适用场景：如果某个合同流程当前至少还有一方没有签署，则可通过该接口取消该合同流程。常用于合同发错、内容填错，需要及时撤销的场景。
注：如果合同流程中的参与方均已签署完毕，则无法通过该接口撤销合同。
     * @param req CancelFlowRequest
     * @return CancelFlowResponse
     * @throws TencentCloudSDKException
     */
    public CancelFlowResponse CancelFlow(CancelFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CancelMultiFlowSignQRCode）用于取消一码多扫二维码。该接口对传入的二维码ID，若还在有效期内，可以提前失效。
     * @param req CancelMultiFlowSignQRCodeRequest
     * @return CancelMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public CancelMultiFlowSignQRCodeResponse CancelMultiFlowSignQRCode(CancelMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CancelUserAutoSignEnableUrl）用来撤销发送给个人用户的自动签开通链接，撤销后对应的个人用户开通链接失效。若个人用户已经完成开通，将无法撤销。（处方单场景专用，使用此接口请与客户经理确认）
     * @param req CancelUserAutoSignEnableUrlRequest
     * @return CancelUserAutoSignEnableUrlResponse
     * @throws TencentCloudSDKException
     */
    public CancelUserAutoSignEnableUrlResponse CancelUserAutoSignEnableUrl(CancelUserAutoSignEnableUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelUserAutoSignEnableUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelUserAutoSignEnableUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelUserAutoSignEnableUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *注：此接口将会废弃，请使用撤销单个签署流程（CancelFlow）接口。
指定需要批量撤回的签署流程Id，获取批量撤销链接。
客户指定需要撤回的签署流程Id，最多100个，超过100不处理；接口调用成功返回批量撤回合同的链接，通过链接跳转到电子签小程序完成批量撤回。
     * @param req CreateBatchCancelFlowUrlRequest
     * @return CreateBatchCancelFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchCancelFlowUrlResponse CreateBatchCancelFlowUrl(CreateBatchCancelFlowUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBatchCancelFlowUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBatchCancelFlowUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBatchCancelFlowUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据产品要求，调整接口目录

新接口：ChannelCreateOrganizationModifyQrCode 

老接口目前无线上流量，测试用例已下线处理

生成子客编辑企业信息二维码
     * @param req CreateChannelSubOrganizationModifyQrCodeRequest
     * @return CreateChannelSubOrganizationModifyQrCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelSubOrganizationModifyQrCodeResponse CreateChannelSubOrganizationModifyQrCode(CreateChannelSubOrganizationModifyQrCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateChannelSubOrganizationModifyQrCodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateChannelSubOrganizationModifyQrCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateChannelSubOrganizationModifyQrCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传了word、excel、图片文件后，通过该接口发起文件转换任务，将word、excel、图片文件转换为pdf文件。
     * @param req CreateConvertTaskApiRequest
     * @return CreateConvertTaskApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateConvertTaskApiResponse CreateConvertTaskApi(CreateConvertTaskApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConvertTaskApiResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConvertTaskApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConvertTaskApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建签署流程电子文档
适用场景：见创建签署流程接口。
注：该接口需要给对应的流程指定一个模板id，并且填充该模板中需要补充的信息。是“发起流程”接口的前置接口。
     * @param req CreateDocumentRequest
     * @return CreateDocumentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocumentResponse CreateDocument(CreateDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDocumentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateEmbedWebUrl）用于创建嵌入web的链接 本接口支持创建：创建印章，创建模板，修改模板，预览模板，预览合同流程的web链接 进入web连接后与当前控制台操作保持一致
     * @param req CreateEmbedWebUrlRequest
     * @return CreateEmbedWebUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmbedWebUrlResponse CreateEmbedWebUrl(CreateEmbedWebUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEmbedWebUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEmbedWebUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEmbedWebUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过模板创建签署流程<br/>
适用场景：在标准制式的合同场景中，可通过提前预制好模板文件，每次调用模板文件的id，补充合同内容信息及签署信息生成电子合同。<br/>
注：该接口是通过模板生成合同流程的前置接口，先创建一个不包含签署文件的流程。<br/>
配合“创建电子文档”接口和“发起流程”接口使用。<br/>
     * @param req CreateFlowRequest
     * @return CreateFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowResponse CreateFlow(CreateFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *### 适用场景
在通过模板或者文件发起合同时，若未指定企业签署人信息，则流程发起后，可以调用此接口补充或签签署人。
同一签署人可以补充多个员工作为或签签署人,最终实际签署人取决于谁先领取合同完成签署。
### 限制条件
-  本企业(发起方企业)支持通过企业微信UserId 或者 姓名+手机号补充
- 他方企业仅支持通过姓名+手机号补充
     * @param req CreateFlowApproversRequest
     * @return CreateFlowApproversResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowApproversResponse CreateFlowApprovers(CreateFlowApproversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowApproversResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowApproversResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowApprovers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateFlowByFiles）用来通过上传后的pdf资源编号来创建待签署的合同流程。<br/>
适用场景1：适用非制式的合同文件签署。一般开发者自己有完整的签署文件，可以通过该接口传入完整的PDF文件及流程信息生成待签署的合同流程。<br/>
适用场景2：可通过该接口传入制式合同文件，同时在指定位置添加签署控件。可以起到接口创建临时模板的效果。如果是标准的制式文件，建议使用模板功能生成模板ID进行合同流程的生成。<br/>
注意事项：该接口需要依赖“多文件上传”接口生成pdf资源编号（FileIds）进行使用。<br/>
     * @param req CreateFlowByFilesRequest
     * @return CreateFlowByFilesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowByFilesResponse CreateFlowByFiles(CreateFlowByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowByFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowByFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowByFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建出证报告，返回报告 ID。需要配合出证套餐才能调用。
出证需要一定时间，建议调用创建出证24小时之后再通过DescribeFlowEvidenceReport进行查询。
     * @param req CreateFlowEvidenceReportRequest
     * @return CreateFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowEvidenceReportResponse CreateFlowEvidenceReport(CreateFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateFlowGroupByFiles）通过多文件创建合同组签署流程。<br/>
PDF资源Id 通过上传文件接口获取
此接口合同组中的子合同必须都是文件发起的合同
     * @param req CreateFlowGroupByFilesRequest
     * @return CreateFlowGroupByFilesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowGroupByFilesResponse CreateFlowGroupByFiles(CreateFlowGroupByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowGroupByFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowGroupByFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowGroupByFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateFlowGroupByTemplates）通过多模板创建合同组签署流程。<br/>
此接口合同组中的子合同必须都是模板发起的合同。 <br/>目前最大仅支持50个子合同
     * @param req CreateFlowGroupByTemplatesRequest
     * @return CreateFlowGroupByTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowGroupByTemplatesResponse CreateFlowGroupByTemplates(CreateFlowGroupByTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowGroupByTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowGroupByTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowGroupByTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *指定需要批量催办的签署流程Id，批量催办合同，最多100个; 接口失败后返回错误信息
注意:
该接口不可直接调用，请联系客户经理申请使用
仅能催办当前状态为“待签署”的签署人，且只能催办一次
发起合同时，签署人的NotifyType需设置为sms，否则无法催办
     * @param req CreateFlowRemindsRequest
     * @return CreateFlowRemindsResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowRemindsResponse CreateFlowReminds(CreateFlowRemindsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowRemindsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowRemindsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowReminds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交企业签署流程审批结果
适用场景: 
在通过接口(CreateFlow 或者CreateFlowByFiles)创建签署流程时，若指定了参数 NeedSignReview 为true，且发起方企业作为签署方参与了流程签署，则可以调用此接口提交企业内部签署审批结果。
若签署流程状态正常，且本企业存在签署方未签署，同一签署流程可以多次提交签署审批结果，签署时的最后一个“审批结果”有效。
     * @param req CreateFlowSignReviewRequest
     * @return CreateFlowSignReviewResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowSignReviewResponse CreateFlowSignReview(CreateFlowSignReviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowSignReviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowSignReviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowSignReview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建个人H5签署链接，请联系客户经理申请开通使用, 否则调用会返回失败 <br/>

该接口用于发起合同后，生成个人签署人的签署链接, 暂时不支持企业端签署 <br/>

注意：该接口目前签署人类型仅支持个人签署方（PERSON） <br/>
注意：该接口可生成签署链接的C端签署人必须仅有手写签名和时间类型的签署控件<br/>
注意：该接口返回的签署链接是用于APP集成的场景，支持APP打开或浏览器直接打开，不支持微信小程序嵌入。微信小程序请使用小程序跳转或半屏弹窗的方式<br/>
     * @param req CreateFlowSignUrlRequest
     * @return CreateFlowSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowSignUrlResponse CreateFlowSignUrl(CreateFlowSignUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowSignUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowSignUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowSignUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口，创建企业的部门，支持绑定客户系统部门ID。
     * @param req CreateIntegrationDepartmentRequest
     * @return CreateIntegrationDepartmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationDepartmentResponse CreateIntegrationDepartment(CreateIntegrationDepartmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationDepartmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationDepartmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationDepartment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建员工,此接口会发送提醒员工实名的短信，如果通过手机号发现员工已经创建，则不会重新创建，会发送短信提醒员工实名
注意：此接口支持企微组织架构的 openid 创建员工，这种场景下传递明文的企微 openid 到WeworkOpenId字段即可（企微明文的 openid 一定要在应用的可见范围内才行），通过企微创建的员工，会发送企微消息去提醒实名
     * @param req CreateIntegrationEmployeesRequest
     * @return CreateIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationEmployeesResponse CreateIntegrationEmployees(CreateIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定员工与对应角色
     * @param req CreateIntegrationUserRolesRequest
     * @return CreateIntegrationUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationUserRolesResponse CreateIntegrationUserRoles(CreateIntegrationUserRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationUserRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationUserRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationUserRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateMultiFlowSignQRCode）用于创建一码多扫流程签署二维码。
适用场景：无需填写签署人信息，可通过模板id生成签署二维码，签署人可通过扫描二维码补充签署信息进行实名签署。常用于提前不知道签署人的身份信息场景，例如：劳务工招工、大批量员工入职等场景。

**本接口适用于发起方没有填写控件的 B2C或者单C模板**

**若是B2C模板,还要满足以下任意一个条件**
- 模板中配置的签署顺序是无序
- B端企业的签署方式是静默签署
- B端企业是非首位签署

 通过一码多扫二维码发起的合同，涉及到的合同回调消息可参考文档[合同发起以及签署相关回调](https://qian.tencent.com/developers/company/callback_types_contracts_sign)

用户通过签署二维码发起合同时，因企业额度不足导致失败 会触发签署二维码相关回调,具体参考文档[签署二维码相关回调](https://qian.tencent.com/developers/company/callback_types_commons#%E7%AD%BE%E7%BD%B2%E4%BA%8C%E7%BB%B4%E7%A0%81%E7%9B%B8%E5%85%B3%E5%9B%9E%E8%B0%83)
     * @param req CreateMultiFlowSignQRCodeRequest
     * @return CreateMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiFlowSignQRCodeResponse CreateMultiFlowSignQRCode(CreateMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口，创建企业批量签署链接，企业员工点击链接即可跳转控制台进行批量签署。
如果没有UserId，Name和Mobile必填，对应的员工必须在企业下已经实名，且该员工为批量签署合同中的签署方。
     * @param req CreateOrganizationBatchSignUrlRequest
     * @return CreateOrganizationBatchSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationBatchSignUrlResponse CreateOrganizationBatchSignUrl(CreateOrganizationBatchSignUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationBatchSignUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationBatchSignUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrganizationBatchSignUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreatePersonAuthCertificateImage）用于创建个人用户证书证明图片
     * @param req CreatePersonAuthCertificateImageRequest
     * @return CreatePersonAuthCertificateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonAuthCertificateImageResponse CreatePersonAuthCertificateImage(CreatePersonAuthCertificateImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonAuthCertificateImageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonAuthCertificateImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePersonAuthCertificateImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建快速发起流程
<br/>适用场景：用户通过API 合同文件及签署信息，并可通过我们返回的URL在页面完成签署控件等信息的编辑与确认，快速发起合同.
<br/>注：该接口文件的resourceId 是通过上传文件之后获取的。
     * @param req CreatePrepareFlowRequest
     * @return CreatePrepareFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrepareFlowResponse CreatePrepareFlow(CreatePrepareFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrepareFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrepareFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrepareFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreatePreparedPersonalEsign）用于创建导入个人印章（处方单场景专用，使用此接口请与客户经理确认）。
     * @param req CreatePreparedPersonalEsignRequest
     * @return CreatePreparedPersonalEsignResponse
     * @throws TencentCloudSDKException
     */
    public CreatePreparedPersonalEsignResponse CreatePreparedPersonalEsign(CreatePreparedPersonalEsignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePreparedPersonalEsignResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePreparedPersonalEsignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePreparedPersonalEsign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起解除协议，主要应用场景为：基于一份已经签署的合同(签署流程)，进行解除操作。
     * @param req CreateReleaseFlowRequest
     * @return CreateReleaseFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseFlowResponse CreateReleaseFlow(CreateReleaseFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReleaseFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReleaseFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReleaseFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取小程序签署链接

适用场景：如果需要签署人在自己的APP、小程序、H5应用中签署，可以通过此接口获取跳转腾讯电子签小程序的签署跳转链接。

注：如果签署人是在PC端扫码签署，可以通过生成跳转链接自主转换成二维码，让签署人在PC端扫码签署。


跳转到小程序的实现，参考官方文档（分为<a href="https://developers.weixin.qq.com/miniprogram/dev/api/navigate/wx.navigateToMiniProgram.html">全屏</a>、<a href="https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/openEmbeddedMiniProgram.html">半屏</a>两种方式）


如您需要自主配置小程序跳转链接，请参考: <a href="https://cloud.tencent.com/document/product/1323/74774">跳转小程序链接配置说明</a>
     * @param req CreateSchemeUrlRequest
     * @return CreateSchemeUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchemeUrlResponse CreateSchemeUrl(CreateSchemeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSchemeUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSchemeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSchemeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSeal）用于创建企业电子印章，支持创建企业公章，合同章，财务专用章和人事专用章创建。
     * @param req CreateSealRequest
     * @return CreateSealResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealResponse CreateSeal(CreateSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSealResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对企业员工进行印章授权
     * @param req CreateSealPolicyRequest
     * @return CreateSealPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealPolicyResponse CreateSealPolicy(CreateSealPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSealPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSealPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSealPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口获取个人用户开启自动签的跳转链接（处方单场景专用，使用此接口请与客户经理确认）
     * @param req CreateUserAutoSignEnableUrlRequest
     * @return CreateUserAutoSignEnableUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserAutoSignEnableUrlResponse CreateUserAutoSignEnableUrl(CreateUserAutoSignEnableUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserAutoSignEnableUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserAutoSignEnableUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserAutoSignEnableUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用来创建页面主题配置
     * @param req CreateWebThemeConfigRequest
     * @return CreateWebThemeConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebThemeConfigResponse CreateWebThemeConfig(CreateWebThemeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWebThemeConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWebThemeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWebThemeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口，删除企业的部门。
     * @param req DeleteIntegrationDepartmentRequest
     * @return DeleteIntegrationDepartmentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationDepartmentResponse DeleteIntegrationDepartment(DeleteIntegrationDepartmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationDepartmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationDepartmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationDepartment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移除员工
这里分两个场景
如果不传交接人的ReceiveUserId或者ReceiveOpenId，则会直接把这个人进行离职
如果传了交接人，会把离职人未处理完的合同交接给交接人后再离职
     * @param req DeleteIntegrationEmployeesRequest
     * @return DeleteIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationEmployeesResponse DeleteIntegrationEmployees(DeleteIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑员工与对应角色关系
     * @param req DeleteIntegrationRoleUsersRequest
     * @return DeleteIntegrationRoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationRoleUsersResponse DeleteIntegrationRoleUsers(DeleteIntegrationRoleUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationRoleUsersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationRoleUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationRoleUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤销员工持有的印章权限
     * @param req DeleteSealPoliciesRequest
     * @return DeleteSealPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSealPoliciesResponse DeleteSealPolicies(DeleteSealPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSealPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSealPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSealPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业扩展服务授权信息，目前支持查询：企业静默签，企业与港澳台居民签署合同，使用手机号验证签署方身份，骑缝章，批量签署能力是否已经开通
     * @param req DescribeExtendedServiceAuthInfosRequest
     * @return DescribeExtendedServiceAuthInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtendedServiceAuthInfosResponse DescribeExtendedServiceAuthInfos(DescribeExtendedServiceAuthInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExtendedServiceAuthInfosResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExtendedServiceAuthInfosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExtendedServiceAuthInfos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文件下载URL。
适用场景：通过传参合同流程编号，下载对应的合同PDF文件流到本地。
     * @param req DescribeFileUrlsRequest
     * @return DescribeFileUrlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileUrlsResponse DescribeFileUrls(DescribeFileUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileUrlsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流程基础信息
适用场景：可用于主动查询某个合同流程的签署状态信息。可以配合回调通知使用。
每个企业限制日调用量限制：100W，当日超过此限制后再调用接口返回错误
     * @param req DescribeFlowBriefsRequest
     * @return DescribeFlowBriefsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowBriefsResponse DescribeFlowBriefs(DescribeFlowBriefsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowBriefsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowBriefsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowBriefs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流程填写控件内容，可以根据流程Id查询该流程相关联的填写控件信息和填写内容。
     * @param req DescribeFlowComponentsRequest
     * @return DescribeFlowComponentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowComponentsResponse DescribeFlowComponents(DescribeFlowComponentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowComponentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowComponentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowComponents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询出证报告，返回报告 URL。出证报告编号通过CreateFlowEvidenceReport接口获取。
     * @param req DescribeFlowEvidenceReportRequest
     * @return DescribeFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowEvidenceReportResponse DescribeFlowEvidenceReport(DescribeFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询合同详情
适用场景：可用于主动查询某个合同详情信息。
     * @param req DescribeFlowInfoRequest
     * @return DescribeFlowInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowInfoResponse DescribeFlowInfo(DescribeFlowInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询本企业模板列表。

当模板较多或模板中的控件较多时，可以通过查询模板接口更方便的获取模板列表，以及每个模板内的控件信息。

> **适用场景** 
>
>  该接口常用来配合“模板发起合同-创建电子文档”接口作为前置的接口使用。 
>  一个模板通常会包含以下结构信息
>- 模板基本信息
>- 发起方参与信息Promoter、签署参与方 Recipients，后者会在模板发起合同时用于指定参与方
>- 填写控件 Components
>- 签署控件 SignComponents
>- 生成模板的文件基础信息 FileInfos
     * @param req DescribeFlowTemplatesRequest
     * @return DescribeFlowTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowTemplatesResponse DescribeFlowTemplates(DescribeFlowTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口，查询企业的部门，支持查询单个部门节点或单个部门节点及一级子节点部门列表。
     * @param req DescribeIntegrationDepartmentsRequest
     * @return DescribeIntegrationDepartmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationDepartmentsResponse DescribeIntegrationDepartments(DescribeIntegrationDepartmentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationDepartmentsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationDepartmentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationDepartments");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业员工列表，每次返回的数据量最大为20
     * @param req DescribeIntegrationEmployeesRequest
     * @return DescribeIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationEmployeesResponse DescribeIntegrationEmployees(DescribeIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集团企业统一使用主代子进行操作，无需根据子企业账号进行转化查询，该接口需要屏蔽下线

通过子企业影子账号查询主企业员工账号
     * @param req DescribeIntegrationMainOrganizationUserRequest
     * @return DescribeIntegrationMainOrganizationUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationMainOrganizationUserResponse DescribeIntegrationMainOrganizationUser(DescribeIntegrationMainOrganizationUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationMainOrganizationUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationMainOrganizationUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationMainOrganizationUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询企业角色列表，法人的角色是系统保留角色，不会返回，按照角色创建时间升序排列
     * @param req DescribeIntegrationRolesRequest
     * @return DescribeIntegrationRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationRolesResponse DescribeIntegrationRoles(DescribeIntegrationRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationRolesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此API接口用户查询加入集团的成员企业
     * @param req DescribeOrganizationGroupOrganizationsRequest
     * @return DescribeOrganizationGroupOrganizationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationGroupOrganizationsResponse DescribeOrganizationGroupOrganizations(DescribeOrganizationGroupOrganizationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationGroupOrganizationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationGroupOrganizationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationGroupOrganizations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业印章的列表，需要操作者具有查询印章权限
客户指定需要获取的印章数量和偏移量，数量最多100，超过100按100处理；入参InfoType控制印章是否携带授权人信息，为1则携带，为0则返回的授权人信息为空数组。接口调用成功返回印章的信息列表还有企业印章的总数。
     * @param req DescribeOrganizationSealsRequest
     * @return DescribeOrganizationSealsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationSealsResponse DescribeOrganizationSeals(DescribeOrganizationSealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationSealsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationSealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationSeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过AuthCode查询用户是否实名
     * @param req DescribeThirdPartyAuthCodeRequest
     * @return DescribeThirdPartyAuthCodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdPartyAuthCodeResponse DescribeThirdPartyAuthCode(DescribeThirdPartyAuthCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeThirdPartyAuthCodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeThirdPartyAuthCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeThirdPartyAuthCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口查询个人用户自动签开启状态。（处方单场景专用，使用此接口请与客户经理确认）
     * @param req DescribeUserAutoSignStatusRequest
     * @return DescribeUserAutoSignStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserAutoSignStatusResponse DescribeUserAutoSignStatus(DescribeUserAutoSignStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserAutoSignStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserAutoSignStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserAutoSignStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口关闭个人的自动签功能（处方单场景专用，使用此接口请与客户经理确认）
     * @param req DisableUserAutoSignRequest
     * @return DisableUserAutoSignResponse
     * @throws TencentCloudSDKException
     */
    public DisableUserAutoSignResponse DisableUserAutoSign(DisableUserAutoSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableUserAutoSignResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DisableUserAutoSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableUserAutoSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询转换任务的状态。转换任务Id通过发起转换任务接口（CreateConvertTaskApi）获取。
注意：大文件转换所需的时间可能会比较长。
     * @param req GetTaskResultApiRequest
     * @return GetTaskResultApiResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskResultApiResponse GetTaskResultApi(GetTaskResultApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTaskResultApiResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetTaskResultApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTaskResultApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增/删除应用callbackinfo
callbackinfo包含： 回调地址和签名key
操作：新增/删除
     * @param req ModifyApplicationCallbackInfoRequest
     * @return ModifyApplicationCallbackInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationCallbackInfoResponse ModifyApplicationCallbackInfo(ModifyApplicationCallbackInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationCallbackInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationCallbackInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationCallbackInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口，更新企业的部门信息，支持更新部门名、客户系统部门ID、部门序列号。
     * @param req ModifyIntegrationDepartmentRequest
     * @return ModifyIntegrationDepartmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIntegrationDepartmentResponse ModifyIntegrationDepartment(ModifyIntegrationDepartmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIntegrationDepartmentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIntegrationDepartmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIntegrationDepartment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于发起流程
适用场景：见创建签署流程接口。
注：该接口是“创建电子文档”接口的后置接口，用于激活包含完整合同信息（模板及内容信息）的流程。激活后的流程就是一份待签署的电子合同。
     * @param req StartFlowRequest
     * @return StartFlowResponse
     * @throws TencentCloudSDKException
     */
    public StartFlowResponse StartFlow(StartFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartFlowResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将存在绑定关系的电子签系统员工userId与客户系统员工openId进行解绑
     * @param req UnbindEmployeeUserIdWithClientOpenIdRequest
     * @return UnbindEmployeeUserIdWithClientOpenIdResponse
     * @throws TencentCloudSDKException
     */
    public UnbindEmployeeUserIdWithClientOpenIdResponse UnbindEmployeeUserIdWithClientOpenId(UnbindEmployeeUserIdWithClientOpenIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindEmployeeUserIdWithClientOpenIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindEmployeeUserIdWithClientOpenIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindEmployeeUserIdWithClientOpenId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新员工信息(姓名，手机号，邮件、部门)，用户实名后无法更改姓名与手机号。
可进行批量操作，Employees中的userID与openID二选一必填
     * @param req UpdateIntegrationEmployeesRequest
     * @return UpdateIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIntegrationEmployeesResponse UpdateIntegrationEmployees(UpdateIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（UploadFiles）用于文件上传。<br/>
适用场景：用于生成pdf资源编号（FileIds）来配合“用PDF创建流程”接口使用，使用场景可详见“用PDF创建流程”接口说明。<br/>

其中上传的文件，图片类型(png/jpg/jpeg)大小限制为5M，其他大小限制为60M。<br/>
调用时需要设置Domain/接口请求域名为 file.ess.tencent.cn,代码示例：<br/>
HttpProfile httpProfile = new HttpProfile();<br/>
httpProfile.setEndpoint("file.test.ess.tencent.cn");<br/>
     * @param req UploadFilesRequest
     * @return UploadFilesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesResponse UploadFiles(UploadFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对流程的合同文件进行数字签名验证，判断文件是否被篡改。
     * @param req VerifyPdfRequest
     * @return VerifyPdfResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPdfResponse VerifyPdf(VerifyPdfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyPdfResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyPdfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyPdf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
