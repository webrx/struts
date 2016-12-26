package com.action;

import org.apache.struts2.ServletActionContext;

/**
 * Created by webrx on 2016/12/27.
 */
public class HelloAction {
    public String execute() throws Exception{
        ServletActionContext.getResponse().getWriter().print("hello-action");
        return null;
    }
}
