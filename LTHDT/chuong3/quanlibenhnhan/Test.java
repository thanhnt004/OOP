package quanlibenhnhan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    private static BenhNhan[] benhNhans = new BenhNhan[100];
    private static Scanner sc = new Scanner(System.in);
    private static int n;
    public static void main(String[] args) {
        try
        {
            System.out.print("Nhap so luong benh nhan (2<n<5): ");
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
        System.out.println("Nhap thong tin cac benh nhan: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap thong  tin cho benh nhan thu "+(i+1));
            benhNhans[i] = new BenhNhan();
            benhNhans[i].nhapThongTin();
        }
        System.out.println("Dnah sach cac benh nhan vua nhap: ");
        for(int i = 0;i<n;i++)
        {
            System.out.println(benhNhans[i].toString());
        }
    }
}