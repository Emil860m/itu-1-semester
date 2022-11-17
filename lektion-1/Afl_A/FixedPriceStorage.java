import java.util.ArrayList;

public class FixedPriceStorage extends PhysicalStorage {
    
    private int keyCounter = 0;

    public FixedPriceStorage(String storageId, double price) {
        super(storageId, price);
    }

    
    

    @Override
    public void addKeyCardNumber(String cardNumber) {
        super.addKeyCardNumber(cardNumber);
        keyCounter++;
        if (keyCounter % 3 == 0) price += 1000;
    }
}

