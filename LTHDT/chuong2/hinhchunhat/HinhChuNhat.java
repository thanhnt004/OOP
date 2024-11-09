package hinhchunhat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double chieuDai = 0,chieuRong = 0;
    while(true)
    {
        try
        {
            System.out.print("Nhap chieu dai hinh chu nhat: ");
            chieuDai = sc.nextDouble();
            System.out.print("Nhap chieu rong hinh chu nhat: ");
            chieuRong = sc.nextDouble();
            if ((chieuDai<=0||chieuRong<=0)) {
                throw new Exception("Cac cach phai lon hon 0!");
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
            System.out.println(e1.getMessage());
        }
    }
    System.out.println("Chu vi hinh chu nhat la: "+ (2*(chieuDai+chieuRong)));
    System.out.println("Dien tich hinh chu nhat la: "+ (chieuDai*chieuRong));
    }
}
