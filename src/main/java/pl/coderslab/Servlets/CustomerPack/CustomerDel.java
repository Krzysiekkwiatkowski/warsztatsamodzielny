package pl.coderslab.Servlets.CustomerPack;

import pl.coderslab.Dao.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerDel", urlPatterns = "/CustomerDel")
public class CustomerDel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if(id != null){
            CustomerDao customerDao = new CustomerDao();
            customerDao.deleteCustomer(Integer.parseInt(id));
            response.sendRedirect("/CustomerPage");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/CustomerDel.jsp")
                .forward(request, response);
    }
}
