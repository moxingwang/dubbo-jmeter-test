package com.mo;

import com.mo.handler.ApplicationContextHandler;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;

/**
 * @author MoXingwang on 2018-06-07.
 */
public abstract class AbstractTesterSamplerClient extends AbstractJavaSamplerClient {

    ApplicationContextHandler contextHandler;

    /**
     * 初始化所需要的Bean
     * 如 (IQueryOrderService) contextHandler.getBean("queryOrderService");
     */
    public abstract void initBean();

    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {
        super.setupTest(javaSamplerContext);
        contextHandler = ApplicationContextHandler.getInstance();
        contextHandler.init();

        //初始化bean
        initBean();
    }

}
