package quanly.quanlynhansu.model.entity;

public class Staff {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String position;
    private String startDate;
    private double salary;


    public Staff() {
    }

    public Staff(int id, String name, String address, String phone, String position, String startDate, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.startDate = startDate;
        this.salary = salary;
    }

    public Staff(String name, String address, String phone, String position, String startDate, double salary) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.startDate = startDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
