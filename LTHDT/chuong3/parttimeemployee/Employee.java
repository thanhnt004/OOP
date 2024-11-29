package parttimeemployee;

import java.util.Scanner;

public class Employee extends Person{
    private String employeeName;
    private String dateHired;
    public Employee(){}
    public Employee(String name, int age, char gender, String employeeName, String dateHired) {
        super(name, age, gender);
        this.employeeName = employeeName;
        this.dateHired = dateHired;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDateHired() {
        return dateHired;
    }
    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    @Override
    public void nhapTT()
    {
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien: ");
        this.employeeName = sc.nextLine();
        System.out.print("Nhap ngay vao cong ty: ");
        this.dateHired = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + "\nTen nhan vien: "+this.employeeName +"\nNgay tuyen dung:" +this.dateHired;
    }
}
