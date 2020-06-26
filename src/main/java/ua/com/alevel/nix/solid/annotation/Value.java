package ua.com.alevel.nix.solid.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 9:14 PM
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Value {

    String value() default "";
}
