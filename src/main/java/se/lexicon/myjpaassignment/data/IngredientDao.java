package se.lexicon.myjpaassignment.data;

import se.lexicon.myjpaassignment.entity.Ingredient;
import java.util.Collection;

public interface IngredientDao {

    Ingredient findById(int id);
    Collection<Ingredient> findAll();
    Ingredient create(Ingredient ingredient);
    Ingredient update(Ingredient ingredient);
    void delete(int id);
}
