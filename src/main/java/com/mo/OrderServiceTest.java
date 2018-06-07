package com.mo;

import com.chinaredstar.ordercenter.serviceinterface.order.IOrderService;
import com.mo.handler.tester.AbstractTesterSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import javax.annotation.Resource;

/**
 * @author MoXingwang on 2018-06-07.
 */
public class OrderServiceTest extends AbstractTesterSamplerClient {

    @Resource
    private IOrderService orderService;

    public void initBean() {
        orderService = (IOrderService) contextHandler.getBean("orderService");
    }

    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult result = new SampleResult();
        result.sampleStart();
        try {
            orderService.findById(1111111111111L);
            result.setSuccessful(true);
        } finally {
            result.sampleEnd();
        }
        return result;

    }


}
