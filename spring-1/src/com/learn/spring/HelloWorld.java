package com.learn.spring;

import java.sql.SQLOutput;

public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法"+this.name);
    }
//    public void setNaMe(String name) {
//        this.name = name;
//    } 名称必须和配置的保持一致

//    public void setname(String name) {
//        this.name = name;
//    } //经测试，此种方式也可以注入成功

    public void printName(){
        System.out.println("name:"+name);
    }

   public  HelloWorld(){
       System.out.println("构造器"+name);
   }


}
