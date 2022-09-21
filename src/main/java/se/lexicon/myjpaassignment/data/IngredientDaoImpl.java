package se.lexicon.myjpaassignment.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.entity.Ingredient;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class IngredientDaoImpl implements IngredientDao{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public Ingredient findById(int id) {
        return entityManager.find(Ingredient.class, id);
    }

    @Transactional
    @Override
    public Collection<Ingredient> findAll() {
        return entityManager.createQuery("SELECT ingredient FROM Ingredient ingredient", Ingredient.class).getResultList();
    }

    @Transactional
    @Override
    public Ingredient create(Ingredient ingredient) {
        entityManager.persist(ingredient);
        return ingredient;
    }

    @Transactional
    @Override
    public Ingredient update(Ingredient ingredient) {
        return entityManager.merge(ingredient);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));
    }
}
