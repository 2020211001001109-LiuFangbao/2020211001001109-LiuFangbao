package com.LiuFangbao.week2.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class HelloWorldServlet extends HttpServlet {

    String name="LiuFangbao";
    String ID="2020211001001109";


    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter writer = response.getWriter();
        Date date=new Date();
        writer.println("Name: "+ name +"<br/>");
        writer.println("ID: "+ ID +"<br/>");
        writer.println("Date and Time: "+date.toString()+"<br/>");
    }

    public void doPost (HttpServletRequest request, HttpServletResponse response){

    }
}
