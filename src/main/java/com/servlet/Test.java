package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by webrx on 2016/12/27.
 */
@WebServlet("/test")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fn = req.getParameter("fn");
        String ext = req.getParameter("ext");
        String f = "/download/"+fn+"."+ext;
        File fff = new File(getServletContext().getRealPath(f));
        if(fff.exists()) {
            resp.setContentType("application/x-download");
            String ff = getServletContext().getRealPath(f);
            String un = new SimpleDateFormat("yyyyMMddHHmmssS").format(new Date()) + "." + ext;
            resp.addHeader("Content-Disposition", "attachment;filename=" + un);
            OutputStream outp = null;
            FileInputStream in = null;
            try {
                outp = resp.getOutputStream();
                in = new FileInputStream(ff);
                byte[] b = new byte[10240];
                int i = 0;
                while ((i = in.read(b)) > 0) {
                    outp.write(b, 0, i);
                }
                outp.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            resp.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.print("<h3>未知错误</h3>");
            out.flush();
            out.close();
        }
    }

    protected void mytest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print("<h3>hello</h3>");
        out.print("<h3>hello</h3>");
        out.print("<h3>hello</h3>");
        out.print("<h3>hello</h3>");
        out.print("<h3>hello</h3>");
        out.flush();
        out.close();
    }
}
