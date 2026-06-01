<%@ page import="java.sql.*" %>
<%@ page import="com.expensetracker.DBConnection" %>

<html>
<body>

<h2>Expense List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Category</th>
<th>Amount</th>
<th>Date</th>
</tr>

<%
Connection con = DBConnection.getConnection();

Statement st = con.createStatement();

ResultSet rs =
st.executeQuery("SELECT * FROM expenses");

while(rs.next()){
%>

<tr>
<td><%= rs.getInt("id") %></td>
<td><%= rs.getString("category") %></td>
<td><%= rs.getDouble("amount") %></td>
<td><%= rs.getDate("expense_date") %></td>
</tr>

<%
}
%>

</table>

</body>
</html>
