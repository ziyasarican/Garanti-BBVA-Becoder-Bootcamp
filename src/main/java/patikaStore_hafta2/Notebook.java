package patikaStore_hafta2;

import static patikaStore_hafta2.Repository.brandList;
import static patikaStore_hafta2.Repository.scan;

public class Notebook extends Product{
    private String memory;
    private Brand brand = new Brand();
    private static int id = 1;

    public Notebook(double price, double discountRate, int stockAmount, String name, Brand brand, String screenSize, String RAM, String memory) {
        super(id, price, discountRate, stockAmount, name, brand, screenSize, RAM);
        id++;
        this.memory = memory;
        this.brand = brand;
    }

    public Notebook( ) {

    }

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }


    @Override
    public void addItem() {
        System.out.println("-----Notebook Telefonu Ekleme-----");
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

        System.out.print("Ürün Ram Miktarı: ");
        String RAM = scan.nextLine();


        Notebook notebook = new Notebook(price, discountRate, stockAmount, name, selectedBrand, screenSize, RAM, memory);
        Repository.notebooks.add(notebook);
    }

    public void listNotebook() {
        Repository.listAllNotebooks();
    }

    public void deleteNotebook() {
        Repository.deleteNotebookById();

    }
}
