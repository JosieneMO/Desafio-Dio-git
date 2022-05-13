package com.raposinhapijamas.raposinhapijamas.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
public class Cliente {
    @Id
    UUID uuid,
    private String nome;
    private String email;
    private String telefone;

}
