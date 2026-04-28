package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class A010_MyServlet extends HttpServlet {

    // Handle GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.append("<h2>This is GET request</h2>");
        String name = request.getParameter("name");

        if (name != null) {
            out.append("<p>Hello, " + name + " (from GET)</p>");
        } else {
            out.append("<p>No name provided in GET request</p>");
        }
    }

    // Handle POST request
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.append("<h2>This is POST request</h2>");
        String name = request.getParameter("name");

        out.append("<p>Hello, " + name + " (from POST)</p>");
    }
}