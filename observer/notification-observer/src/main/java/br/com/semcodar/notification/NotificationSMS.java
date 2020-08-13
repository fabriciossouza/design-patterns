package br.com.semcodar.notification;

import br.com.semcodar.config.properties.NotificationProperties;
import br.com.semcodar.model.Client;
import br.com.semcodar.notification.annotation.NotificationAnnotation;
import br.com.semcodar.notification.enums.NotificationEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@NotificationAnnotation(NotificationEnum.NO_URGENCY)
@Component
public class NotificationSMS implements Notification {

    @Autowired
    private NotificationProperties properties;

    @Override
    public void notify(Client client, String message) {

        out.println("Host: " + properties.getHostServer());
        out.println("Porta: " + properties.getPortServer());

        out.printf("Notificando %s através do e-mail %s: %s\n",
                client.getName(), client.getEmail(), message);

    }
}
