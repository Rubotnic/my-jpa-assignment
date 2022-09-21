package se.lexicon.myjpaassignment.data;

import se.lexicon.myjpaassignment.entity.Measurement;
import java.util.Collection;

public interface MeasurementDao {

    Measurement findById(int id);
    Collection<Measurement> findAll();
    Measurement create(Measurement measurement);
    Measurement update(Measurement measurement);
    void delete(int id);

}
