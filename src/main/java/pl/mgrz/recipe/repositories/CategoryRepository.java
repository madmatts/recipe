package pl.mgrz.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mgrz.recipe.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
