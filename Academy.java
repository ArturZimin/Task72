package by.minsk.itakademy.arturzimin;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Academy {

    int year;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
    public @interface AcademyInfo {
        int year = 1970;
    }

    public static void yearOfFoundationOfTheAcademy() {
        int year = 1971;
        
    }

    @AcademyInfo
    public static void yearOfFoundationOfTheAcademy1() {
        int year = 1972;
        
    }


}
