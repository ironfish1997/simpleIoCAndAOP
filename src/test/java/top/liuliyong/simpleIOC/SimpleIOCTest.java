package top.liuliyong.simpleIOC;

import org.junit.Test;
import top.liuliyong.simpleIOC.model.Car;

/**
 * @Author: Liyong.liu
 * @Date: 2019/10/10 上午10:09
 */
public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}