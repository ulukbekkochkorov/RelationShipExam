package org.example.service;

import org.example.entity.Section;

import java.util.List;

public interface SectionService {
    void saveSection(Section section);

    Section updateSection(Long id, Section section);

    Section getSectionById(Long id);

    List<Section> getSectionBySchoolId(Long id);

    void deleteSectionById(Long id);

}
