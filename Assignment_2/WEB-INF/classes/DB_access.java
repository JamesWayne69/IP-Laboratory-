import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class DB_access extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List <Row> rows = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "username", "password");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM mytable")) {
            while (rs.next()) {
                Row row = new Row();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                row.setEmail(rs.getString("email"));
                rows.add(row);
            }
        } catch (SQLException e) {
            throw new ServletException("Failed to retrieve rows", e);
        }
        request.setAttribute("rows", rows);
        request.getRequestDispatcher("/main.jsp").forward(request, response);
    }
}
