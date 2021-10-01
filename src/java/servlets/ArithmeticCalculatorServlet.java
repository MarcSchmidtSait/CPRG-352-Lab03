
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NullPointerException {
        String first_Num = request.getParameter("first_num");
        String second_Num = request.getParameter("second_num");
        String pressed_button = request.getParameter("button");
        request.setAttribute ("first_num", first_Num);
        request.setAttribute ("second_num", second_Num);
        System.out.println(pressed_button);
        boolean isNumber;
        isNumber = isNumeric(first_Num, second_Num);
        if (isNumber == false){
            request.setAttribute("message", "Result: Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
       }
        boolean isEmpty;
        isEmpty = isEmpty(first_Num, second_Num);
        if (isEmpty == true){
            request.setAttribute("message", "Result: Invalid");  
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        } 
        System.out.println("Made it to +101");
            if (pressed_button.equals("+")){
                System.out.println("Made it to +");
                int first_num_int = Integer.parseInt(first_Num);
                int second_num_int = Integer.parseInt(second_Num);
                int addSum = first_num_int + second_num_int;
                String addSt = Integer.toString(addSum); 
                request.setAttribute("message", "Result: " + addSt);
                request.setAttribute("user_first", first_num_int);
                request.setAttribute("user_second", second_num_int);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
            if (pressed_button.equals("-")){
                int first_num_int = Integer.parseInt(first_Num);
                int second_num_int = Integer.parseInt(second_Num);
                int subSum = first_num_int - second_num_int;
                String subSt = Integer.toString(subSum); 
                request.setAttribute("message", "Result: " + subSt);
                request.setAttribute("user_first", first_num_int);
                request.setAttribute("user_second", second_num_int);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
            if (pressed_button.equals("*")){
                int first_num_int = Integer.parseInt(first_Num);
                int second_num_int = Integer.parseInt(second_Num);
                int multSum = first_num_int * second_num_int;
                String mulSt = Integer.toString(multSum); 
                request.setAttribute("message", "Result: " + mulSt);
                request.setAttribute("user_first", first_num_int);
                request.setAttribute("user_second", second_num_int);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
            if (pressed_button.equals("%")){
                int first_num_int = Integer.parseInt(first_Num);
                int second_num_int = Integer.parseInt(second_Num);
                int modSum = first_num_int % second_num_int;
                String modSt = Integer.toString(modSum); 
                request.setAttribute("message", "Result: " + modSt);
                request.setAttribute("user_first", first_num_int);
                request.setAttribute("user_second", second_num_int);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
           
        
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "Result: ---"); 
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }
    
    public static boolean isEmpty(String first_Num, String second_Num){
        //check if string age from user is a number 
        if(first_Num.equals("") || first_Num.equals(null) || second_Num.equals("") || second_Num.equals(null)){
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public static boolean isNumeric (String num1, String num2){
        //check if string age from user is a number 
        int test1; 
        int test2;
        try {
            test1 = Integer.parseInt(num1);
            test2 = Integer.parseInt(num2);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}

    
    
    
