package pl.mgrz.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mgrz.recipe.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}