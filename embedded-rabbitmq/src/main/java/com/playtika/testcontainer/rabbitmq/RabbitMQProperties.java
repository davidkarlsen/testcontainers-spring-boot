package com.playtika.testcontainer.rabbitmq;

import com.playtika.testcontainer.common.properties.CommonContainerProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties("embedded.rabbitmq")
public class RabbitMQProperties extends CommonContainerProperties {
    public static final String BEAN_NAME_EMBEDDED_RABBITMQ = "embeddedRabbitMq";

    private String password = "rabbitmq";
    private String host = "localhost";
    private String vhost = "/";
    private int port = 5672;
    private int httpPort = 15672;

    // https://hub.docker.com/_/rabbitmq
    @Override
    public String getDefaultDockerImage() {
        // Please don`t remove this comment.
        // renovate: datasource=docker
        return "rabbitmq:3.11-alpine";
    }
}
