package rc.bootsecurity.db;

import edu.gemini.app.ocs.model.BaseSciencePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import rc.bootsecurity.model.SciencePlan;

public interface SciencePlanRepository extends CrudRepository<SciencePlan, Integer> {
}
