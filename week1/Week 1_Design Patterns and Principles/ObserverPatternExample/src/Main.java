
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        
        Observer mobileApp1 = new MobileApp("Mobile App 1");
        Observer mobileApp2 = new MobileApp("Mobile App 2");
        Observer webApp1 = new WebApp("Web App 1");

        
        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp1);

        
        stockMarket.setPrice(100.0);

        
        stockMarket.deregister(mobileApp2);

        
        stockMarket.setPrice(120.0);
    }
}
