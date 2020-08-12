

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.DBUtil.DBConnection;
import com.wipro.bean.Employee1;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Connection con = new DBConnection().getConnection();
			Employee1 employee=(Employee1) request.getAttribute("Employee_Details");
			PreparedStatement pstmt= con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getDesignation());
			int count = pstmt.executeUpdate();
			PrintWriter out = response.getWriter();
			if(count<0)
			{
				out.println("<h3 style=\"color: red;\">Employee Details aren't Saved. Please Try again</h3>");
			}
			else
			{
				out.println("<h3 style=\"color: green;\">Employee Details are Saved successfully.</h3>");
			}
			out.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
