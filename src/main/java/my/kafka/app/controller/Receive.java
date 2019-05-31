package my.kafka.app.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import my.kafka.app.kafka.Data;

@Controller("/receive")
public class Receive {
    @Get
    public String index() {
        return "Get Param => " + Data.shared().getParam1() + "/" + Data.shared().getParam2();
    }
}