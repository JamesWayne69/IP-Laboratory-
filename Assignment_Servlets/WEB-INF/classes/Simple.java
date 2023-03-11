import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Integer;

public class Simple extends HttpServlet {


    String alpha[] = {"A","B","C","D","E"};



    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Simple Servlet Response!</title>");
        out.println("</head>");
        out.println("<body>");

        int x = Integer.parseInt(request.getParameter("Num"));
        x %= 5;

        switch(x) {
            
            case 0:
            out.println("<h1>" +alpha[0] +"</h1>");
            break;

            case 1:
            out.println("<h1>" +alpha[1] +"</h1>");
            break;

            case 2:
            out.println("<h1>" +alpha[2] +"</h1>");
            break;

            case 3:
            out.println("<h1>" +alpha[3] +"</h1>");
            break;

            case 4:
            out.println("<h1>" +alpha[4] +"</h1>");
            break;

            default:
            out.println("<h1>" +"Oooops" +"</h1>");
            break;
        }

        out.println("</body>");
        out.println("</html>");



    }
}