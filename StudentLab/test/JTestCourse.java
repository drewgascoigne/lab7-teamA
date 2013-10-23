/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import junit.framework.Assert;
import junit.framework.TestCase;
import studentlab.Course;
import studentlab.Professor;
import studentlab.Student;

/**
 *
 * @author abdullahadeeb
 */
public class JTestCourse extends TestCase {

    public JTestCourse() {
    }

    void testgetId() {
        String id = "123";
        String name = "my name";
        Course c = new Course(id, name);
        Assert.assertEquals(id, c.getId());
    }

    void testgetName() {

        String id = "123";
        String name = "my name";
        Course c = new Course(id, name);
        Assert.assertEquals(name, c.getName());
    }

    void testtoString() {
        String id = "123";
        String name = "my name";
        Course c = new Course(id, name);
        Assert.assertEquals(name + ":" + id, c.toString());

    }

    void testtoStringNotNull() {
        String id = "123";
        String name = "my name";
        Course c = new Course(id, name);
        Assert.assertNotNull(c.toString());
    }

    void testequalsTrue() {
        String id = "123";
        String name = "my name";
        Course c1 = new Course(id, name);
        Course c2 = new Course(id, name);
        Assert.assertTrue(c1.equals(c2));
    }

    void testequalsFalse() {
        String id1 = "123";
        String name1 = "my name";
        String id2 = "321";
        String name2 = "not my name";
        Course c1 = new Course(id1, name1);
        Course c2 = new Course(id2, name2);
        Assert.assertFalse(c1.equals(c2));
    }

    void testsetProfessor() {
        String id = "123";
        String name = "my name";
        String profFirst = "firstProf";
        String profLast = "LastProf";
        Course c1 = new Course(id, name);
        try {
            c1.setProfessor(new Professor(profFirst, profLast));
        } catch (Exception ex) {
            Assert.fail("set Professor failed");
        }

    }

    void testgetProfessor() {
        String id = "123";
        String name = "my name";
        String profFirst = "firstProf";
        String profLast = "LastProf";
        Course c1 = new Course(id, name);
        try {
            c1.setProfessor(new Professor(profFirst, profLast));
        } catch (Exception ex) {
            Assert.fail("set Professor failed");
        }
        Assert.assertEquals(profFirst + " " + profLast, c1.getProfessor());
    }

    void testaddStudentOne() {
        String id = "123";
        String name = "my name";
        String studentFirst = "firstProf";
        String studentLast = "LastProf";
        Course c1 = new Course(id, name);
        try {
            c1.addStudent(new Student(studentFirst, studentLast));
        } catch (Exception ex) {
            Assert.fail("adding one student failed");
        }
    }

    void testaddStudentMoreThanOne() {
        String id = "123";
        String name = "my name";
        ArrayList<Student> students = new ArrayList<Student>();
        String studentFirst = "firstStudent";
        String studentLast = "lastStudent";
        for (int i = 0; i < 10; i++) {
            students.add(new Student(studentFirst + i, studentLast + i));
        }
        Course c1 = new Course(id, name);
        try {
            for (int i = 0; i < 10; i++) {
                c1.addStudent(students.get(i));
            }
        } catch (Exception ex) {
            Assert.fail("adding students failed");
        }
    }

    void testremoveStudent() {
        String id = "123";
        String name = "my name";
        ArrayList<Student> students = new ArrayList<Student>();
        String studentFirst = "firstStudent";
        String studentLast = "lastStudent";
        for (int i = 0; i < 10; i++) {
            students.add(new Student(studentFirst + i, studentLast + i));
        }
        Course c1 = new Course(id, name);
        try {
            for (int i = 0; i < 10; i++) {
                c1.addStudent(students.get(i));
            }
        } catch (Exception ex) {
            Assert.fail("adding students failed");
        }
        for (int i = 0; i < 10; i++) {
            try {
                c1.removeStudent(students.get(i));
            } catch (Exception ex) {
                Assert.fail("removing students failed");
            }
        }
    }

    void testgetStudents() {
        String id = "123";
        String name = "my name";
        Course c = new Course(id, name);
        String studentFirst = "firstStudent";
        String studentLast = "lastStudent";
        try {
            for (int i = 0; i < 10; i++) {
                c.addStudent(new Student(studentFirst, studentLast));
            }
        } catch (Exception ex) {
            Assert.fail("adding students failed");
        }
        Assert.assertEquals(10, c.getStudents().length);
    }
}