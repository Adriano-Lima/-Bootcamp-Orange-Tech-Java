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
        //addUsuario();
        System.out.println("Utilizando findByNameContaining");
        for (var u:repository.findByNameContaining("Adriano")) {
            System.out.println(u);
        }
        System.out.println("Utilizando filtrarPorNome");
        for (var u:repository.filtrarPorNome("Adriano")) {
            System.out.println(u);
        }

        System.out.println("Busca por username");
        var u = repository.findByUsername("alana");
        System.out.println(u);
    }

    private void addUsuario(){
        Usuario usuario = new Usuario("Adriano Lima","adriano-lima","111321");
        repository.save(usuario);
        for (var u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
