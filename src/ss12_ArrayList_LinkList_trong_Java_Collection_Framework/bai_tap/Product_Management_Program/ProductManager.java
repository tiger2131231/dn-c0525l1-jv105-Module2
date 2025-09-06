package ss12_ArrayList_LinkList_trong_Java_Collection_Framework.bai_tap.Product_Management_Program;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

    private final List<Product> productList = new LinkedList<>();


    public void add(Product product) {
        productList.add(product);
    }

    public void updateById(int id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID " + id);
    }

    public void deleteById(int id) {
        productList.removeIf(p -> p.getId() == id);
    }

    public void display() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public void searchByName(String name) {
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void sortByPriceAscending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDescending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}