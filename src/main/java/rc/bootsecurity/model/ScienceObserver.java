package rc.bootsecurity.model;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class ScienceObserver extends User{

    private String observingProgram;

    private ArrayList<String> listObservingProgram;

    private String sciencePlan;

    private ArrayList<String> listSciencePlan;


    public ScienceObserver(String username, String password, String roles, String permissions) {
        super(username, password, roles, permissions);

    }

    public ScienceObserver() { }


    public void createObservingProgram(String observingProgram) {
        this.listObservingProgram.add(observingProgram);
    }

    public boolean validateSciencePlan(){
//        if(this.sciencePlan)
        return true;
    }
}
