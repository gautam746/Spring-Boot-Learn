package com._Introduction.intro;

import com._Introduction.intro.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class IntroApplication implements CommandLineRunner {

//    day 1
//    @Autowired
//    PaymentService paymentService;
//
//
//    public static void main(String[] args) {
//		SpringApplication.run(IntroApplication.class, args);
//
////        PaymentService paymentServiceObj = new PaymentService();
////        paymentServiceObj.pay();
//	}
//
//   @Override
//    public void run(String... args) throws Exception{
//        paymentService.pay();
//
//   }

//@Autowired
// final NotificationService notificationServiceObj; //dependency injection

//    public IntroApplication(
//            @Qualifier("emailNotify") NotificationService notificationService) {
//        this.notificationServiceObj = notificationService; //constructor DI // Preferred
//    }
//public IntroApplication(NotificationService notificationService) {
//    this.notificationServiceObj = notificationService; //constructor DI // Preferred
//}

    @Autowired
    Map<String, NotificationService> notificationServiceMap = new HashMap<>();


    public static void main(String[] args) {
    SpringApplication.run(IntroApplication.class, args);
}


    @Override
    public void run(String... args) throws Exception {
//        NotificationService notificationServiceObj = new EmailNotificationService();
//        notificationServiceObj.gatValue().send("hello");

        for(var notificationService: notificationServiceMap.entrySet()){
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("Hello");
        }
    }
}
