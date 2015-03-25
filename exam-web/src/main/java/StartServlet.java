import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.logging.Logger;

@WebServlet(name = "StartServlet",urlPatterns = "/Start.do")
public class StartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/jsp/form.jsp").forward(request, response);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        config.getServletContext().log("TEST!!!!!!!!!");

    }

}
