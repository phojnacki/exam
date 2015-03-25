import javax.servlet.*;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Logger;

public class ReplacementFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        Logger.getAnonymousLogger().info("Before chain do filter");
        chain.doFilter(req, resp);
        Writer w = resp.getWriter();
        w.write("Test2222");
        Logger.getAnonymousLogger().info("After chain do filter");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
