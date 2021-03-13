package petrol;

import java.util.LinkedList;
import java.util.Queue;

public class Kolonka {
    private int id;
    private Queue<Car> queue;
    private boolean nowFueling;



    public Kolonka(int id) {
        this.id = id;
        this.queue = new LinkedList<>();
        nowFueling = false;

    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void addCar(Car car){
        queue.offer(car);

    }

    public void removeCar(Car car){
        queue.poll();
    }

    public  Car getNextCar(){
        return queue.peek();
    }

    public boolean nowFueling() {
        return nowFueling;
    }



    public void setNowFueling(boolean nowFueling) {
        this.nowFueling = nowFueling;
    }

    public boolean nowPaying() {
        return queue.peek().isNowPaying();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kolonka{" +
                 + id +
                '}';
    }
}
