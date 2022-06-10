package ajax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ajaxrequest2")
public class AjaxRequestServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应的内容类型
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
//        out.print("<font color='red'>用户名已经存在！！</font>");
        //获取ajax get请求提交的数据
        String usercode = request.getParameter("usercode");
        String username = request.getParameter("username");

        out.print("usercode=" + usercode + "username=" + username);
    }
}
