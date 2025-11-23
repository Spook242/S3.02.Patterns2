package nivel2Observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent {

    private List<StockObserver> observers = new ArrayList<>();
    private int stockValue;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }


    private void notifyObservers(String message) {
        for (StockObserver obs : observers) {
            obs.update(message);
        }
    }

    public void setStockValue(int newValue) {
        String trend = (newValue > stockValue)
                ? "Stock is going UP!"
                : (newValue < stockValue)
                ? "Stock is going DOWN!"
                : "No change.";

        stockValue = newValue;

        notifyObservers("New value: " + newValue + " — " + trend);
    }
}
