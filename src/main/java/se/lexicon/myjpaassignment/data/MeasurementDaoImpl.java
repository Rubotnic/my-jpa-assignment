package se.lexicon.myjpaassignment.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.myjpaassignment.entity.Measurement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class MeasurementDaoImpl implements MeasurementDao{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public Measurement findById(int id) {
        return entityManager.find(Measurement.class, id);
    }

    @Transactional
    @Override
    public Collection<Measurement> findAll() {
        return null;
    }

    @Transactional
    @Override
    public Measurement create(Measurement measurement) {
        entityManager.persist(measurement);
        return measurement;
    }

    @Transactional
    @Override
    public Measurement update(Measurement measurement) {
        return entityManager.merge(measurement);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));
    }
}
