package com.lqz.test.util;

import com.lqz.test.annotation.IgnoreField;
import com.lqz.test.annotation.TargetField;

import java.lang.reflect.Field;

public class CopyExcutor {
    private Object source;
    private Object target;

    public CopyExcutor(Object source, Object target) {
        this.source = source;
        this.target = target;
    }
    public void executor() throws IllegalAccessException {
        Class<?> sourceClass = source.getClass();
        Field[] sourcedeclaredFields = sourceClass.getDeclaredFields();
        for (int i = 0; i < sourcedeclaredFields.length; i++) {
            IgnoreField ignoreField = sourcedeclaredFields[i].getAnnotation(IgnoreField.class);
            if (ignoreField!=null){
                continue;
            }

            String targetName=null;


            TargetField targetField = sourcedeclaredFields[i].getAnnotation(TargetField.class);
            if (targetField==null){
                targetName=  sourcedeclaredFields[i].getName();//对象字段名
            }else {
                targetName=targetField.value();
            }
            Class<?> targetClass = target.getClass();
            Field declaredField=null;
            try {
                declaredField = targetClass.getDeclaredField(targetName);
            } catch (NoSuchFieldException e) {
                System.out.println("没有拿到字段");
                System.exit(0);
            }
            sourcedeclaredFields[i].setAccessible(true);
            Object o = sourcedeclaredFields[i].get(source);
            if (o==null){
                return;
            }

            declaredField.setAccessible(true);
            declaredField.set(target,o);
        }
    }

}
