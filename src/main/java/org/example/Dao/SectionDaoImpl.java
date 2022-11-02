package org.example.Dao;

import org.example.config.Config;
import org.example.entity.Section;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class SectionDaoImpl implements SectionDao {
    private SessionFactory sessionFactory = Config.createSessionFactory();
    @Override
    public void saveSection(Section section) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(section);
            session.getTransaction().commit();
            session.close();
        }catch (HibernateException e) {
            e.getMessage();
        }

    }

    @Override
    public Section updateSection(Long id, Section section) {
        return null;
    }

    @Override
    public Section getSectionById(Long id) {
        return null;
    }

    @Override
    public List<Section> getSectionBySchoolId(Long id) {
        return null;
    }

    @Override
    public void deleteSectionById(Long id) {

    }
}
