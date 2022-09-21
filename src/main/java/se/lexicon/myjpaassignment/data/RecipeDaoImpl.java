package se.lexicon.myjpaassignment.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.entity.Recipe;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class RecipeDaoImpl implements RecipeDao{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public Recipe findById(int id) {
        return entityManager.find(Recipe.class, id);
    }

    @Transactional
    @Override
    public Collection<Recipe> findAll() {
        return entityManager.createQuery("SELECT recipe FROM Recipe recipe", Recipe.class).getResultList();
    }

    @Transactional
    @Override
    public Recipe create(Recipe recipe) {
        entityManager.persist(recipe);
        return recipe;
    }

    @Transactional
    @Override
    public Recipe update(Recipe recipe) {
        return entityManager.merge(recipe);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));

    }
}
