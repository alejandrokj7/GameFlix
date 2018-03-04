package es.urjc.etsii;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Repositorio generador de API REST HATEOAS: películas
 *
 * @author J. M. Colmenar
 */
@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRestRepository extends CrudRepository<Usuarios, Integer> {

    // Declaración de método para buscar peliculas por título:
    //List<Usuario> findByTitulo(@Param("nombre") String nombre);

}