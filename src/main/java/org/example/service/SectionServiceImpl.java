package org.example.service;

import org.example.Dao.SectionDao;
import org.example.Dao.SectionDaoImpl;
import org.example.entity.Section;

import java.util.List;

public class SectionServiceImpl implements SectionService{
    SectionDao sectionDao = new SectionDaoImpl();
    @Override
    public void saveSection(Section section) {
        sectionDao.saveSection(section);
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
