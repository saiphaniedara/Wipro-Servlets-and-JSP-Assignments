

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessServlet
 */
@WebServlet("/ProcessServlet")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(request.getParameter("num"));
		if(num<10)
		{
			request.getRequestDispatcher("page1.jsp").forward(request, response);
		}
		else if(num>10&&num<99)
		{
			request.getRequestDispatcher("page2.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("errorPage.jsp").forward(request, response);
		}
	}

}
