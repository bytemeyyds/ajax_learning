package ajax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @program: 代码
 * @ClassName: AjaxRequestServlet11
 * @version: 1.0
 * @description: 测试自己写的jQuery库
 * @author: bjpowernode
 * @create: 2022-05-15 19:38
 **/
@WebServlet("/ajaxrequest11")
public class AjaxRequestServlet11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        response.setContentType("text/html;charset=UTF-8");
        // {"uname":"zhangsan"}
        response.getWriter().print("{\"uname\":\""+username.toUpperCase()+"\"}");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        response.setContentType("text/html;charset=UTF-8");
        // {"uname":"zhangsan"}
        response.getWriter().print("{\"uname\":\""+username.toLowerCase()+"\"}");
    }

}
