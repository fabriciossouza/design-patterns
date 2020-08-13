package br.com.semcodar;

import br.com.semcodar.observer.PhoneClient;
import br.com.semcodar.observer.TableClient;
import br.com.semcodar.subject.MessageStream;

public class Demo {

    public static void main(String...args) {
        var subject = new MessageStream();

        var phoneClient = new PhoneClient(subject);
        var tableClient = new TableClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tableClient.addMessage("Another new message!");
    }
}