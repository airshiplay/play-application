package com.airlenet.play.plugin.payment.service;

import com.airlenet.core.PlayConstants;
import com.airlenet.play.plugin.payment.model.AlipayPlugin;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author airlenet
 * @version 2017-12-20
 */
@Service
public class AlipayPluginService {
    private AlipayClient alipayClient;

    @Autowired
    private AlipayPlugin alipayPlugin;
    public AlipayClient getAlipayClient() {
        if(alipayClient==null){
            alipayClient= new DefaultAlipayClient(alipayPlugin.getPayGateway(),alipayPlugin.getAppId(),alipayPlugin.getAppPrivateKey(),alipayPlugin.getFormat(),
                    alipayPlugin.getCharset(),alipayPlugin.getAlipayPublicKey(),alipayPlugin.getSignType());
        }
        return alipayClient;
    }

    public void updateAlipayClient(){
        if(alipayClient!=null){
            synchronized (alipayClient){
                alipayClient= new DefaultAlipayClient(alipayPlugin.getPayGateway(),alipayPlugin.getAppId(),alipayPlugin.getAppPrivateKey(),alipayPlugin.getFormat(),
                        alipayPlugin.getCharset(),alipayPlugin.getAlipayPublicKey(),alipayPlugin.getSignType());
            }
        }else{
            alipayClient= new DefaultAlipayClient(alipayPlugin.getPayGateway(),alipayPlugin.getAppId(),alipayPlugin.getAppPrivateKey(),alipayPlugin.getFormat(),
                    alipayPlugin.getCharset(),alipayPlugin.getAlipayPublicKey(),alipayPlugin.getSignType());
        }

    }

    public String  unifiedorder(String orderNo,String subject,String body,String metadata,String totalAmount){
        getAlipayClient();
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
        alipayRequest.setReturnUrl("http://domain.com/CallBack/return_url.jsp");
        alipayRequest.setNotifyUrl("http://domain.com/CallBack/notify_url.jsp");//在公共参数中设置回跳和通知地址
        alipayRequest.setBizContent("{" +
                "    \"out_trade_no\":\"20150320010101001\"," +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                "    \"total_amount\":88.88," +
                "    \"subject\":\"Iphone6 16G\"," +
                "    \"body\":\"Iphone6 16G\"," +
                "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
                "    \"extend_params\":{" +
                "    \"sys_service_provider_id\":\"2088511833207846\"" +
                "    }"+
                "  }");//填充业务参数
        String form="";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
//        httpResponse.setContentType("text/html;charset=" + PlayConstants.characterEncoding);
//        httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面
//        httpResponse.getWriter().flush();
//        httpResponse.getWriter().close();
        return form;

    }
}
