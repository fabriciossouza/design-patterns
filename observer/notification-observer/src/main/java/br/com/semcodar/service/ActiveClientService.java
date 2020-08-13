package br.com.semcodar.service;

import br.com.semcodar.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ActiveClientService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void active(Client client){
        client.active();
    }
}