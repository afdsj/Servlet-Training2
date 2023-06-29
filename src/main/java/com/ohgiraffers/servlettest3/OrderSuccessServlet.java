package com.ohgiraffers.servlettest3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ordersuccess")
public class OrderSuccessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");
        System.out.println("이름 : " + name);
        String menu = (String) session.getAttribute("menu");
        System.out.println("메뉴 : " + menu);
        String topping = (String) session.getAttribute("topping");
        System.out.println("토핑 : " + topping);
        String review = (String) session.getAttribute("review");
        System.out.println("리뷰 : " + review);
//        String name = (String) req.getAttribute("name");
//        String menu = (String) req.getAttribute("menu");
//        String topping = (String) req.getAttribute("topping");
//        String review = (String) req.getAttribute("review");


        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html lang=\"en\">")
                .append("<head>")
                .append("<title>forward</title>")
                .append("</head>")
                .append("<body>")
                .append("<h3 style=\"align-content: center;\">")
                .append(name)
                .append("님 주문완료</h3>")
                .append("<br/>")
                .append("<label>메뉴 : </label>" + menu)
                .append("<br/>")
                .append("<label>토핑 : </label>" + topping)
                .append("<br/>")
                .append("<label>리뷰 이벤트 : </label>" + review)
                .append("</body>")
                .append("</html>");

        PrintWriter out = resp.getWriter();

        out.print(responseText.toString());
        out.flush();
        out.close();
    }
}
