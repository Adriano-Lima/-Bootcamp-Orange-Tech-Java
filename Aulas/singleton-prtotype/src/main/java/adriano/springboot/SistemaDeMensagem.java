package adriano.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaDeMensagem {
    @Autowired
    private Remetente noreplay;
    @Autowired
    private Remetente tech;

    //no singleton ambos os objetos noreplay e tech apontam para o mesmo endereco de memoria, ou seja, apenas um objeto e criado
    //e qualquer mudanca em um dos objetos afeta os dois
    //ja em prototype dois objetos serao criados

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        tech.setEmail("tech@gmail.com");
        System.out.println(tech);
        System.out.println("Bem-vindo à Tech");
    }
}
