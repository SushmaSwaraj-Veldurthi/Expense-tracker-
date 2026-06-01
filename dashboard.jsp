<%@ page language="java" %>

<html>
<head>
<title>Dashboard</title>
</head>

<body>

<h2>Add Expense</h2>

<form action="ExpenseServlet" method="post">

Category:
<input type="text" name="category">

Amount:
<input type="number" name="amount">

Date:
<input type="date" name="date">

<input type="submit" value="Save">

</form>

<a href="viewExpenses.jsp">
View Expenses
</a>

</body>
</html>
