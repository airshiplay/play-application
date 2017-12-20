package com.airlenet.play.plugin.payment;

import com.airlenet.play.plugin.payment.model.PaymentPlugin;
import com.airlenet.play.plugin.payment.service.PaymentPluginService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/payment/plugin")
public class PaymentPluginController {

    @Autowired
    private PaymentPluginService paymentService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Page<PaymentPlugin> list(Pageable pageable) {
        Iterable<PaymentPlugin> it = paymentService.getPaymentPlugins();
        List<PaymentPlugin> paymentPlugins = it == null ? new ArrayList<>() : Lists.newArrayList(it);
        paymentPlugins.sort(null);
        return new PageImpl<>(paymentPlugins);
    }

}
