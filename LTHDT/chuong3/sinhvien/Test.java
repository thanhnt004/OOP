package sinhvien;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {
    private static SinhVien[] sinhViens = new SinhVien[10];
    private static Scanner sc = new Scanner(System.in);
    private static int n;
    public static void main(String[] args) {
        try
        {
            System.out.print("Nhap so luong sinh vien (2<n<5): ");
            n = sc.nextInt();
            if (n>5||n<2) {
                throw new Exception("So luong nhap vao khong hop le!");
            }
        }catch(InputMismatchException e1)
        {
            System.err.println("Nhap sai kieu du lieu! ");
        }catch(Exception e2)
        {
            System.err.println(e2.getMessage());
        }
        System.out.println("Nhap thong tin cac sinh vien: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap thong  tin cho sinh vien thu "+(i+1));
            sinhViens[i] = new SinhVien();
            sinhViens[i].nhapThongTin();
        }
        System.out.println("Dnah sach cac sinh vien vua nhap: ");
        for(int i = 0;i<n;i++)
        {
            System.out.println(sinhViens[i].toString());
        }
    }
}
