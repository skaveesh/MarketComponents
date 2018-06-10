public class Stock {

    private int stockPrice;

    public void increseStockValue(int i){
        stockPrice += i;
    }

    public void decreaseStockValue(int i){
        stockPrice -= i;
    }

    public int getStockPrice() {
        return stockPrice;
    }
}


