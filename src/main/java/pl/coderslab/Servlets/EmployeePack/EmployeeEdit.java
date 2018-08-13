package pl.coderslab.Servlets.EmployeePack;

import pl.coderslab.Class.Employee;
import pl.coderslab.Dao.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeEdit", urlPatterns = "/EmployeeEdit")
public class EmployeeEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String address = request.getParameter("address");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String note = request.getParameter("note");
        int salary = Integer.parseInt(request.getParameter("salary"));
        Employee employee = new Employee(id, name, surname, address, phone, note, salary);
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.updateEmployee(employee);
        response.sendRedirect("/EmployeeEdit");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/EmployeeEdit.jsp")
                .forward(request, response);
    }
}
