package tinhtiendien;

import java.io.EOFException;
import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        double soDien = 0, soTien = 0;
        while (true) {
            try {
                System.out.print("Nhap so dien tieu thu trong 1 thang: ");
                soDien = sc.nextDouble();
                if(soDien<0)
                   throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("So dien tieu thu khong hop le!");
            }
        }
        if (soDien<=50)
            soTien = soDien*1484;
        else if(soDien<=100)
            soTien = 50*1484 + (soDien -50)*1533;
        else if(soDien<=200)
            soTien = 50*1484 + 50*1533 + (soDien - 100)*1786;
        else soTien = 50*1484 + 50*1533 + 100*1786 + (soDien - 200)*2242;
        System.out.println("So tien dien phai tra la: "+soTien);
    }
}
