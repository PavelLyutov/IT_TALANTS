package petrol;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Receipt {
    private int fuel;
    private FuelType fuelType;
    private String kolonka;
    private LocalDateTime date;

    public Receipt(int fuel, FuelType fuelType, String kolonka, LocalDateTime date) {
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.kolonka = kolonka;
        this.date = date;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getKolonka() {
        return kolonka;
    }

    public int getFuel() {
        return fuel;
    }
}
