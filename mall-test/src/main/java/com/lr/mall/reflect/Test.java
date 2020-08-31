package com.lr.mall.reflect;

import com.alibaba.fastjson.JSON;
import com.lr.mall.utils.ClassScanUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liurui
 * @date 2020/7/27 4:16 下午
 */

public class Test extends Person<Student>{
    public static void main(String[] args) {

        Test test = new Test();
        test.get();
        //test.getInfo();

        /*try {
            List<Class<?>> classes = ClassScanUtil.getClasses("com.lr.mall");
            String target = "aon";
            Optional<Class<?>> first = classes.stream().filter(e -> isTargetAnnotation(e, target)).findFirst();
            if (first.isPresent()) {
                Class<?> aClass = first.get();

                Field[] fields = aClass.getDeclaredFields();
                for (Field filed : fields) {
                    System.out.println(filed);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }

    private static boolean isTargetAnnotation(Class<?> e,String target) {
        ThirdProvider thirdProvider = e.getAnnotation(ThirdProvider.class);
        return thirdProvider!=null && Objects.equals(target, thirdProvider.value());
    }


    public void getInfo() {
        Annotation[] declaredAnnotations = getClass().getDeclaredAnnotations();
        List<Annotation> collect = Stream.of(declaredAnnotations).collect(Collectors.toList());
        collect.forEach(e-> System.out.println(e));
    }

    public void get() {


        /*  Type type = getClass().getGenericSuperclass();

        Type trueType = ((ParameterizedType)type).getActualTypeArguments()[0];
        System.out.println(trueType);
*/
        Type type = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        Type[] actualTypes = pt.getActualTypeArguments();
        System.out.println(actualTypes[0]);

        Student student = JSON.parseObject("{\"age\":1,\"name\":\"tom\"}", actualTypes[0]);

        System.out.println(student.toString());
    }
}
