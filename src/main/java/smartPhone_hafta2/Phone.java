package smartPhone_hafta2;

public abstract class Phone extends Product{
    private String phoneNumber;

    public Phone(int id, String name, double price, String phoneNumber) {
        super(id, name, price);
        this.phoneNumber = phoneNumber;
    }

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone() {

    }

    @Override
    public void getInfo() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
