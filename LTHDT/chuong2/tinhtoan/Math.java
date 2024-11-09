package tinhtoan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0.0, b = 0.0;
        char c;
        while (true) {
            try
            {
                System.out.print("Nhap so thu nhat: ");
                a = sc.nextDouble();
                System.out.print("Nhap so thu hai: ");
                b = sc.nextDouble();
                break;
            } catch(InputMismatchException e)
            {
                System.out.println("Ban nhap sai kieu du lieu! Vui long nhap lai");
                sc.next();
            }
        }
        System.out.print("Lua chon: \nA: Tinh tong\nS: Tinh hieu\nM:Tinh tich\nD: Tinh thuong");
        while (true) {    
            System.out.print("\nNhap lua chon cua ban: ");
            c = sc.next().charAt(0);
            if (Character.toUpperCase(c) == 'A'|| Character.toUpperCase(c) == 'S' || Character.toUpperCase(c) == 'M'||Character.toUpperCase(c) == 'D') {
                break;
            }
            System.out.println("Ky tu vua nhap khong hop le!");
        }
        switch (Character.toUpperCase(c)) {
            case 'A':
                System.out.println("Tong hai so vua nhap la: "+(a+b));;
                break;
            case 'S':
                System.out.println("Hieu hai so vua nhap la: "+(a - b));
                break;
            case 'M':
                System.out.println("Tich hai so vua nhap la:" + (a*b));
                break;
            case 'D':
                try {
                double t = a/b;
                System.out.println("Thuong hai so vua nhap la:" + t);
                } catch (Exception e) {
                   System.out.println("Khong the chia cho 0");
                }
                break;
        }
    }
}
