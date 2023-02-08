package com.ndp.chatapp.Controllers;

import org.jivesoftware.smack.XMPPConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ndp.chatapp.Configs.SmackConfig;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/tests")
public class TestController {
    
    @Autowired
    private SmackConfig smackConfig;

    @GetMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> retrieveAll() {
        ResponseEntity<Object> entity;

        // SmackConfig smackConfig = new SmackConfig();

        XMPPConnection connection = smackConfig.xmppConnection();

        // entity = new ResponseEntity<>("Connecting to=" + connection.getHost() + "Port: " + connection.getPort(), HttpStatus.OK);

        try {
            connection.login("admin", "admin");

            entity = new ResponseEntity<>("Login successfully", HttpStatus.OK);

            // connection.login("thien", "thien");

            // entity = new ResponseEntity<>("Login successfully 2", HttpStatus.OK);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

            entity = new ResponseEntity<>("Failed to login", HttpStatus.FORBIDDEN);
        }

        return entity;
    }
}
