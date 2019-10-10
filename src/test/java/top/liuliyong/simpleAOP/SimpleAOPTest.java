package top.liuliyong.simpleAOP;

import org.junit.Test;
import top.liuliyong.simpleAOP.aspect.Advice;
import top.liuliyong.simpleAOP.aspect.BeforeAdvice;
import top.liuliyong.simpleAOP.aspect.MethodInvocation;
import top.liuliyong.simpleAOP.aspect.SimpleAOP;
import top.liuliyong.simpleAOP.model.HelloService;
import top.liuliyong.simpleAOP.model.HelloServiceImpl;

/**
 * @Author: Liyong.liu
 * @Date: 2019/10/10 上午11:48
 */
public class SimpleAOPTest {

    @Test
    public void getProxy() throws Exception {
        //1.创建一个MethodInvocation实现类
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();

        //2.创建一个Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);

        //3.为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl, beforeAdvice);

        helloServiceImplProxy.sayHelloWorld();
    }
}
