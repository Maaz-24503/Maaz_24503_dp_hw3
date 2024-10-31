import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observers;
    public void attach(Observer obs){
        if(observers == null) observers = new ArrayList<>();
        observers.add(obs);
    }
    public void detach(Observer obs){
        if(observers != null)
            observers.remove(obs);
    }
    public void notifyObservers(){
        if(observers!=null)
            for(Observer obs: observers){
                obs.update(this);
            }
    }
    public abstract String getState();
}
