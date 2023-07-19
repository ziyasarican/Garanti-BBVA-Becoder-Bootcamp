package patikaStore_hafta2;

import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
    public static Scanner scan = new Scanner(System.in);
    static ArrayList<MobilePhone> mobilePhones = new ArrayList<>();
    static ArrayList<Notebook> notebooks = new ArrayList<>();
    static ArrayList<Brand> brandList = new ArrayList<>();
    private static Brand brand;

    public static ArrayList<Brand> getBrands() {
        return brandList;
    }

    public static void setBrands(ArrayList<Brand> brands) {
        Repository.brandList = brands;
    }

    public static ArrayList<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }
    public static void setMobilePhones(ArrayList<MobilePhone> mobilePhones) {
        Repository.mobilePhones = mobilePhones;
    }
    static {
        brandList.add(new Brand(1, "Xiaomi"));
        brandList.add(new Brand(2, "Asus"));
        brandList.add(new Brand(3, "Casper"));
        brandList.add(new Brand(4, "Hp"));
        brandList.add(new Brand(5, "Huawei"));
        brandList.add(new Brand(6, "Lenovo"));
        brandList.add(new Brand(7, "Monster"));
        brandList.add(new Brand(8, "Samsung"));
        brandList.add(new Brand(9, "Apple"));
    }
    static{
        notebooks.add(new Notebook(7000.0,10, 5, "Matebook 14", brandList.get(4), "14.3", "8", "256" ));
    }
    static {
        mobilePhones.add(new MobilePhone(3199, 10, 15, "GALAXY A51", brandList.get(1), "6.5", "4", "128", "4000", "black"));
        mobilePhones.add(new MobilePhone(2199, 10, 15, "14 Pro", brandList.get(3), "6.5", "6", "128", "4000", "white"));
        mobilePhones.add(new MobilePhone(4199, 10, 15, "S20 Pro", brandList.get(2), "6.5", "4", "128", "4000", "black"));
    }

    public static void listAllMobilePhones(){
        for (MobilePhone phone : mobilePhones){
            System.out.println("ID: " + phone.getId() + "\tBrand: " + phone.getBrand().getName() + "\tModel: " + phone.getName() +  "\tScreen Size: " + phone.getScreenSize() + "\tRAM: " + phone.getRAM() +
                    "\tMemory: " + phone.getMemory() + "\tBattery: " + phone.getBattery() + "\tColor: " + phone.getColor() +
                    "\tPrice: " + phone.getPrice() + "\tDiscount Rate: " + phone.getDiscountRate() + "\tStock Amount: " + phone.getStockAmount() + "\n");
        }
    }
    public static void listAllNotebooks() {
        for (Notebook notebook : notebooks){
            System.out.println("ID: " + notebook.getId() + "\tBrand: " + notebook.getBrand().getName() + "\tModel: " + notebook.getName() +  "\tScreen Size: " + notebook.getScreenSize() + "\tRAM: " + notebook.getRAM() +
                    "\tMemory: "  + "\tBattery: "  + "\tColor: " +
                    "\tPrice: " + notebook.getPrice() + "\tDiscount Rate: " + notebook.getDiscountRate() + "\tStock Amount: " + notebook.getStockAmount() + "\n");
        }
    }


    public static void deleteMobilePhoneById() {
        listAllMobilePhones();
        System.out.print("Silmek istediğiniz ürün ID:");
        int deleteId = scan.nextInt();
        mobilePhones.remove(deleteId-1);
        System.out.println("Telefon Silindi");
    }



    public static void deleteNotebookById() {
        listAllNotebooks();
        System.out.print("Silmek istediğiniz ürün ID:");
        int deleteId = scan.nextInt();
        notebooks.remove(deleteId-1);
        System.out.println("Notebook Silindi");
    }
}
