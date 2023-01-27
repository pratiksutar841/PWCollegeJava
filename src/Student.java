//write a program  to create n student objects and print the USN, Name, Branch , phone of these objects with suitable heading
import java.util.*;
public class Student // student
{
    String USN;
    String NAME;
    String BRANCH;
    String PHONE;
    public  void Student(String usn, String name, String branch, String phone)
    {
        USN = usn;
        NAME = name;
        BRANCH = branch;
        PHONE = phone;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of students = ");
        int n = sc.nextInt();
        Student[]St = new Student[n];
        String usn,name,branch,phone;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details of the student"+(i+1));
            System.out.print("usn = ");
            usn = sc.next();
            System.out.print("Name = ");
            name = sc.next();
            System.out.print("Branch = ");
            branch = sc.next();
            System.out.print("phone = ");
            phone=sc.next();
            St[i]= new Student();
            System.out.println("Student Details");
            System.out.println("USN\t NAME\t BRANCH\t PHONE\t");
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(St[i].USN+"\t"+St[i].NAME+"\t"+St[i].BRANCH+"\t"+St[i].PHONE);
        }
    }
}
