package ss12_Map.product.Controller;

import ss12_Map.product.service.IProductService;
import ss12_Map.product.service.impl.ProcductService;

import java.util.Scanner;

public class ProductController {
    private static final Scanner scanner = new Scanner(System.in);
    private final IProductService product = new ProcductService();
    public void menuMangement() {
        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI SIÊU THỊ CỦA CHÚNG TÔI");
            System.out.println("1.Hiển thị danh sách sản phẩm");
            System.out.println("2.Thêm mới sản phẩm");
            System.out.println("3.Cập nhật thông tin sản phẩm");
            System.out.println("4.Tìm kiếm sản phẩm bằng tên");
            System.out.println("5. Xóa sản phẩm");
            System.out.println("6.Exit");
            System.out.println("mời bạn nhập chức năng từ 1->6");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    product.displayProduct();
                    break;
                case 2:
                    product.addProduct();
                    break;
                case 3:
                    product.editProduct();
                    break;
                case 4:
                    product.search();
                    break;
                case 5:
                    product.removeProduct();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("lựa chọn của bạn không đúng!");
            }
        }
    }
}
