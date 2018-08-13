package pl.coderslab.Servlets.StatusPack;

import pl.coderslab.Class.Status;
import pl.coderslab.Dao.StatusDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StatusEdit", urlPatterns = "/StatusEdit")
public class StatusEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int repairStatus = Integer.parseInt(request.getParameter("repairStatus"));
        double repairCost = Integer.parseInt(request.getParameter("repairCost"));
        int id = Integer.parseInt(request.getParameter("id"));
        Status status = new Status(id, repairStatus, repairCost);
        StatusDao statusDao = new StatusDao();
        statusDao.updateStatus(status);
        response.sendRedirect("/StatusEdit");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/StatusEdit.jsp")
                .forward(request, response);
    }
}
