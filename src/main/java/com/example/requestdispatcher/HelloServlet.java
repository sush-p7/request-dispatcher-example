package com.example.requestdispatcher;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String username = request.getParameter("user");
        String password = request.getParameter("pin");
       try{
           if (username.equals("admin")&&password.equals("123")){
               out.println("hello "+username);
               RequestDispatcher rd = request.getRequestDispatcher("home");
               rd.forward(request,response);
               out.println("hello");
           } else if (username.equals("student")&&password.equals("123")) {
               RequestDispatcher rd = request.getRequestDispatcher("home");
               out.println("Include method");
               rd.forward(request,response);
           }
           else {
               out.println("Invalid user");
               RequestDispatcher rd = request.getRequestDispatcher("index.html");
               rd.include(request,response);
           }
       }catch (Exception e){
           out.println(e);
       }
    }

    public void destroy() {
    }
}