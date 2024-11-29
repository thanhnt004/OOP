package quanlibenhnhan;

import java.util.Scanner;

public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;
    public BenhVien() {
    }
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
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
    public String getGiamDoc() {
        return giamDoc;
    }
    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }
    public void nhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten benh vien: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap dia chi benh vien: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhap ten giam doc benh vien: ");
        this.giamDoc = sc.nextLine();
    }
    @Override
    public String toString() {
        return "Ten: "+this.ten + "\nDia chi: "+this.diaChi +"\nGiam doc: " +this.giamDoc;
    }
}
