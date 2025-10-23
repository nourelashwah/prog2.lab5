/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LapTop
 */
public class StudentManger {
    private ArrayList<Student> students;

    public StudentManger() {
         students= new ArrayList<>();
         
    }
    public void addStudent(Student s){
    if(s.getName()==null||s.getName().isEmpty())
    {
        JOptionPane.showMessageDialog(null,"NAME CAN'T BE EMOTY!");//to write in the gui
        return;
    }
    if(s.getAge()<=0)
    {
    JOptionPane.showMessageDialog(null,"INVALID AGE!");
    return;
    }if(s.getGpa()<0||s.getGpa()>4)
    {
    JOptionPane.showMessageDialog(null,"INVALID GPA!");
    return;
    }
    student.add(s);
    JOptionPane.showMessageDialog(null,"STUDENT ADDED SUCCESSFULLY!");
    
    }
    public ArrayList<student>getAllStudents()
    {
    return students;
    }
    public Student searchStudent(String keyword)
    {
        for(int i=0 ;i<students.size();i++)
        {
            Student s=students.get(i);
            if(String.valueOf(s.getId()).equals(keyword)||s.getName().equalsIgnoreCase(keyword))
            {
                return s;
            }
        }
    return null;}
    
    
}
