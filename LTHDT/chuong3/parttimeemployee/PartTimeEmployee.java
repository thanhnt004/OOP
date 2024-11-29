package parttimeemployee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    private int hoursPerWeek;
    public PartTimeEmployee(){}
    public PartTimeEmployee(String name, int age, char gender, String employeeName, String dateHired,
            int hoursPerWeek) {
        super(name, age, gender, employeeName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    @Override
    public void nhapTT()
    {
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Nhap so gio lam trong tuan: ");
            this.hoursPerWeek = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e)
        {
            System.err.println("Nhap sai dinh dang!");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\nSo gio lam trong tuan: "+this.hoursPerWeek;
    }
}
