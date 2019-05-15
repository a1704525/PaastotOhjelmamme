package Projektitehtava.PaastotOhjelma.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;

@RepositoryRestResource
public interface MaaVakilukuRepository extends CrudRepository<MaaVakiluku, Long> {

	List<MaaVakiluku> findByVakilukunimi(@Param("vakiluku")String vakilukunimi);
}
