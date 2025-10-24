/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
//testting
public class Students {
    
    private int studentID;
    private String fullName;
    private int age;
    private String gender;
    private String department;
    private float gpa;
    
    
    public Students(int studentID,String fullName,int age,String gender,String department,float gpaORgrade) {
        
        setStudentID(studentID);
        setFullName(fullName);
        setAge(age);
        setGender(gender);
        setDepartment(department);
        setGpa(gpa);
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGpa(float gpa) {
        
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public float getGpa() {
        return gpa;
    }

    
}
