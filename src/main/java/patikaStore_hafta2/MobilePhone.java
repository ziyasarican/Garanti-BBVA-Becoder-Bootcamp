package patikaStore_hafta2;

import java.util.ArrayList;
import java.util.HashMap;

import static patikaStore_hafta2.Repository.*;

public class MobilePhone extends Product{
    private String memory;
    private String battery;
    private String color;
    private Brand brand = new Brand();
    private static int id = 1;



    public MobilePhone(double price, double discountRate, int stockAmount, String name, Brand brand, String screenSize, String RAM, String memory, String battery, String color) {
        super(id, price, discountRate, stockAmount, name, brand, screenSize, RAM);
        id++;
        this.memory = memory;
        this.battery = battery;
        this.color = color;
        this.brand = brand;
    }

    public MobilePhone() {
        super();
    }

    @Override
    public void addItem() {
        System.out.println("-----Cep Telefonu Ekleme-----");
        brand.listBrandById();
        System.out.print("Ürün Markası(ID Giriniz): ");
        int brandId = scan.nextInt();
        Brand selectedBrand = null;
        for (Brand brand : brandList) {
            if (brand.getId() == brandId) {
                selectedBrand = brand;
                break;
            }
        }

        if (selectedBrand == null) {
            System.out.println("Geçersiz marka ID'si girdiniz.");
            return;
        }
        System.out.print("Ürün İsmi: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Ürün Fiyatı: ");
        Double price = scan.nextDouble();
        System.out.print("Ürün İndirim Oranı: ");
        Double discountRate = scan.nextDouble();
        System.out.print("Ürün Stok Miktarı: ");
        int stockAmount = scan.nextInt();
        System.out.print("Ürün Depolama Miktarı: ");
        scan.nextLine();
        String memory = scan.nextLine();
        System.out.print("Ürün Ekran Boyutu: ");
        String screenSize = scan.nextLine();
        System.out.print("Ürün Pil Kapasitesi: ");
        String battery = scan.nextLine();
        System.out.print("Ürün Ram Miktarı: ");
        String RAM = scan.nextLine();
        System.out.println("Ürün Rengi:");
        scan.nextLine();
        scan.nextLine();
        String color = scan.nextLine();

        MobilePhone mobilePhone = new MobilePhone(price, discountRate, stockAmount, name, selectedBrand, screenSize, RAM, memory, battery, color);
        Repository.mobilePhones.add(mobilePhone);
    }



    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }






    public void listMobilePhone() {
        Repository.listAllMobilePhones();
    }


    public void deletePhone() {
        Repository.deleteMobilePhoneById();
    }
}
