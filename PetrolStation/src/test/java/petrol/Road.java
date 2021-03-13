package petrol;

import javax.swing.table.TableRowSorter;

public class Road extends Thread {

    public static PetrolStation petrolStation ;
    @Override
    public void run() {
        int i =1;
        while(true) {
            Car car = new Car(i++);
            petrolStation.enterCar(car);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
