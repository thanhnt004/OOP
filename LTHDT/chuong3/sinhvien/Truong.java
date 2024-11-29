package sinhvien;

import java.util.Scanner;

import org.xml.sax.SAXException;

public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;
    public Truong() {
    }
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getHieuTruong() {
        return hieuTruong;
    }
    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten truong: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap dia chi truong: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhap ten hieu truong: ");
        this.hieuTruong = sc.nextLine();
    }
    @Override
    public String toString() {
        return "Ten: "+ten+"\nDia chi: "+diaChi+ "\nTen hieu truong: "+hieuTruong;
    }
}