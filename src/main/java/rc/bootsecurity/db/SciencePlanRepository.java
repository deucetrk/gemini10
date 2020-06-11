package rc.bootsecurity.db;

import edu.gemini.app.ocs.model.BaseSciencePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import rc.bootsecurity.model.SciencePlan;

import java.util.List;

public interface SciencePlanRepository extends CrudRepository<SciencePlan, Integer> {
//    List<SciencePlan> listAllSciencePlan();
    //SciencePlan getPlanNo(Integer id);
}
