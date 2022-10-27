package ss17_binarry_file.product_file.controller;

import ss17_binarry_file.product_file.service.IProductService;
import ss17_binarry_file.product_file.service.impl.ProductService;

import java.util.Scanner;

public class MainController {
    private static final Scanner scanner = new Scanner(System.in);
    private final IProductService product = new ProductService();

    public void menuMangement() {
        int choice;
        while (true) {
            System.out.println("Menu \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Hiển thị sản phẩm \n" +
                    "3. Tìm kiếm sản phẩm \n" +
                    "4. Exit \n" +
                    "Chọn từ 1->4 ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.displayProduct();
                    break;
                case 3:
                    product.search();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhập lại. ");
                    break;
            }
        }
    }
}
