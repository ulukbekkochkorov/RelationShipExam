package org.example.Dao;

import org.example.entity.Section;

import java.util.List;

public interface SectionDao {

    void saveSection(Section section);

    Section updateSection(Long id, Section section);

    Section getSectionById(Long id);

    List<Section> getSectionBySchoolId(Long id);

    void deleteSectionById(Long id);

}
