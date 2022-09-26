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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setAttribute("result", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String firstNum = request.getParameter("firstNum");
            String secondNum = request.getParameter("secondNum");
            String doTheMath = request.getParameter("math");
            
            request.setAttribute("firstNum", firstNum);
            request.setAttribute("secondNum", secondNum);
            
            if (firstNum == null || secondNum == null || firstNum.equals("") || secondNum.equals("")) {
                request.setAttribute("result", "invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
            return;
            
            } else {
                
                int afterMath = 0;
                
                try {
            
                switch(doTheMath){
                    case "add":
                        afterMath = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                    break;
                    
                    case "subtract":
                        afterMath = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
                    break;
                    
                    case "multiply":
                        afterMath = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
                    break;
                    
                    case "divide":
                        afterMath = Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
                    break;
                    
                    default:
                    break;
                }
                } catch (NumberFormatException e) {
                    request.setAttribute("result", "invalid");
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                            .forward(request, response);
                    return;
                }
                String afterAfterMath = Integer.toString(afterMath);
                    request.setAttribute("result", afterAfterMath);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                            .forward(request, response);
            }
    }
}