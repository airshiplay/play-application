package com.airlenet.play.im.client;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketConnectionManager;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.sockjs.client.SockJsClient;

/**
 * @author airlenet
 * @version 2017-11-13
 */
public class Client {
    public static void main(String args[]){

        StandardWebSocketClient webSocketClient = new StandardWebSocketClient();
        WebSocketConnectionManager connectionManager = new WebSocketConnectionManager(webSocketClient, new MyHandler(), "ws://localhost:8080/websocket/websocket");
        connectionManager.start();
    }

    private static class MyHandler extends TextWebSocketHandler {
        @Override
        public void afterConnectionEstablished(WebSocketSession session) throws Exception {
            System.out.println("connected...........");
            session.sendMessage(new TextMessage("hello, web socket"));
            super.afterConnectionEstablished(session);
        }

        @Override
        protected void handleTextMessage(WebSocketSession session, TextMessage message)
                throws Exception {
            System.out.println("receive: " + message.getPayload());
            super.handleTextMessage(session, message);
        }
    }
}
