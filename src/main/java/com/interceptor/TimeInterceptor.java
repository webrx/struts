package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by webrx on 2016-12-27.
 */
public class TimeInterceptor extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        long start = System.currentTimeMillis();
        System.out.println("TimeInterceptor 拦截器开始......");
        String result = ai.invoke();
        System.out.println("TimeInterceptor 拦截器结束......");
        long end = System.currentTimeMillis();
        System.out.println("当前操作:"+(end-start)+"ms");
        return result;
    }
}
