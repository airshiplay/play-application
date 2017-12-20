package com.airlenet.play.plugin.payment;

import com.airlenet.play.plugin.payment.model.PaymentPlugin;
import com.airlenet.play.plugin.payment.service.PaymentPluginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plugin/payment")
public class AdminPaymentPluginController {
    @Autowired
    private PaymentPluginService paymentService;

    @RequestMapping("/list")
    public String list() {
        return "classpath:/plugin/payment/list";
    }

    @RequestMapping("/view/{paymentPluginId}")
    public String view(Model model, @PathVariable String paymentPluginId) {
        PaymentPlugin plugin = paymentService.getPaymentPlugin(paymentPluginId);
        model.addAttribute("plugin", plugin);
        model.addAttribute("plugin_config", plugin.getPluginConfig());
        return "classpath:/plugin/payment/view";
    }

    @RequestMapping("/setting/{oauthPluginId}")
    public String install(Model model, @PathVariable String paymentPluginId) {
        PaymentPlugin plugin = paymentService.getPaymentPlugin(paymentPluginId);
        model.addAttribute("plugin", plugin);
        model.addAttribute("plugin_config", plugin.getPluginConfig());
        return "classpath:/plugin/payment/setting";
    }

}
