package logic_hand;

import java.util.Scanner;
import entity.Seller;

public class SellerLogic {
    private Seller[] sellers;
    private int totaSeller;

    public Seller[] getSellers() {
        return sellers;
    }

    public void setSellers(Seller[] sellers) {
        this.sellers = sellers;
    }

    public int getTotaSeller() {
        return totaSeller;
    }

    public void setTotaSeller(int totaSeller) {
        this.totaSeller = totaSeller;
    }

    public void addNewSeller() {
        System.out.printf("Nhap so luong Seller muon them moi ");
        int sellerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < sellerNum; i++) {
            System.out.println("Nhap thong tin cho Seller thu " + (i + 1));
            Seller seller = null;
            seller.inputInfo();
            saveSeller(seller);
            System.out.println("----------------------");
        }
        totaSeller += sellerNum;
    }

    private void saveSeller(Seller r) {
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] == null) {
                sellers[i] = r;
                break;
            }
        }
    }

    public void showSellers() {
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] != null) {
                System.out.println(sellers[i]);
            }
        }
    }
}
