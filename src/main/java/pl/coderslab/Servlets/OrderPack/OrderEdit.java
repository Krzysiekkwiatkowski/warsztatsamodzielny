package pl.coderslab.Servlets.OrderPack;

import pl.coderslab.Class.Order;
import pl.coderslab.Dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OrderEdit", urlPatterns = "/OrderEdit")
public class OrderEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String receptionDate = request.getParameter("receptionDate");
        String planningRepairDate = request.getParameter("planningRepairDate");
        String repairStartDate = request.getParameter("repairStartDate");
        String repairEmployee = request.getParameter("repairEmployee");
        String problem = request.getParameter("problem");
        String repairPlan = request.getParameter("repairPlan");
        int status = Integer.parseInt(request.getParameter("status"));
        String vehicle = request.getParameter("vehicle");
        Order order = new Order(id, receptionDate, planningRepairDate, repairStartDate, repairEmployee, problem, repairPlan, status, vehicle);
        OrderDao orderDao = new OrderDao();
        orderDao.updateOrder(order);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/OrderEdit.jsp")
                .forward(request, response);
    }
}
