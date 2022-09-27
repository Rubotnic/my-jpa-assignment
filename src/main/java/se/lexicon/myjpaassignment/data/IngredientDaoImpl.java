package se.lexicon.myjpaassignment.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.entity.Ingredient;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.Optional;

@Repository
public class IngredientDaoImpl implements IngredientDao{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional(readOnly = true)
    @Override
    public Ingredient findById(int id) {
        return entityManager.find(Ingredient.class, id);
    }

    @Transactional(readOnly = true)
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

    // -- Extra --

    @Transactional(readOnly = true)
    @Override
    public Optional<Ingredient> findIngredientByExactName(String ingredientName) {

        TypedQuery<Ingredient> query = entityManager.createQuery("SELECT ing FROM Ingredient ing WHERE ing.ingredientName = :ingredientname", Ingredient.class);
        query.setParameter("ingredientname", ingredientName);

        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public Optional<Ingredient> findIngredientByPartsOfName(String ingredientName) {
        return Optional.empty();
    }
}
