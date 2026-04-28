package com;

import java.io.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class A007_HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get user input
        String name = request.getParameter("username");

        if (name == null || name.isEmpty()) {
            name = "Guest";
        }

        // Set response type
        response.setContentType("text/html");

        // Print output
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Servlet Output</title></head>");
        out.println("<body>");
        out.println("<h2>Hello, " + name + "!</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}