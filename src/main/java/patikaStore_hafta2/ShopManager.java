package patikaStore_hafta2;
import java.util.Scanner;
public class ShopManager {
    private Scanner scan = new Scanner(System.in);
    private boolean exit = false;
    Brand brand;
    MobilePhone mobilePhone = new MobilePhone();
    Notebook notebook = new Notebook();


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void run(){
        System.out.println("--------------------");
        System.out.println("Patika Store Yönetim Paneli");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");

        boolean check = true;
        System.out.print("Seçiminiz: ");
        String selection = scan.next();

        while(check){
            if(!selection.equals("0") && !selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")){
                System.out.println("Lütfen geçerli bir seçenek giriniz!");
                System.out.print("Seçiminiz: ");
                selection = scan.next();
            }else
                check = false;
        }

        switch (selection){
            case "0":
                System.out.println("Çıkış Yapıldı");
                break;
            case "1":
                notebookMenu();
                break;
            case "2":
                mobilePhoneMenu();
                break;
            case "3":
                System.out.println("-----Marka Listeleme----");
                brand.listBrand();
                System.out.println();
                run();
                break;
        }
    }

    private void notebookMenu() {
        boolean isContinue = true;
        while (isContinue){
            System.out.println("-----Notebook Yönetim Paneli-----");
            System.out.println("1 - Notebook Ekle");
            System.out.println("2 - Notebook Listele");
            System.out.println("3 - Notebook Sil");
            System.out.println("4 - Ana Menü");
            System.out.println("0 - Çıkış");

            boolean check = true;
            System.out.print("Seçiminiz: ");
            String selection = scan.next();
            while(check){
                if(!selection.equals("0") && !selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")){
                    System.out.println("Lütfen geçerli bir seçenek giriniz!");
                    System.out.print("Seçiminiz: ");
                    selection = scan.next();
                }else
                    check = false;
            }
            switch (selection){
                case "0":
                    System.out.println("Çıkış Yapıldı");
                    isContinue = false;
                    break;
                case "1":
                    System.out.println("Notebook telefonu ekle");
                    notebook.addItem();
                    break;
                case "2":
                    System.out.println("Notebook listele");
                    notebook.listNotebook();
                    break;
                case "3":
                    System.out.println("Notebook sil");
                    notebook.deleteNotebook();
                    break;
                case "4":
                    System.out.println("Ana menü");
                    isContinue = false;
                    run();
                    break;
            }
        }
    }

    private void mobilePhoneMenu() {
        boolean isContinue = true;
        while (isContinue){
            System.out.println("-----Cep Telefonu Yönetim Paneli-----");
            System.out.println("1 - Cep Telefonu Ekle");
            System.out.println("2 - Cep Telefonu Listele");
            System.out.println("3 - Cep Telefonu Sil");
            System.out.println("4 - Ana Menü");
            System.out.println("0 - Çıkış");

            boolean check = true;
            System.out.print("Seçiminiz: ");
            String selection = scan.next();
            while(check){
                if(!selection.equals("0") && !selection.equals("1") && !selection.equals("2") && !selection.equals("3") && !selection.equals("4")){
                    System.out.println("Lütfen geçerli bir seçenek giriniz!");
                    System.out.print("Seçiminiz: ");
                    selection = scan.next();
                }else
                    check = false;
            }
            switch (selection){
                case "0":
                    System.out.println("Çıkış Yapıldı");
                    isContinue = false;
                    break;
                case "1":
                    System.out.println("Cep telefonu ekle");
                    mobilePhone.addItem();
                    break;
                case "2":
                    System.out.println("Cep telefonu listele");
                    mobilePhone.listMobilePhone();
                    break;
                case "3":
                    System.out.println("Cep telefonu sil");
                    mobilePhone.deletePhone();
                    break;
                case "4":
                    System.out.println("Ana menü");
                    isContinue = false;
                    run();
                    break;
            }
        }
    }
}
