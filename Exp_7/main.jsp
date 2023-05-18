<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Items for Sale</title>
</head>
<body>
	<h1>Items for Sale</h1>
	<table>
		<tr>
			<th>Item ID</th>
			<th>Item Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<%
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Billing", "root", "ayano@104");
				
				String sql = "SELECT * FROM items";
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getInt("item_id") + "</td>");
					out.println("<td>" + rs.getString("item_name") + "</td>");
					out.println("<td>" + rs.getString("description") + "</td>");
					out.println("<td>" + rs.getDouble("price") + "</td>");
					out.println("<td><a href='addToCart.jsp?id=" + rs.getInt("item_id") + "'>Add to Cart</a></td>");
					out.println("</tr>");
				}
				
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</table>
    <form action = 'cart.jsp'>
        <input type = 'submit'> Go To Cart </input> 
    </form>
</body>
</html>
