package com.example.requestdispatcher;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.RequestDispatcher;

@WebServlet(name = "home", value = "/home")
public class Home extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");

        try {
            out.println("Welcome " +user);
        }catch (Exception e){
            out.println(e);
        }
    }
}
