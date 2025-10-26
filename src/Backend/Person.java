/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Backend;


/**
 *
 * @author DELL
 */
public abstract class Person {
    
    
    private String fullName;
    private int age;
    private String gender;
    
    
    public Person(String fullName,int age,String gender) {
        
        setFullName(fullName);
        setAge(age);
        setGender(gender);
        
    }
    
    private boolean validName ( String fullName )
    {
        fullName = fullName.trim();
        
        if (fullName.length() < 1 || fullName.length() > 150 )
        {
            System.out.println("Too short or too long full name, error!!");
            return false;
        }  //lw el name osyr awe hrfyn harf, aw tawel over, yeb2a ignore. 
        
        String regex = "^[A-Za-z]+$";
        String[] line = fullName.split(" ");
        
        for (int i = 0 ; i < line.length; i++)
        {
            if ( !line[i].matches(regex) || line[i].isEmpty())
                return false;
        }
        return true;
    }
    
    
    public void setFullName(String fullName) {
        
        if (validName (fullName))
        {
            this.fullName = fullName;
        }
        System.out.println("!!Error in validation of Name, incorrect format or empty. ");
    }
    
    
    private boolean validAge ( int age )
    {
        if (age < 1 || age > 90)
        {
            return false;
        }
        return true;
    }
    public void setAge(int age) {
        
        if (validAge(age))
        {
            this.age = age;
            
        }
        else {
            System.out.println("Invalid limit of age.");
        }
        
    }

    public void setGender(String gender) {
        
        if (!gender.isEmpty())
        this.gender = gender;
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
    
}
