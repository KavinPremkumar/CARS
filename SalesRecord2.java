package CarSalesPackageV2;

public class SalesRecord2 extends Inventory2 {
    static double TotalPrice;
    static double OldPrice;
    static double salesTax;
    static Car2[] c2 =new Car2[1];
    static int num;





        public static double FinalPrice(Car2 c1, String state){
            double pricessingFee = 3500.00;
            if(state.toLowerCase().equals("north carolina".toLowerCase())){
            salesTax = 0.0475;
            } else if (state.toLowerCase().equals(("south Carolina").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Alabama").toLowerCase())) {
                salesTax = 0.04;
            }else if (state.toLowerCase().equals(("Alaska").toLowerCase())) {
                salesTax = 0.0;
            }else if (state.toLowerCase().equals(("Arizona").toLowerCase())) {
                salesTax = 0.056;
            }else if (state.toLowerCase().equals(("Arkansas").toLowerCase())) {
                salesTax = 0.065;
            }else if (state.toLowerCase().equals(("California").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Colorado").toLowerCase())) {
                salesTax = 0.029;
            }else if (state.toLowerCase().equals(("Connecticut").toLowerCase())) {
                salesTax = 0.0635;
            } else if (state.toLowerCase().equals(("delaware").toLowerCase())) {
                salesTax = 0.0;
            }else if (state.toLowerCase().equals(("Florida").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Georgia").toLowerCase())) {
                salesTax = 0.04;
            }else if (state.toLowerCase().equals(("Hawaii").toLowerCase())) {
                salesTax = 0.04;
            }else if (state.toLowerCase().equals(("Idaho").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Illinois").toLowerCase())) {
                salesTax = 0.0625;
            }else if (state.toLowerCase().equals(("Indiana").toLowerCase())) {
                salesTax = 0.07;
            }else if (state.toLowerCase().equals(("Iowa").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Kansas").toLowerCase())) {
                salesTax = 0.065;
            }else if (state.toLowerCase().equals(("Kentucky").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Louisiana").toLowerCase())) {
                salesTax = 0.0445;
            }else if (state.toLowerCase().equals(("Maine").toLowerCase())) {
                salesTax = 0.055;
            }else if (state.toLowerCase().equals(("Maryland").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Massachusetts").toLowerCase())) {
                salesTax = 0.056;
            }else if (state.toLowerCase().equals(("Michigan").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Minnesota").toLowerCase())) {
                salesTax = 0.0688;
            }else if (state.toLowerCase().equals(("Mississippi").toLowerCase())) {
                salesTax = 0.07;
            }else if (state.toLowerCase().equals(("Missouri").toLowerCase())) {
                salesTax = 0.0423;
            }else if (state.toLowerCase().equals(("Montana").toLowerCase())) {
                salesTax = 0.0;
            }else if (state.toLowerCase().equals(("Nebraska").toLowerCase())) {
                salesTax = 0.055;
            }else if (state.toLowerCase().equals(("Nevada").toLowerCase())) {
                salesTax = 0.046;
            }else if (state.toLowerCase().equals(("New Hampshire").toLowerCase())) {
                salesTax = 0.0;
            }else if (state.toLowerCase().equals(("New Jersey").toLowerCase())) {
                salesTax = 0.0663;
            }else if (state.toLowerCase().equals(("New Mexico").toLowerCase())) {
                salesTax = 0.0513;
            }else if (state.toLowerCase().equals(("New York").toLowerCase())) {
                salesTax = 0.04;
            }else if (state.toLowerCase().equals(("North Dakota").toLowerCase())) {
                salesTax = 0.05;
            }else if (state.toLowerCase().equals(("Ohio").toLowerCase())) {
                salesTax = 0.0575;
            }else if (state.toLowerCase().equals(("Oklahoma").toLowerCase())) {
                salesTax = 0.045;
            }else if (state.toLowerCase().equals(("Oregon").toLowerCase())) {
                salesTax = 0.0;
            }else if (state.toLowerCase().equals(("pennsylvania").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("rhode Island").toLowerCase())) {
                salesTax = 0.07;
            }else if (state.toLowerCase().equals(("South Dakota").toLowerCase())) {
                salesTax = 0.045;
            }else if (state.toLowerCase().equals(("tennessee").toLowerCase())) {
                salesTax = 0.07;
            }else if (state.toLowerCase().equals(("Texas").toLowerCase())) {
                salesTax = 0.0625;
            }else if (state.toLowerCase().equals(("utah").toLowerCase())) {
                salesTax = 0.047;
            }else if (state.toLowerCase().equals(("Vermont").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("virginia").toLowerCase())) {
                salesTax = 0.043;
            }else if (state.toLowerCase().equals(("Washington").toLowerCase())) {
                salesTax = 0.065;
            }else if (state.toLowerCase().equals(("West Virginia").toLowerCase())) {
                salesTax = 0.06;
            }else if (state.toLowerCase().equals(("Wisconsin").toLowerCase())) {
                salesTax = 0.05;
            }else if (state.toLowerCase().equals(("Wyoming").toLowerCase())) {
                salesTax = 0.04;
            }
            double FinalPrice = c1.price +(c1.price*salesTax) + pricessingFee;
            TotalPrice = FinalPrice + OldPrice;
            c1.TotalPrice = FinalPrice;
            c2[num] = c1;
            num++;
            OldPrice = TotalPrice;
             return FinalPrice;
        }


    public static Car2[] getC2() {
        return c2;
    }
    public static Car2 getC2i(int i) {
        return c2[i];
    }

    public static void main(String[] args) {
        for (int i = 0; i < inventory.length; i++) {
            c2[i] = inventory[i];
        }


        for (int i = 0; i < getCarsLength(); i++) {
            System.out.println(getCars(i));
        }

        System.out.println(c2);

    }

}

