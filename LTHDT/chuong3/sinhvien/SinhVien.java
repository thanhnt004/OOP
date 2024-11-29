package sinhvien;

import java.util.Scanner;

import quanlibenhnhan.Nguoi;

public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;
    public SinhVien() {
        super();
        truong = new Truong();
    }

    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }
    @Override
    public void nhapThongTin()
    {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten lop: ");
        this.lop = sc.nextLine();
        System.out.print("Nhap ten nganh: ");
        this.nganh = sc.nextLine();
        System.out.println("Nhap thong tin truong: ");
        this.truong.nhapThongTin();
    }

    @Override
    public String toString() {
        return super.toString()+ "\nLop: " + lop + "\nNganh: " + nganh + "\nTruong: \n" + truong;
    }
}