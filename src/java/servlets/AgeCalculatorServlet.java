package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jsenopati
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String stringAge = request.getParameter("currentAge");
            
            if (stringAge == null || stringAge.equals("")) {
            request.setAttribute("result", "You must give your current age. <br>");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
            
            try {
            int ageInt = Integer.parseInt(stringAge) + 1;
            request.setAttribute("result", "Your age next birthday will be " + ageInt + ". <br>");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
            } catch (NumberFormatException e) {
                request.setAttribute("result", "You must enter a number. <br>");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            }
    }
}
