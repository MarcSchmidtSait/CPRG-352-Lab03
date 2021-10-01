
package servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NullPointerException {
        String Age = request.getParameter("age");
        System.out.println(Age);
        boolean isNumber;
        isNumber = isNumeric(Age);
        if (isNumber == false){
            request.setAttribute("message", "Invalid entry. You must enter a number. ");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
       }
        boolean isEmpty;
        isEmpty = isEmpty(Age);
        if (isEmpty == true){
            request.setAttribute("message", "Invalid entry. You must give your current age. ");  
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        } 
        else {
            int user_Age = Integer.parseInt(Age);
            user_Age++;
            String nextBirthday = Integer.toString(user_Age);
            request.setAttribute("message", "Your age next birthday will be " + nextBirthday);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }
    
    public static boolean isEmpty(String age){
        //check if string age from user is a number 
        if(age.equals("") || age.equals(null)){
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public static boolean isNumeric (String age){
        //check if string age from user is a number 
        int test; 
        try {
            test = Integer.parseInt(age);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
