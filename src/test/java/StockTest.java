import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @org.junit.jupiter.api.Test
    void getInstance() {
    }

    @org.junit.jupiter.api.Test
    void addGnome() {
        Stock stock = Stock.getInstance();
        Gnome michel = new Handicaped(1,"michel",8,"red","small","thin","female",0);
        stock.addGnome(michel);
        out.println(stock.listGnomeStock);
    }

    @org.junit.jupiter.api.Test
    void delGnome() {
        Stock stock = Stock.getInstance();
        Gnome michel = new Handicaped(1,"michel",8,"red","small","thin","female",0);
        stock.addGnome(michel);
        out.println(stock.listGnomeStock);
        stock.delGnome(michel);
        out.println(stock.listGnomeStock);
    }

    @org.junit.jupiter.api.Test
    void moveGnome() {
    }
}