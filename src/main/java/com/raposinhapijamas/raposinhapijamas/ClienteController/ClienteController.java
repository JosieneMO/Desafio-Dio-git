package com.raposinhapijamas.raposinhapijamas.ClienteController;

import com.raposinhapijamas.raposinhapijamas.Entity.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ClienteController {

   @GetMapping ("/clientes")
    public List <Cliente> listar() {
      return
   }
}
