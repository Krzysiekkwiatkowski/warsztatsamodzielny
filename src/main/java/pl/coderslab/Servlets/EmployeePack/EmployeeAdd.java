package pl.coderslab.Servlets.EmployeePack;

import pl.coderslab.Class.Employee;
import pl.coderslab.Dao.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeAdd", urlPatterns = "/EmployeeAdd")
public class EmployeeAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String address = request.getParameter("address");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String note = request.getParameter("note");
        double salary = Double.parseDouble(request.getParameter("salary"));
        Employee employee = new Employee(name, surname, address, phone, note, salary);
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.createEmployee(employee);
        response.sendRedirect("/EmployeePage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/EmployeeAdd.jsp")
                .forward(request, response);
    }
}
