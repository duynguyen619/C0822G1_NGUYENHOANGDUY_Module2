package bai_mau.Quan_Ly_Hang_Xe.service.impl;

import bai_mau.Quan_Ly_Hang_Xe.model.Car;
import bai_mau.Quan_Ly_Hang_Xe.model.Transpost;
import bai_mau.Quan_Ly_Hang_Xe.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Car> cars = new ArrayList<>();
    private static final List<Transpost> transposts = new ArrayList<>();

    @Override
    public void addCar() {
        Car car = this.infoCar();
        cars.add(car);
        System.out.println("Thêm mới thành công");
    }

    private Car infoCar() {
        System.out.println("Nhập biển kiểm soát");
        String seaOfControl = scanner.nextLine();
        System.out.println("Nhập nhà chế tạo");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        String yearOfManufacture = scanner.nextLine();
        System.out.println("Nhập chủ xe");
        String owner = scanner.nextLine();
        System.out.println("Nhập loại phương tiện");
        String vehicletype = scanner.nextLine();
        return new Car(seaOfControl, manufacturer, yearOfManufacture, owner, vehicletype);
    }

    @Override
    public void displayCar() {
        if (cars.size() == 0) {
            System.out.println("Danh sách trống");
        } else {
            for (Car car : cars) {
                System.out.println(car.getInfo());
            }
        }
    }

    @Override
    public void removeCar() {

    }

    @Override
    public void searchCar() {

    }

}
