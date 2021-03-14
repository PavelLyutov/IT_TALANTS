package port;

import java.util.LinkedList;
import java.util.Queue;

public class Dock {

    private int id;
    private Queue<Ship> queue;
    private volatile boolean nowUnloading;

    public Dock(int id){
        this.id = id;
        queue = new LinkedList<>();
        nowUnloading = false;
    }

    public int getId() {
        return id;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void addShip(Ship ship){
        queue.offer(ship);
    }

    public void removeShip(){
        queue.poll();
    }

    public void setNowUnloading(boolean nowUnloading) {
        this.nowUnloading = nowUnloading;
    }

    public Ship getNextShip(){
        return queue.peek();
    }

    public boolean isNowUnloading() {
        return nowUnloading;
    }
}
