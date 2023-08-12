package alezkar.kafka.service.impl;

import alezkar.kafka.service.KafkaService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaServiceImpl implements KafkaService {
    KafkaTemplate<String, String> kafkaTemplate;

    public KafkaServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void postSolicitations(String idSolicitation){
        kafkaTemplate.send("first-topic", idSolicitation);
    }
}
