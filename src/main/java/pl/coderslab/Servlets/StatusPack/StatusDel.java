package pl.coderslab.Servlets.StatusPack;

import pl.coderslab.Dao.StatusDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StatusDel", urlPatterns = "/StatusDel")
public class StatusDel extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id != null) {
            StatusDao statusDao = new StatusDao();
            statusDao.deleteStatus(Integer.parseInt(request.getParameter("id")));
            response.sendRedirect("/StatusPage");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        getServletContext().getRequestDispatcher("/StatusDel.jsp")
                .forward(request, response);
    }
}

