package logic;

import entity.Reporter;

import java.util.Scanner;

public class MenuManagement {
    private ReporterLogic reporterLogic;
    private PostTypeLogic postType;

    public MenuManagement() {
        Reporter[] reporters = new Reporter[1000];
        reporterLogic = new ReporterLogic(reporters);

        PostTypeLogic[] postTypes = new PostTypeLogic[1000];
        PostTypeLogic PostTypeLogic = new PostTypeLogic(postTypes);
    }

    public void menu() {
        showMenu();
        while (true) {
            int function = functionChoice();
            switch (function) {
                case 1:
                    reporterLogic.inputReporter();
                    break;
                case 2:
                    reporterLogic.inputPostType();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    return;
            }
        }
    }

    public void showMenu() {
        System.out.println("+-------------------------------- MENU -------------------------------+");
        System.out.println("|  1. Nhập vào danh sách phóng viên mới                               |");
        System.out.println("|  2. Tra cứu danh sách phóng viên                                    |");
        System.out.println("|  3. Nhâpj vào bài viết mới                                          |");
        System.out.println("|  4. Tra cứu bài viêts trong ngày                                    |");
        System.out.println("|  5. Lập bảng tính công cho phóng viên                               |");
        System.out.println("|  6. Sắp xếp bảng tính công                                          |");
        System.out.println("|  7. Tính thu nhập cho phóng viên                                    |");
        System.out.println("|  8. Thoát chương trình                                              |");
        System.out.println("+---------------------------------------------------------------------+");
    }

    private int functionChoice() {
        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = new Scanner(System.in).nextInt();
            if (choose > 0 && choose <= 7) {
                return choose;
            }
            System.out.println("Không hợp lệ, yêu cầu nhập lại !");
        } while (true);
    }
}

