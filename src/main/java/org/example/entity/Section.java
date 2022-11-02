package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "sections")
@Getter
@Setter
@NoArgsConstructor
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH,PERSIST}, fetch = FetchType.LAZY)
    private School school;

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH,PERSIST})
    @JoinTable(name = "student_section",
            joinColumns = @JoinColumn(name = "section_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
    private List<Student> students;

    public Section(String name) {
        this.name = name;

    }
}
