package entity;

public class QuanLyBanHang {
    private Seller seller;
    private int soLuong;

    public QuanLyBanHang(Seller seller, int soLuong) {
        this.seller = seller;
        this.soLuong = soLuong;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "QuanLyBanHang{" +
                "seller=" + seller +
                ", soLuong=" + soLuong +
                '}';
    }
}
