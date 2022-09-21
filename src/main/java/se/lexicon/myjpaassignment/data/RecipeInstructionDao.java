package se.lexicon.myjpaassignment.data;

import se.lexicon.myjpaassignment.entity.RecipeInstruction;
import java.util.Collection;

public interface RecipeInstructionDao {

    RecipeInstruction findById(int id);
    Collection<RecipeInstruction> findAll();
    RecipeInstruction create(RecipeInstruction recipeInstruction);
    RecipeInstruction update(RecipeInstruction recipeInstruction);
    void delete(int id);
}
