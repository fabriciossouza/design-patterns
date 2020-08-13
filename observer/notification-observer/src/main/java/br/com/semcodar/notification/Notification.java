package br.com.semcodar.notification;

import br.com.semcodar.model.Client;

public interface Notification {

    void notify(Client client, String message);
}
