package nhapxuatdulieu;
import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        int a = 0;
        double b = 0.0;
        char c = ' ';
        String s = " ";
        Scanner sc = new Scanner(System.in);
        while (true) {
            try
        {
            System.out.print("Nhap so 1 so nguyen: ");
            a = sc.nextInt();
            System.out.print("Nhap so thuc: ");
            b = sc.nextDouble();
            System.out.print("Nhap 1 ky tu: ");
            c = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nhap 1 chuoi ky tu: ");
            s = sc.nextLine();
            break;
        }
        catch(InputMismatchException e)
        {
            System.out.println("Nhap sai kieu du lieu");
            sc.next();
        }
        }
        System.out.println("\nSo tu nhien vua nhap la: "+a);
        System.out.println("So thuc vua nhap la: "+b);
        System.out.println("Ky tu vua nhap la: "+c);
        System.out.println("Chuoi ky tu vua nhap la: "+s);
    }
}