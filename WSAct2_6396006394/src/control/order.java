package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class order
 */
@WebServlet("/order")
public class order extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String amount1 = request.getParameter("amount1");
		String amount2 = request.getParameter("amount2");

		int amount1Int = Integer.parseInt(amount1);
		int amount2Int = Integer.parseInt(amount2);
		int sum, price1, price2;
		price1 = amount1Int * 3900;
		price2 = amount1Int * 6000;
		sum = (amount1Int * 3900) + (amount2Int * 6000);

		HttpSession session = request.getSession();
		session.setAttribute("amount1", amount1);
		session.setAttribute("amount2", amount2);
		session.setAttribute("price1", price1);
		session.setAttribute("price2", price2);
		session.setAttribute("sum", sum);
		request.getRequestDispatcher("payment.jsp").forward(request, response);
	}

}
