package pl.coderslab.Servlets.StatusPack;

import pl.coderslab.Class.Status;
import pl.coderslab.Dao.StatusDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StatusAdd", urlPatterns = "/StatusAdd")
public class StatusAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sta = Integer.parseInt(request.getParameter("repairStatus"));
        double cos = Double.parseDouble(request.getParameter("repairCost"));
        StatusDao statusDao = new StatusDao();
        Status status = new Status(sta, cos);
        statusDao.createStatus(status);
        response.sendRedirect("/StatusPage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/StatusAdd.jsp")
                .forward(request, response);
    }
}
