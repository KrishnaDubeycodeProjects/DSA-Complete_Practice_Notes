package dsa.oops.interfaces.ObserverMech;

public class obsexecu {
    public static void main(String[] args) {
        obsvable obj = new obsvable(5);
        observer obj2 = new observer("krishna");
        obj.addObserver(obj2);
        obj.setmetho(3);
    }
}
