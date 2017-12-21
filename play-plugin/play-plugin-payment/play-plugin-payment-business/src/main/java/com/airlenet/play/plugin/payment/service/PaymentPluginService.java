package com.airlenet.play.plugin.payment.service;

import com.airlenet.play.plugin.payment.model.AlipayPlugin;
import com.airlenet.play.plugin.payment.model.PaymentPlugin;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author airlenet
 * @version 2017-12-19
 */
@Service()
public class PaymentPluginService {
    @Autowired
    private Map<String, PaymentPlugin> paymentPluginMap = new HashMap<>();



    public Iterable<PaymentPlugin> getPaymentPlugins() {
        return paymentPluginMap.values();
    }

    public PaymentPlugin getPaymentPlugin(String paymentPluginId) {
        return paymentPluginMap.get(paymentPluginId);
    }

    public List<PaymentPlugin> getAvailablePaymentPlugins() {
        List<PaymentPlugin> result = new ArrayList<PaymentPlugin>();
        for (Iterator<PaymentPlugin> iterator = paymentPluginMap.values().iterator(); iterator.hasNext(); ) {
            PaymentPlugin plugin = (PaymentPlugin) iterator.next();
            if (!plugin.isDisabled() && plugin.getIsInstalled()) {
                result.add(plugin);
            }
        }
        return result;
    }


}
