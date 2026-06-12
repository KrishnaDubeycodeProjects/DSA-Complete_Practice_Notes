package dsa.oops.interfaces.Observer;

import java.util.Observable;
import java.util.Observer;

public class obs extends Observable
{   int s;
    obs(int s){
        this.s =s;
    }
    int setMethod(int s){
        setChanged();
        notifyObservers(s);
       return s;
    }
}
class obserer implements Observer {
    int s;
    obserer(int s){
        this.s = s;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(s+""+arg);

    }
}


