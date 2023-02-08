// package com.ndp.chatapp.Configs;

// import org.jivesoftware.smack.ConnectionConfiguration;
// import org.jivesoftware.smack.XMPPConnection;
// import org.jivesoftware.smack.XMPPException;

// public class SmackDemo {
//     public static void main(String[] args) {
//         SmackDemo smackDemo = new SmackDemo();

//         XMPPConnection connection=smackDemo.XMPPConnection();

//         System.out.println("Connecting to="+connection.getHost()+" Post:"+connection.getPort());
//     }

//     public XMPPConnection XMPPConnection() {
//         ConnectionConfiguration config = new ConnectionConfiguration("host", 0);

//         /*
//          * ConnectionConfiguration config = new ConnectionConfiguration(
//          * "192.163.2.200", 5222);
//          */
//         XMPPConnection connection = new XMPPConnection(config);
//         try {
//             connection.connect();
//         } catch (XMPPException e) {

//             e.printStackTrace();
//         }
//         return connection;
//     }
// }