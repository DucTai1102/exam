package entity;

import java.util.Scanner;

public class Person implements InputTable {
    protected String name;
    protected String addres;
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String name, String addres, String phone) {
        this.name = name;
        this.addres = addres;
        this.phone = phone;
    }

    public void inputInfo() {
        System.out.print("Nhap ten nguoi ban hang` ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi ");
        this.addres = new Scanner(System.in).nextLine();
        System.out.print("Nhap so dien thoai ");
        this.phone = new Scanner(System.in).nextLine();
    }
}
