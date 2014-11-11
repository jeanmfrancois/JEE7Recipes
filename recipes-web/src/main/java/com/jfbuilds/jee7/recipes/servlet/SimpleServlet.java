/**
 * File Name: SimpleServlet.java<br>
 * Jean-francois Nepton<br>
 * JMX 2014<br>
 * Programmer: Jean-francois Nepton<br>
 * E-mail: jeanmfrancois@hotmail.com<br>
 * Created: Nov 10, 2014
 */
package com.jfbuilds.jee7.recipes.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Recipe 1-2: Developing a Servlet
 * 
 * @author juneau
 */
@WebServlet(name = "JFServlet", urlPatterns = "/SimpleServlet", displayName = "JF Simple Servlet", description = "My Servlet without a web.xml file configured.")
public class SimpleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8381118177335418591L;

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			/*
			 * TODO output your page here. You may use following sample code.
			 */
			out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:h=\"http://java.sun.com/jsf/html\""
					+ "xmlns:f=\"http://java.sun.com/jsf/core\" xmlns:p=\"http://primefaces.org/ui\">");
			out.println("<head>");
			out.println("<title>JF's Servlet is on it's way, Profiling</title>");
			out.println("</head>");
			out.println("<body style='background-color:#FFFFDD;color:dark-red;'>");
			out.println("<h2>JF You did it! You have a SimpleServlet at Context Path:" + request.getContextPath()
					+ " Status Code:" + response.getStatus() + "... still sooo much to go!</h2>");
			out.println("<br/><font style='text-decoration:bolder;color:red;'>Welcome to Java EE Recipes, Maven Style!!!</font>");
			out.println("<p:button outcome=\"productDetail\" value=\"Bookmark\" icon=\"ui-icon-star\">");
			out.println("<f:param name=\"productId\" value=\"10\" />");
			out.println("</p:button>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

	// <editor-fold defaultstate="collapsed"
	// desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>
}
