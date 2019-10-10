package top.liuliyong.simpleAOP.aspect;

import java.lang.reflect.Proxy;

/**
 * @Author: Liyong.liu
 * @Date: 2019/10/10 上午11:44
 */
public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
