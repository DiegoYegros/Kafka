package alezkar.kafka.controller;

import org.springframework.http.ResponseEntity;

public interface KafkaController {
    public ResponseEntity<Void> postSolicitation(String idSolicitations);
}
