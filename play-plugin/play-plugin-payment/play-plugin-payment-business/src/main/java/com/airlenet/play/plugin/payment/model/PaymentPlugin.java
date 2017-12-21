package com.airlenet.play.plugin.payment.model;

import com.airlenet.plugin.core.Plugin;

/**
 * @author airlenet
 * @version 2017-12-19
 */
public abstract class PaymentPlugin  extends Plugin {

    /**
     *
     * 支付网关
     *
     * @return
     */
    public abstract String getPayGateway();

    /**
     * 获取LOGO
     *
     * @return LOGO
     */
    public abstract String getLogo();
}
