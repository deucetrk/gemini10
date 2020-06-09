package rc.bootsecurity.model;
import java.util.ArrayList;


public class Astronomer extends User{

    private String sciencePlan;

    private ArrayList<String> listSciencePlan;

    public void createSciencePlan(String sciencePlan) {
        this.listSciencePlan.add(sciencePlan);
    }

    public void testSciencePlan(String sciencePlan){

    }

    public void commentSciencePlan(){

    }
}
