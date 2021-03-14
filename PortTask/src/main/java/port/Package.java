package port;

public class Package {

    private int id;
    private static int uniqueID = 0;

    public Package(){
        this.id = ++uniqueID;
    }

    public int getId() {
        return id;
    }
}
