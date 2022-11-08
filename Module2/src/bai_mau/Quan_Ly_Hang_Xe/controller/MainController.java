package bai_mau.Quan_Ly_Hang_Xe.controller;

import java.util.Scanner;

public class MainController {
   private static final Scanner scanner = new Scanner(System.in);

    public static void managenmentProgram() {
        while (true) {
                System.out.println("-----Chương trình quản lý phương tiện giao thông-----");
                System.out.println("1.Quản lý ô tô");
                System.out.println("2.Quản lý xe tải");
                System.out.println("3.Quản lý xe máy");
                System.out.println("4.Thoát");
                System.out.println("Chọn các chức nắng");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        CarController.manageCar();
                        break;
                    case 2:
                        TruckController.manageTruck();
                        break;
                    case 3:
                        MotorcycleController.manageMotorcycle();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn của bạn không đúng");
                }
        }
    }
}
