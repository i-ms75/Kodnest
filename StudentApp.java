import java.util.*;
import java.util.jar.Attributes.Name;
class student
{
    String name;
    int usn;
    int age;
    String gender;

    void eat()
    {
        System.out.println("student is eating");
    }
    void sleep()
    {
        System.out.println("student is sleeping");
    }
    void study()
    {
        System.out.println("student is studying");
    }
}
class StudentApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        student s1=new student();
        student s2=new student();
        student s3=new student();
        s1.usn=sc.nextInt();
        s1.name=sc.next();
        new student().sleep();
        s1.eat();
        s2.sleep();
        s3.study();
        

        //sc.close();
        System.out.println("usn is"+s1.usn);
        System.out.println("name is "+s1.name);
    
    }

}
