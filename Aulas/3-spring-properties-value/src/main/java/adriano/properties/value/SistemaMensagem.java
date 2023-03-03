package adriano.properties.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${nome:NoReplay-DIO}") //colando um valor padrao se nao achar a propriedade chamada nome
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por " + nome
                + "\nE-mail:" + email
                + "\nCom telefones:" + telefones);
    }
}
