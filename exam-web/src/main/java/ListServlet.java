import beans.IMyBean;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name = "ListServlet", urlPatterns = "/List.do")
public class ListServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Logger.getAnonymousLogger().info(this.toString());

        if (request.getSession().getAttribute("bean") == null) {
            try {
                InitialContext ic = new InitialContext();
                IMyBean myBean = (IMyBean) ic.lookup("java:global/businessLogicEar-1.0-SNAPSHOT/businessLogic-1.0-SNAPSHOT/MyBean");
                myBean.setTest(request.getParameter("name"));
                request.getSession().setAttribute("bean", myBean);
            } catch (NamingException e) {
                e.printStackTrace();
            }
        }

        response.sendRedirect("List.do?testInput="+request.getParameter("testInput"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Logger.getAnonymousLogger().info(this.toString());
        Logger.getAnonymousLogger().info("listServlet doGet");
        Logger.getAnonymousLogger().info("!  Session ID = " + req.getSession().getId());


        req.getRequestDispatcher("WEB-INF/jsp/list.jsp").forward(req, resp);
    }
}
