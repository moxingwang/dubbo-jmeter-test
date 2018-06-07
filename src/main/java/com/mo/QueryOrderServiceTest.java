package com.mo;

import com.chinaredstar.ordercenter.service.order.IQueryOrderService;
import com.mo.handler.ApplicationContextHandler;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import javax.annotation.Resource;

public class QueryOrderServiceTest extends AbstractJavaSamplerClient {

    @Resource
    private IQueryOrderService queryOrderService;

    /**
     * 测试准备工作
     *
     * @param javaSamplerContext
     */
    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {
        super.setupTest(javaSamplerContext);
        System.err.println("test started.");
        ApplicationContextHandler initializer = ApplicationContextHandler.getInstance();
        initializer.init();
        queryOrderService = (IQueryOrderService) initializer.getBean("queryOrderService");
    }

    /**
     * 执行测试的接口
     *
     * @param javaSamplerContext
     * @return
     */
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult result = new SampleResult();
        try {
            long start = System.currentTimeMillis();
            queryOrderService.queryOrderWithItemsBySerialNumber("1111111111111111111111111111111111111");
            result.setSuccessful(true);
            long end = System.currentTimeMillis();
            result.setResponseData((end - start) + "", null);
        } finally {
            result.sampleEnd();
        }
        return result;
    }

    /**
     * 测试完成后的操作
     *
     * @param context
     */
    @Override
    public void teardownTest(JavaSamplerContext context) {
        super.teardownTest(context);
        System.err.println("test finished.");
    }

}
