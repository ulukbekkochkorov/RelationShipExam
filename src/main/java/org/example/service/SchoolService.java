package org.example.service;

import org.example.entity.School;

public interface SchoolService {
    public void saveSchool(School school);

    School getSchoolById(Long id);

    void deleteSchoolById(Long id);

}
