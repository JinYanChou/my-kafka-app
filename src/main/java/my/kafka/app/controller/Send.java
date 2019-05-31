package my.kafka.app.controller;

import java.util.Optional;

import javax.inject.Inject;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import my.kafka.app.kafka.ProductClient;

@Controller("/send")
public class Send {
    @Inject
    ProductClient client;

    @Get
    public String index(@Parameter Optional<String> param1, Optional<String> param2) {
        String p1 = param1.orElse("DEFAULT");
        String p2 = param2.orElse("DEFAULT");
        client.sendProduct(p1, p2);
        return "Send Param => " + p1 + "/" + p2;
    }
}