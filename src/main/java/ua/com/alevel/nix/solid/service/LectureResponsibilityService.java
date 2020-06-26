package ua.com.alevel.nix.solid.service;

import ua.com.alevel.nix.solid.data.abstr.ListenerOfLecture;

/**
 * @author Iehor Funtusov, created 26/06/2020 - 8:05 PM
 */
public interface LectureResponsibilityService<L extends ListenerOfLecture> {

    void startResponsible(L l);
    void finishResponsible();
}
