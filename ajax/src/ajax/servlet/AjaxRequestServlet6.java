package ajax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ajaxrequest6")
public class AjaxRequestServlet6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //注意响应的内容是XML
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        StringBuilder xml = new StringBuilder();
        xml.append("<students>");
        xml.append("<student>");
        xml.append("<no>1</no>");
        xml.append("<name>wangwu</name>");
        xml.append("<age>30</age>");
        xml.append("<address>chongqing</address>");
        xml.append("</student>");
        xml.append("<student>");
        xml.append("<no>2</no>");
        xml.append("<name>lisi</name>");
        xml.append("<age>22</age>");
        xml.append("<address>chengdu</address>");
        xml.append("</student>");
        xml.append("</students>");
        out.print(xml);

    }
}
