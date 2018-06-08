package com.mo.mock;

/**
 * @author MoXingwang on 2018-06-08.
 * 使用前配置自己的真实dubbo服务，删除掉mock
 */
public interface IQueryOrderService {
    String queryOrderWithItemsBySerialNumber(String orderNo);
}
