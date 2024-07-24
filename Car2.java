package CarSalesPackageV2;

import CarSalesProject.Car;

public class Car2 {
        protected String model;
        protected int year;
        protected String type;
        protected double price;
        protected String range;
        protected double TotalPrice = 0;

        public Car2(String carModel, int carYear, String carType, double carPrice, String carRange){
            this.model = carModel;
            this.year = carYear;
            this.type = carType;
            this.price = carPrice;
            this.range = carRange;
        }


    @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    ", type='" + type + '\'' +
                    ", price=" + price +
                    ", range='" + range + '\'' +
                    ", totalPrice=" + TotalPrice +
                    '}';
        }

        public double getTotalPrice() {
            return TotalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.TotalPrice = totalPrice;
        }

        public String getRange() {
            return range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public static void main(String[] args) {
            CarSalesProject.Car car1 =  new CarSalesProject.Car("Honda Pilot", 2016, "gas", 45000.00, "45k-50k");
            System.out.println(car1);
        }

}
