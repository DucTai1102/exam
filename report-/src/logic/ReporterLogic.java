package logic;

import entity.Reporter;

import java.util.Scanner;


public class ReporterLogic {

    private Reporter[] reporters;

    public ReporterLogic(Reporter[] reporters) {
        this.reporters = reporters;
    }

    public void inputReporter() {
        System.out.printf("Nhập số lượng tuyến muốn thêm ");
        int reporterNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNum; i++) {
            Reporter r = new Reporter();
            r.inputInfo();
            saveReporter(r);
        }
    }

    public void saveReporter(Reporter r) {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i]==null);
            reporters[i] = r;
            break;
        }
    }
    public void showReporters(){
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null ){
                System.out.println(reporters[i]);
            }
        }
    }
}
