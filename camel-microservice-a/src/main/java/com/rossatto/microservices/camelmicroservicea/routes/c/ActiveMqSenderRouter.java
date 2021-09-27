package com.rossatto.microservices.camelmicroservicea.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder {

    private static final String ROUTE_JSON_FILES = "file:C:/www/camel-microservice-a/camel-microservice-a/files/jsonnnn";
    private static final String ROUTE_ACTIVEMQ_QUEUE = "activemq:my-activemq-queue";
    private static final String ROUTE_XML_FILES = "file:C:/www/camel-microservice-a/camel-microservice-a/files/xml";
    private static final String ROUTE_ACTIVEMQ_QUEUE_XML = "activemq:my-activemq-xml-queue";

    @Override
    public void configure() throws Exception {

        from(ROUTE_JSON_FILES)
                .log("${body}")
                .to(ROUTE_ACTIVEMQ_QUEUE);

        from(ROUTE_XML_FILES)
                .log("${body}")
                .to(ROUTE_ACTIVEMQ_QUEUE_XML);


    }

}
