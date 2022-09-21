package se.lexicon.myjpaassignment.data;

import se.lexicon.myjpaassignment.entity.RecipeIngredient;
import java.util.Collection;

public interface RecipeIngredientDao {

    RecipeIngredient findById(int id);
    Collection<RecipeIngredient> findAll();
    RecipeIngredient create(RecipeIngredient recipeIngredient);
    RecipeIngredient update(RecipeIngredient recipeIngredient);
    void delete(int id);
}
