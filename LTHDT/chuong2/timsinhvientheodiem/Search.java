package timsinhvientheodiem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {
    static int n;
    static Scanner sc = new Scanner(System.in);

    public static void nhapSoLuong() throws InputMismatchException, Exception {
        System.out.println("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        if (n < 0)
            throw new Exception("So luong sinh vien phai lon hon 0!");
    }

    public static void nhapDanhSach(int[] a) {
        System.out.println("Nhap diem cua sinh vien: ");

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Sinh vien thu " + (i + 1) + ": ");
                    a[i] = sc.nextInt();
                    if (a[i] < 0 || a[i] > 100)
                        throw new Exception("Diem vua nhap khong hop le!");
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Nhap sai kieu du lieu!");
                    sc.next();
                } catch (Exception e1) {
                    System.err.println(e1.getMessage());
                }
            }
        }
    }

    public static int search(int[] a, int d) {
        for (int i = 0; i < n; i++) {
            if (a[i] == d)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] diem;
        int a = 0;
        while (true) {
            try {
                nhapSoLuong();
                break;
            } catch (InputMismatchException e1) {
                System.err.println("Nhap sai kieu du lieu!");
                sc.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        diem = new int[n];
        try {
            nhapDanhSach(diem);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Nhap diem can tim: ");
            a = sc.nextInt();
            if (a < 0 || a > 100) {
                throw new Exception("Diem vua nhap khong hop le!");
            }
        } catch (Exception e) {
            System.err.println("Diem khong hop le!");
            sc.next();
        }
        if (search(diem, a) != -1) {
            System.out.println("Sinh vien co diem " + a + " la: " + (search(diem, a) +1));
        } else
            System.out.print("Khong tim thay sinh vien co diem" + a);
    }
}