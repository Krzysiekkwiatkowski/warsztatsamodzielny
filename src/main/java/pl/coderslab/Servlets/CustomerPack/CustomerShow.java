package pl.coderslab.Servlets.CustomerPack;

import pl.coderslab.Class.Customer;
import pl.coderslab.Dao.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerShow", urlPatterns = "/CustomerShow")
public class CustomerShow extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerDao customerDao = new CustomerDao();
        List<Customer> customerList = customerDao.showCustmers();
        request.setAttribute("customerList", customerList);
    }
}
