package diachi;

import java.util.Scanner;

public class Address {
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;
    public Address() {
    }
    public Address(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }
    public String getThon() {
        return thon;
    }
    public void setThon(String thon) {
        this.thon = thon;
    }
    public String getXa() {
        return xa;
    }
    public void setXa(String xa) {
        this.xa = xa;
    }
    public String getHuyen() {
        return huyen;
    }
    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }
    public String getTinh() {
        return tinh;
    }
    public void setTinh(String tinh) {
        this.tinh = tinh;
    }
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thon: ");
        this.thon = sc.nextLine();
        System.out.print("Nhap xa: ");
        this.xa = sc.nextLine();
        System.out.print("Nhap huyen: ");
        this.huyen = sc.nextLine();
        System.out.print("Nhap tinh: ");
        this.tinh = sc.nextLine();
}
    @Override
    public String toString() {
        return "Dia chi: thon " + thon + ", xa " + xa + ", huyen " + huyen + ", tinh " + tinh ;
    }
}
