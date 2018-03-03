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
@RepositoryRestResource(collectionResourceRel = "partidas", path = "partidas")
public interface PartidaRestRepository extends CrudRepository<Partida, Integer> {

    // Declaración de método para buscar peliculas por título:
    //List<Partida> findByTitulo(@Param("titulo") String titulo);

}