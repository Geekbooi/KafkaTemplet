package trace.Lab12PartC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class UserService {
    @Service
    public class KafkaProducerService {

        @Autowired
        private KafkaTemplate<String, String> kafkaTemplate;

        public void sendMessage(String message) {
            kafkaTemplate.send("my-topic", message);
        }
    }

    @Service
    public class KafkaConsumerService {

        @KafkaListener(topics = "my-topic", groupId = "my-group")
        public void listen(String message) {
            System.out.println("Received message: " + message);
        }
    }

}