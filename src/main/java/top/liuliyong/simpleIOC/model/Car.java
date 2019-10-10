package top.liuliyong.simpleIOC.model;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: Liyong.liu
 * @Date: 2019/10/10 上午9:37
 */
@Data
@ToString
public class Car {
    private String name;
    private String length;
    private String width;
    private String height;
    private Wheel wheel;
}
