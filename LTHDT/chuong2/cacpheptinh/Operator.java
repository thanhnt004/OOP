package cacpheptinh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0;
        try {
            System.out.print("Nhap so thu nhat: ");
            a = sc.nextInt();
            System.out.println("Nhap so thu 2: ");
            b = sc.nextInt();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Tong hai so la: "+(a+b));
        System.out.println("Hieu hai so la: "+ (a-b));
        System.out.println("Tich hai so la: " + a*b);
        try {
            System.out.println("Thuong hai so la: " + a/b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
