import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.kafkaexample.service.KafkaService;
@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final KafkaService kafkaService;

    @Autowired
    public MessageController(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestParam String topic, @RequestParam String message) {
        kafkaService.produceMessage(topic, message);
        return ResponseEntity.ok("Message sent to topic: " + topic);
    }
}