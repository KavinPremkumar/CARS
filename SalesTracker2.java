package CarSalesPackageV2;


import CarSalesProject.SaleRecord;

import static CarSalesPackageV2.SalesRecord2.c2;
import static CarSalesPackageV2.SalesRecord2.getC2;

public class SalesTracker2 {
    public static void addSale(Car2 c2, String State){
        System.out.println(SalesRecord2.FinalPrice(c2, State));
    }

    public static void displayAllSales(){
        for (int i = 0; i < getC2().length; i++) {
            System.out.println(SalesRecord2.getC2i(i));
        }
    }

    public static Car2 getSalesbyModel(String Model){
        Car2 name = null;
        System.out.println("The following car sales are: " + Model + "\'s!");
        for (int i = 0; i < c2.length; i++) {
            if (c2[i].model.toLowerCase().equals(Model.toLowerCase())) {
                name = c2[i];
            } else{
                System.out.println("Not the Car I'm looking for.");
            }

        }
        return name;
    }

}
