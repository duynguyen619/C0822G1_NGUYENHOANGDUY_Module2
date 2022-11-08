package bai_mau.Quan_Ly_Hang_Xe.controller;

import bai_mau.Quan_Ly_Hang_Xe.service.ICarService;
import bai_mau.Quan_Ly_Hang_Xe.service.impl.CarService;

import java.util.Scanner;

public class CarController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService carService = new CarService();

    public static void manageCar() {
        while (true) {
            System.out.println("------Quản lý xe hơi------");
            System.out.println("1.Thêm mới ô tô");
            System.out.println("2.Hiện thị ô tô");
            System.out.println("3.Xóa ô tô");
            System.out.println("4.Tìm kiếm theo biển kiểm soát");
            System.out.println("5.Quay lại menu chính");
            System.out.println("Chọn");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    carService.addCar();
                    break;
                case 2:
                    carService.displayCar();
                    break;
                case 3:
                    carService.removeCar();
                    break;
                case 4:
                    carService.searchCar();
                case 5:
                    return;
                default:
                    System.err.println("Lựa chọn của bạn không đúng");
            }
        }
    }
}
