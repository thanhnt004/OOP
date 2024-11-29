package quanlibenhnhan;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
    private String tieuSu;
    private String chanDoan;
    private BenhVien benhVien;
    public BenhNhan()
    {
        super();
        benhVien = new BenhVien();
    }
    public BenhNhan(String ten, int tuoi, char gioiTinh, String tieuSu, String chuanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tieuSu = tieuSu;
        this.chanDoan = chuanDoan;
        this.benhVien = benhVien;
    }
    public String getTieuSu() {
        return tieuSu;
    }
    public void setTieuSu(String tieuSu) {
        this.tieuSu = tieuSu;
    }
    public String getChanDoan() {
        return chanDoan;
    }
    public void setChanDoan(String chuanDoan) {
        this.chanDoan = chuanDoan;
    }
    public BenhVien getBenhVien() {
        return benhVien;
    }
    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    @Override
    public void nhapThongTin()
    {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tieu su benh nhan: ");
        this.tieuSu = sc.nextLine();
        System.out.print("Nhap chuan doan: ");
        this.chanDoan = sc.nextLine();
        System.out.println("Nhap thong tin benh vien: ");
        this.benhVien.nhapThongTin();
    }
    @Override
    public String toString() {
        return super.toString() + "\nTieu su: " + tieuSu + "\nChan doan: " + chanDoan + "\nBenh vien:\n" + benhVien ;
    }
}
