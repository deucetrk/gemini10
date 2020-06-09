package rc.bootsecurity.model;

public class Supporter extends User{


    private String notification;


    public String sendNotification(String notification){
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

}
