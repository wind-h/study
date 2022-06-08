package com.wind.study.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Refiex {
    public static void main(String[] args) {
        String s = new String();
        Class cla02 = s.getClass();
        try {
            Class cla03 = Class.forName("java.lang.String");
            Constructor c = cla03.getConstructor();
            String str = (String) c.newInstance();
            Field[] fields = cla03.getFields();
            for (Field field : fields) {
                System.out.println("field = " + field);
            }
            Field[] declaredFields = cla03.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println("declaredField = " + declaredField);
            }
            Method[] methods = cla03.getMethods();
            for (Method method : methods) {
                System.out.println("method = " + method);
            }
            Constructor[] constructors = cla03.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("constructor = " + constructor);
            }
            cla03.getDeclaredConstructor();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public String getInstance() {
        Class cla = String.class;
        String s = null;
        try {
            s = (String) cla.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return s;
    }
}

