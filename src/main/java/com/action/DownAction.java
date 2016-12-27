package com.action;

import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by webrx on 2016-12-27.
 */
public class DownAction {
    private String fn;
    private String ext;
    private String path;

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String execute(){
        return "success";
    }
    public InputStream getInputStream() throws Exception {
        String ip = ServletActionContext.getServletContext().getRealPath(path)+"/"+fn+ext;
        InputStream is = new FileInputStream(ip);
        return is;
    }

}
