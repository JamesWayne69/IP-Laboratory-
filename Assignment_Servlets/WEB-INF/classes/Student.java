import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Student extends HttpServlet {


    String alpha[][] = {{"311120104001","99","1"},{"311120104002","96","2"},{"311120104003","89","4"},{"311120104004","69","5"},{"311120104005","95","3"}};
    
    String result;


    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        int flag = 0;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Simple Servlet Response!</title>");
        out.println("</head>");
        out.println("<body>");

        String x = request.getParameter("Num");

        for(int i =0;i<5;i++) {
            if(x.equals(alpha[i][0])) {
                result = alpha[i][2];
                flag = 1;
            }
        }

        if (flag==0) {
            result = "Register Number not found";
        }

        out.println("<h1>" +result +"</h1>");
        

        

        out.println("</body>");
        out.println("</html>");



    }
}