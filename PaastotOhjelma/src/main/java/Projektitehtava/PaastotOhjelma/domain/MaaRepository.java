package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MaaRepository extends CrudRepository<Maa, Long> {

	List<Maa>finbByName(@Param("name") String name);
	
}
