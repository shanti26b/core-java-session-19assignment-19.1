 
 // here i am showing to create a student class with  three filed name , rollNumber ,department

package assignment19;       // here i am taking package name as assignment19

import java.util.HashSet;
import java.util.Iterator;

 class Student {    // i am creating class as Student
	String name;     // here i am taking three variable in String name as int data type name as rollNumber
	 
    int rollNumber;
 
    String department;
 
    public Student(String name, int rollNumber, String department)  // here i am creating constructor and passing the arguments
    {
        this.name = name;              // here i am passing the constructor arguments
 
        this.rollNumber = rollNumber;
 
        this.department = department;
        
    }
  
 
    @Override
    public String toString()        // creating String method to run the parameters
    {
        return name+", "+rollNumber+", "+department;
    }
}
 
public class StudentExample
{
    public static void main(String[] args)  // and main method
    {
        HashSet<Student> studentset = new HashSet<Student>(); // creating the HashSet 
 
                  //Adding elements to HashSet method
 
        studentset.add(new Student("Uma",     80, "ECE"));
        
        //  here i am adding HashSet method  name as uma  taking rollNumber as 80 and department ECE
        
        studentset.add(new Student("Komali",  45, "EEE"));
        
        // here i am adding HashSet method name as Komali taking and rollNumber as 45 department EEE
 
       studentset.add(new Student("Rekha",    23, "CIVIL"));
       
       // here i am adding HashSet method name as Rekha  taking rollNumber as 23 and department CIVIL
 
       studentset.add(new Student("Sailaja", 50, "IT"));
       
       // here i am adding HashSet method name as Sailaja taking rollNumber as 50 and department IT
 
       studentset.add(new Student("Sirisha", 90, "CS"));
       
       //here i am adding HashSet method name as Sirisha taking rollNumber as 90 and department CS
       
 
         Iterator<Student> it = studentset.iterator();    //Iterating through HashSet 

         
 
        while (it.hasNext())     // here i taking while loop  
        {
            Student student = (Student) it.next();     
            
 
            System.out.println(student);   
        }
    }
}
   
 
  