package com.grsu.teacherassistant.push.resources;

import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PushEndpoint("/register")
public class RegisterStudentResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterStudentResource.class);

    @OnMessage(encoders = {JSONEncoder.class})
    public String onMessage(String cardUid) {
        LOGGER.info("==> onMessage(); cardUid = " + cardUid);
        return cardUid;
    }
}
