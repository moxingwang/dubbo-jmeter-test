package com.mo;

import com.chinaredstar.ordercenter.api.common.OrderResult;
import com.chinaredstar.ordercenter.service.order.IQueryOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
public class QueryOrderTest {

    @Autowired
    private IQueryOrderService queryOrderService;

    @Test
    public void testServiceMethod() {
        OrderResult s = queryOrderService.queryOrderWithItemsBySerialNumber("1111111111111111");
        System.out.println(queryOrderService.queryOrderWithItemsBySerialNumber("1111111111111111"));

    }

}

