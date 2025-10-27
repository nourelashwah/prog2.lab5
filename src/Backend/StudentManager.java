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
    private ArrayList<Students> students;


    private FileManager manager;


    public StudentManager() {
        students = new ArrayList<>();
        manager=new FileManager("Students.txt", students);
        
    }

    public void addStudent(Students s) {
 
        

        if ( s.getFullName().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NAME CAN'T BE EMPTY!");//to write in the gui
        }
        if (s.getFullName() == null || s.getFullName().isEmpty()) {
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
        manager.saveToFile();

   
   
    }
    public ArrayList<Students> getAllStudents() {
        return students;
    }

    public Students searchStudent(String keyword) {
        keyword  = keyword.trim();
      for(Students s : students){
      if(Integer.toString(s.getID()).equals(keyword)|| s.getFullName().equalsIgnoreCase(keyword)){
      return s;
      }
      
      
      }
      return null;
    }
    public boolean updateStudent(int id, Students newdata) {

     Students s = searchStudent(Integer.toString(id));
     if(s  == null){
     JOptionPane.showMessageDialog(null, "DOESNT EXIST");
     return false;
     }
int index = students.indexOf(s);
students.set(index, newdata);
                JOptionPane.showMessageDialog(null, "STUDENT UPDATED SUCCESSFULLY!");
                manager.saveToFile();
                return true;
        
        
    
  
       
    }
    
    
    public boolean deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            Students s = students.get(i);
            if (s.getID()== id) {
                students.remove(s);
                JOptionPane.showMessageDialog(null, "STUDENT DELETED SUCCESSFULLY!");
                manager.saveToFile();
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "FAILED TO DELETE! STUDENT STUDENT NOT FOUND!");
        return false;
    }

}
