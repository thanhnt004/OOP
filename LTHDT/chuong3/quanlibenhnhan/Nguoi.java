package quanlibenhnhan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;
    public Nguoi() {
    }
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public char getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void nhapThongTin() throws InputMismatchException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine().charAt(0);
    }
    @Override
    public String toString() {
        return "Ten: "+ this.ten + "\nTuoi: "+this.tuoi +"\nGioi tinh: "+this.gioiTinh;
    }
    
}
