package br.com.semcodar.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("notification.email")
@Component
@Data
public class NotificationProperties {

    private String hostServer;

    private Integer portServer = 25;
}
