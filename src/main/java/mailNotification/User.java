package mailNotification;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String name;
    private String lastNotification;

    public User (String name){
        this.name = name;
    }

    public String getLastNotification(){
        return this.lastNotification;
    }
    public void signIn(Newsletter newsletter){
        newsletter.addObserver(this);
    }
    public void update(Observable newsletter, Object arg1){
        this.lastNotification = "Nova mensagem para " + this.name + ":" + newsletter.toString();
    }
}
