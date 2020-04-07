package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //常规方式注入属性值
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("NoSpring");
        helloWorld.printName();

        System.out.println("======spring=========");
        //使用spring 容器注入属性值
        //容器初始化时，会对配置的bean进行初始化，属性赋值。注意，必须提供一个无参构造器。否则会报错。
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorldSpring = (HelloWorld) ctx.getBean("helloWorld");

        //通过类型获取，但注意一点，在配置文件中只能存在一个此种类型的bean
        HelloWorld helloWorldSpring1 =  ctx.getBean(HelloWorld.class);
        helloWorldSpring1.printName();
        helloWorldSpring.printName();

        //构造器方法注入。
        Car car = (Car) ctx.getBean("car");
        System.out.println(car.toString());
        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2.toString());
    }
}
