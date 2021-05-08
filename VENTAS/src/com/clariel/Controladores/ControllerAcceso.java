package com.clariel.Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clariel.entidades.Loguin;
import com.clariel.negocio.ClsLoguin;

/**
 * Servlet implementation class ControllerAcceso
 */
@WebServlet("/ControllerAcceso")
public class ControllerAcceso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAcceso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		Loguin log = new Loguin();
		ClsLoguin clsLog = new ClsLoguin();
		
		log.setPass(user);
		log.setUser(pass);
		
		int valordeacceso = clsLog.acceso(log);
		
		
		if(valordeacceso == 1) {
			System.out.println("WELCOME");
			response.sendRedirect("Saludo.jsp");
		}
		else {
			System.out.println("ERROR");
			response.sendRedirect("Error.jsp");
		}
		
	}

}
