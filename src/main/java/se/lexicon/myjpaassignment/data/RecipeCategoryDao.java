package se.lexicon.myjpaassignment.data;

import se.lexicon.myjpaassignment.entity.RecipeCategory;

import java.util.Collection;

public interface RecipeCategoryDao {

    RecipeCategory findById(int Id);
    Collection<RecipeCategory> findAll();
    RecipeCategory create(RecipeCategory recipeCategory);
    RecipeCategory update(RecipeCategory recipeCategory);
    void delete(int id);

}
