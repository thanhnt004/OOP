package danhsachdiem;

import java.util.Scanner;

public class Diem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,max = 0,maxi = 0;
        int[] diem;
        try {
            System.out.print("Nhap so sinh vien: ");
            n = sc.nextInt();
            if (n<0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("So luong sinh vien vua nhap khong hop le!");
            System.exit(-1);
        }
       diem = new int[n];
       System.out.println("Nhap diem cua tung sinh vien (thang 100): ");
       for (int i =0;i<n;i++) {
            while (true) {
                try {
                    System.out.print("Sinh vien thu "+(i+1)+": ");
                    diem[i] = sc.nextInt();
                    if (diem[i]<0||diem[i]>100) {
                        throw new Exception();
                    }
                    if(diem[i]>max)
                    {
                        max = diem[i];
                        maxi = i;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Diem vua nhap khong hop le!");
                    sc.next();
                }
            }
       }
       System.out.println("Diem cao nhat la: "+max);       
       System.out.println("Sinh vien co diem cao nhat la: "+maxi+1);
       for(int i = 0;i<n;i++)
       {
            for(int j = i+1;j<n;j++) {
                if(diem[j-1]>diem[j])
                {
                    int tmp = diem[j-1];
                    diem[j-1] = diem[j];
                    diem[j] = tmp;
                }
            }
       }
       System.out.println("Diem sau khi sap xep tang dan la: ");
       for (int i : diem) {
            System.out.println(i);
       }
    }
}
