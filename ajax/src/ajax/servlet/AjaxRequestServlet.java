package ajax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ajaxrequest1")
public class AjaxRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        //out对象向浏览器输出信息
        //服务器的代码实际上还是和以前一样的，只是这个out在响应的时候，浏览器客户端的XMLHttpRequest对象会接收到这个响应的信息
        out.print("<font color='red'>hello to ajax!!!</font>");
    }
}
