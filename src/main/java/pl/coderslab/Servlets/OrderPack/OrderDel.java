package pl.coderslab.Servlets.OrderPack;

import pl.coderslab.Dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OrderDel", urlPatterns = "/OrderDel")
public class OrderDel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if(id != null) {
            OrderDao orderDao = new OrderDao();
            orderDao.deleteOrder(Integer.parseInt(request.getParameter("id")));
            response.sendRedirect("/OrderPage");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/OrderDel.jsp")
                .forward(request, response);
    }
}
