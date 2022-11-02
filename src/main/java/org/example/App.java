package org.example;


import org.example.Dao.SchoolDaoImpl;
import org.example.entity.School;
import org.example.entity.Section;
import org.example.entity.Student;
import org.example.service.SchoolServiceImpl;
import org.example.service.SectionService;
import org.example.service.SectionServiceImpl;
import org.example.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        SchoolServiceImpl schoolService = new SchoolServiceImpl();
        SectionServiceImpl sectionService = new SectionServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
//        schoolService.saveSchool(new School("CambridgeSchool"));
        sectionService.saveSection(new Section("Football"));
//        studentService.saveStudentTable(new Student("Amir", "Asanov", 18L));
//        studentService.dropStudentsTable();
//        System.out.println(studentService.getAllStudent();
//        studentService.deleteById(1L);

    }
}
