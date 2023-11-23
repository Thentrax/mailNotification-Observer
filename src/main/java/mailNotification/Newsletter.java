package mailNotification;

import java.util.Observable;

public class Newsletter extends Observable {
    private String message;

    public Newsletter (String message){
        this.message = message;
    }
    public void lauchNew(){
        setChanged();
        notifyObservers();
    }
    @Override
    public String toString(){
        return message;
    }
}
