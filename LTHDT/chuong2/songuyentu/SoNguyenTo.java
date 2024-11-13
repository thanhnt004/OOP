package songuyentu;

import java.util.Scanner;

class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean c = true;
        try {
            System.out.print("Nhap so nguyen: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap sai kieu du lieu!");
        }
        if(n>1)
            for(int i = 2;i<Math.sqrt(n);i++)
                if(n%i==0)
                {
                    c = false;
                    break;
                }
        else
        {
            c = false;
        }
        if (c == false) {
            System.out.println("So vua nhap khong la so nguyen to!");
        }
        else   
            System.out.print("So vua nhap la so nguyen to");
    }
}