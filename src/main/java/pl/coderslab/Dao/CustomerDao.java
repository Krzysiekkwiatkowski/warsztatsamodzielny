package pl.coderslab.Dao;

import pl.coderslab.Class.Customer;
import pl.coderslab.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao{

    private static final String CREATE_CUSTOMER_QUERY = "INSERT INTO Customers(name, surname) VALUES (?,?)";
    private static final String UPDATE_CUSTOMER_QUERY = "UPDATE Customers SET name = ? , surname = ? WHERE	id = ?";
    private static final String DELETE_CUSTOMER_QUERY = "DELETE FROM Customers where id = ?";
    private static final String SHOW_CUSTOMER_QUERY = "SELECT * FROM Customers";

    public Customer createCustomer(Customer customer){

        try (Connection con = DbUtil.getConn();
             PreparedStatement prepStat = con.prepareStatement(CREATE_CUSTOMER_QUERY)) {
            prepStat.setString(1,customer.getName());
            prepStat.setString(2,customer.getSurname());
            prepStat.executeUpdate();
            return customer;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateCustomer(Customer customer){

        try (Connection con = DbUtil.getConn()){
            PreparedStatement prepStat = con.prepareStatement(UPDATE_CUSTOMER_QUERY);
            prepStat.setString(1, customer.getName());
            prepStat.setString(2, customer.getSurname());
            prepStat.setInt(3, customer.getId());
            prepStat.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteCustomer(int id){

        try(Connection con = DbUtil.getConn()){
            PreparedStatement prepStat = con.prepareStatement(DELETE_CUSTOMER_QUERY);
            prepStat.setInt(1, id);
            prepStat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Customer> showCustmers(){
        List<Customer> customerList = new ArrayList<>();
        try (Connection con = DbUtil.getConn()){
            PreparedStatement prepStat = con.prepareStatement(SHOW_CUSTOMER_QUERY);
            ResultSet resSet = prepStat.executeQuery();

            while (resSet.next()){
                Customer customer = new Customer();
                customer.setId(resSet.getInt("id"));
                customer.setName(resSet.getString("name"));
                customer.setSurname(resSet.getString("surname"));
                customerList.add(customer);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return customerList;
    }
}