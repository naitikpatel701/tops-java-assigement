package Com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class regFilter
 */
@WebFilter("/reg")
public class regFilter extends HttpFilter implements Filter {
       
   @Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	
	   String name=request.getParameter("name");
	   String email=request.getParameter("email");
	   String phone=request.getParameter("phone");
	   
	   RequestDispatcher rd=request.getRequestDispatcher("reg.jsp");
	   if(name.equals("") ||name.equals(null)) {
		   
		  request.setAttribute("nameErr", "name required !!!");
		   rd.forward(request, response);
		   
	   }
	   if(email.equals("") ||email.equals(null)) {
			  request.setAttribute("emailErr", "emaill required !!!");
			   rd.forward(request, response);
			   
		   }
	   if(phone.equals("") ||name.equals(null)) {
			  request.setAttribute("phoneErr", "phone required !!!");
			   rd.forward(request, response);
			   
		   }
	   chain.doFilter(request, response);
}

}
