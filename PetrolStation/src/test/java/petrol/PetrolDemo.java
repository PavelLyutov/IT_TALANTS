package petrol;

public class PetrolDemo {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation("Lukoil");
        Road.petrolStation = petrolStation;
        Benzindjiq.petrolStation  = petrolStation;
        Benzindjiq b1 = new Benzindjiq(1);
        Benzindjiq b2 = new Benzindjiq(2);


        b1.start();
        b2.start();
        new Road().start();



    }
}