package ua.com.alevel.nix.solid.config;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 8:27 PM
 */
public interface ApplicationConfiguration {

    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
}
