package sogiay;

import java.util.Scanner;

public class ThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int h = 0,m = 0, s = 0;
    while(true)
    {
        try {
            System.out.print("Nhap so gio: ");
            h = sc.nextInt();
            System.out.print("Nhap so phut: ");
            m = sc.nextInt();
            System.out.print("Nhap so giay: ");
            s = sc.nextInt();
            if(h<0||m<0||s<0)
                throw new Exception();
            break;
        } catch (Exception e) {
            System.out.println("Thoi gian khong hop le!");
            sc.next();
        }
    }
    System.out.println("So giay la: "+(h*60*60 + m*60 + s));
    }
    
}
