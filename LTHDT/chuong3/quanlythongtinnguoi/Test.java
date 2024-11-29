package quanlythongtinnguoi;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Test {
    static Person[] persons = new Person[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        char luaChon;
        System.out.println("=======Menu=======");
        System.out.println("1. Them thong tin");
        System.out.println("2. Lay thong tin");
        System.out.println("3. Sua thong tin");
        System.out.println("4. In danh sach");
        System.out.println("5. Thoat");
        System.out.print("Nhap lua chon! ");
        luaChon = sc.next().charAt(0);
        switch (luaChon) {
            case '1':
                themThongTin();
                break;
            case '2':
                layThongTin();
                break;
            case '3':
                suaThongTin();
                break;
            case '4':
                inDanhSach();
                break;
            case '5':
                System.exit(1);
                break;
        }
    }
    public static void inDanhSach()
    {
        if (count == 0) {
            System.out.println("Danh sach rong");
            return;
        }
        for(int i = 0;i<count;i++)
        {
            System.out.print(persons[i].toString());
        }
    }
    public static void suaThongTin()
    {
        int stt = 0;
        char luaChon;
        System.out.print("Nhap so thu tu: ");
        try {
            stt = sc.nextInt();
        } catch (Exception e) {
            System.out.println("So thu tu khong hop le!");
            return;
        }
        while (persons[stt -1]==null) {
            System.out.println("Khong ton nguoi so "+stt);
            return;
        }
        while (true) {
            try {
                persons[count - 1].nhapTT();
                break;
            } catch (DateTimeParseException e1) {
                System.out.println(e1.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void layThongTin() {
        int stt = 0;
        char luaChon;
        System.out.print("Nhap so thu tu: ");
        try {
            stt = sc.nextInt();
        } catch (Exception e) {
            System.out.println("So thu tu khong hop le!");
            return;
        }
        while (persons[stt -1]==null) {
            System.out.println("Khong ton nguoi so "+stt);
            return;
        }
            System.out.println("Nhap thong tin can in ra: ");
            System.out.print("1. CCCD\n2. Ho va Ten\n3. Ngay sinh\n4.Noi sinh\n5.Gioi tinh: \n6.Email\n7. So dien thoai\n0. Quay lai");
            luaChon = sc.next().charAt(0);
            switch (luaChon) {
                case '1':
                    System.out.println(persons[stt - 1].getSoCCCD());
                    break;
                case '2':
                    System.out.println(persons[stt - 1].getName());
                    break;
                case '3':
                    System.out.println(persons[stt - 1].getDob());
                    break;
                case '4':
                    System.out.println(persons[stt - 1].getPob());
                    break;
                case '5':
                    System.out.println(persons[stt - 1].getGender());
                    break;
                case '6':
                    System.out.println(persons[stt - 1].getEmail());
                    break;
                case '7':
                    System.out.println(persons[stt - 1].getPhone());
                    break;
               case '0':
                    return;
                default:
                    System.out.print("Nhap sai lua chon!");
            }
    }

    public static void themThongTin() {
        count++;
        persons[count - 1] = new Person();
        while (true) {
            try {
                persons[count - 1].nhapTT();
                break;
            } catch (DateTimeParseException e1) {
                System.out.println(e1.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
