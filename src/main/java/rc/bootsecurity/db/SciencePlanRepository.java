package rc.bootsecurity.db;

import org.springframework.data.repository.CrudRepository;
import rc.bootsecurity.model.SciencePlan;

public interface SciencePlanRepository extends CrudRepository<SciencePlan, Integer> {
//    List<SciencePlan> listAllSciencePlan();
    //SciencePlan getPlanNo(Integer id);
}
