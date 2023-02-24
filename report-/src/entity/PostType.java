package entity;

import java.util.Scanner;

public class PostType implements Inputable {
    protected int id;
    protected double price;
    protected String name;
    protected static int AUTO_ID = 100;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PortType{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        int temp;
        System.out.print("Nhap gia tien ");
        System.out.print("1. Nghiệp dư ");
        System.out.print("2. Chuyên nghiệp ");
        System.out.print("3. Cộng tác viên ");
        do {
            temp = new Scanner(System.in).nextInt();
            if (temp >= 1 && temp <= 3) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ vui lòng chọn lại ");
        } while (true);
    }
}

