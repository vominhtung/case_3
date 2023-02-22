package quanly.quanlynhansu.model.dao;

import quanly.quanlynhansu.connection.JdbcConnection;
import quanly.quanlynhansu.model.dto.StaffDto;
import quanly.quanlynhansu.model.entity.Staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class StaffDao {
    private static List<StaffDto> staffs = null;

    public List<StaffDto> getAll() {
        staffs = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "SELECT * FROM nhansu;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                StaffDto staff = new StaffDto();
                staff.setId(resultSet.getInt("id"));
                staff.setName(resultSet.getString("name"));
                staff.setAddress(resultSet.getString("address"));
                staff.setPhone(resultSet.getString("phone_number"));
                staff.setPosition(resultSet.getString("position"));
                staff.setStartDate(resultSet.getString("start_date"));
                staff.setSalary(resultSet.getDouble("salary"));
                staffs.add(staff);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return staffs;
    }

    public StaffDto get(int id) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "SELECT * FROM nhansu WHERE id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                StaffDto staff = new StaffDto();
                staff.setId(resultSet.getInt("id"));
                staff.setName(resultSet.getString("name"));
                staff.setAddress(resultSet.getString("address"));
                staff.setPhone(resultSet.getString("phone_number"));
                staff.setPosition(resultSet.getString("position"));
                staff.setStartDate(resultSet.getString("start_date"));
                staff.setSalary(resultSet.getDouble("salary"));
                return staff;
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         return new StaffDto();
    }

    public void insert(StaffDto staff) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO nhansu(id,name, address,phone_number, position,start_date,salary) VALUES(?,?,?,?,?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, staff.getId());
            preparedStatement.setString(2, staff.getName());
            preparedStatement.setString(3, staff.getAddress());
            preparedStatement.setString(4, staff.getPhone());
            preparedStatement.setString(5, staff.getPosition());
            preparedStatement.setString(6, staff.getStartDate());
            preparedStatement.setDouble(7, staff.getSalary());

            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Added customer successfully.");
            } else {
                System.out.println("Failed to insert customer.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(StaffDto staff) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "UPDATE nhansu SET name = ? , address = ? , phone_number=?,position=?,start_date=?,salary=? WHERE id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, staff.getName());
            preparedStatement.setString(2, staff.getAddress());
            preparedStatement.setString(3, staff.getPhone());
            preparedStatement.setString(4, staff.getPosition());
            preparedStatement.setString(5, staff.getStartDate());
            preparedStatement.setDouble(6, staff.getSalary());
            preparedStatement.setInt(7, staff.getId());


            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Edited customer successfully.");
            } else {
                System.out.println("Failed to edit customer.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "DELETE FROM nhansu WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);

            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Removed customer successfully.");
            } else {
                System.out.println("Failed to remove customer.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<StaffDto> searchByName(String name) {
        staffs = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "SELECT * FROM nhansu WHERE name like ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"%"+ name+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StaffDto staff = new StaffDto();
                staff.setId(resultSet.getInt("id"));
                staff.setName(resultSet.getString("name"));
                staff.setAddress(resultSet.getString("address"));
                staff.setPhone(resultSet.getString("phone_number"));
                staff.setPosition(resultSet.getString("position"));
                staff.setStartDate(resultSet.getString("start_date"));
                staff.setSalary(resultSet.getDouble("salary"));
                staffs.add(staff);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return staffs;
    }
    public List<StaffDto> sortByIdDesc() {
        staffs = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "SELECT * FROM nhansu order by id desc ;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StaffDto staff = new StaffDto();
                staff.setId(resultSet.getInt("id"));
                staff.setName(resultSet.getString("name"));
                staff.setAddress(resultSet.getString("address"));
                staff.setPhone(resultSet.getString("phone_number"));
                staff.setPosition(resultSet.getString("position"));
                staff.setStartDate(resultSet.getString("start_date"));
                staff.setSalary(resultSet.getDouble("salary"));
                staffs.add(staff);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return staffs;
    }
}
