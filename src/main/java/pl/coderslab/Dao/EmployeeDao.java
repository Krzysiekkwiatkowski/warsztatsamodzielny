package pl.coderslab.Dao;

import pl.coderslab.Class.Employee;
import pl.coderslab.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private static final String CREATE_EMPLOYEE_QUERY = "INSERT INTO Employees(name, surname, address, phone, note, salary) VALUES (?,?,?,?,?,?)";
    private static final String UPDATE_EMPLOYEE_QUERY = "UPDATE Employees SET name = ? , surname = ? , address = ? , phone = ? , note = ? , salary = ? WHERE	id = ?";
    private static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM Employees where id = ?";
    private static final String SHOW_EMPLOYEE_QUERY = "SELECT * FROM Employees";

    public Employee createEmployee(Employee employee) {
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(CREATE_EMPLOYEE_QUERY);
            prepStat.setString(1, employee.getName());
            prepStat.setString(2, employee.getSurname());
            prepStat.setString(3, employee.getAddress());
            prepStat.setInt(4, employee.getPhone());
            prepStat.setString(5, employee.getNote());
            prepStat.setDouble(6, employee.getSalary());
            prepStat.executeUpdate();
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee updateEmployee(Employee employee) {
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(UPDATE_EMPLOYEE_QUERY);
            prepStat.setString(1, employee.getName());
            prepStat.setString(2, employee.getSurname());
            prepStat.setString(3, employee.getAddress());
            prepStat.setInt(4, employee.getPhone());
            prepStat.setString(5, employee.getNote());
            prepStat.setDouble(6, employee.getSalary());
            prepStat.setInt(7, employee.getId());
            prepStat.executeUpdate();
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteEmployee(int id){
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(DELETE_EMPLOYEE_QUERY);
            prepStat.setInt(1, id);
            prepStat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Employee> showEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(SHOW_EMPLOYEE_QUERY);
            ResultSet resSet = prepStat.executeQuery();
            while(resSet.next()){
                Employee employee = new Employee();
                employee.setId(resSet.getInt("id"));
                employee.setName(resSet.getString("name"));
                employee.setSurname(resSet.getString("surname"));
                employee.setAddress(resSet.getString("address"));
                employee.setPhone(resSet.getInt("phone"));
                employee.setNote(resSet.getString("note"));
                employee.setSalary(resSet.getDouble("salary"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}