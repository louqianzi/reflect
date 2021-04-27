package com.lqz.test;

import com.lqz.test.entity.Source;
import com.lqz.test.entity.Target;
import com.lqz.test.util.CopyExcutor;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        Source source = new Source("娄黔子", "15634917785", 21, 99.9, new Date(), "其他");
        Target target = new Target();
        System.out.println("资源对象的内容："+source);
        System.out.println("目标对象的内容："+target);
        CopyExcutor copyExcutor = new CopyExcutor(source, target);
        try {
            copyExcutor.executor();
        } catch (IllegalAccessException e) {
            System.out.println("运行出错，请检查程序");
        }
        System.out.println("=====================工具方法结束============================");
        System.out.println("资源对象的内容："+source);
        System.out.println("目标对象的内容："+target);
    }
}
