import java.util.ArrayList;
import java.util.List;

public class Market {

    private List<Sector> sectorList = new ArrayList<>();

    public void addToMarket(Sector sector){
        sectorList.add(sector);
    }

    public void increaseStockValuesInMarket(int i){
        for(Sector sector:sectorList){
            for(Stock stock:sector.stockList){
                stock.increseStockValue(i);
            }
        }
    }

    public void decreaseStockValuesInMarket(int i){
        for(Sector sector:sectorList){
            for(Stock stock:sector.stockList){
                stock.decreaseStockValue(i);
            }
        }
    }
}
