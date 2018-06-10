public class Main {

    public static void main(String[] args) {

        //==================Market==================//

        Market sriLankanStockMarket = new Market();

        //==================Sectors==================//

        Sector financialSector = new Sector();
        Sector technologicalSector = new Sector();
        Sector manufacturingSector = new Sector();

        //==================Stocks==================//

        //Stocks of Financial Sector
        Stock hattonNationalBank = new Stock();
        Stock lolc = new Stock();

        //Stocks of Technological Sector
        Stock johnKeels = new Stock();
        Stock softlogic = new Stock();

        //Stocks of Manufacturing Sector
        Stock dutchLanka = new Stock();
        Stock sierra = new Stock();


        // ==========================================//
        // Stocks add to Sectors. Then Sectors add to Market
        // ==========================================//

        //first, add stocks to corresponding sectors
        financialSector.addToSector(hattonNationalBank);
        financialSector.addToSector(lolc);

        technologicalSector.addToSector(johnKeels);
        technologicalSector.addToSector(softlogic);

        manufacturingSector.addToSector(dutchLanka);
        manufacturingSector.addToSector(sierra);

        //second, add above sectors to the market
        sriLankanStockMarket.addToMarket(financialSector);
        sriLankanStockMarket.addToMarket(technologicalSector);
        sriLankanStockMarket.addToMarket(manufacturingSector);

        ////////////////////////////////////////////////////////
        //increasing, decreasing values of the market/sectors/stocks
        ////////////////////////////////////////////////////////

        //increase value of whole stock market by 4
        sriLankanStockMarket.increaseStockValuesInMarket(4);

        //increase only technological stock market by 7
        technologicalSector.increaseStockValuesInSector(7);

        //increase dutchLanka stock by 13
        dutchLanka.increseStockValue(13);

        //increase johnKeels stock by 13
        johnKeels.increseStockValue(15);


        //print results
        System.out.println(hattonNationalBank.getStockPrice()); // increased market value by 4 = final value 4
        System.out.println(softlogic.getStockPrice()); // increased market value by 4 + increased technological sector value by 7 = final value 11
        System.out.println(dutchLanka.getStockPrice()); // increased market value by 4 + increased dutchLanka stock value by 13 = final value 17
        System.out.println(johnKeels.getStockPrice()); // increased market value by 4 + increased technological sector value by 7 + increased johnKeels stock value by 15 = final value 26
    }
}
