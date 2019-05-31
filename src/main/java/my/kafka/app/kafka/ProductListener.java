package my.kafka.app.kafka;

import io.micronaut.configuration.kafka.annotation.*;

@KafkaListener(offsetReset = OffsetReset.EARLIEST) 
public class ProductListener {
    @Topic("my-products") 
    public void receive(@KafkaKey String param1, String param2) { 
        Data.shared().setParam1(param1);
        Data.shared().setParam2(param2);
    }
}