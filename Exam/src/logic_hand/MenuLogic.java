package logic_hand;

import entity.Item;
import entity.Seller;

import java.util.Scanner;

public class MenuLogic {

    private SellerLogic sellerLogic;
    private ItemLogic itemLogic;
    public MenuLogic() {
        Seller[] sellers = new Seller[100];
        sellerLogic = new SellerLogic();

        Item[] items = new Item[100];
        itemLogic = new ItemLogic();

    }
    public void menu() {
        while (true) {
            showMenu();
            int functionChoice = choose();
            switch (functionChoice) {
                case 1: sellerLogic.addNewSeller();
                    break;
                case 2: sellerLogic.showSellers();
                    break;
                case 3: itemLogic.addNewItem();
                    break;
                case 4: itemLogic.showItemType();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;
            }
        }
    }

    private int choose() {
        int choice = 0;
        System.out.print("Xin mời nhập lựa chọn: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.print("Chức năng không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private void showMenu() {
        System.out.println("+-------------------------------- MENU -------------------------------+");
        System.out.println("|  1. Nhap danh sach mat hang moi                                     |");
        System.out.println("|  2. In ra danh sach mat hang da co                                  |");
        System.out.println("|  3. Nhap danh sach nhan vien moi                                    |");
        System.out.println("|  3. In ra danh sach nhan vien da co                                 |");
        System.out.println("|  4. In ra danh sach ban hang                                        |");
        System.out.println("|  5. Sap xe danh sach ban hang                                       |");
        System.out.println("|  6. Sap xep danh sach theo ten nhan vien                            |");
        System.out.println("|  7. Sap xep danh sach theo nhom mat hang                            |");
        System.out.println("|  8. Lap bang ke doan thu cho moi nhan vien                          |");
        System.out.println("|  9. Thoat                                                           |");
        System.out.println("+---------------------------------------------------------------------+");

    }
}