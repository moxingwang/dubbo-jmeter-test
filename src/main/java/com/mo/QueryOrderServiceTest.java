package com.mo;

import com.mo.handler.tester.AbstractTesterSamplerClient;
import com.mo.mock.IQueryOrderService;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import javax.annotation.Resource;

public class QueryOrderServiceTest extends AbstractTesterSamplerClient {

    @Resource
    private IQueryOrderService queryOrderService;

    public void initBean() {
        queryOrderService = (IQueryOrderService) contextHandler.getBean("queryOrderService");
    }

    /**
     * 执行测试的接口
     *
     * @param javaSamplerContext
     * @return
     */
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult result = new SampleResult();
        result.sampleStart();
        try {
            queryOrderService.queryOrderWithItemsBySerialNumber("1111111111111111111111111111111111111");
            result.setSuccessful(true);
        } finally {
            result.sampleEnd();
        }
        return result;
    }


}
