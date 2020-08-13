package br.com.semcodar.notification;

import br.com.semcodar.model.Client;
import br.com.semcodar.notification.annotation.NotificationAnnotation;
import br.com.semcodar.notification.enums.NotificationEnum;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@NotificationAnnotation(NotificationEnum.URGENCY)
@Component
public class NotificationEmail implements Notification {

    @Override
    public void notify(Client client, String message) {

        out.printf("Notificando %s através do SMS %s: %s\n",
                client.getName(), client.getEmail(), message);

    }
}
