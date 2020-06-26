package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.config.ObjectFactory;
import ua.com.alevel.nix.solid.data.Group;
import ua.com.alevel.nix.solid.service.TeacherResponsibilityService;
import ua.com.alevel.nix.solid.service.WorkEnvironmentService;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 7:30 PM
 */
public class TeacherResponsibilityServiceImpl implements TeacherResponsibilityService {

    private WorkEnvironmentService workEnvironmentService = ObjectFactory.getInstance().createObject(WorkEnvironmentService.class);

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
