package com.LiuFangbao.week3.homework;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    //1.tomcat read wen.xml file and find out all servlet class
    //2.load servlet - when ?2.first request for this servlet come in - from client
    //3.call default constructor - add code
    public  LifeCycleServlet(){
        System.out.println("I am in constructor --> LifeCycleServlet() ");//line 1
    }
    //4.init() - add code
    public void init(){
        System.out.println("I am in init() ");//line 2
    }
    //5.tomcat call  service(）--》 call doGet() or doPost()
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("I am in service() --> doGet()   ");//line 3
        //line 4 - 2nd request
        //line 5 - 3rd request
        //and so on -- many times - for each request
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        System.out.println("I am in destroy()  ");//when ?- stop tomcat
    }
}
