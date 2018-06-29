package com.example.demo.web.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class ResponseUtil {

    public static void write(Object o, HttpServletResponse response) throws Exception {
        response.setContentType("text/thymeleaf;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(o.toString());
        out.flush();
        out.close();
    }
}
