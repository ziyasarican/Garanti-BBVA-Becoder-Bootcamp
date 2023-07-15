package employee_hafta2;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double calculateTax(double salary){
        double tax = (salary > 1000) ? (salary*0.03) : 0;
        return tax;
    }

    public double calculateBonus(int workHours){
        double bonus = (workHours > 40) ? ((workHours - 40) * 30) : 0;
        return bonus;
    }

    public double raiseSalary (int hireYear){
        int tempYear = 2021 - hireYear;
        double raiseSalaryAmount = 0;
        if (tempYear < 9)
            raiseSalaryAmount = this.salary * 0.05;
        else if (tempYear < 20)
            raiseSalaryAmount = this.salary * 0.10;
        else if (tempYear >= 20)
            raiseSalaryAmount = this.salary * 0.15;


        return raiseSalaryAmount;
    }

    public String toString(){
        String text = "\n" +
                "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + calculateTax(this.salary) +
                "\nBonus: " + calculateBonus(this.workHours) +
                "\nVergi ve Bonuslar ile Maaş: " + (double)(this.salary - calculateTax(this.salary) + calculateBonus(this.workHours)) +
                "\nToplam Maaş: " + (double)(this.salary + this.raiseSalary(this.hireYear));
        return text;
    }
}
