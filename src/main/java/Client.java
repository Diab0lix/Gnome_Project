import java.util.*;

public class Client {

    protected String name;
    protected String surname;
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
        System.out.println("A client can t hunt");
    }

    public void Buy() {
        // TODO implement here
        Normal thomas = new Normal();
        this.wallet = this.wallet - thomas.getPrice();
        stock.addGnome(thomas);
    }

    public void Rent() {
        // TODO implement here
        Normal thomas = new Normal();
        thomas.getPrice();
        stock.listRentedGnome.add(thomas);
    }

    public void Sale(Gnome gnome) {
        // TODO implement here
        wallet += gnome.getPrice() ;
        stock.delGnome(gnome);
    }

    public String getStock() {
        return stock.stockContent();
    }

}
