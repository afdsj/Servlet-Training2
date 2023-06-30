package com.ohgiraffers.servlettest3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user/order")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        String name = req.getParameter("name");
        System.out.println("이름 : " + name);
        String password = req.getParameter("password");
        System.out.println("비밀번호 : " + password);
        String call = req.getParameter("call");
        System.out.println("전화번호 : " + call);
        String add = req.getParameter("add");
        System.out.println("주소 : " + add);

        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(60*10);
        session.setAttribute("name",name);

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html lang=\"en\">")
                .append("<head>")
                .append("<title>forward</title>")
                .append("</head>")
                .append("<body>")
                .append("<h3 style=\"align-content: center;\">")
                .append(name)
                .append("님 환영 합니다</h3>")
                .append("<a href=\"/order.jsp\">주문하기</a>")
                .append("</body>")
                .append("</html>");

        PrintWriter out = resp.getWriter();

        out.print(responseText.toString());
        out.flush();
    }
}
