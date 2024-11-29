package quanlynhanvien;

import java.util.Scanner;

public class Test {
    private static NhanVien[] nv = new NhanVien[100];
    private static Scanner sc = new Scanner(System.in);
    private static int n;
    public static void main(String[] args) {
        try {
            System.out.print("Nhap so luong nhan vien: ");
            n = sc.nextInt();
            if(n<=0 || n>20)
                throw new Exception("So nhan vien khong nho hon 0 va lon hon 20!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        for(int i = 0;i<n;i++)
        {
            System.out.println("Nhap thong tin cua nhan vien thu "+(i+1)+" :");
            nv[i] = new NhanVien();
            nv[i].nhapThongTin();
        }
        System.out.println("Danh sach nhan vien vua nhap la: ");
        for(int i = 0;i<n;i++)
        {
            System.out.println(nv[i].toString());
        }
    }
}

