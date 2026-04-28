package com;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class A008_SimpleServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get parameters from user
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        // Default values (if empty)
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }
        if (age == null || age.isEmpty()) {
            age = "Not provided";
        }

        // Set response type
        response.setContentType("text/html");

        // Send response to browser
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Servlet Response</title></head>");
        out.println("<body>");
        out.println("<h2>User Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}