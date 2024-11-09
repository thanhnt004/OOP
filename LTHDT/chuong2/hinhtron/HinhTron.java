package hinhtron;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        double banKinh = 0.0;
         while(true)
    {
        try
        {
           System.out.print("Nhap ban kinh hinh tron: ");
           banKinh = sc.nextDouble();
            if (banKinh<=0) {
                throw new Exception();
            }
            break;
        }
        catch(InputMismatchException e)
        {
            System.out.println("Vui long nhap dung kieu du lieu!");
            sc.next();
        }
        catch(Exception e1)
        {
            System.out.println("Ban kinh phai lon hon 0!");
        }
    } 
    System.out.println("Chu vi hinh tron la: "+(2*PI*banKinh));
    System.out.println("Dien tich hinh tron la: "+(PI*banKinh*banKinh));
}
}
