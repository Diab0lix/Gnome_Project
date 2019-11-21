import java.util.*;

public class Client {

    private String name;

    private String surname;
    protected Stock stock;
    protected double wallet;

    /**
     * Default constructor
     */
    public Client(String name, String surname, double wallet) {
        this.name = name;
        this.surname = surname;
        this.wallet =  wallet;
        stock = Stock.getInstance();
    }

    public void AddFunds(double money) {
        this.wallet += money;
    }

    public double GetFunds() {
        return wallet;
    }

    public void Hunt() {
        // TODO implement here
    }

    public void Buy() {
        // TODO implement here
    }

    public void Rent() {
        // TODO implement here
    }

    public void Sale() {
        // TODO implement here
    }

    public String getStock() {
        return stock.stockContent();
    }

}
