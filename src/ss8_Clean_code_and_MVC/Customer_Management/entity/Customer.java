package ss8_Clean_code_and_MVC.Customer_Management.entity;

public class Customer extends Person {
    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Customer() {}


    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getName()+","+this.getEmail()+","+this.getAddress()+","+this.getPoint();
    }

    public Customer(int id, String name, String email, String address, int point) {
        super(id, name, email, address);
        this.point = point;
    }
    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "point='" + point + '\'' +
                '}';
    }
}


