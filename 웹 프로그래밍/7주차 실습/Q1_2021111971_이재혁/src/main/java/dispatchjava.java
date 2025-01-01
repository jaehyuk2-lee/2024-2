

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dsipatchjava
 */
@WebServlet("/dispatchjava")
public class dispatchjava extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dispatchjava() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;cherset=UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("dispatchjsp.jsp");
		request.setAttribute("request", "requestValue");
		request.setAttribute("requestName", "Hong-gil-dong");
		dispatcher.forward(request, response);
	}

}
