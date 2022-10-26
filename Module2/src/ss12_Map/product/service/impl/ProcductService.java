package ss12_Map.product.service.impl;

import ss12_Map.product.model.Product;
import ss12_Map.product.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProcductService implements IProductService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("SV-2", "Iphone", products.toString(), 300000.0));
        products.add(new Product("SV-1", "Samsung", products.toString(), 120000.0));
        products.add(new Product("SV-3", "Nokia", products.toString(), 10000.0));
    }


    public void addProduct() {
        Product product = this.InfoProduct();
        products.add(product);
        System.out.println("Thêm mới thành công");
    }

    public void displayProduct() {
            boolean swap = true;
            for (int k = 0; k < products.size() - 1 && swap; k++) {
                swap = false;
                for (int i = 0; i < products.size() - 1 - k; i++) {
                    if (products.get(i).getPrice().compareTo(products.get(i + 1).getPrice()) > 0) {
                        swap = true;
                        Product temp = products.get(i + 1);
                        products.set(i + 1, products.get(i));
                        products.set(i, temp);
                    }
                }
            }
            System.out.println(products);
        }

    @Override
    public void removeProduct() {
        Product product = this.findProduct();
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm tương thích");
        } else {
            System.out.println("Bạn có chắc muốn xóa sản phẩm");
            System.out.println("1.Có");
            System.out.println("2.Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                products.remove(product);
                System.out.println("Xóa thành công");
            }
        }
    }

    public Product findProduct() {
        System.out.println("Mời bạn nhập vào tên cần xóa");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                return product;
            }
        }
        return null;
    }

    public Product InfoProduct() {
        String id = "SV-" + (products.size() + 1);
        System.out.print("Mời bạn nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập giá: ");
        Double price = Double.valueOf(scanner.nextLine());
        return new Product(id, name, products.toString(), price);
    }

    public void editProduct() {
        System.out.println("Nhập ID sản phẩm cần chỉnh sửa: ");
        String idEdit = scanner.nextLine();
        Product temp = null;
        Product product1 = null;
        for (Product product : products) {
            if (Objects.equals(idEdit, product.getName())) {
                temp = product;
                String setId = "SV-" + (products.size() + 1);

                System.out.println("Nhập chỉnh sửa tên của sản phẩm: ");
                String setName = scanner.nextLine();

                System.out.println("Nhập chỉnh sửa giá của sản phẩm: ");
                Double setPrice = scanner.nextDouble();

                product1 = new Product(setId, setName, products.toString(), setPrice);
                break;
            }
        }
        if (temp != null) {
            int index = products.indexOf(temp);
            products.set(index, product1);
        }
    }

    public void search() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Product product : products) {
            if (name.equals(product.getName())) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có tên sản phẩm");
        }
    }
}
