package top.liuliyong.simpleAOP.model;

/**
 * @Author: Liyong.liu
 * @Date: 2019/10/10 上午11:46
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello AOP World!");
    }
}
