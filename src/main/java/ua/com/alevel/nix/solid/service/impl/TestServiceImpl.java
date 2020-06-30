package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.annotation.Service;
import ua.com.alevel.nix.solid.service.TestService;

/**
 * @author Iehor Funtusov, created 30/06/2020 - 9:13 PM
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public void test() {
        System.out.println("Все готово!!!!");
    }
}
