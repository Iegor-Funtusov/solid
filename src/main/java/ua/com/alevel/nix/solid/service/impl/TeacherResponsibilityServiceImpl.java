package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.annotation.Autowired;
import ua.com.alevel.nix.solid.annotation.Service;
import ua.com.alevel.nix.solid.data.Group;
import ua.com.alevel.nix.solid.service.TeacherResponsibilityService;
import ua.com.alevel.nix.solid.service.WorkEnvironmentService;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 7:30 PM
 */
@Service
public class TeacherResponsibilityServiceImpl implements TeacherResponsibilityService {

    @Autowired
    private WorkEnvironmentService workEnvironmentService;

    @Override
    public void startResponsible(Group group) {
        workEnvironmentService.check();
        System.out.println("Дожидается всех!!!");
        System.out.println("Делает перекличку!!!");
    }

    @Override
    public void finishResponsible() {
        System.out.println("Дает домашнее задание!!!");
    }
}
