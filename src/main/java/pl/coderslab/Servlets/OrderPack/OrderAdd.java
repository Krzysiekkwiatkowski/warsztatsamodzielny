package pl.coderslab.Servlets.OrderPack;

import pl.coderslab.Class.Order;
import pl.coderslab.Dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OrderAdd", urlPatterns = "/OrderAdd")
public class OrderAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String receptionDate = request.getParameter("receptionDate");
        String planningRepairDate = request.getParameter("planningRepairDate");
        String repairStartDate = request.getParameter("repairStartDate");
        String repairEmployee = request.getParameter("repairEmployee");
        String problem = request.getParameter("problem");
        String repairPlan = request.getParameter("repairPlan");
        int status = Integer.parseInt(request.getParameter("status"));
        String vehicle = request.getParameter("vehicle");
        Order order = new Order(receptionDate, planningRepairDate, repairStartDate, repairEmployee, problem, repairPlan, status, vehicle);
        OrderDao orderDao = new OrderDao();
        orderDao.createOrder(order);
        response.sendRedirect("/OrderPage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/OrderAdd.jsp")
                .forward(request, response);
    }
}
