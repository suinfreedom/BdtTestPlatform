package springcucumbertemplate.kafkaconsumer;

import org.springframework.stereotype.Component;


/*
@Component
public class ConsumerRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kafka:{{consumer.topic}}?brokers={{kafka.brokers}}&consumersCount={{consumer.consumersCount}}&groupId={{consumer.group}}")
                .routeId("FromKafka")
                .log("------- ROUTE BUILDER -------")
                .log("${body}")             //formato JSON.
                .onException(Exception.class)
                .log(LoggingLevel.ERROR, "it.kcconsumer.radarmeteo", "Invalid Input")
                .maximumRedeliveries(2).redeliveryDelay(30000)
                .end()
                .to("bean:lastEndTripManager" +
                        "?method=getBody(${body})")
        ;
    }
}
*/

