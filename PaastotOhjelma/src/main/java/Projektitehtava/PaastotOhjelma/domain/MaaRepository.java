package Projektitehtava.PaastotOhjelma.domain;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource
public interface MaaRepository extends CrudRepository<Maa, Long> {

}
