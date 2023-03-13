package adriano.aula.api.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControler {
    @GetMapping("/")
    public String retornarBoasVindas(){
        return "Welcome to my Spring Boot Web API";
    }
}
