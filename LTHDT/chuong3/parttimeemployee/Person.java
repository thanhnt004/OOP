package parttimeemployee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private char gender;
    public Person() {
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void nhapTT()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        try
        {
            System.out.print("Nhap tuoi: ");
            this.age = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e)
        {
            System.err.println("Tuoi khong hop le!");
        }
        System.out.print("Nhap gioi tinh: ");
        this.gender = sc.nextLine().charAt(0);
    }
    @Override
    public String toString() {
        return "Ten: "+this.name +"\nTuoi: "+this.age + "\nGioi tinh: "+this.gender;
    }
}
