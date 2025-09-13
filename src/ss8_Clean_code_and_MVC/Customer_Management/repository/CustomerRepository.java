package ss8_Clean_code_and_MVC.Customer_Management.repository;

import ss8_Clean_code_and_MVC.Customer_Management.entity.Customer;
import ss8_Clean_code_and_MVC.Customer_Management.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_FILE = "src/ss8_Clean_code_and_MVC/Customer_Management/data/customer.csv";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CUSTOMER_FILE);
            for (String line : stringList) {
                String[] array = line.split(",");
                Customer customer = new Customer(
                        Integer.parseInt(array[0]),
                        array[1],
                        array[2],
                        array[3],
                        Integer.parseInt(array[4])
                );
                customerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("Đọc file bị lỗi!");
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        List<String> list = new ArrayList<>();
        list.add(customer.getInfoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteById(int id) {
        boolean isSuccessDelete = false;
        List<Customer> customerList = this.findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).getId()) {
                customerList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i <customerList.size() ; i++) {
            stringList.add(customerList.get(i).getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
        return isSuccessDelete;
    }

    @Override
    public boolean updateById(int id, Customer newCustomer) {
        boolean isSuccessUpdate = false;
        List<Customer> customerList = this.findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).getId()) {
                // cập nhật thông tin
                customerList.set(i, newCustomer);
                isSuccessUpdate = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            stringList.add(c.getInfoToCSV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, stringList, false);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
        return isSuccessUpdate;
    }
}

