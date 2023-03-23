import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class HitCount extends HttpServlet {

    int hitCount = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        hitCount++;


        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String location = request.getParameter("location");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello " + name + "</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello " + name + "</h1>");
        out.println("<p>You are from " + location + "</p><br>");
        out.println("<p>No of Time you've been here: " + hitCount + "</p><br>");


        out.println("<form method='get'>");
        out.println("<label for='name'>Name:</label>");
        out.println("<input type='hidden' id='name' name='name' value="+name+"><br>");
        out.println("<label for='location'>Location:</label>");
        out.println("<input type='hidden' id='location' name='location' value=" + location + "><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}