class Student{

    //Private variables
    private int rollNo ;
    private String name ;
    private double marks ;   //Use private fields to protect data

    public void setRollNo(int r){    //Setter Method to Set Values
        rollNo = r;
    }

    public void setName(String n){
       name = n; 
    }

    public void setMarks(double m){
        marks = m;
    }

    public int getRollNo(){       //Gettet Method to Get Values
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }
}

public class Encapsulation{
      
    public static void main(String args[]){
         
        Student s = new Student();    //Set Values
        s.setRollNo(1);
        s.setName("Vaishnavi");
        s.setMarks(90);

        System.out.println("Roll No : " + s.getRollNo());     //Get Values
        System.out.println("Name : " + s.getName());
        System.out.println("Marks : " + s.getMarks());
    }
}