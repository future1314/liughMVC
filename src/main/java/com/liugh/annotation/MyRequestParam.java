package com.liugh.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)//作用范围
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {///程序里未进行处理？
	/**
     * 表示参数的别名，必填
     * @return
     */
    String value();

}
