package aula.jpa;

import aula.jpa.Model.Usuario;
import aula.jpa.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UsuarioRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario("Adriano","adriano","111321");
        repository.save(usuario);
        for (var u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
