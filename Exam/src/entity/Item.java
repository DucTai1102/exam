package entity;

import constant.ItemType;

import java.util.Scanner;

public class Item implements InputTable  {
    protected int id;
    protected String name;
    protected String price;
    protected String soLuong;
    protected static int AUTO_ID = 1000;
    protected ItemType itemType;

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public Item(int id, String name, String price, String soLuong) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", itemType=" + itemType +
                '}';
    }

    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.println("Chon loai mat hang duoi day");
        System.out.println("1. Dien tu");
        System.out.println("2. Dien lanh");
        System.out.println("3. May tinh");
        System.out.println("4. Thiet bi van phong");
        System.out.print("Xin mời chọn: ");

        int temp = 0;
        System.out.print("Xin mời nhập lựa chọn: ");
        do {
            temp = new Scanner(System.in).nextInt();
            if (temp >= 1 && temp <= 4) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);

        switch (temp) {
            case 1:
                this.itemType = ItemType.DT;
                break;
            case 2:
                this.itemType = ItemType.DL;
                break;
            case 3:
                this.itemType = ItemType.MT;
                break;
            case 4:
                this.itemType = ItemType.TBVP;
                break;
        }
    }
}
