package constant;

import entity.InputTable;

public enum ItemType implements InputTable {
    DT("Dien tu"),
    DL("Dien lanh"),
    MT("May Tinh"),
    TBVP("Thiet bi van phong");

    public String value;

    ItemType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "value='" + value + '\'' +
                '}';
    }

    public void inputInfo() {
    }
}
