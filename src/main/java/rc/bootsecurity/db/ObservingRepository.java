package rc.bootsecurity.db;

import org.springframework.data.repository.CrudRepository;
import rc.bootsecurity.model.ObservingProgram;
import rc.bootsecurity.model.SciencePlan;

public interface ObservingRepository  extends CrudRepository<ObservingProgram, Integer> {
}
