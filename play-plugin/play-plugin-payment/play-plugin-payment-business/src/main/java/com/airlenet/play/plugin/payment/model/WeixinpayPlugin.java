package com.airlenet.play.plugin.payment.model;

import com.airlenet.plugin.core.config.PluginConfigEntity;
import org.springframework.stereotype.Component;

/**
 * https://pay.weixin.qq.com/wiki/doc/api/app/app_jw.php?chapter=3_1
 *
 * @author airlenet
 * @version 2017-12-19
 */
@Component("weixinpayPlugin")
public class WeixinpayPlugin extends PaymentPlugin{
    public static final String APP_ID_ATTRIBUTE_NAME = "APPID";

    public static final String MCH_ID_ATTRIBUTE_NAME = "mch_id";

    public static final String APP_SECRET_ATTRIBUTE_NAME = "APP_SECRET";

    public static final String API_KEY_ATTRIBUTE_NAME = "API_KEY";
    /**
     * 获取客户端ID
     *
     * @return
     */
    public String getAppId() {
        PluginConfigEntity pluginConfig = getPluginConfig();
        return pluginConfig != null ? pluginConfig.getAttribute(APP_ID_ATTRIBUTE_NAME) : null;
    }

    /**
     * AppSecret是APPID对应的接口密码，用于获取接口调用凭证access_token时使用。
     *
     * @return
     */
    public String getAppSecret() {
        PluginConfigEntity pluginConfig = getPluginConfig();
        return pluginConfig != null ? pluginConfig.getAttribute(APP_SECRET_ATTRIBUTE_NAME) : null;
    }

    /**
     * 交易过程生成签名的密钥，仅保留在商户系统和微信支付后台，不会在网络中传播。商户妥善保管该Key，切勿在网络中传输，不能在其他客户端中存储，保证key不会被泄漏。商户可根据邮件提示登录微信商户平台进行设置。也可按一下路径设置：微信商户平台(pay.weixin.qq.com)-->账户设置-->API安全-->密钥设置
     * @return
     */
    public String getApiKey() {
        PluginConfigEntity pluginConfig = getPluginConfig();
        return pluginConfig != null ? pluginConfig.getAttribute(API_KEY_ATTRIBUTE_NAME) : null;
    }

    /**
     * 微信支付商户号
     *商户申请微信支付后，由微信支付分配的商户收款账号。
     * @return
     */
    public String getMchId() {
        PluginConfigEntity pluginConfig = getPluginConfig();
        return pluginConfig != null ? pluginConfig.getAttribute(MCH_ID_ATTRIBUTE_NAME) : null;
    }

    /**
     * 支付网关（固定）
     * @return
     */
    public String getPayGateway(){
        return "https://api.mch.weixin.qq.com";
    }

    @Override
    public String getName() {
        return "weixinpay";
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String getSiteUrl() {
        return null;
    }

    @Override
    public String getInstallUrl() {
        return null;
    }

    @Override
    public String getUninstallUrl() {
        return null;
    }

    @Override
    public String getSettingUrl() {
        return null;
    }
}
