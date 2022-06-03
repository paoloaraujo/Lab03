package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Paolo
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        String result = "---";
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String initialMessage = "---";
        request.setAttribute("firstValue", first);
        request.setAttribute("secondValue", second);
        
        if(first.equals("") || second.equals("")){
            
            String result = "invalid";
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } 
        try {
            int calcFirst = Integer.parseInt(first);
            int calcSecond = Integer.parseInt(second);
                        
            String operator = request.getParameter("operator");
            
                
            
            switch(operator) {
                case "+":
                    String result = Integer.toString(calcFirst + calcSecond);
                    request.setAttribute("result", result);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                    return;

                case "-":
                    result = Integer.toString(calcFirst - calcSecond);
                    request.setAttribute("result", result);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                    return;

                case "*":
                    result = Integer.toString(calcFirst * calcSecond);
                    request.setAttribute("result", result);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                    return;

                case "%":
                    result = Integer.toString(calcFirst % calcSecond);
                    request.setAttribute("result", result);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                    return;
             }
            } 
            catch(Exception e){
            String result = "invalid";
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
                
            }
                        

        }

    }


