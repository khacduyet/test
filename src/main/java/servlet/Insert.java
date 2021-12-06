package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Impl.ComputerDAOImpl;
import entity.Computer;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("comName");
		String producer = request.getParameter("producer");
		int yearMaking = 0;
		try {
			yearMaking = Integer.parseInt(request.getParameter("yearMaking"));
		} catch (Exception ex){
			ex.printStackTrace();
		}
		Date expireDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			expireDate = sdf.parse(request.getParameter("expireDate"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String configuration = request.getParameter("configuration");
		double price = 0;
		try {
			price = Double.parseDouble(request.getParameter("price"));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		Computer c = new Computer();
		c.setComName(name);
		c.setProducer(producer);
		c.setYearMaking(yearMaking);
		c.setExpireDate(expireDate);
		c.setConfiguration(configuration);
		c.setPrice(price);
		
		boolean bl = new ComputerDAOImpl().insertComputer(c);
		
		if (bl) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.setAttribute("Error", "Insert failed!");
			request.getRequestDispatcher("insert.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
