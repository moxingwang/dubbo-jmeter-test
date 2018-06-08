package com.mo;

import com.mo.mock.IQueryOrderService;
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
        String s = queryOrderService.queryOrderWithItemsBySerialNumber("1111111111111111");
        System.out.println(queryOrderService.queryOrderWithItemsBySerialNumber("1111111111111111"));

    }

}

