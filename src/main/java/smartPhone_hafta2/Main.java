package smartPhone_hafta2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<SmartPhone> smartPhones = new ArrayList<>();

        SmartPhone smartPhone1 = new SmartPhone(1, "Iphone 14 Pro", 1400, "543", "256", "6", "12 MP");
        SmartPhone smartPhone2 = new SmartPhone(2, "Iphone 13 Pro", 800, "542", "256", "4", "12 MP");
        SmartPhone smartPhone3= new SmartPhone(3, "Iphone 12 Pro", 600, "532", "256", "4", "8 MP");
        SmartPhone smartPhone4 = new SmartPhone(4, "Iphone 11 Pro", 500, "531", "256", "3", "8 MP");
        SmartPhone smartPhone5 = new SmartPhone(5, "Iphone 10 Pro", 400, "505", "256", "3", "8 MP");

        smartPhones.add(smartPhone1);
        smartPhones.add(smartPhone2);
        smartPhones.add(smartPhone3);
        smartPhones.add(smartPhone4);
        smartPhones.add(smartPhone5);

        System.out.println("Total Price: " + calculateTotalPrice(smartPhones));
    }

    public static Double calculateTotalPrice(ArrayList<SmartPhone> smartPhones){

        double totalPrice = 0;
        for(SmartPhone phone : smartPhones){
            totalPrice += phone.getPrice();
        }

        return totalPrice;
    }
}
