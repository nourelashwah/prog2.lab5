/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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
    public void loadFile(){
        students.clear();
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
            String line;
            while((line=br.readLine())!=null)
                students.add(createStudent(line));
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERROR LOADING FILE: "+e.getMessage());
    }
}
