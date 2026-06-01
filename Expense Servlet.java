package com.expensetracker;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ExpenseServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String category =
                req.getParameter("category");

        String amount =
                req.getParameter("amount");

        String date =
                req.getParameter("date");

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                    "INSERT INTO expenses(category,amount,expense_date) VALUES(?,?,?)");

            ps.setString(1, category);
            ps.setDouble(2,
                    Double.parseDouble(amount));

            ps.setString(3, date);

            ps.executeUpdate();

            resp.sendRedirect("viewExpenses.jsp");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
