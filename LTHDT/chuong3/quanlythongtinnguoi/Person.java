package quanlythongtinnguoi;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private String soCCCD;
    private String name;
    // ngay sinh
    private LocalDate dob;
    // noi sinh
    private String pob;
    // gioi tinh M: nam; F: nu
    private char gender;
    private String email;
    private String phone;

    public Person() {
        this.soCCCD = "default";
        this.name = "default";
        this.dob = LocalDate.of(0000, 1, 1);
        this.pob = "default";
        this.gender = 'O';
        this.email = "default";
        this.phone = "default";
    }

    public Person(String soCCCD, String name, String dob, String pob, char gender, String email, String phone)
            throws DateTimeParseException, Exception {
        this.soCCCD = soCCCD;
        this.name = name;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.dob = LocalDate.parse(dob, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Ngay khong hop le", dob, -1);
        }
        this.pob = pob;
        if (Character.toUpperCase(gender) != 'M' && Character.toUpperCase(gender) != 'F')
            throw new Exception("Gioi tinh khong hop le!");
        else
            this.gender = Character.toUpperCase(gender);
        this.email = email;
        this.phone = phone;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void nhapTT() throws DateTimeParseException, Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("CCCD: ");
        this.soCCCD = sc.nextLine();
        System.out.print("Ho va ten: ");
        this.name = sc.nextLine();
        System.out.print("Ngay sinh: ");
        String ngaySinh = sc.nextLine();
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.dob = LocalDate.parse(ngaySinh, dateTimeFormatter);
        } catch (Exception e) {
            throw new DateTimeParseException("Nhap sai dinh dang ngay (dd/MM/yyyy)!", ngaySinh, -1);
        }
        System.out.print("Noi sinh: ");
        this.pob = sc.nextLine();
        System.out.print("Gioi tinh (M/F): ");
        this.gender = Character.toUpperCase(sc.next().charAt(0));
        if (Character.toUpperCase(gender) != 'M' && Character.toUpperCase(gender) != 'F')
            throw new Exception("Gioi tinh khong hop le!");
        System.out.print("Email: ");
        this.email = sc.next();
        sc.nextLine();
        System.out.print("So dien thoai: ");
        this.phone = sc.next();
    }
    public String toString()
    {
        return "So can cuoc cong dan: "+soCCCD+"\nHo va ten: "+name+"\nNgay sinh"+this.dob.toString()+"\nNoi sinh: "+pob+"\nGioi tinh: "+gender+"\nEmail:" +email+"So dien thoai: "+phone  ;
    }
}