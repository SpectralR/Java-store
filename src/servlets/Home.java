package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Databases.DBConnect;
import beans.Product;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = DBConnect.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Product pr1 = new Product(0, "Huawei", 599.99);
		Product pr2 = new Product(1, "Apple", 1099.99);
		Product pr3 = new Product(2, "Samsung", 1299.99);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(pr1);
		products.add(pr2);
		products.add(pr3);
		HttpSession session = request.getSession();
		session.setAttribute("products", products);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

}
