package se.lexicon.myjpaassignment.data;

import se.lexicon.myjpaassignment.entity.Ingredient;
import java.util.Collection;
import java.util.Optional;

public interface IngredientDao {

    Ingredient findById(int id);
    Collection<Ingredient> findAll();
    Ingredient create(Ingredient ingredient);
    Ingredient update(Ingredient ingredient);
    void delete(int id);

    // -- Extra --

    Optional<Ingredient> findIngredientByExactName(String ingredientName);

    Optional<Ingredient> findIngredientByPartsOfName(String ingredientName);




}
