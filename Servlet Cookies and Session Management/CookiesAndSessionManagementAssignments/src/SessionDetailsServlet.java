

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDetailsServlet
 */
@WebServlet("/SessionDetailsServlet")
public class SessionDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		int visitCount = 0;
		if(session.isNew())
		{
			visitCount = 1;
		}
		else
		{
			visitCount = (int) session.getAttribute("vcount");
			visitCount++;
		}
		session.setAttribute("vcount", visitCount);
		out.println("<table><tr><th colspan=\"2\" align=\"center\">Session Details</th></tr><tr><th>Attribute Name</th><th>Attribute Value</th></tr><tr><td>Session Id</td>");
		out.print("<td>"+session.getId()+"</td></tr><tr><td>Creation Time</td><td>"+session.getCreationTime()+"</td></tr><tr><td>Last Accessed Time</td><td>"+session.getLastAccessedTime()+"</td></tr><tr><td>Visit Count</td><td>"+visitCount+"</td></tr></table>");
		out.close();
	}

}
