package aula.jpa.Repository;

import aula.jpa.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    //Query method - retorna lista de usuarios que contem a parte no nome
    List<Usuario> findByNameContaining(String name);

    //Query Override
    @Query("select u from Usuario u where u.name like %:name%")
    List<Usuario> filtrarPorNome(@Param("name") String name);

    //Query Method
    Usuario findByUsername(String username);
}
