package entity;

import constant.ReporterType;

import java.util.Scanner;

public class Reporter extends Person implements Inputable {
    protected int id;
    protected ReporterType reporterType;
    protected static int AUTO_ID = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReporterType getReporterType() {
        return reporterType;
    }

    public void setReporterType(ReporterType reporterType) {
        this.reporterType = reporterType;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", reporterType=" + reporterType +
                '}';
    }

    public void inputInfo() {
        super.inputInfo();
        this.id = AUTO_ID;
        AUTO_ID++;
        int temp;
        System.out.print("Lựa chọn trình độ ");
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
        switch (temp) {
            case 1:
                this.reporterType = ReporterType.NGHIEP_DU;
                break;
            case 2:
                this.reporterType = ReporterType.CHUYEN_NGHIEP;
                break;
            case 3:
                this.reporterType = ReporterType.CONG_TAC_VIEN;
                break;
        }
    }
}