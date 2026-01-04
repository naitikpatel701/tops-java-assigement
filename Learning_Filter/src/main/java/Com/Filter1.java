package Com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/Ser1")
public class Filter1 extends HttpFilter implements Filter {
       
  @Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	
	  System.out.println("filter entry...");
	  System.out.println(request.getRequestId());
	  System.out.println(request.getRemoteHost());
	  System.out.println(request.getRemoteAddr());
	  chain.doFilter(request, response);
	  System.out.println("filter exites...");
}
}
