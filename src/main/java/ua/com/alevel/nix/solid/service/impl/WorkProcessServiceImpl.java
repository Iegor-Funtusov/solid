package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.annotation.Service;
import ua.com.alevel.nix.solid.exception.InternetException;
import ua.com.alevel.nix.solid.service.InternetService;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 9:01 PM
 */
@Service
public class WorkProcessServiceImpl implements InternetService {

    private boolean existInternet = true;
    private boolean zoomWorked = true;

    @Override
    public void isExist() {
        if (existInternet) {
            System.out.println("Интернет имеется");
        } else {
            throw new InternetException("Интернет не имеется");
        }
        if (zoomWorked) {
            System.out.println("Zoom работает");
        } else {
            throw new InternetException("Zoom не работает");
        }
    }
}
