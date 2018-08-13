package pl.coderslab.Dao;

import pl.coderslab.Class.Status;
import pl.coderslab.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StatusDao {

    private static final String CREATE_STATUS_QUERY = "INSERT INTO Status (repairStatus, repairCost) VALUES(?,?)";
    private static final String UPDATE_STATUS_QUERY = "UPDATE Status SET repairStatus = ? , repairCost = ? WHERE id=?";
    private static final String DELETE_STATUS_QUERY = "DELETE FROM Status WHERE id = ?";
    private static final String SHOW_STATUS_QUERY = "SELECT * FROM Status";

    public Status createStatus(Status status){

        try (Connection con = DbUtil.getConn()){
            PreparedStatement prepStat = con.prepareStatement(CREATE_STATUS_QUERY);
            prepStat.setInt(1, status.getRepairStatus());
            prepStat.setDouble(2, status.getRepairCost());
            prepStat.executeUpdate();
            return status;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateStatus(Status status){

        try (Connection con = DbUtil.getConn()){
            PreparedStatement prepStat = con.prepareStatement(UPDATE_STATUS_QUERY);
            prepStat.setInt(1, status.getRepairStatus());
            prepStat.setDouble(2, status.getRepairCost());
            prepStat.setInt(3, status.getId());
            prepStat.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteStatus(int id){
        try (Connection con = DbUtil.getConn()){
            PreparedStatement prepStat = con.prepareStatement(DELETE_STATUS_QUERY);
            prepStat.setInt(1, id);
            prepStat.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Status> showStatus(){

        List<Status> statusList = new ArrayList<>();
        try (Connection con = DbUtil.getConn()){
            PreparedStatement prepStat = con.prepareStatement(SHOW_STATUS_QUERY);
            ResultSet resultSet = prepStat.executeQuery();
            while (resultSet.next()){
                Status status = new Status();
                status.setId(resultSet.getInt("id"));
                status.setRepairStatus(resultSet.getInt("repairStatus"));
                status.setRepairCost(resultSet.getDouble("repairCost"));
                statusList.add(status);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return statusList;
    }
}
