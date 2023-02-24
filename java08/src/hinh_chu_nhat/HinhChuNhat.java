package hinh_chu_nhat;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai < 0) {
            System.out.print("Chieu Dai phai la so duong");
            return;
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong < 0) {
            System.out.print("Chieu rong phai la so duong");
            return;
        }
        this.chieuRong = chieuRong;
    }
}
