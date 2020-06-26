package ua.com.alevel.nix.solid;

import ua.com.alevel.nix.solid.data.Group;
import ua.com.alevel.nix.solid.service.TeacherService;
import ua.com.alevel.nix.solid.service.impl.TeacherServiceImpl;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 7:10 PM
 */
public class Main {

    public static void main(String[] args) {
        TeacherService teacherService = new TeacherServiceImpl();
        teacherService.startLecture(new Group());
    }
}
