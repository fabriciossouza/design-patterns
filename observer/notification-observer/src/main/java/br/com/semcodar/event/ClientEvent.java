package br.com.semcodar.event;

import br.com.semcodar.model.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ClientEvent {

    private Client client;
}
