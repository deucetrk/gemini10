package rc.bootsecurity.model;
import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Astronomer extends User{

    private String sciencePlan;

    private ArrayList<String> listSciencePlan;

    public Astronomer(String astronomer, String astronomer123, String astronomer1, String as_1) {
        super(astronomer,astronomer123,astronomer1,as_1);
    }
    protected Astronomer(){}

    public void createSciencePlan(String sciencePlan) {
        this.listSciencePlan.add(sciencePlan);
    }

    public void testSciencePlan(String sciencePlan){

    }

    public void commentSciencePlan(){

    }
}
