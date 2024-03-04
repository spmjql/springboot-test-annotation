package com.home.skt;

import java.lang.reflect.Method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.skt.Annotation.MyAnnotation;
import com.home.skt.myClass.TestClass;

@SpringBootApplication
public class SpringbootTestAnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestAnotationApplication.class, args);
        TestClass testClass = new TestClass();

        // 클래스에 적용된 어노테이션 가져오기
        MyAnnotation classAnnotation = testClass.getClass().getAnnotation(MyAnnotation.class);
        if (classAnnotation != null) {
            String value = classAnnotation.value();
            int number = classAnnotation.number();
            System.out.println("TestClass 어노테이션 값: " + value + ", " + number);
        }

        // 메서드에 적용된 어노테이션 가져오기
        try {
            Method method = testClass.getClass().getMethod("testMethod");
            MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
            if (methodAnnotation != null) {
                String value = methodAnnotation.value();
                System.out.println("testMethod 어노테이션 값: " + value);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // 메서드 실행
        testClass.testMethod();
        testMethod2();
	}
	
	@MyAnnotation(value = "안녕")
	private static void testMethod2() {
		System.out.println("testMethod2()");
	}

}
