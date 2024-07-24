package CarSalesPackageV2;

import static CarSalesPackageV2.SalesRecord2.*;

public class Inventory2{
    static Car2[] inventory = new Car2[3];
    static int num;

    public static Car2 getCars(int i) {
        return inventory[i];
    }
    public static int getCarsLength() {
        return inventory.length;
    }

    public static void setCars(Car2[] cars) {
        Inventory2.inventory = cars;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Inventory2.num = num;
    }

    public static void addCar(String Model, int Year, String Type, double Price, String Range){
        Car2 name = new Car2(Model, Year, Type, Price, Range);
        inventory[num] = name;
        num++;
    }

    public static void removeCar(String model, int year, String type, double price, String range) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].model.toLowerCase().equals(model.toLowerCase()) & inventory[i].year == year & inventory[i].type.toLowerCase().equals(type.toLowerCase()) & inventory[i].price == price & inventory[i].range.toLowerCase().equals(range.toLowerCase())) {
                for (int j = i; j < inventory.length; j++) {
                    int a = j+1;
                    if (j == inventory.length - 1) {
                        inventory[j] = null;
                    } else {
                        inventory[j] = inventory[a];
                    }
                }
                break;
            }
        }

    }


    public static void searchByModel(String Model){
        System.out.println("The following cars are: "+ Model + "\'s!" );
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].model.toLowerCase().equals(Model.toLowerCase())) {
                System.out.println(inventory[i]);
            }
        }
    }

    public static void searchByRange(String Range){
        System.out.println("The following car sales are in the  "+ Range + " Price range!" );
        for (int i = 0; i < inventory.length-1; i++) {
            if (inventory[i].range.toLowerCase().equals(Range.toLowerCase())) {
                System.out.println(inventory[i]);
            }
        }
    }

    public static void displayInventory(){
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }
    }

    public static void main(String[] args) {
        addCar("nissan rogue", 2041, "gas", 35000.00, "30-35k");
        addCar("HONda CivIc", 1948, "gas", 25000.00, "20-25k");
        addCar("nissan rogue", 2091, "gas", 35080.00, "30-35k");
//        for (int i = 0; i < inventory.length; i++) {
//            System.out.println(inventory[i]);
//        }
        searchByModel("nissan rogue");
        removeCar("NissaN RoGUe", 2041, "GaS", 35000.00, "30-35K");
        System.out.println("After Removing");
        displayInventory();


        SalesTracker2.addSale(inventory[0], "Arizona");

        System.out.println(inventory[0]);
        System.out.println(TotalPrice);
        SalesTracker2.displayAllSales();
        System.out.println(SalesTracker2.getSalesbyModel("honda civic"));
        searchByRange("30-35k");
    }


}
