package br.com.semcodar.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Client {

    private String name;
    private String email;
    private String phone;
    private boolean active = false;

    public void active(){
        active = true;
    }
}
