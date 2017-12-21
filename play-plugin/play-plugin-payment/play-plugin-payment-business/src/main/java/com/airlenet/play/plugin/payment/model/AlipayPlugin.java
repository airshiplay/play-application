package com.airlenet.play.plugin.payment.model;

import com.airlenet.plugin.core.config.PluginConfigEntity;
import org.springframework.stereotype.Component;

/**
 * @author airlenet
 * @version 2017-12-19
 */
@Component("alipayPlugin")
public class AlipayPlugin extends PaymentPlugin {

    public static final String APP_ID_ATTRIBUTE_NAME = "APPID";

    public static final String APP_PRIVATE_KEY_ATTRIBUTE_NAME = "APP_PRIVATE_KEY";

    public static final String ALIPAY_PUBLIC_KEY_ATTRIBUTE_NAME = "ALIPAY_PUBLIC_KEY";

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
     * 开发者私钥，由开发者自己生成
     *
     * @return
     */
    public String getAppPrivateKey() {
        PluginConfigEntity pluginConfig = getPluginConfig();
        return pluginConfig != null ? pluginConfig.getAttribute(APP_PRIVATE_KEY_ATTRIBUTE_NAME) : null;
    }

    /**
     * 支付宝公钥，由支付宝生成
     *
     * @return
     */
    public String getAlipayPublicKey() {
        PluginConfigEntity pluginConfig = getPluginConfig();
        return pluginConfig != null ? pluginConfig.getAttribute(ALIPAY_PUBLIC_KEY_ATTRIBUTE_NAME) : null;
    }

    /**
     * 支付宝网关（固定）
     *
     * @return
     */
    public String getPayGateway() {
        return "https://openapi.alipay.com/gateway.do";
    }

    /**
     * 获取LOGO
     *
     * @return LOGO
     */
    @Override
    public String getLogo() {
        return "alipay";
    }

    /**
     * 参数返回格式，只支持json
     *
     * @return
     */
    public String getFormat() {
        return "json";
    }

    /**
     * 编码集，支持GBK/UTF-8
     *
     * @return
     */
    public String getCharset() {
        return "UTF-8";
    }

    /**
     * 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
     *
     * @return
     */
    public String getSignType() {
        return "RSA2";
    }

    @Override
    public String getName() {
        return "alipay";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getAuthor() {
        return "airlenet";
    }

    @Override
    public String getSiteUrl() {
        return null;
    }

    @Override
    public String getInstallUrl() {
        return "/payment/alipay/install";
    }

    @Override
    public String getUninstallUrl() {
        return "/payment/alipay/uninstall";
    }

    @Override
    public String getSettingUrl() {
        return "/payment/alipay/setting";
    }
}
