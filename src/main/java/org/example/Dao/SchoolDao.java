package org.example.Dao;

import org.example.entity.School;

import java.time.LocalDate;
import java.util.List;

public interface SchoolDao {
    public void saveSchool(School school);

    School getSchoolById(Long id);

    void deleteSchoolById(Long id);


}
