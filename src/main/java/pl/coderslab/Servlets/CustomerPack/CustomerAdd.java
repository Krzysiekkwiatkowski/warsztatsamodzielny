package pl.coderslab.Servlets.CustomerPack;

import pl.coderslab.Class.Customer;
import pl.coderslab.Dao.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerAdd", urlPatterns = "/CustomerAdd")
public class CustomerAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            Customer customer = new Customer(name, surname);
            CustomerDao customerDao = new CustomerDao();
            customerDao.createCustomer(customer);
            response.sendRedirect("/CustomerPage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/CustomerAdd.jsp")
                .forward(request, response);
    }
}
