package com.qq.weixin.mp.model.msg.receive;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * <pre>
 * <b>点击菜单跳转链接时的事件推送</b>
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[FromUser]]></FromUserName>
 * <CreateTime>123456789</CreateTime>
 * <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[VIEW]]></Event>
 * <AdminEventKey><![CDATA[www.qq.com]]></AdminEventKey>
 * </xml>
 * </pre>
 *
 * @author lig
 */
@Root(name = "xml")
public class WexinMsgEventView extends WexinMsgFactory.WechatMsgParent {
    @Element(name = "AdminEventKey", required = false)
    private String eventKey;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

}
