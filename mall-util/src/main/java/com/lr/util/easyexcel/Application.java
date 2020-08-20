package com.lr.util.easyexcel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liurui
 * @date 2020/8/17 4:27 下午
 */
public class Application {
    public static void main(String[] args) {
        List<Car> list = new ArrayList();
        /**
         * list存放的是一个Car对象，里面有两个属性
         */
        Car car1 = new Car(11, "宝马");
        Car car2 = new Car(12, "奔驰");
        Car car3 = new Car(13, "特斯拉");
        list.add(car1);
        list.add(car2);
        list.add(car3);

        //list.get(i) 就是拿出来list的第i个元素
        list.get(0);//new Car(11, "宝马")

        //盛放结果
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            //遍历list集合，因为list.size()为2
            //list.get(0)是什么？我放进去的第一条数据就是一个 new Car(11, "宝马")

            //i可能为0，1，2
            //你可以看看这个拿出来的是什么东西，要有自己的思考，
            //快捷键ctrl+alt+v就能生成前面的东西，比如list.get(i)就会变成Car car = list.get(i);
            Car car = list.get(i);
            //现在拿到的是一个车，而我要计算所有车的数量
            result = result + car.getNum();

        }
    }
}
