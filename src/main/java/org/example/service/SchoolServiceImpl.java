package org.example.service;

import org.example.Dao.SchoolDao;
import org.example.Dao.SchoolDaoImpl;
import org.example.entity.School;

public class SchoolServiceImpl implements SchoolService{
    private SchoolDaoImpl schoolDao = new SchoolDaoImpl();
    @Override
    public void saveSchool(School school) {
        schoolDao.saveSchool(school);
    }

    @Override
    public School getSchoolById(Long id) {
        return null;
    }

    @Override
    public void deleteSchoolById(Long id) {

    }
}
