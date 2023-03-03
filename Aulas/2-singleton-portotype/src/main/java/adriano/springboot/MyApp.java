package adriano.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
   @Autowired
    private SistemaDeMensagem sistemaDeMensagem;
    @Override
    public void run(String... args) throws Exception {
        sistemaDeMensagem.enviarConfirmacaoCadastro();
        sistemaDeMensagem.enviarMensagemBoasVindas();
        sistemaDeMensagem.enviarConfirmacaoCadastro();
    }
}
