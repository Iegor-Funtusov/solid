package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.annotation.Service;
import ua.com.alevel.nix.solid.annotation.Value;
import ua.com.alevel.nix.solid.service.WorkEnvironmentService;

import javax.annotation.PostConstruct;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 9:12 PM
 */

@Service
public class WorkEnvironmentServiceImpl implements WorkEnvironmentService {

    @Value("NetBeans")
    private String ide;

    public WorkEnvironmentServiceImpl() {
        System.out.println("WorkEnvironmentServiceImpl.WorkEnvironmentServiceImpl");
    }

    @PostConstruct
    public void init() {
        System.out.println("WorkEnvironmentServiceImpl.init");
    }

    @Override
    public void check() {
        System.out.println("Chrome открыт, " + ide + " запущена");
    }
}
