package pl.mgrz.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mgrz.recipe.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
