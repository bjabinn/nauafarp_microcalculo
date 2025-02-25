package es.giss.poc.farp.config;

import es.giss.arch.core.autoconfiguration.kafka.client.producer.EnableGissKafkaProducer;
import es.giss.arch.web.swagger.EnableGissSwagger;
import org.springframework.context.annotation.Configuration;


@EnableGissKafkaProducer
@Configuration
@EnableGissSwagger
public class AppConfig {

}
