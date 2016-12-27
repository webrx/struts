package com.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

/**
 * Created by webrx on 2016-12-27.
 */
public class AuthInterceptor implements Interceptor {
    @Override
    public void destroy() {
    }

    @Override
    public void init() {
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        Map<String,Object> session = ai.getInvocationContext().getSession();
        String result = "login";
        if(session.containsKey("login")){
            result = ai.invoke();
        }
        return result;
    }
}
