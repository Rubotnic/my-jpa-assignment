package se.lexicon.myjpaassignment.data;

import se.lexicon.myjpaassignment.entity.Recipe;
import java.util.Collection;

public interface RecipeDao {

    Recipe findById(int id);
    Collection<Recipe> findAll();
    Recipe create(Recipe recipe);
    Recipe update(Recipe recipe);
    void delete(int id);


}
