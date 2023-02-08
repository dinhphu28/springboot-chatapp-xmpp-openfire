package com.ndp.chatapp.Configs;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.springframework.stereotype.Component;

@Component
public class SmackConfig {
    public XMPPConnection xmppConnection() {
        ConnectionConfiguration config = new ConnectionConfiguration("103.146.20.250", 5222);

        XMPPConnection connection = new XMPPConnection(config);

        try {
            connection.connect();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return connection;
    }
}
