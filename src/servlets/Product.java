package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Product
 */
@WebServlet("/product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = (String) request.getAttribute("id");
//		System.out.println(id);
		
		HttpSession session = request.getSession();
		ArrayList<Product> prod = new ArrayList<Product>();
		
//		prod.add((Product) session.getAttribute("products"));
//		
//		for (Product product : prod) {
//			System.out.println(product);
//		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		//		System.out.println(prod);
	}

}
