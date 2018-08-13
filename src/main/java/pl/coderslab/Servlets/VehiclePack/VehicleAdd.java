package pl.coderslab.Servlets.VehiclePack;

import pl.coderslab.Class.Vehicle;
import pl.coderslab.Dao.VehicleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VehicleAdd", urlPatterns = "/VehicleAdd")
public class VehicleAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String model = request.getParameter("model");
        String mark = request.getParameter("mark");
        int year = Integer.parseInt(request.getParameter("year"));
        String registrationNumber = request.getParameter("registration_number");
        String dateOfNextVisit = request.getParameter("date_of_next_visit");
        Vehicle vehicle = new Vehicle(model, mark, year, registrationNumber, dateOfNextVisit);
        VehicleDao vehicleDao = new VehicleDao();
        vehicleDao.createVehicle(vehicle);
        response.sendRedirect("/VehiclePage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/VehicleAdd.jsp")
                .forward(request, response);
    }
}
