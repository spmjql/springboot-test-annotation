package com.home.skt.Annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//커스텀 어노테이션 정의
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface MyAnnotation {
    String value() default ""; // 어노테이션 속성으로 사용할 수 있는 필드 정의
    int number() default 0;
}
