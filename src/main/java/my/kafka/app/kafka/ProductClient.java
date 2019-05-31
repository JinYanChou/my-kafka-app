package my.kafka.app.kafka;

import io.micronaut.configuration.kafka.annotation.*;

@KafkaClient
public interface ProductClient {
    @Topic("my-products")
    void sendProduct(@KafkaKey String param1, String param2);
}