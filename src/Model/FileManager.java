/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Student;

/**
 *
 * @author malak
 */
public class FileManager {
    private String filename;
    private ArrayList<Student> students;

    public FileManager(String filename, ArrayList<Student> students) {
        this.filename = filename;
        this.students = students;
    }
    
    public void saveToFile(){
        try(PrintWriter pw=new PrintWriter(new FileWriter(filename))){
            for(int i=0;i<students.size();i++){
                Student stu=students.get(i);
                pw.println(stu.toString());
            }
            JOptionPane.showMessageDialog(null, "FILE SAVED SUCCESSFULLY!");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERROR SAVING FILE: "+e.getMessage());
        }
    }
    public Student createStudent(String studentLine){
        String [] split=studentLine.split(",");
        return new Student(Integer.parseInt(split[0]),split[1],Integer.parseInt(split[2]),split[3],split[4],Float.parseFloat(split[5]));
    }
}
