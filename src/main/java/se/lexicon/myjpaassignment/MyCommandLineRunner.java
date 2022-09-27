package se.lexicon.myjpaassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.data.*;

import javax.persistence.EntityManager;

@Profile("dev")
@Transactional
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    public MyCommandLineRunner(IngredientDao ingredientDao, MeasurementDao measurementDao, RecipeCategoryDao recipeCategoryDao, RecipeDao recipeDao, RecipeIngredientDao recipeIngredientDao, RecipeInstructionDao recipeInstructionDao, EntityManager entityManager) {
        this.ingredientDao = ingredientDao;
        this.measurementDao = measurementDao;
        this.recipeCategoryDao = recipeCategoryDao;
        this.recipeDao = recipeDao;
        this.recipeIngredientDao = recipeIngredientDao;
        this.recipeInstructionDao = recipeInstructionDao;
        this.entityManager = entityManager;
    }

        private final IngredientDao ingredientDao;
        private final MeasurementDao measurementDao;
        private final RecipeCategoryDao recipeCategoryDao;
        private final RecipeDao recipeDao;
        private final RecipeIngredientDao recipeIngredientDao;
        private final RecipeInstructionDao recipeInstructionDao;
        private final EntityManager entityManager;



    @Override
    public void run(String... args) throws Exception {







    }
}
