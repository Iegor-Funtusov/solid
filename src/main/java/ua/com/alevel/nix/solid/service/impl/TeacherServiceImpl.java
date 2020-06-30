package ua.com.alevel.nix.solid.service.impl;

import ua.com.alevel.nix.solid.annotation.Autowired;
import ua.com.alevel.nix.solid.annotation.Service;
import ua.com.alevel.nix.solid.data.Group;
import ua.com.alevel.nix.solid.service.InternetService;
import ua.com.alevel.nix.solid.service.TeacherResponsibilityService;
import ua.com.alevel.nix.solid.service.TeacherService;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 7:12 PM
 */
@Service
public class TeacherServiceImpl implements TeacherService<Group> {

    @Autowired
    private InternetService internetService;

    @Autowired
    private TeacherResponsibilityService teacherResponsibilityService;

    public void startLecture(Group group) {
        internetService.isExist();
        teacherResponsibilityService.startResponsible(group);
        teach(group);
        teacherResponsibilityService.finishResponsible();
    }

    private void teach(Group group) {
        System.out.println("Ведет лекцию!!!");
    }
}
