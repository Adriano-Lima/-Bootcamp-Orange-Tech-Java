package adriano.aula.api.controler;

import adriano.aula.api.model.Usuario;
import adriano.aula.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControler {
    //para acessar com swagger: localhost:8080/swagger-ui/index.html
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping()
    public List<Usuario> getUsuarios() {
        return usuarioRepository.listAll();
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable("id") Integer id){
        return usuarioRepository.finById(id);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable("id") Integer id){
        usuarioRepository.remove(id);
    }

    @PostMapping()
    public void adicionarUsuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }



}
