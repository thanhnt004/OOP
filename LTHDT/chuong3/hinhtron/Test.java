package hinhtron;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle();
        int percent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        try {
            circle.setRadius(sc.nextDouble());
            System.out.print("Nhap phan tram: ");
            percent = sc.nextInt();
            circle.resize(percent);
        } catch (Exception e) {
            System.err.println("Loi!");
        }
        System.out.print("Ban kinh sau khi thay doi la: "+circle.getRadius());
    }
}
