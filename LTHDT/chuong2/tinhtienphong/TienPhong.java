package tinhtienphong;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TienPhong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double donGia = 0.0,soTien = 0.0;
        int soNgay = 0;
        while (true) {
            try
            {
                System.out.print("Nhap so ngay luu tru: ");
                soNgay = sc.nextInt();
                System.out.print("Nhap don gia: ");
                donGia = sc.nextDouble();
                if (donGia<=0||soNgay<0) {
                    throw new Exception("So ngay va don gia phai lon hon 0!");
                }
                break;
            }catch(InputMismatchException e)
            {
                System.out.println("Nhap sai kieu du lieu!");
                sc.next();
            }
            catch(Exception e1)
            {
                System.err.println(e1.getMessage());
            }
        }
        if(soNgay==1)
            soTien = donGia;
        else if(soNgay>=2&&soNgay<5)
            soTien = donGia + (soNgay - 1)*donGia*0.8;
        else if (soNgay>=5&&soNgay<11) {
            soTien = donGia*(1 + 3*0.8) + (soNgay - 4)*0.6*donGia;
        }
        else
            soTien = donGia*(1+3*0.8+6*0.6) + (soNgay - 10)*0.4*donGia;
        System.out.println("So tien phong la: " + soTien);
    }
}

