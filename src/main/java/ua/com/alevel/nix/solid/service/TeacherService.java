package ua.com.alevel.nix.solid.service;

import ua.com.alevel.nix.solid.data.abstr.ListenerOfLecture;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 8:12 PM
 */
public interface TeacherService<L extends ListenerOfLecture> {

    void startLecture(L l);
}
