package com.gadventures.gnation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sforce.soap.enterprise.LoginFault;
import com.sforce.soap.enterprise.SforceServiceStub;
import com.sforce.soap.enterprise.SforceServiceStub.ExceptionCode;
import com.sforce.soap.enterprise.SforceServiceStub.Login;
import com.sforce.soap.enterprise.SforceServiceStub.LoginResponse;

/**
 * Servlet implementation class HomePageServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String EXCEPTION = "An unexpected error occurred. If the problem persists, please contact software@gadventures.com";
	private static final String LOGIN_FAULT = "A login error occurred. If the problem persists, please contact software@gadventures.com";
	private static final String INVALID_LOGIN = "Invalid username or password.  Please verify your login credentials and try again.";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			if(cookie.getName().equalsIgnoreCase("salesforcesessionid")) {
				request.setAttribute("sessionId", cookie.getValue());
				dispatcher = getServletContext().getRequestDispatcher("/success.jsp");
				break;
			}			
		}	
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		String errorMessage = null;
		
		try {			
			Login login = new Login();
			
			String username = request.getParameter("id_username");
			
			//Assume they're using their short name
			if(!username.contains("@")) {
				username = username + "@gadventures.com";
			}
			
			login.setUsername(username);			
			login.setPassword(request.getParameter("id_password"));

			SforceServiceStub service = new SforceServiceStub();
			LoginResponse loginResponse = service.login(login, null);
			
			String sessionId = loginResponse.getResult().getSessionId();
			request.setAttribute("sessionId", sessionId);
			
			Cookie cookie = new Cookie("salesforcesessionid", sessionId);
			cookie.setMaxAge(120*60);
			response.addCookie(cookie);
			
			dispatcher = getServletContext().getRequestDispatcher("/success.jsp");
			
		}
		catch(LoginFault e) {
			if(e.getFaultMessage().getLoginFault().getExceptionCode().getValue().equalsIgnoreCase(ExceptionCode._INVALID_LOGIN)) {
				errorMessage = INVALID_LOGIN;
			}
			else {
				errorMessage = LOGIN_FAULT;
			}
		}
		catch(Exception e) {			
			e.printStackTrace();
			errorMessage = EXCEPTION;
		}
		
		request.setAttribute("errorMessage", errorMessage);		
		dispatcher.forward(request, response);
	}

}
