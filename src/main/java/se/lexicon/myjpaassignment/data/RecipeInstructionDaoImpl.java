package se.lexicon.myjpaassignment.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.entity.RecipeInstruction;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;


@Repository
public class RecipeInstructionDaoImpl implements RecipeInstructionDao{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public RecipeInstruction findById(int id) {
        return entityManager.find(RecipeInstruction.class, id);
    }

    @Transactional
    @Override
    public Collection<RecipeInstruction> findAll() {
        return entityManager.createQuery("SELECT recipeInstruction FROM RecipeInstruction recipeInstruction", RecipeInstruction.class).getResultList();
    }

    @Transactional
    @Override
    public RecipeInstruction create(RecipeInstruction recipeInstruction) {
        entityManager.persist(recipeInstruction);
        return recipeInstruction;
    }

    @Transactional
    @Override
    public RecipeInstruction update(RecipeInstruction recipeInstruction) {
        return entityManager.merge(recipeInstruction);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));
    }
}
