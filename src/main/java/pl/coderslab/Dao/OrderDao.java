package pl.coderslab.Dao;

import pl.coderslab.Class.Order;
import pl.coderslab.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {

    private static final String CREATE_ORDER_QUERY = "INSERT INTO Orders(reception_date, planning_repair_date, repair_start_date, repair_employee, problem, repair_plan, status, vehicle) VALUES (?,?,?,?,?,?,?,?)";
    private static final String UPDATE_ORDER_QUERY = "UPDATE Orders SET reception_date = ? , planning_repair_date = ? , repair_start_date = ? , repair_employee = ? , problem = ? , repair_plan = ? , status = ? , vehicle = ? WHERE id = ?";
    private static final String DELETE_ORDER_QUERY = "DELETE FROM Orders where id = ?";
    private static final String SHOW_ORDER_QUERY = "SELECT * FROM Orders";

    public Order createOrder(Order order) {
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(CREATE_ORDER_QUERY);
            prepStat.setString(1, order.getReceptionDate());
            prepStat.setString(2, order.getPlanningRepairDate());
            prepStat.setString(3, order.getRepairStartDate());
            prepStat.setString(4, order.getRepairEmployee());
            prepStat.setString(5, order.getProblem());
            prepStat.setString(6, order.getRepairPlan());
            prepStat.setInt(7, order.getStatus());
            prepStat.setString(8, order.getVehicle());
            prepStat.executeUpdate();
            return order;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Order updateOrder(Order order) {
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(UPDATE_ORDER_QUERY);
            prepStat.setString(1, order.getReceptionDate());
            prepStat.setString(2, order.getPlanningRepairDate());
            prepStat.setString(3, order.getRepairStartDate());
            prepStat.setString(4, order.getRepairEmployee());
            prepStat.setString(5, order.getProblem());
            prepStat.setString(6, order.getRepairPlan());
            prepStat.setInt(7, order.getStatus());
            prepStat.setString(8, order.getVehicle());
            prepStat.setInt(9, order.getId());
            prepStat.executeUpdate();
            return order;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteOrder(int id){
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(DELETE_ORDER_QUERY);
            prepStat.setInt(1, id);
            prepStat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Order> showOrders(){
        List<Order> orderList = new ArrayList<>();
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(SHOW_ORDER_QUERY);
            ResultSet resSet = prepStat.executeQuery();
            while(resSet.next()){
                Order order = new Order();
                order.setId(resSet.getInt("id"));
                order.setReceptionDate(resSet.getString("reception_date"));
                order.setPlanningRepairDate(resSet.getString("planning_repair_date"));
                order.setRepairStartDate(resSet.getString("repair_start_date"));
                order.setRepairEmployee(resSet.getString("repair_employee"));
                order.setProblem(resSet.getString("problem"));
                order.setRepairPlan(resSet.getString("repair_plan"));
                order.setStatus(resSet.getInt("status"));
                order.setVehicle(resSet.getString("vehicle"));
                orderList.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderList;
    }

}
