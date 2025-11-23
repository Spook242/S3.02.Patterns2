package nivel2Observer;

public class Main {
    public static void main(String[] args) {

        StockAgent agent = new StockAgent();

        StockAgency agencyA = new StockAgency("AlphaInvest");
        StockAgency agencyB = new StockAgency("GlobalMarkets");
        StockAgency agencyC = new StockAgency("FutureAnalytics");

        agent.addObserver(agencyA);
        agent.addObserver(agencyB);
        agent.addObserver(agencyC);

        agent.setStockValue(100);
        agent.setStockValue(120);
        agent.setStockValue(90);
        agent.setStockValue(90);
    }
}
