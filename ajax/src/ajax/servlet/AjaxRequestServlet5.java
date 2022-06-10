package ajax.servlet;

import com.alibaba.fastjson.JSON;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ajaxrequest5")
public class AjaxRequestServlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //连接数据库，查询学员信息，拼接html代码，响应html代码到浏览器
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

//        StringBuilder jsonStr = new StringBuilder();



//        存在的缺点：在后端java代码中又开始写前端代码了，不好维护
//        正确方式：后端只用将数据返回，让前端拿到数据就好
//        后端可以只用返回数据（JSON格式或者XML格式）
//        html.append("<tr>");
//        html.append("<th>1</th>");
//        html.append("<th>张三</th>");
//        html.append("<th>20</th>");
//        html.append("<th>重庆</th>");
//        html.append("</tr>");

//        Boolean flag = false;
        try {
            List<Student> studentList = new ArrayList<>();
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
            // 3、获取预编译的数据库操作对象
            String sql = "select no,name,age,address from t_stu";
            ps = conn.prepareStatement(sql);
            // 4、执行sql语句
            rs = ps.executeQuery();
            // 5、处理结果集
//            jsonStr.append("[");
            while (rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String address = rs.getString("address");
                Student student = new Student(no, name, age, address);
                studentList.add(student);


                // 使用json格式字符串将数据返回
//                jsonStr.append("{\"no\":\"");
//                jsonStr.append(no);
//                jsonStr.append("\",\"name\":\"");
//                jsonStr.append(name);
//                jsonStr.append("\",\"age\":");
//                jsonStr.append(age);
//                jsonStr.append(",\"address\":\"");
//                jsonStr.append(address);
//                jsonStr.append("\"},");



//                html.append(jsonStr);

            }
            String json = JSON.toJSONString(studentList);
            out.print(json);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6、释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
