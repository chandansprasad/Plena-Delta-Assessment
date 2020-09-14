package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/welcome")
public class ArrangementServlet extends HttpServlet {
	
	RewriteService ser = new RewriteService();	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String name = request.getParameter("name");
		String res = ser.rewrite(name);
		String fc= ser.first(name);
		request.setAttribute("res", res);
		request.setAttribute("fc", fc);
		request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
		

	}

}