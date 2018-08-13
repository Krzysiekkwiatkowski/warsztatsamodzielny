package pl.coderslab.Dao;

import pl.coderslab.Class.Vehicle;
import pl.coderslab.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDao {
    private static final String CREATE_VEHICLE_QUERY = "INSERT INTO Vehicles(model, mark, year, registration_number, date_of_next_visit) VALUES (?,?,?,?,?)";
    private static final String UPDATE_VEHICLE_QUERY = "UPDATE Vehicles SET model = ? , mark = ?, year = ?, registration_number = ?, date_of_next_visit = ? WHERE	id = ?";
    private static final String DELETE_VEHICLE_QUERY = "DELETE FROM Vehicles where id = ?";
    private static final String SHOW_VEHICLE_QUERY = "SELECT * FROM Vehicles";

    public Vehicle createVehicle(Vehicle vehicle) {
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(CREATE_VEHICLE_QUERY);
            prepStat.setString(1, vehicle.getModel());
            prepStat.setString(2, vehicle.getMark());
            prepStat.setInt(3, vehicle.getYear());
            prepStat.setString(4, vehicle.getRegistrationNumber());
            prepStat.setString(5, vehicle.getDateOfNextVisit());
            prepStat.executeUpdate();
            return vehicle;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Vehicle updateVehicle(Vehicle vehicle) {
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(UPDATE_VEHICLE_QUERY);
            prepStat.setString(1, vehicle.getModel());
            prepStat.setString(2, vehicle.getMark());
            prepStat.setInt(3, vehicle.getYear());
            prepStat.setString(4, vehicle.getRegistrationNumber());
            prepStat.setString(5, vehicle.getDateOfNextVisit());
            prepStat.setInt(6, vehicle.getId());
            prepStat.executeUpdate();
            return vehicle;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteVehicle(int id){
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(DELETE_VEHICLE_QUERY);
            prepStat.setInt(1, id);
            prepStat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Vehicle> showVehicle(){
        List<Vehicle> vehicleList = new ArrayList<>();
        try (Connection con = DbUtil.getConn()) {
            PreparedStatement prepStat = con.prepareStatement(SHOW_VEHICLE_QUERY);
            ResultSet resSet = prepStat.executeQuery();
            while(resSet.next()){
                Vehicle vehicle = new Vehicle();
                vehicle.setId(resSet.getInt("id"));
                vehicle.setModel(resSet.getString("model"));
                vehicle.setMark(resSet.getString("mark"));
                vehicle.setYear(resSet.getInt("year"));
                vehicle.setRegistrationNumber(resSet.getString("registration_number"));
                vehicle.setDateOfNextVisit(resSet.getString("date_of_next_visit"));;
                vehicleList.add(vehicle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicleList;
    }
}
