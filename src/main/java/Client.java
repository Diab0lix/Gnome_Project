
import java.util.*;

/**
 * 
 */
public class Client {


    /**
     *
     */
    private String name;

    /**
     *
     */
    private String surname;
    protected Stock stock;

    /**
     * Default constructor
     */
    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        stock = Stock.getInstance();
    }


    /**
     * 
     */
    public void Hunt() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Buy() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Rent() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Sale() {
        // TODO implement here
    }

    /**
     *
     */
    public String getStock() {
        return stock.stockContent();
    }

}