package petrol;

public class Benzindjiq  extends Thread{
    private int id;
    public static PetrolStation petrolStation;

    Benzindjiq(int id){
        this.id = id;
    }


    @Override
    public void run() {
        while (true){
            try {
                petrolStation.fuelCars();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
