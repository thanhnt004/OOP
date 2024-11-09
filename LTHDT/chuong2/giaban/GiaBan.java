package giaban;

import java.util.Scanner;

public class GiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int giaSanPhan = 0, phanTramGiamGia = 0;
        while (true) {
            try {
                System.out.print("Nhap gia cua san pham: ");
                giaSanPhan = sc.nextInt();
                System.out.print("Nhap vao phan tram giam gia: ");
                phanTramGiamGia = sc.nextInt();
                if(giaSanPhan<=0||phanTramGiamGia<0)
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Gia tri ban vua nhap khong hop le! Vui long nhap lai");
                sc.next();
            }
        }
        System.out.println("Gia ban cua san pham la: "+(giaSanPhan - giaSanPhan*phanTramGiamGia/100));
    }
}
