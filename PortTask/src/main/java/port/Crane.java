package port;

public class Crane extends Thread{

    public static Port port;
    private int number;

    public Crane(int id){
        this.number = id;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        while(true){
            try {
                port.unload(this);
            } catch (Exception e) {
                System.out.println("Kofti trupka - " + e.getMessage());
                return;
            }
        }
    }
}
