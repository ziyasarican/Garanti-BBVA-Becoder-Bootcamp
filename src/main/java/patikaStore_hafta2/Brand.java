package patikaStore_hafta2;

import java.util.*;

import static patikaStore_hafta2.Repository.brandList;
import static patikaStore_hafta2.Repository.getMobilePhones;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Comparator<Brand> getCompareById() {
        return compareById;
    }

    public static void setCompareById(Comparator<Brand> compareById) {
        Brand.compareById = compareById;
    }

    public Brand() {
    }
    @Override
    public int compareTo(Brand brand) {
        return this.name.compareTo(brand.getName());
    }
    public static Comparator<Brand> compareById = new Comparator<Brand>() {
        @Override
        public int compare(Brand brand1, Brand brand2) {
            return Integer.compare(brand1.id, brand2.id);
        }
    };
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Brand> getBrandList() {
        return brandList;
    }



    public void listBrand(){

        Collections.sort(brandList);
        System.out.println("--------------------");
        System.out.println("Markalarımız:");
        for (Brand brand : brandList){
            System.out.println(" - " + brand.getName());
        }
    }

    public void listBrandById(){

        Collections.sort(brandList, Brand.compareById);
        System.out.println("--------------------");
        System.out.println("Markalarımız:");
        for (Brand brand : brandList){
            System.out.println(brand.getId() + " - " + brand.getName());
        }
    }

}
