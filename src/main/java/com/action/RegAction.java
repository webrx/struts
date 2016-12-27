package com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by webrx on 2016-12-27.
 */
public class RegAction extends ActionSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String execute() throws IOException {
        System.out.println(id);
        //HttpServletRequest req = ServletActionContext.getRequest();
        //HttpServletResponse res = ServletActionContext.getResponse();
        //res.getWriter().print(req.getParameter("id"));
        System.out.println("com.action.RegAction.execute()方法执行了");
        for(int i=0;i<=10000000;i++){

        }
        return null;
    }
}
