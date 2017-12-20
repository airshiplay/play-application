package com.airlenet.play.plugin.payment;

import com.airlenet.play.plugin.controller.PluginController;
import com.airlenet.play.plugin.payment.model.AlipayPlugin;
import com.airlenet.play.plugin.payment.model.WeixinpayPlugin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author airlenet
 * @version 2017-12-19
 */
@Controller
@RequestMapping("/payment/weixinpay")
public class WeixinpayPluginController extends PluginController<WeixinpayPlugin> {
}
