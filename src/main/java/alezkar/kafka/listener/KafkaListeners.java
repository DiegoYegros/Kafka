package alezkar.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "first-topic", groupId = "a-group-id")
    void listener(String data){
        //call another microservice
        System.out.println("This is working well! this is the data i received: " + data);
    }
}
