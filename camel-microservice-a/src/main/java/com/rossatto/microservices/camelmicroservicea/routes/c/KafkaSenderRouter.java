package com.rossatto.microservices.camelmicroservicea.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaSenderRouter extends RouteBuilder {

    private static final String ROUTE_JSON_FILES = "file:C:/www/camel-microservice-a/camel-microservice-a/files/json";
    private static final String ROUTE_KAFKA_TOPIC = "kafka:myKafkaTopic";

    @Override
    public void configure() throws Exception {

        from(ROUTE_JSON_FILES)
                .log("${body}")
                .to(ROUTE_KAFKA_TOPIC);

    }


}
