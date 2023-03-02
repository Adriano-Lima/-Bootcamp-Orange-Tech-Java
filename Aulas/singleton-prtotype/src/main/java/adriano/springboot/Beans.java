package adriano.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando um objeto remetente");
        Remetente remetente = new Remetente("Digital Innovation One", "noreplay@dio.com.br");
        return remetente;
    }
}
