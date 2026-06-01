package dsa.oops.interfaces.ObserverMech;
import java.util.Observable;
import java.util.Observer;

public class obsvable extends Observable{

    int s;
    obsvable(int s){
        this.s = s;
    }
  void setmetho(int s){

        setChanged();
        notifyObservers(s);
    }

}
class observer implements Observer{
    String name;
    observer(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " "+ ":"+arg);
    }

}