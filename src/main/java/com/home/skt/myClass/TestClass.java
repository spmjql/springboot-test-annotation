package com.home.skt.myClass;

import com.home.skt.Annotation.MyAnnotation;

//사용 예제
@MyAnnotation(value = "TestClass", number = 10)
public class TestClass {
    @MyAnnotation("tesㅁㅁtMethod")
    public void testMethod() {
        // 메서드 내용
    	System.out.println("테스트어노테이션테스트");
    }
}
