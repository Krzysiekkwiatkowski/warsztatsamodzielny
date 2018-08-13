package pl.coderslab.Servlets.EmployeePack;

import pl.coderslab.Class.Employee;
import pl.coderslab.Dao.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeShow", urlPatterns = "/EmployeeShow")
public class EmployeeShow extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employeeList = employeeDao.showEmployees();
        request.setAttribute("employeeList", employeeList);
    }
}
