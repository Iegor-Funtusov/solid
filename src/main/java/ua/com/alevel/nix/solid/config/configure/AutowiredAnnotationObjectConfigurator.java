package ua.com.alevel.nix.solid.config.configure;

import ua.com.alevel.nix.solid.annotation.Autowired;
import ua.com.alevel.nix.solid.config.ApplicationContext;
import ua.com.alevel.nix.solid.config.ObjectConfigurator;

import java.lang.reflect.Field;

/**
 * @author Iehor Funtusov, created 30/06/2020 - 7:50 PM
 */
public class AutowiredAnnotationObjectConfigurator implements ObjectConfigurator {

    @Override
    public void configure(Object o, ApplicationContext context) {
        for (Field field : o.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Autowired.class)) {
                field.setAccessible(true);
                Object o1 = context.getObject(field.getType());
                try {
                    field.set(o, o1);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Возникли проблемы с инициализацией филда: " + e.getMessage());
                }
            }
        }
    }
}
