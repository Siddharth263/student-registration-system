package com.example.registrationSystem.customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Password {
    String message() default "Password must contain minimum 8, maximum 20 characters, at least 1 upper case character, 1 lower case character, 1 digit and 1 special character";
    int minLength() default 8;
    int maxLength() default 20;
    boolean requireSpecialChar() default true;
    boolean requireDigit() default true;
    boolean requireLowercase() default true;
    boolean requireUppercase() default true;
}
