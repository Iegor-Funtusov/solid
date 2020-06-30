package ua.com.alevel.nix.solid.config;

import ua.com.alevel.nix.solid.config.impl.JavaApplicationConfiguration;

import java.util.Map;

/**
 * @author Iehor Funtusov, created 30/06/2020 - 8:26 PM
 */
public class Application {

    public static ApplicationContext run(String packageToScan, Map<Class, Class> mapImpl) {
        JavaApplicationConfiguration javaApplicationConfiguration = new JavaApplicationConfiguration(packageToScan, mapImpl);
        ApplicationContext context = new ApplicationContext(javaApplicationConfiguration);
        ObjectFactory objectFactory = new ObjectFactory(context);
        context.setFactory(objectFactory);
        return context;
    }
}
