package br.com.semcodar.listener;

import br.com.semcodar.notification.annotation.NotificationAnnotation;
import br.com.semcodar.notification.Notification;
import br.com.semcodar.notification.enums.NotificationEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.com.semcodar.event.ClientEvent;

@Component
public class NotificationListener {

    @NotificationAnnotation(NotificationEnum.NO_URGENCY)
    @Autowired
    private Notification notification;

    @EventListener
    public void clientActiveListener(ClientEvent event) {
        notification.notify(event.getClient(), "Seu cadastro no sistema está ativo!");
    }
}
