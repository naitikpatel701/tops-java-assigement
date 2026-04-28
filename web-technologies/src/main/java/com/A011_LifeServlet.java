package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleServlet")
public class A011_LifeServlet extends HttpServlet {

    // 1. init() - called only once
    @Override
    public void init() throws ServletException {
        System.out.println("init() method called - Servlet is initialized");
    }

    // 2. service() - called for every request
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("service() method called - Request received");
        super.service(req, resp); // very important to call doGet/doPost
    }

    // 3. doGet() - handles GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("doGet() method called");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.append("<h2>GET request processed</h2>");
    }

    // 4. doPost() - handles POST request
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("doPost() method called");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.append("<h2>POST request processed</h2>");
    }

    // 5. destroy() - called once before servlet is destroyed
    @Override
    public void destroy() {
        System.out.println("destroy() method called - Servlet is destroyed");
    }
}