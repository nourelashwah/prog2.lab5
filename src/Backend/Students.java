package Backend;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Backend.Person;
import java.util.Random;

/**
 *
 * @author DELL
 */
//testting
public class Students extends Person {
    
    private int id;
    private String department;
    private float gpa;
    private StudentManager database = new StudentManager();
  
    
    public Students(int id,String fullName,int age,String gender,String department,float gpa) {
        super(fullName, age, gender); 
        setID(id);
        setDepartment(department);
        setGpa(gpa);
        
    }
    
    
    private int generateID()
    {
        Random autom = new Random(); //method gowa java bt-generate random integers w hahot el limit
        
        int newID;
        while(true)
        {
            newID = autom.nextInt(9000) + 1000;
            if (database.searchStudent(String.valueOf(newID)) == null)
                return newID; //y3ne hwa mesh mwgod fel database, fa tmam generated!
        }
        
       
    }
    
    public void setID(int id) {
        if (id == 1) //the user wants to generate an ID
        {
            int newID = generateID();
            this.id = newID;
            System.out.println("Successfully generated an ID");
        }
        else {  //el user hwa eli dkhal ID
            if (!(database.searchStudent(String.valueOf(id)) == null)) 
            {
                System.out.println("ERROR, ID already exsists!");
            }
            else{
                if ( id < 1000 || id > 10000)
                {
                    System.out.println("ERROR, ID should be between 1000 and 10000");
                }
                else{
                    this.id = id;
                System.out.println("Valid entered ID");
                }
            }
        }
    }

    
    public void setDepartment(String department) {
        if (!department.isEmpty())
        this.department = department;
    }
    
    private boolean validGPA(float gpa)
    {
        if (gpa < 0.0 || gpa > 4.0 )
        {
            System.out.println("!!ERROR, Gpa should be between 0.0 and 4.0");
            return false;
        }
        return true;
    }
    
    
    public void setGpa(float gpa) {
        if (validGPA(gpa))
        {
            this.gpa=gpa;
        }
    }
     
    public int getID() {
        return id;
    }
    public String getDepartment() {
        return department;
    }

    public float getGpa() {
        return gpa;
    }

    
}
