package Polimorfismo.Exercicio.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, double price, LocalDate date) {
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }


}
