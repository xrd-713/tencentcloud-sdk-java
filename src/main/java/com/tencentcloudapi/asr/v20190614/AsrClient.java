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
package com.tencentcloudapi.asr.v20190614;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.asr.v20190614.models.*;

public class AsrClient extends AbstractClient{
    private static String endpoint = "asr.tencentcloudapi.com";
    private static String service = "asr";
    private static String version = "2019-06-14";
    
    public AsrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AsrClient(Credential credential, String region, ClientProfile profile) {
        super(AsrClient.endpoint, AsrClient.version, credential, region, profile);
    }

    /**
     *本接口用于关闭语音流异步识别任务。
     * @param req CloseAsyncRecognitionTaskRequest
     * @return CloseAsyncRecognitionTaskResponse
     * @throws TencentCloudSDKException
     */
    public CloseAsyncRecognitionTaskResponse CloseAsyncRecognitionTask(CloseAsyncRecognitionTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseAsyncRecognitionTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CloseAsyncRecognitionTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CloseAsyncRecognitionTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过本接口进行热词表的创建。
<br>•   默认最多可创建30个热词表。
<br>•   每个热词表最多可添加128个词，每个词最长10个汉字或30个英文字符，不能超出限制。
<br>•   热词表可以通过数组或者本地文件形式上传。
<br>•   本地文件必须为UTF-8编码格式，每行仅添加一个热词且不能包含标点和特殊字符。
<br>•   热词权重取值范围为[1,10]之间的整数，权重越大代表该词被识别出来的概率越大。
     * @param req CreateAsrVocabRequest
     * @return CreateAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public CreateAsrVocabResponse CreateAsrVocab(CreateAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAsrVocabResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAsrVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAsrVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于对语音流进行准实时识别，通过异步回调来返回识别结果。适用于直播审核等场景。
<br>• 支持rtmp、rtsp等流媒体协议，以及各类基于http协议的直播流(不支持hls)
<br>• 音频流时长无限制，服务会自动拉取音频流数据，若连续10分钟拉不到流数据时，服务会终止识别任务
<br>• 服务通过回调的方式来提供识别结果，用户需要提供CallbackUrl。回调时机为一小段话(最长15秒)回调一次。
<br>• 签名方法参考 [公共参数](https://cloud.tencent.com/document/api/1093/35640) 中签名方法v3。
<br>• 默认单账号限制并发数为20路，如您有提高并发限制的需求，请提[工单](https://console.cloud.tencent.com/workorder/category)进行咨询。
     * @param req CreateAsyncRecognitionTaskRequest
     * @return CreateAsyncRecognitionTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAsyncRecognitionTaskResponse CreateAsyncRecognitionTask(CreateAsyncRecognitionTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAsyncRecognitionTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAsyncRecognitionTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAsyncRecognitionTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户使用该接口可以创建自学习模型，以供识别调用。

注意：调用该接口后，模型会自动训练。新建模型成功后，调用ModifyCustomizationState接口修改为上线状态，即可在识别请求中使用对应模型ID。
     * @param req CreateCustomizationRequest
     * @return CreateCustomizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomizationResponse CreateCustomization(CreateCustomizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口服务对时长5小时以内的录音文件进行识别，异步返回识别全部结果。
• 支持中文普通话、英语、粤语、日语、越南语、马来语、印度尼西亚语、菲律宾语、葡萄牙语、土耳其语、阿拉伯语、西班牙语、上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话。
• 支持wav、mp3、m4a、flv、mp4、wma、3gp、amr、aac、ogg-opus、flac格式。
• 支持语音 URL 和本地语音文件两种请求方式。语音 URL 的音频时长不能长于5小时，文件大小不超过1GB。本地语音文件调用不能大于5MB。推荐使用 [ 腾讯云COS](https://cloud.tencent.com/document/product/436/38484) 来存储&生成URL提交任务，无外网&流量下行费用，节约成本、提升任务速度。(COS桶权限需要设置公有读私有写，或URL设置外部可访问)
• 提交录音文件识别请求后，在3小时内完成识别（大多数情况下1小时音频约3分钟以内完成识别，半小时内发送超过1000小时录音或者2万条识别任务的除外），识别结果在服务端可保存7天。
• 支持回调或轮询的方式获取结果，结果获取请参考[ 录音文件识别结果查询](https://cloud.tencent.com/document/product/1093/37822)。
•   生成字幕场景可设置参数ResTextFormat为3，解析ResultDetail结构生成字幕，可参考 [生成字幕最佳实践](https://cloud.tencent.com/document/product/1093/84291)。
•   签名方法参考 [公共参数](https://cloud.tencent.com/document/api/1093/35640) 中签名方法v3。
• 默认接口请求频率限制：20次/秒。
     * @param req CreateRecTaskRequest
     * @return CreateRecTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecTaskResponse CreateRecTask(CreateRecTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过本接口进行热词表的删除。
     * @param req DeleteAsrVocabRequest
     * @return DeleteAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAsrVocabResponse DeleteAsrVocab(DeleteAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAsrVocabResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAsrVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAsrVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口可以删除自学习模型
     * @param req DeleteCustomizationRequest
     * @return DeleteCustomizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomizationResponse DeleteCustomization(DeleteCustomizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询当前在运行的语音流异步识别任务列表。
<br>•   签名方法参考 [公共参数](https://cloud.tencent.com/document/api/1093/35640) 中签名方法v3。
     * @param req DescribeAsyncRecognitionTasksRequest
     * @return DescribeAsyncRecognitionTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRecognitionTasksResponse DescribeAsyncRecognitionTasks(DescribeAsyncRecognitionTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAsyncRecognitionTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAsyncRecognitionTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAsyncRecognitionTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在调用录音文件识别请求接口后，有回调和轮询两种方式获取识别结果。
<br>• 当采用回调方式时，识别完成后会将结果通过 POST 请求的形式通知到用户在请求时填写的回调 URL，具体请参见[ 录音识别结果回调 ](https://cloud.tencent.com/document/product/1093/52632)。
<br>• 当采用轮询方式时，需要主动提交任务ID来轮询识别结果，共有任务成功、等待、执行中和失败四种结果，具体信息请参见下文说明。
<br>•   请求方法为 HTTP POST , Content-Type为"application/json; charset=utf-8"
<br>•   签名方法参考 [公共参数](https://cloud.tencent.com/document/api/1093/35640) 中签名方法v3。
<br>•   默认接口请求频率限制：50次/秒，如您有提高请求频率限制的需求，请提[工单](https://console.cloud.tencent.com/workorder/category)进行咨询。
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过本接口进行热词表的下载，获得词表权重文件形式的 base64 值，文件形式为通过 “|” 分割的词和权重，即 word|weight 的形式。
     * @param req DownloadAsrVocabRequest
     * @return DownloadAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public DownloadAsrVocabResponse DownloadAsrVocab(DownloadAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadAsrVocabResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadAsrVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadAsrVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口可以下载自学习模型的语料
     * @param req DownloadCustomizationRequest
     * @return DownloadCustomizationResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCustomizationResponse DownloadCustomization(DownloadCustomizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadCustomizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadCustomizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadCustomization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户根据词表的ID可以获取对应的热词表信息
     * @param req GetAsrVocabRequest
     * @return GetAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public GetAsrVocabResponse GetAsrVocab(GetAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAsrVocabResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetAsrVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAsrVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口，可获得所有的热词表及其信息。
     * @param req GetAsrVocabListRequest
     * @return GetAsrVocabListResponse
     * @throws TencentCloudSDKException
     */
    public GetAsrVocabListResponse GetAsrVocabList(GetAsrVocabListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAsrVocabListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetAsrVocabListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAsrVocabList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询自学习模型列表
     * @param req GetCustomizationListRequest
     * @return GetCustomizationListResponse
     * @throws TencentCloudSDKException
     */
    public GetCustomizationListResponse GetCustomizationList(GetCustomizationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCustomizationListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetCustomizationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCustomizationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过自学习模型id获取自学习模型详细信息
     * @param req GetModelInfoRequest
     * @return GetModelInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetModelInfoResponse GetModelInfo(GetModelInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetModelInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetModelInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetModelInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口可以更新自学习模型，如模型名称、模型类型、模型语料。
     * @param req ModifyCustomizationRequest
     * @return ModifyCustomizationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizationResponse ModifyCustomization(ModifyCustomizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过该接口，用户可以修改自学习模型状态，上下线自学习模型
     * @param req ModifyCustomizationStateRequest
     * @return ModifyCustomizationStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizationStateResponse ModifyCustomizationState(ModifyCustomizationStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomizationStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomizationStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomizationState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于对60秒之内的短音频文件进行识别。<br>•   支持中文普通话、英语、粤语、日语、越南语、马来语、印度尼西亚语、菲律宾语、泰语、葡萄牙语、土耳其语、阿拉伯语、上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话。<br>•   支持本地语音文件上传和语音URL上传两种请求方式，音频时长不能超过60s，音频文件大小不能超过3MB。<br>•   音频格式支持wav、pcm、ogg-opus、speex、silk、mp3、m4a、aac。<br>•   请求方法为 HTTP POST , Content-Type为"application/json; charset=utf-8"<br>•   签名方法参考 [公共参数](https://cloud.tencent.com/document/api/1093/35640) 中签名方法v3。<br>•   默认接口请求频率限制：30次/秒，如您有提高请求频率限制的需求，请[前往购买](https://buy.cloud.tencent.com/asr)。
     * @param req SentenceRecognitionRequest
     * @return SentenceRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public SentenceRecognitionResponse SentenceRecognition(SentenceRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceRecognitionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceRecognitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SentenceRecognition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口可以设置热词表的默认状态。初始状态为0，用户可设置状态为1，即为默认状态。默认状态表示用户在请求识别时，如不设置热词表ID，则默认使用状态为1的热词表。
     * @param req SetVocabStateRequest
     * @return SetVocabStateResponse
     * @throws TencentCloudSDKException
     */
    public SetVocabStateResponse SetVocabState(SetVocabStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetVocabStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetVocabStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetVocabState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过本接口进行对应的词表信息更新。
     * @param req UpdateAsrVocabRequest
     * @return UpdateAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAsrVocabResponse UpdateAsrVocab(UpdateAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAsrVocabResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAsrVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAsrVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计并返回注册的说话人id总数
     * @param req VoicePrintCountRequest
     * @return VoicePrintCountResponse
     * @throws TencentCloudSDKException
     */
    public VoicePrintCountResponse VoicePrintCount(VoicePrintCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VoicePrintCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VoicePrintCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VoicePrintCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于以删除已经注册的说话人信息（删除之后，原有的说话人ID和说话人音频数据都会失效）
     * @param req VoicePrintDeleteRequest
     * @return VoicePrintDeleteResponse
     * @throws TencentCloudSDKException
     */
    public VoicePrintDeleteResponse VoicePrintDelete(VoicePrintDeleteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VoicePrintDeleteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VoicePrintDeleteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VoicePrintDelete");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *说话人注册接口用于注册一个指定音频，生成一个唯一的说话人id，后续可通过说话人验证接口验证其它音频和已有的说话人ID匹配度，注册时可指定说话人昵称，方便标识说话人ID，  说话人昵称可重复配置。 
（注: 一个appid最多可以注册1000个说话人ID，一个说话人ID仅支持一条音频注册，后续可通过更新接口进行更新）

使用须知
支持的输入格式：编码文件(PCM, WAV)、16 bit采样位数、单声道（mono）。

支持的音频采样率：16000 Hz。
     * @param req VoicePrintEnrollRequest
     * @return VoicePrintEnrollResponse
     * @throws TencentCloudSDKException
     */
    public VoicePrintEnrollResponse VoicePrintEnroll(VoicePrintEnrollRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VoicePrintEnrollResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VoicePrintEnrollResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VoicePrintEnroll");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于更新和覆盖已注册的音频数据和说话人昵称，更新后原有的音频数据将失效。
     * @param req VoicePrintUpdateRequest
     * @return VoicePrintUpdateResponse
     * @throws TencentCloudSDKException
     */
    public VoicePrintUpdateResponse VoicePrintUpdate(VoicePrintUpdateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VoicePrintUpdateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VoicePrintUpdateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VoicePrintUpdate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验传入音频与已注册音频的匹配程度，通过指定说话人ID（VoicePrintId）和一段音频进行音频和说话人的匹配度判断
     * @param req VoicePrintVerifyRequest
     * @return VoicePrintVerifyResponse
     * @throws TencentCloudSDKException
     */
    public VoicePrintVerifyResponse VoicePrintVerify(VoicePrintVerifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VoicePrintVerifyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VoicePrintVerifyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VoicePrintVerify");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
