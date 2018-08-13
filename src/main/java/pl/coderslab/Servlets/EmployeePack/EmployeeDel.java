package pl.coderslab.Servlets.EmployeePack;

import pl.coderslab.Dao.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeDel", urlPatterns = "/EmployeeDel")
public class EmployeeDel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if(id != null){
            EmployeeDao employeeDao = new EmployeeDao();
            employeeDao.deleteEmployee(Integer.parseInt(id));
            response.sendRedirect("/EmployeePage");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/EmployeeDel.jsp")
                .forward(request, response);
    }
}
