package ss12_ArrayList_LinkList_trong_Java_Collection_Framework.bai_tap.Product_Management_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-- QUẢN LÝ SẢN PHẨM --");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp tăng dần theo giá");
            System.out.println("7. Sắp xếp giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    manager.add(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    int editId = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Giá mới: ");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    manager.updateById(editId, newName, newPrice);
                    break;
                case 3:
                    System.out.print("Nhập ID cần xoá: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    manager.deleteById(deleteId);
                    break;
                case 4:
                    manager.display();
                    break;
                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = sc.nextLine();
                    manager.searchByName(searchName);
                    break;
                case 6:
                    manager.sortByPriceAscending();
                    System.out.println("Đã sắp xếp tăng dần.");
                    break;
                case 7:
                    manager.sortByPriceDescending();
                    System.out.println("Đã sắp xếp giảm dần.");
                    break;
            }
        } while (choice != 0);
    }
}