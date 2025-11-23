package nivel2Observer;

public class StockAgency implements StockObserver {

    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[Agency " + name + "] received update: " + message);
    }
}
