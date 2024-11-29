package xeploaisinhvien;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diem = 0;
        char diemChu;
        while (true) {
            try {
                System.out.print("Nhap diem cua sinh vien: ");
                diem = sc.nextInt();
                if (diem>100||diem<0) {
                    throw new Exception("Vui long nhap diem theo thang 100!");
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
                sc.next();
            }
        }
        if(diem>=90)
            diemChu = 'A';
        else if (diem>=80) 
            diemChu =  'B';
        else if(diem>=70)
            diemChu = 'C';
        else if(diem>=50)
            diemChu = 'D';
        else
            diemChu = 'D';
        System.out.println("Xep loai cua sinh vien la: "+diemChu);
    }
}
