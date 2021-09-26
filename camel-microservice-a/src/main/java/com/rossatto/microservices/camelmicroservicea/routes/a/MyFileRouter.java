package com.rossatto.microservices.camelmicroservicea.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFileRouter extends RouteBuilder {

    private static String IN_PATH = "C:/www/camel-microservice-a/camel-microservice-a/files/input";
    private static String OUT_PATH = "C:/www/camel-microservice-a/camel-microservice-a/files/output";

    @Override
    public void configure() throws Exception {

        from("file:" + IN_PATH)
                .log("${body}")
                .to("file:" + OUT_PATH);

    }


}
