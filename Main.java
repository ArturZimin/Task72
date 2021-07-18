package by.minsk.itakademy.arturzimin;

import javax.tools.JavaFileObject;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {


        Class clazz = Academy.class;

Method method1=clazz.getMethod("yearOfFoundationOfTheAcademy1");
        Annotation[] annotation=method1.getAnnotations();
        for (Annotation a:annotation){
            if (a!=null){
            System.out.println("There is an annotation in the method 1 = "+a);
        }}

        Method method=clazz.getMethod("yearOfFoundationOfTheAcademy");
        Annotation[] annotation1=method.getAnnotations();
        for (Annotation a:annotation1){
            if (a!=null){
                System.out.println("There is an annotation in the method 1 = "+a);
            }

        }
    }



}




