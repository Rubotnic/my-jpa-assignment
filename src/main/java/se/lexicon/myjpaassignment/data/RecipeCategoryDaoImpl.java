package se.lexicon.myjpaassignment.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.entity.RecipeCategory;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class RecipeCategoryDaoImpl implements RecipeCategoryDao{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public RecipeCategory findById(int id) {
        return entityManager.find(RecipeCategory.class, id);
    }

    @Transactional
    @Override
    public Collection<RecipeCategory> findAll() {
        return entityManager.createQuery("SELECT recipecategory FROM RecipeCategory recipecategory", RecipeCategory.class).getResultList();
    }

    @Transactional
    @Override
    public RecipeCategory create(RecipeCategory recipeCategory) {
        entityManager.persist(recipeCategory);
        return recipeCategory;
    }

    @Transactional
    @Override
    public RecipeCategory update(RecipeCategory recipeCategory) {
        return entityManager.merge(recipeCategory);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));
    }
}
