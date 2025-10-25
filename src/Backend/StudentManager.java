/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author LapTop
 */
public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();

    }

    public void addStudent(Student s) {
        if (s.getName() == null || s.getName().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NAME CAN'T BE EMOTY!");//to write in the gui
            return;
        }
        if (s.getAge() <= 0) {
            JOptionPane.showMessageDialog(null, "INVALID AGE!");
            return;
        }
        if (s.getGpa() < 0 || s.getGpa() > 4) {
            JOptionPane.showMessageDialog(null, "INVALID GPA!");
            return;
        }
        students.add(s);
        JOptionPane.showMessageDialog(null, "STUDENT ADDED SUCCESSFULLY!");

    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public Student searchStudent(String keyword) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (String.valueOf(s.getId()).equals(keyword) || s.getName().equalsIgnoreCase(keyword)) {
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(int id, Student newdata) {

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId() == id) {
                s.setName(newdata.getName());
                s.setAge(newdata.getAge());
                s.setGender(newdata.getGender());
                s.setDepartment(newdata.getDeparment());
                s.setGpa(newdata.getGpa());

                JOptionPane.showMessageDialog(null, "STUDENT UPDATED SUCCESSFULLY!");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "STUDENT NOT FOUND!");
        return false;
    }

    public boolean deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId() == id) {
                students.remove(s);
                JOptionPane.showMessageDialog(null, "STUDENT DELETED SUCCESSFULLY!");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "FAILED TO DELETW STUDENT STUDENT NOT FOUND!");
        return false;
    }

}
