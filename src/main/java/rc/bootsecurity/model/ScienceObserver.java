package rc.bootsecurity.model;

import java.util.ArrayList;

public class ScienceObserver extends User{
    private String observingProgram;

    private ArrayList<String> listObservingProgram;

    private String sciencePlan;

    private ArrayList<String> listSciencePlan;

    public void createObservingProgram(String observingProgram) {
        this.listObservingProgram.add(observingProgram);
    }

    public boolean validateSciencePlan(){
//        if(this.sciencePlan)
        return true;
    }
}
