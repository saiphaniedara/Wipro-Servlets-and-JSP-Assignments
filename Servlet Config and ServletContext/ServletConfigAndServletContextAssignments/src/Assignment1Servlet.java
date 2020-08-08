

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment1Servlet
 */
public class Assignment1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServletConfig config;
    ServletContext context;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		config = getServletConfig();		
		out.println("<h3>Using Servlet Config Parameters</h3>");
		out.println("Hi, I am "+config.getInitParameter("Name")+". My mail id is "+config.getInitParameter("Email"));
		
		context = config.getServletContext();
		out.println("<h3>Using Servlet Context Parameters</h3>");
		out.println("My Contact No is "+context.getInitParameter("Contact")+". I am studying at "+context.getInitParameter("College"));
		out.close();
	}


}
