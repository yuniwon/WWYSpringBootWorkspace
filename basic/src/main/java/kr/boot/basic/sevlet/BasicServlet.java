package kr.boot.basic.sevlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "basicServlet", urlPatterns = "/basic")
public class BasicServlet extends HttpServlet {
    //ctrl + o

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("basicServlet.service");
        System.out.println("req = " + request);
        System.out.println("res = " + response);

        //파라미터 값 받아오기
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //응답해줄때
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello basic");

    }

}
