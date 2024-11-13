package giaithua;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,gt = 1;
        while (true) {
            try {
                System.out.print("Nhap so nguyen duong n: ");
                n = sc.nextInt();
                if (n<0) {
                    throw new Exception("n phai lon hon hoac bang 0!");
                }
                break;
            } 
            catch(InputMismatchException e1)
            {
                System.err.println("Nhap sai kieu du lieu!");
                sc.next();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }   
        if(n<=1)
            gt = 1;
        else
            for(int i = n;i>0;i--)
            {
                gt*=i;
            }
        System.out.println("Gia thua cua n la: "+gt);
    }
}
