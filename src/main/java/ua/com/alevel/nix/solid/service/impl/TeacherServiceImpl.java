package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.config.ObjectFactory;
import ua.com.alevel.nix.solid.data.Group;
import ua.com.alevel.nix.solid.service.InternetService;
import ua.com.alevel.nix.solid.service.TeacherResponsibilityService;
import ua.com.alevel.nix.solid.service.TeacherService;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 7:12 PM
 */
public class TeacherServiceImpl implements TeacherService<Group> {

    private InternetService internetService = ObjectFactory.getInstance().createObject(InternetService.class);
    private TeacherResponsibilityService teacherResponsibilityService = ObjectFactory.getInstance().createObject(TeacherResponsibilityService.class);

    public void startLecture(Group group) {
        internetService.isExist();
        teacherResponsibilityService.startResponsible(group);
        teach(group);
        teacherResponsibilityService.finishResponsible();
    }

    public void teach(Group group) {
        System.out.println("Делает перекличку!!!");
        System.out.println("Ведет лекцию!!!");
        System.out.println("Дает домашнее задание!!!");
    }
}
