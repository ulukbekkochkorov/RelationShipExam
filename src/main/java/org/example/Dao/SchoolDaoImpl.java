package org.example.Dao;

import org.example.config.Config;
import org.example.entity.School;
import org.example.entity.Section;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SchoolDaoImpl implements SchoolDao{
    private SessionFactory sessionFactory = Config.createSessionFactory();
    @Override
    public void saveSchool(School school) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(school);
            session.getTransaction().commit();
            session.close();
        }catch (HibernateException e){
            e.getMessage();
        }

    }

    @Override
    public School getSchoolById(Long id) {
        return null;
    }

    @Override
    public void deleteSchoolById(Long id) {

    }
}
