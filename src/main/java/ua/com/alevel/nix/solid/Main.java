package ua.com.alevel.nix.solid;

import ua.com.alevel.nix.solid.config.Application;
import ua.com.alevel.nix.solid.config.ApplicationContext;
import ua.com.alevel.nix.solid.data.Group;
import ua.com.alevel.nix.solid.data.abstr.ListenerOfLecture;
import ua.com.alevel.nix.solid.service.InternetService;
import ua.com.alevel.nix.solid.service.TeacherService;
import ua.com.alevel.nix.solid.service.impl.WorkProcessServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 7:10 PM
 */

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = Application.run("ua.com.alevel.nix.solid",
                new HashMap<>(Map.of(InternetService.class, WorkProcessServiceImpl.class)));
        TeacherService<Group> teacherService = context.getObject(TeacherService.class);
        ListenerOfLecture listenerOfLecture = new Group();
        listenerOfLecture.test();
        teacherService.startLecture((Group) listenerOfLecture);
    }
}
