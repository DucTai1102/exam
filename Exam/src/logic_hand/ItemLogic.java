package logic_hand;

import constant.ItemType;

import java.util.Scanner;

public class ItemLogic {
    private ItemType[] itemTypes;

    private int totalItemType;

    public ItemType[] getItemTypes() {
        return itemTypes;
    }

    public void setItemTypes(ItemType[] itemTypes) {
        this.itemTypes = itemTypes;
    }

    public int getTotalItemType() {
        return totalItemType;
    }

    public void setTotalItemType(int totalItemType) {
        this.totalItemType = totalItemType;
    }
    public void addNewItem() {
        System.out.print("Nhap so luong mat hang muon them moi ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("nhap thong tin cho loai mat hang " + (i + 1));
            ItemType itemType = null;
            itemType.inputInfo();
            saveItemType(itemType);
            System.out.println("----------------------");
        }
        totalItemType += num;
    }

    private void saveItemType(ItemType t) {
        for (int i = 0; i < itemTypes.length; i++) {
            if (itemTypes[i] == null) {
                itemTypes[i] = t;
                break;
            }
        }
    }

    public void showItemType() {
        for (int i = 0; i < itemTypes.length; i++) {
            if (itemTypes[i] != null) {
                System.out.println(itemTypes[i]);
            }
        }
    }
}
