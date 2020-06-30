package ua.com.alevel.nix.solid.config.configure;

import ua.com.alevel.nix.solid.annotation.Value;
import ua.com.alevel.nix.solid.config.ApplicationContext;
import ua.com.alevel.nix.solid.config.ObjectConfigurator;
import ua.com.alevel.nix.solid.util.ResourceUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author Iehor Funtusov, created 30/06/2020 - 7:36 PM
 */
public class ValueAnnotationObjectConfigurator implements ObjectConfigurator {

    private Map<String, String> map;

    public ValueAnnotationObjectConfigurator() {
        this.map = ResourceUtil.getResource("application.properties");
    }

    @Override
    public void configure(Object o, ApplicationContext context) {
        Class<?> implClass = o.getClass();
        for (Field field : implClass.getDeclaredFields()) {
            Value annotation = field.getAnnotation(Value.class);
            if (annotation != null) {
                String value = annotation.value().isEmpty() ? map.get(field.getName()) : annotation.value();
                field.setAccessible(true);
                try {
                    field.set(o, value);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Возникли проблемы с инициализацией филда: " + e.getMessage());
                }
            }
        }
    }
}
