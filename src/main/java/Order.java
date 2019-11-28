
import org.graalvm.compiler.nodes.extended.ArrayRangeWrite;

import java.util.*;
import java.lang.*;
/**
 *
 */
public class Order {

    private ArrayList<Gnome> gnomeList;
    private double price;
    private int customerID,sellerID;

    public static enum OrderType{
        Lent,
        Rented,
        Bought,
        Sold;
    }

    private OrderType type;



    /**
     * Miniaml constructor
     * @param {OrderType} order
     * @param {int} customerID
     * @param {int} sellerID
     */
    public Order(OrderType type, int customerID,int sellerID){
        this(null, type, customerID, sellerID);
    }

    /**
     * Complete constructor
     * @param {ArrayList<Gnome>} list
     * @param {OrderType} type
     * @param {int} customerID
     * @param {int} sellerID
     */
    public Order(ArrayList<Gnome> list,OrderType type,int customerID,int sellerID){
        gnomeList = new ArrayList<>();
        price = 0;
        this.type = type;
        if(list != null) {
            for (int i = 0; i < list.size(); i++) {
                Gnome gnome = list.get(i);
                gnomeList.add(gnome);
                price += gnome.getPrice();
            }
        }
    }
    // Getters

    /**
     * Gives the list of Gnomes concerned by the transaction
     * @return {ArrayList<Gnome>} list of concerned Gnomes
     */
    public ArrayList<Gnome> getListGnome(){return this.gnomeList;}

    /**
     * Gives the total price of this transaction
     * @return {double} bill
     */
    public double getPrice(){return this.price;}

    /**
     * ID of the person losing money
     * @return {int} client's ID
     */
    public int getIDClient(){return this.customerID;}

    /**
     * Gives the nature of the transaction
     * @return {OrderType} nature
     */
    public OrderType getOrderType(){return this.type;}

    // setters

    /**
     * add a single gnome to the list
     * @param gnome {Gnome}
     */
    public void addGnome(Gnome gnome){
        this.gnomeList.add(gnome);
    }

    /**
     * Add multiple gnomes to the list
     * @param gnome {ArrayList<Gnome>}
     */
    public void addGnome(ArrayList<Gnome> gnome){
        if(gnome !=null)
            for (int i = 0; i < gnome.size(); i++)
                addGnome(gnome.get(i));
    }

    /**
     * generate a receipt for the other party
     * @return {Order}
     */
    public Order generateOtherPartyOrder(){
        OrderType type = OrderType.Bought;
        switch(this.type){
            case Lent:
                type = OrderType.Rented;
                break;
            case Rented:
                type = OrderType.Lent;
                break;
            case Bought:
                type = OrderType.Sold;
                break;
            default:
                break;
        }
        return new Order(this.gnomeList,type,this.customerID,this.sellerID);
    }
}
