package rc.bootsecurity.model;

import java.util.ArrayList;

public class StarSystem {
    private String name;
    private int noOfStar;
    private String overviewDescription;
    private int distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfStar() {
        return noOfStar;
    }

    public void setNoOfStar(int noOfStar) {
        this.noOfStar = noOfStar;
    }

    public String getOverviewDescription() {
        return overviewDescription;
    }

    public void setOverviewDescription(String overviewDescription) {
        this.overviewDescription = overviewDescription;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public ArrayList<String> getListOfStar() {
        return listOfStar;
    }

    public void setListOfStar(ArrayList<String> listOfStar) {
        this.listOfStar = listOfStar;
    }

    private ArrayList<String> listOfStar;

    public String getSystemInfo() {
        return "";
    }

}
