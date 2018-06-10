import java.util.ArrayList;
import java.util.List;

public class Sector {

    public List<Stock> stockList = new ArrayList<>();

    public void addToSector(Stock stock){
        stockList.add(stock);
    }

    public  void increaseStockValuesInSector(int i){
        for(Stock stock:stockList){
            stock.increseStockValue(i);
        }
    }

    public  void decreaseStockValuesInSector(int i){
        for(Stock stock:stockList){
            stock.decreaseStockValue(i);
        }
    }
}
