package nhietdo;

import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doC = 0;
        try {
            System.out.print("Nhap nhiet do o do C: ");
            doC = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Du lieu khong hop le!");
            sc.next();
            System.exit(-1);
        }
        System.out.println("Nhiet do o do F la: "+ (1.8*doC + 32));
    }
}
