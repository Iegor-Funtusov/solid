package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.annotation.Service;
import ua.com.alevel.nix.solid.exception.InternetException;
import ua.com.alevel.nix.solid.service.InternetService;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 7:26 PM
 */
@Service
public class InternetServiceImpl implements InternetService {

    private boolean existInternet = true;

    @Override
    public void isExist() {
        if (existInternet) {
            System.out.println("Интернет имеется");
        } else {
            throw new InternetException("Интернет не имеется");
        }
    }
}
