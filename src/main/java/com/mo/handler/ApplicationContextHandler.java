package com.mo.handler;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextHandler {

    private static ApplicationContextHandler instance;
    private static ClassPathXmlApplicationContext context;

    private ApplicationContextHandler() {
    }

    public static ApplicationContextHandler getInstance() {
        if (null == instance) {
            synchronized (ApplicationContextHandler.class) {
                if (null == instance) {
                    instance = new ApplicationContextHandler();
                }
            }
        }
        return instance;
    }

    public void init() {
        context = new ClassPathXmlApplicationContext("classpath:spring/*.xml");
        if (null == context) {
            throw new RuntimeException("未获取到Context");
        }
    }

    public Object getBean(String beanName) {
        return context.getBean(beanName);
    }

}
