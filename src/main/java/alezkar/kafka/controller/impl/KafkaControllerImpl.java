package alezkar.kafka.controller.impl;

import alezkar.kafka.controller.KafkaController;
import alezkar.kafka.service.KafkaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${version}")
public class KafkaControllerImpl implements KafkaController {

    KafkaService service;

    public KafkaControllerImpl(KafkaService service) {
        this.service = service;
    }

    @PostMapping("/solicitations")
    public ResponseEntity<Void> postSolicitation(@RequestParam(value = "id_solicitation") String idSolicitation){
        service.postSolicitations(idSolicitation);
        return ResponseEntity.ok().build();
    }
}
