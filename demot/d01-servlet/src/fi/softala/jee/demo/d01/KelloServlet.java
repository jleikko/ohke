package fi.softala.jee.demo.d01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java EE
 * DEMO 01
 */
@WebServlet("/kellonaikaservletti")
public class KelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * T�lle Java-metodille tulee selaimelta HTTP-protokollan GET-kutsut
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//tulostetaan lokiin kutsujan ip-osoite
		System.out.println("Servlettiin saapui kutsu osoitteesta: " +request.getRemoteAddr());
		//tarvitaan kirjoituskone, jolla voidaan kirjoittaa teksti� webbiselaimelle takaisin p�in
		PrintWriter wout = response.getWriter();

		//selvitet��n nykyhetki:
		//uusi java.util.Date-olio alustetaan oletuksena nykyhetkeen
		Date nykyhetki = new Date();
		
		//kirjoitetaan selaimelle nykyhetken tekstimuotoinen esitys
		wout.println("<!DOCTYPE html>");
		wout.println("<html><body>");
		wout.println(nykyhetki.toString());
		wout.println("</body></html>");
		
	}

}
