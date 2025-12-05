package com._Introduction.intro.impl;

import com._Introduction.intro.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("smsNotify")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")

public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sms sending..."+message);
    }
}
