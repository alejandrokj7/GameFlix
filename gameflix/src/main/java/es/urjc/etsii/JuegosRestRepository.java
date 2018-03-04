package es.urjc.etsii;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

import org.springframework.data.repository.query.Param;
/**
 * Repositorio generador de API REST HATEOAS: directores
 *
 * @author J. M. Colmenar
 */
@RepositoryRestResource(collectionResourceRel = "juegos", path = "juegos")
public interface JuegosRestRepository extends CrudRepository<Juegos, Integer> {

	 List<Juegos> findByNombre(@Param("nombre") String nombre);
	 
	 @Query("select p.id from Juegos p")
	 List<Integer> getAllIds();
	    @Query(	    		
	        value = "SELECT j.id FROM Juegos j  WHERE j.nombre =:nombre"
	    )
	    List<Juegos> findIdJuegoByNombre(@Param("nombre") String nombre);
	    
	    @Query(	    		
		        value = "SELECT j.id FROM Juegos j  WHERE j.nombre =:nombre"
		    )
	    String findIdJuegoByNombre2(@Param("nombre") String nombre);
	 
	    @Query(value = "FROM Juegos WHERE nombre = :nombre")
	    List<Juegos> findPassedForStream(@Param("nombre") String nombre);
	    
	    @Query("delete from Juegos j where j.nombre = ?1")
	    void deleteJuegoByNombre(String nombre);
	
}