package com.mo;

import com.chinaredstar.ordercenter.serviceinterface.order.IOrderService;
import com.mo.handler.AbstractTesterSamplerClient;
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
        try {
            long start = System.currentTimeMillis();

            orderService.findById(1111111111111L);

            result.setSuccessful(true);
            long end = System.currentTimeMillis();
            result.setResponseData((end - start) + "", null);
        } finally {
            result.sampleEnd();
        }
        return result;

    }


}
