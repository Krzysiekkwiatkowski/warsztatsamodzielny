package pl.coderslab.Servlets.VehiclePack;

import pl.coderslab.Dao.VehicleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VehicleDel", urlPatterns = "/VehicleDel")
public class VehicleDel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if(id != null){
            VehicleDao vehicleDao = new VehicleDao();
            vehicleDao.deleteVehicle(Integer.parseInt(id));
            response.sendRedirect("/VehiclePage");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/VehicleDel.jsp")
                .forward(request, response);
    }
}
