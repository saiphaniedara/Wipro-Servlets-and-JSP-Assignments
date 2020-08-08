

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeneratePrimesServlet
 */
@WebServlet("/GeneratePrimesServlet")
public class GeneratePrimesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneratePrimesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int range = Integer.parseInt(request.getParameter("num"));
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=2;i<=range;i++)
		{
			if(i==2 || i==3)
			{
				primes.add(i);
			}
			else
			{
				Boolean isPrime = true;
				int r = (int)Math.sqrt(i);
				for(int j=2;j<=r;j++)
				{
					if(i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
				{
					primes.add(i);
				}
			}
		}
		request.setAttribute("Primes", primes);
		request.getRequestDispatcher("Result.jsp").forward(request, response);		
	}

}
