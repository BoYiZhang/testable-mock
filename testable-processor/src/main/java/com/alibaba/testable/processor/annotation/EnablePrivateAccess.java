package com.alibaba.testable.processor.annotation;

import java.lang.annotation.*;

/**
 * Make test class able to access private field and method in source class
 *
 * @author flin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EnablePrivateAccess {
}
