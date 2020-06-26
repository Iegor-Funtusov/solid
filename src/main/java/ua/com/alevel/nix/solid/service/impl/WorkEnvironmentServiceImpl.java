package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.annotation.Value;
import ua.com.alevel.nix.solid.service.WorkEnvironmentService;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 9:12 PM
 */
public class WorkEnvironmentServiceImpl implements WorkEnvironmentService {

    @Value("Idea")
    private String ide;

    @Override
    public void check() {
        System.out.println("Chrome открыт, " + ide + " запущена");
    }
}
