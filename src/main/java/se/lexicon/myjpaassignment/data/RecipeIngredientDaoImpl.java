package se.lexicon.myjpaassignment.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.entity.RecipeIngredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class RecipeIngredientDaoImpl implements RecipeIngredientDao{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public RecipeIngredient findById(int id) {
        return entityManager.find(RecipeIngredient.class, id);
    }

    @Transactional
    @Override
    public Collection<RecipeIngredient> findAll() {
        return entityManager.createQuery("SELECT recipeingrident FROM RecipeIngredient recipeingrident", RecipeIngredient.class).getResultList();
    }

    @Transactional
    @Override
    public RecipeIngredient create(RecipeIngredient recipeIngredient) {
        entityManager.persist(recipeIngredient);
        return recipeIngredient;
    }

    @Transactional
    @Override
    public RecipeIngredient update(RecipeIngredient recipeIngredient) {
        return entityManager.merge(recipeIngredient);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));

    }
}
