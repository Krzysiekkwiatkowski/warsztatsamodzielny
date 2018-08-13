package pl.coderslab.Servlets.VehiclePack;

import pl.coderslab.Class.Vehicle;
import pl.coderslab.Dao.VehicleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VehicleEdit", urlPatterns = "/VehicleEdit")
public class VehicleEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String model = request.getParameter("model");
        String mark = request.getParameter("mark");
        int year = Integer.parseInt(request.getParameter("year"));
        String registationNumber = request.getParameter("registrationNumber");
        String dateOfNextVisit = request.getParameter("dateOfNextVisit");
        Vehicle vehicle = new Vehicle(id, model, mark, year, registationNumber, dateOfNextVisit);
        VehicleDao vehicleDao = new VehicleDao();
        vehicleDao.updateVehicle(vehicle);
        response.sendRedirect("/VehicleEdit");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/VehicleEdit.jsp")
                .forward(request, response);
    }
}
