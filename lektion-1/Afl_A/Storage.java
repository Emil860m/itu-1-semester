import java.util.ArrayList;
public class Storage {
    protected String storageId;
    protected double price;
    public Storage(String storageId, double price) {
        this.storageId = storageId;
        this.price = price;
    }
    
    public void display() {
        System.out.println(" ** Storage Info ** ");
        System.out.println("ID: " + storageId);
        System.out.println("Price: " + price);
    }
    
    
}