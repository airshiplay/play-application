package com.airlenet.play.plugin.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author airlenet
 * @version 2017-12-19
 */
@Controller
@RequestMapping("/payment")
public class PaymentController {
    @Value("${path.admin?:/admin}")
    private String adminHomeUrl;

}
