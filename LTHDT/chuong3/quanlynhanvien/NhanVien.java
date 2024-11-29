package quanlynhanvien;

import java.util.Scanner;

import diachi.Address;

public class NhanVien {
    private String name;
    private String id;
    private Address diaChi;
    private String dob;
    private char gender;
    public NhanVien() {
        name = "";
        id = "";
        diaChi = new Address();
        dob = "";
        gender = 'o';
    }
    public NhanVien(String name, String id, Address diaChi, String dob, char gender) {
        this.name = name;
        this.id = id;
        this.diaChi = diaChi;
        this.dob = dob;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Address getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(Address diaChi) {
        this.diaChi = diaChi;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ho va ten nhan vien: ");
        this.name = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi.nhapThongTin();
        System.out.print("Nhap ngay sinh: ");
        this.dob = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        this.gender = sc.nextLine().charAt(0);
    }
    @Override
    public String toString() {
        return "ID: "+ this.id +"\nTen: "+this.name+"\n"+this.diaChi.toString()+"\nNgay Sinh: "+ this.dob+"\n Gioi tinh: "+this.gender;
    }
    
}
