<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<html>
<head>
	<title>Checkout</title>
</head>
<body>
	<h1>Checkout</h1>
	
	<%
		// Retrieve the user's cart object from the session
		HttpSession session = request.getSession();
		Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
		
		if (cart == null || cart.isEmpty()) {
			out.println("<p>Your shopping cart is empty.</p>");
		} else {
			// Display the items in the cart
			out.println("<table>");
			out.println("<tr><th>Item</th><th>Quantity</th><th>Price</th></tr>");
			
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Billing", "root", "ayano@104");
				
				String sql = "SELECT * FROM items WHERE item_id=?";
				PreparedStatement stmt = conn.prepareStatement(sql);
				
				double total = 0.0;
				for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {
					int itemId = entry.getKey();
					int quantity = entry.getValue();
					
					stmt.setInt(1, itemId);
					ResultSet rs = stmt.executeQuery();
					
					if (rs.next()) {
						String name = rs.getString("name");
						double price = rs.getDouble("price");
						
						out.println("<tr><td>" + name + "</td><td>" + quantity + "</td><td>" + price + "</td></tr>");
						total += price * quantity;
					}
					
					rs.close();
				}
				
				stmt.close();
				conn.close();
				
				out.println("<tr><td colspan='2'><b>Total:</b></td><td><b>$" + total + "</b></td></tr>");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			out.println("</table>");
			
			out.println("<form action='success.jsp' method='post'>");
			out.println("<label>Credit Card Number:</label>");
			out.println("<input type='text' name='creditcard' id='creditcard' required><br>");
            out.println("<label>PIN:</label>");
			out.println("<input type='text' name='pin' id='pin' required><br>");
			out.println("<input type='submit' value='Pay'>");
			out.println("</form>");
		}
	%>
	
</body>
</html>
